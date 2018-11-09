package com.blockeng.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author qiang
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "iploc")
public class IpLocProperties {

    private String appcode;
}