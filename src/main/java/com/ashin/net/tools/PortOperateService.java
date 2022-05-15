package com.ashin.net.tools;

import java.util.List;

/**
 * The interface Port operate service.
 *
 * @author ashin
 * @date 2022 -03
 * @Desc cmd操作命令
 */
public interface PortOperateService {
    /**
     * List port list.
     *
     * @return the list
     */
    List<PortInfo> listPort();

    /**
     * Gets by port.
     *
     * @param port the port
     * @return the by port
     */
    PortInfo getByPort(int port);

    /**
     * Kill.
     *
     * @param pid the pid
     */
    Integer kill(int pid);
}
