package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class k63 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object o;

    public /* synthetic */ k63(Object obj, long j, long j2, long j3, int i) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((w63) this.o).i().x0(this.b, this.c, this.d, -1, false);
            default:
                return new ez5((hwa) this.o, this.b, this.c, this.d);
        }
    }
}
