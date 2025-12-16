package defpackage;

/* loaded from: classes2.dex */
public final class o4f extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ p4f d;

    /* JADX WARN: Illegal instructions before constructor call */
    public o4f(p4f p4fVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                Float fValueOf = Float.valueOf(1.0f);
                this.d = p4fVar;
                super(12, fValueOf);
                break;
            case 2:
                Float fValueOf2 = Float.valueOf(1.0f);
                this.d = p4fVar;
                super(12, fValueOf2);
                break;
            default:
                Float fValueOf3 = Float.valueOf(0.0f);
                this.d = p4fVar;
                super(12, fValueOf3);
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    p4f p4fVar = this.d;
                    p4fVar.c(p4fVar.d);
                    p4fVar.e = p4fVar.a();
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    p4f p4fVar2 = this.d;
                    p4fVar2.c(p4fVar2.d);
                    p4fVar2.e = p4fVar2.a();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    p4f p4fVar3 = this.d;
                    p4fVar3.e = p4fVar3.a();
                    break;
                }
                break;
        }
    }
}
