package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class haa implements ju3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ haa(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((hbh) obj).a = this.b;
                break;
            default:
                hbh hbhVar = (hbh) obj;
                hbhVar.b = this.b;
                hbhVar.c = false;
                break;
        }
    }
}
