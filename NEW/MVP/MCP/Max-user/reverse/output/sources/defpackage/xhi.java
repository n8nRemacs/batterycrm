package defpackage;

/* loaded from: classes.dex */
public final class xhi extends zhi {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zhi o;

    public xhi(zhi zhiVar, int i, int i2) {
        this.o = zhiVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.qhi
    public final int b() {
        return this.o.c() + this.c + this.d;
    }

    @Override // defpackage.qhi
    public final int c() {
        return this.o.c() + this.c;
    }

    @Override // defpackage.qhi
    public final Object[] d() {
        return this.o.d();
    }

    @Override // defpackage.zhi, java.util.List
    /* renamed from: e */
    public final zhi subList(int i, int i2) {
        rui.d(i, i2, this.d);
        int i3 = this.c;
        return this.o.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        rui.c(i, this.d);
        return this.o.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
