package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class wtg implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bug b;

    public /* synthetic */ wtg(bug bugVar, int i) {
        this.a = i;
        this.b = bugVar;
    }

    @Override // defpackage.p6
    public final void run() {
        int i = this.a;
        bug bugVar = this.b;
        switch (i) {
            case 0:
                wqi.c("aug", "getUploadFromRepository: upload not found in cache,  uploadData=%s", bugVar);
                break;
            default:
                wqi.c("aug", "removeUploadFromRepository: finished for data=" + bugVar, new Object[0]);
                break;
        }
    }
}
