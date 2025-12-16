package defpackage;

/* loaded from: classes.dex */
public final class vci extends zci {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zci o;

    public vci(zci zciVar, int i, int i2) {
        this.o = zciVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.pci
    public final int b() {
        return this.o.c() + this.c + this.d;
    }

    @Override // defpackage.pci
    public final int c() {
        return this.o.c() + this.c;
    }

    @Override // defpackage.pci
    public final Object[] d() {
        return this.o.d();
    }

    @Override // defpackage.zci, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zci subList(int i, int i2) {
        kvi.e(i, i2, this.d);
        int i3 = this.c;
        return this.o.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        kvi.c(i, this.d);
        return this.o.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
