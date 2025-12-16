package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class lub implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mub b;

    public /* synthetic */ lub(mub mubVar, int i) {
        this.a = i;
        this.b = mubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        mub mubVar = this.b;
        switch (i) {
            case 0:
                mubVar.d();
                break;
            default:
                try {
                    mubVar.d();
                    break;
                } catch (Exception e) {
                    wqi.b("mub", "syncInternal: exception", e);
                    ((y3b) mubVar.h).a(new IllegalStateException("mub".concat(" syncInternal: exception"), e));
                    return;
                }
        }
    }
}
