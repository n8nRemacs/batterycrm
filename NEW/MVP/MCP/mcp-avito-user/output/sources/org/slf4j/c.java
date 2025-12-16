package org.slf4j;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.helpers.i;
import org.slf4j.helpers.m;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* compiled from: MDC.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final MDCAdapter f421817a;

    /* compiled from: MDC.java */
    public static class b implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final String f421818b;

        public b(String str, a aVar) {
            this.f421818b = str;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            String str = this.f421818b;
            if (str == null) {
                MDCAdapter mDCAdapter = c.f421817a;
                throw new IllegalArgumentException("key parameter cannot be null");
            }
            MDCAdapter mDCAdapter2 = c.f421817a;
            if (mDCAdapter2 == null) {
                throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
            mDCAdapter2.remove(str);
        }
    }

    static {
        try {
            f421817a = a();
        } catch (Exception e12) {
            m.c("MDC binding unsuccessful.", e12);
        } catch (NoClassDefFoundError e13) {
            f421817a = new i();
            String message = e13.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e13;
            }
            m.b("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            m.b("Defaulting to no-operation MDCAdapter implementation.");
            m.b("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    public static MDCAdapter a() {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    public static void b() {
        MDCAdapter mDCAdapter = f421817a;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.clear();
    }

    public static Map<String, String> c() {
        MDCAdapter mDCAdapter = f421817a;
        if (mDCAdapter != null) {
            return mDCAdapter.a();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static void d(Map<String, String> map) {
        MDCAdapter mDCAdapter = f421817a;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.b(map);
    }
}
