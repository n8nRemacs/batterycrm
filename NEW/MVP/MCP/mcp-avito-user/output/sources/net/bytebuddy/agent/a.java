package net.bytebuddy.agent;

import java.lang.reflect.InvocationTargetException;

/* compiled from: Attacher.java */
/* loaded from: classes8.dex */
public class a {
    public a() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    public static void a(String str, String str2, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = cls.getMethod("attach", String.class).invoke(null, str);
        try {
            cls.getMethod("loadAgent", String.class, String.class).invoke(objInvoke, str2, null);
            cls.getMethod("detach", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable th2) {
            cls.getMethod("detach", new Class[0]).invoke(objInvoke, new Object[0]);
            throw th2;
        }
    }
}
