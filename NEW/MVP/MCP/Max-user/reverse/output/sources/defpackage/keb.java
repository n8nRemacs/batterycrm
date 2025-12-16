package defpackage;

/* loaded from: classes2.dex */
public final class keb extends i3 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ meb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keb(aya ayaVar, meb mebVar) {
        super(12, ayaVar);
        this.d = mebVar;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a((aya) obj, (aya) obj2)) {
                    meb.a(this.d);
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    meb.a(this.d);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public keb(meb mebVar) {
        Boolean bool = Boolean.TRUE;
        this.d = mebVar;
        super(12, bool);
    }
}
