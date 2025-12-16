package defpackage;

/* loaded from: classes2.dex */
public final class b9d extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c9d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9d(x8d x8dVar, c9d c9dVar) {
        super(12, x8dVar);
        this.c = 1;
        this.d = c9dVar;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    c9d c9dVar = this.d;
                    if (!zBooleanValue && zBooleanValue2) {
                        c9dVar.a(true);
                        break;
                    } else {
                        c9dVar.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    this.d.v0.setText(((x8d) obj2).a);
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    this.d.w0.g(iIntValue, true);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b9d(c9d c9dVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                this.d = c9dVar;
                super(12, (Object) 0);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.d = c9dVar;
                super(12, bool);
                break;
        }
    }
}
