package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import j.N;
import j.P;
import j.X;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f44629a;

    /* renamed from: b, reason: collision with root package name */
    public final LocusId f44630b;

    /* compiled from: LocusIdCompat.java */
    @X
    public static class a {
        @N
        public static LocusId a(@N String str) {
            return new LocusId(str);
        }
    }

    public h(@N String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f44629a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f44630b = a.a(str);
        } else {
            this.f44630b = null;
        }
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        String str = ((h) obj).f44629a;
        String str2 = this.f44629a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f44629a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f44629a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
