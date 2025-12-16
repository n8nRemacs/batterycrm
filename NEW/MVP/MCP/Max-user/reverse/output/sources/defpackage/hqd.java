package defpackage;

/* loaded from: classes.dex */
public final class hqd extends c2 {
    public int c;
    public int d;
    public final /* synthetic */ iqd o;

    public hqd(iqd iqdVar) {
        this.o = iqdVar;
        this.c = iqdVar.d;
        this.d = iqdVar.c;
    }

    @Override // defpackage.c2
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        iqd iqdVar = this.o;
        Object[] objArr = iqdVar.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % iqdVar.b;
        this.c = i - 1;
    }
}
