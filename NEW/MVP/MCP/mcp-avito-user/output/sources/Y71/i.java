package Y71;

import java.lang.reflect.Method;

/* compiled from: ObjectMethodsGuru.java */
/* loaded from: classes7.dex */
public class i {
    public static boolean a(Method method) {
        return method.getReturnType() == String.class && new M71.a(method).f10410c.length == 0 && "toString".equals(method.getName());
    }
}
