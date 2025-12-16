package defpackage;

/* loaded from: classes2.dex */
public final class dng implements fng {
    public final n5g a;
    public final long b;
    public final int c;

    public dng(n5g n5gVar) {
        int i = e0d.oneme_settings_twofa_configuration_header_item;
        this.a = n5gVar;
        this.b = i;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dng)) {
            return false;
        }
        dng dngVar = (dng) obj;
        return this.a.equals(dngVar.a) && this.b == dngVar.b;
    }

    @Override // defpackage.fng
    public final int f() {
        return 4;
    }

    @Override // defpackage.fng
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + utb.k(4, xrf.k(0, Integer.hashCode(this.a.c) * 31, 31), 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=0, sectionItemType=" + ctd.v(4) + ", itemId=" + this.b + ")";
    }
}
