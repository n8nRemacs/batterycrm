package defpackage;

/* loaded from: classes2.dex */
public final class eoa implements foa {
    public final xne X;
    public final int Y;
    public final n5g a;
    public final int b;
    public final long c;
    public final s5g d;
    public final foe o;

    public eoa(n5g n5gVar, int i, long j, n5g n5gVar2, foe foeVar, int i2) {
        n5gVar2 = (i2 & 16) != 0 ? null : n5gVar2;
        this.a = n5gVar;
        this.b = i;
        this.c = j;
        this.d = n5gVar2;
        this.o = foeVar;
        this.X = null;
        this.Y = z7b.o;
    }

    @Override // defpackage.foa, defpackage.ioe
    public final s5g a() {
        return this.d;
    }

    @Override // defpackage.foa, defpackage.ioe
    public final xne b() {
        return this.X;
    }

    @Override // defpackage.foa, defpackage.ioe
    public final foe d() {
        return this.o;
    }

    @Override // defpackage.foa, defpackage.ioe
    public final u18 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoa)) {
            return false;
        }
        eoa eoaVar = (eoa) obj;
        return this.a.equals(eoaVar.a) && this.b == eoaVar.b && this.c == eoaVar.c && fni.a(this.d, eoaVar.d) && this.o.equals(eoaVar.o) && fni.a(this.X, eoaVar.X);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    @Override // defpackage.foa, defpackage.ioe
    public final hoe getType() {
        return hoe.b;
    }

    public final int hashCode() {
        int iHashCode = (hoe.b.hashCode() + a9h.a(xrf.k(this.b, Integer.hashCode(this.a.c) * 31, 31), 31, this.c)) * 31;
        s5g s5gVar = this.d;
        int iHashCode2 = (this.o.hashCode() + ((iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31)) * 961;
        xne xneVar = this.X;
        return iHashCode2 + (xneVar != null ? xneVar.hashCode() : 0);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Y;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "NotificationsSettingItem(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + this.c + ", type=" + hoe.b + ", descriptionRes=" + this.d + ", endView=" + this.o + ", leadingElementProperties=null, counterType=" + this.X + ")";
    }
}
