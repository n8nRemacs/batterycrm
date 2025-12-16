package defpackage;

/* loaded from: classes2.dex */
public final class uza extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vza d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uza(vza vzaVar, int i) {
        super(12, oza.b);
        this.c = i;
        this.d = vzaVar;
        switch (i) {
            case 1:
                super(12, nza.a);
                break;
            case 2:
                super(12, (Object) null);
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
                    this.d.invalidate();
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    this.d.invalidate();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    this.d.invalidate();
                    break;
                }
                break;
        }
    }
}
