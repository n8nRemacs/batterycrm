package defpackage;

/* loaded from: classes.dex */
public final class j3j extends n4j {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ n4j o;

    public j3j(n4j n4jVar, int i, int i2) {
        this.o = n4jVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.jyi
    public final int b() {
        return this.o.c() + this.c + this.d;
    }

    @Override // defpackage.jyi
    public final int c() {
        return this.o.c() + this.c;
    }

    @Override // defpackage.jyi
    public final Object[] d() {
        return this.o.d();
    }

    @Override // defpackage.n4j, java.util.List
    /* renamed from: e */
    public final n4j subList(int i, int i2) {
        gvi.f(i, i2, this.d);
        int i3 = this.c;
        return this.o.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        gvi.e(i, this.d);
        return this.o.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
