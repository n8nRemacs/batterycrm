package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class g6c implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6c b;

    public /* synthetic */ g6c(o6c o6cVar, int i) {
        this.a = i;
        this.b = o6cVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                i6c i6cVar = this.b.a;
                if (i6cVar != null) {
                    i6cVar.k();
                }
                return qqg.a;
            case 1:
                i6c i6cVar2 = this.b.a;
                if (i6cVar2 != null) {
                    i6cVar2.h();
                }
                return qqg.a;
            case 2:
                return new f6c(this.b.a);
            default:
                i6c i6cVar3 = this.b.a;
                if (i6cVar3 != null) {
                    i6cVar3.k();
                }
                return qqg.a;
        }
    }
}
