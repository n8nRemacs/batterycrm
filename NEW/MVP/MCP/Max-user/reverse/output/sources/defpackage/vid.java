package defpackage;

/* loaded from: classes.dex */
public abstract class vid {
    public static final wid a;

    static {
        wid widVar = null;
        try {
            widVar = (wid) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (widVar == null) {
            widVar = new wid();
        }
        a = widVar;
    }

    public static ca3 a(Class cls) {
        a.getClass();
        return new ca3(cls);
    }
}
