package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f64 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(o02.d, o02.o, o02.X, o02.Y));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(p02.d, p02.a));
    public static final Set c;
    public static final Set d;

    static {
        n02 n02Var = n02.o;
        n02 n02Var2 = n02.d;
        n02 n02Var3 = n02.a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(n02Var, n02Var2, n02Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(n02Var2);
        enumSetCopyOf.remove(n02Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
