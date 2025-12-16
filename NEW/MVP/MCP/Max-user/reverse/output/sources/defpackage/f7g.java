package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f7g implements t98 {
    public final boolean a;
    public final String b;
    public final h5b c;
    public final Drawable d;

    public f7g(boolean z, String str, h5b h5bVar, Drawable drawable) {
        this.a = z;
        this.b = str;
        this.c = h5bVar;
        this.d = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.graphics.drawable.Drawable] */
    public static f7g l(f7g f7gVar, boolean z, c7g c7gVar, int i) {
        if ((i & 1) != 0) {
            z = f7gVar.a;
        }
        String str = f7gVar.b;
        h5b h5bVar = f7gVar.c;
        c7g c7gVar2 = c7gVar;
        if ((i & 8) != 0) {
            c7gVar2 = f7gVar.d;
        }
        return new f7g(z, str, h5bVar, c7gVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7g)) {
            return false;
        }
        f7g f7gVar = (f7g) obj;
        return this.a == f7gVar.a && fni.a(this.b, f7gVar.b) && fni.a(this.c, f7gVar.c) && fni.a(this.d, f7gVar.d);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.b.hashCode();
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return getItemId() == t98Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + u45.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Drawable drawable = this.d;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        boolean z;
        f7g f7gVar = t98Var instanceof f7g ? (f7g) t98Var : null;
        if (f7gVar == null || this.a == (z = f7gVar.a)) {
            return null;
        }
        return new e7g(z);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 0;
    }

    public final String n() {
        h5b h5bVar = h5b.d;
        h5b h5bVar2 = h5b.d;
        h5b h5bVar3 = this.c;
        return fni.a(h5bVar3, h5bVar2) ? "space" : fni.a(h5bVar3, h5b.e) ? "nature" : fni.a(h5bVar3, h5b.f) ? "neon" : fni.a(h5bVar3, h5b.g) ? "simple" : fni.a(h5bVar3, h5b.h) ? "Moscow" : "unknown";
    }

    public final String toString() {
        return "ThemeItem(isSelected=" + this.a + ", themeName=" + this.b + ", theme=" + this.c + ", backgroundDrawable=" + this.d + ")";
    }
}
