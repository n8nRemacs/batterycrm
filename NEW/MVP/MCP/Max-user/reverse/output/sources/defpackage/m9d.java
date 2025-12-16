package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class m9d implements t98 {
    public final long X;
    public final long a;
    public final x8d b;
    public final Drawable c;
    public final boolean d;
    public final int o = cvd.b;

    public m9d(long j, x8d x8dVar, Drawable drawable, boolean z) {
        this.a = j;
        this.b = x8dVar;
        this.c = drawable;
        this.d = z;
        this.X = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d)) {
            return false;
        }
        m9d m9dVar = (m9d) obj;
        return this.a == m9dVar.a && fni.a(this.b, m9dVar.b) && fni.a(this.c, m9dVar.c) && this.d == m9dVar.d;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.o;
    }

    public final String toString() {
        return "ReactionModel(animojiId=" + this.a + ", reaction=" + ((Object) this.b) + ", reactionDrawable=" + this.c + ", selected=" + this.d + ")";
    }
}
