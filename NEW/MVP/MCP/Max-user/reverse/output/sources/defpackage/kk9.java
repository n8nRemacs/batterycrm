package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class kk9 implements lk9 {
    public final long a;
    public final Layout b;
    public final Layout c;

    public kk9(long j, Layout layout, Layout layout2) {
        this.a = j;
        this.b = layout;
        this.c = layout2;
    }

    @Override // defpackage.lk9
    public final Layout a() {
        return this.b;
    }

    @Override // defpackage.lk9
    public final Layout b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk9)) {
            return false;
        }
        kk9 kk9Var = (kk9) obj;
        return this.a == kk9Var.a && fni.a(this.b, kk9Var.b) && fni.a(this.c, kk9Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Layout layout = this.c;
        return iHashCode + (layout == null ? 0 : layout.hashCode());
    }

    public final String toString() {
        return "User(senderId=" + this.a + ", bodyLayout=" + this.b + ", forwardedTitleLayout=" + this.c + ")";
    }
}
