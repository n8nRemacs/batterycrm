package org.slf4j.spi;

import java.util.Map;

/* loaded from: classes7.dex */
public interface MDCAdapter {
    Map<String, String> a();

    void b(Map<String, String> map);

    void clear();

    void remove(String str);
}
