package Y71;

import org.mockito.creation.instance.InstantiationException;

/* compiled from: JavaEightUtil.java */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static Object f19316a;

    /* renamed from: b, reason: collision with root package name */
    public static Object f19317b;

    /* renamed from: c, reason: collision with root package name */
    public static Object f19318c;

    /* renamed from: d, reason: collision with root package name */
    public static Object f19319d;

    /* renamed from: e, reason: collision with root package name */
    public static Object f19320e;

    /* renamed from: f, reason: collision with root package name */
    public static Object f19321f;

    public static Object a(String str) {
        try {
            try {
                return Class.forName(str).getField("ZERO").get(null);
            } catch (ClassNotFoundException e12) {
                throw new InstantiationException(String.format("Could not find %s: %s", str, e12), e12);
            }
        } catch (Exception e13) {
            throw new InstantiationException(String.format("Could not get %s#%s(): %s", str, "ZERO", e13), e13);
        }
    }

    public static Object b(String str) {
        try {
            try {
                try {
                    return Class.forName(str).getMethod("empty", new Class[0]).invoke(null, new Object[0]);
                } catch (ClassNotFoundException e12) {
                    throw new InstantiationException(String.format("Could not find %s: %s", str, e12), e12);
                }
            } catch (Exception e13) {
                throw new InstantiationException(String.format("Could not find %s#%s(): %s", str, "empty", e13), e13);
            }
        } catch (Exception e14) {
            throw new InstantiationException(String.format("Could not create %s#%s(): %s", str, "empty", e14), e14);
        }
    }
}
