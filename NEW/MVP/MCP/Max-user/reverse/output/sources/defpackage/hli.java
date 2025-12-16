package defpackage;

/* loaded from: classes.dex */
public final class hli extends jli {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ jli o;

    public hli(jli jliVar, int i, int i2) {
        this.o = jliVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.dli
    public final Object[] a() {
        return this.o.a();
    }

    @Override // defpackage.dli
    public final int b() {
        return this.o.b() + this.c;
    }

    @Override // defpackage.dli
    public final int c() {
        return this.o.b() + this.c + this.d;
    }

    @Override // defpackage.dli
    public final boolean d() {
        return true;
    }

    @Override // defpackage.jli, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jli subList(int i, int i2) {
        dvi.f(i, i2, this.d);
        int i3 = this.c;
        return this.o.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        dvi.e(i, this.d);
        return this.o.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
