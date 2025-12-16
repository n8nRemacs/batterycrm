package defpackage;

/* loaded from: classes.dex */
public final class gv extends e9j {
    public final /* synthetic */ hv a;

    public gv(hv hvVar) {
        this.a = hvVar;
    }

    @Override // defpackage.e9j
    public final boolean b(int i, int i2) {
        hv hvVar = this.a;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((f9j) hvVar.o.b.c).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.e9j
    public final boolean c(int i, int i2) {
        hv hvVar = this.a;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((f9j) hvVar.o.b.c).b(obj, obj2);
    }

    @Override // defpackage.e9j
    public final Object d(int i, int i2) {
        hv hvVar = this.a;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((f9j) hvVar.o.b.c).c(obj, obj2);
    }

    @Override // defpackage.e9j
    public final int e() {
        return this.a.b.size();
    }

    @Override // defpackage.e9j
    public final int f() {
        return this.a.a.size();
    }
}
