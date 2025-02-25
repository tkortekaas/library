/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2020 MinIO, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package data_io.minio.messages;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/** Years type retention duration of {@link ObjectLockConfiguration} */
@Root(name = "Years")
public class RetentionDurationYears implements RetentionDuration {
  @Text(required = false)
  private Integer years;

  public RetentionDurationYears() {}

  public RetentionDurationYears(int years) {
    this.years = Integer.valueOf(years);
  }

  public RetentionDurationUnit unit() {
    return RetentionDurationUnit.YEARS;
  }

  public int duration() {
    return years;
  }

  /** Returns RetentionDurationYears as string. */
  @Override
  public String toString() {
    if (years == null) {
      return "";
    }
    return years.toString() + ((years == 1) ? " year" : " years");
  }
}
