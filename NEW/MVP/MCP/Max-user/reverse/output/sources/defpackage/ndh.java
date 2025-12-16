package defpackage;

/* loaded from: classes2.dex */
public final class ndh extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ odh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndh(odh odhVar, int i) {
        super(12, (Object) null);
        this.c = i;
        this.d = odhVar;
        switch (i) {
            case 1:
                super(12, idh.a);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    this.d.requestLayout();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    this.d.requestLayout();
                    break;
                }
                break;
        }
    }
}
