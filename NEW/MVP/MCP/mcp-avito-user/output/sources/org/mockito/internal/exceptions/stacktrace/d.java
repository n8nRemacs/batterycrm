package org.mockito.internal.exceptions.stacktrace;

import java.io.Serializable;
import java.lang.reflect.Method;
import org.mockito.internal.configuration.plugins.j;

/* compiled from: StackTraceFilter.java */
/* loaded from: classes7.dex */
public class d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final F71.a f421637b = j.f().a(new b());

    /* renamed from: c, reason: collision with root package name */
    public static final Object f421638c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f421639d;
    static final long serialVersionUID = -5499819791513105700L;

    static {
        try {
            f421638c = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            f421639d = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
        } catch (Exception unused) {
        }
    }
}
