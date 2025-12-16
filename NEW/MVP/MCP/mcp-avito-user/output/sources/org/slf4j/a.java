package org.slf4j;

import java.io.Serializable;
import x41.InterfaceC49770g;

/* compiled from: Logger.java */
/* loaded from: classes7.dex */
public interface a {
    void a(String str, Exception exc);

    void b(String str);

    void c(InterfaceC49770g interfaceC49770g);

    void d(String str, Object obj, Serializable serializable);

    void debug(String str);

    void e(String str);

    void f(String str);

    void g(Integer num, String str);

    String getName();

    void h(io.sentry.c cVar, io.sentry.c cVar2);

    void i(String str, Exception exc);

    void info(String str);

    void k(String str, Object obj, Serializable serializable);

    void l(String str, Exception exc);

    void m(Object obj, String str);

    void n(Object... objArr);
}
