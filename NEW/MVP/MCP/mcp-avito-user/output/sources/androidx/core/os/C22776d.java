package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import j.P;
import j.X;

/* compiled from: BundleCompat.java */
/* renamed from: androidx.core.os.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22776d {

    /* compiled from: BundleCompat.java */
    @X
    /* renamed from: androidx.core.os.d$a */
    public static class a {
        public static <T> T a(@j.N Bundle bundle, @P String str, @j.N Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    @P
    public static <T> T a(@j.N Bundle bundle, @P String str, @j.N Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t12 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t12)) {
            return t12;
        }
        return null;
    }
}
