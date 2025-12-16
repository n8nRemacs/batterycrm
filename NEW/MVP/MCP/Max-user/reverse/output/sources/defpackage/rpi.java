package defpackage;

/* loaded from: classes.dex */
public final class rpi extends uai {
    public final hx5 d;
    public final n2g e;
    public final /* synthetic */ sri f;

    public rpi(sri sriVar, n2g n2gVar) {
        hx5 hx5Var = new hx5("OnRequestInstallCallback", 1);
        this.f = sriVar;
        super(3);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.d = hx5Var;
        this.e = n2gVar;
    }
}
