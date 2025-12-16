package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ipb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;
    public final /* synthetic */ String c;

    public /* synthetic */ ipb(wpb wpbVar, String str, int i) {
        this.a = i;
        this.b = wpbVar;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, vpb] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wpb wpbVar = this.b;
                wpbVar.getClass();
                wpbVar.k("set sdp error " + this.c, "set.sdp2");
                wpbVar.B.log(hcf.callError, "setSdpFailed", (String) null);
                break;
            case 1:
                wpb wpbVar2 = this.b;
                wpbVar2.getClass();
                wpbVar2.k("create sdp error " + this.c, "create.sdp2");
                wpbVar2.B.log(hcf.callError, "onCreateSDPFailed", (String) null);
                break;
            default:
                wpb wpbVar3 = this.b;
                ?? r1 = wpbVar3.S;
                if (r1 != 0) {
                    r1.f(wpbVar3, this.c);
                    break;
                }
                break;
        }
    }
}
