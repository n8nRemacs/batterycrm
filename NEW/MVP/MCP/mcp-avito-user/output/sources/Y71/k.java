package Y71;

import java.util.HashMap;

/* compiled from: Primitives.java */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f19336a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19337b;

    static {
        HashMap map = new HashMap();
        f19336a = map;
        HashMap map2 = new HashMap();
        f19337b = map2;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        Class cls2 = Character.TYPE;
        map.put(Character.class, cls2);
        Class cls3 = Byte.TYPE;
        map.put(Byte.class, cls3);
        Class cls4 = Short.TYPE;
        map.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(Integer.class, cls5);
        Class cls6 = Long.TYPE;
        map.put(Long.class, cls6);
        Class cls7 = Float.TYPE;
        map.put(Float.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(Double.class, cls8);
        Boolean bool = Boolean.FALSE;
        map2.put(Boolean.class, bool);
        map2.put(Character.class, (char) 0);
        map2.put(Byte.class, (byte) 0);
        map2.put(Short.class, (short) 0);
        map2.put(Integer.class, 0);
        map2.put(Long.class, 0L);
        Float fValueOf = Float.valueOf(0.0f);
        map2.put(Float.class, fValueOf);
        Double dValueOf = Double.valueOf(0.0d);
        map2.put(Double.class, dValueOf);
        map2.put(cls, bool);
        map2.put(cls2, (char) 0);
        map2.put(cls3, (byte) 0);
        map2.put(cls4, (short) 0);
        map2.put(cls5, 0);
        map2.put(cls6, 0L);
        map2.put(cls7, fValueOf);
        map2.put(cls8, dValueOf);
    }

    public static <T> Class<T> a(Class<T> cls) {
        return cls.isPrimitive() ? cls : (Class) f19336a.get(cls);
    }
}
