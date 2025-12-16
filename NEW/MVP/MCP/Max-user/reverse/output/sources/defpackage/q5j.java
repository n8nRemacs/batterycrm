package defpackage;

/* loaded from: classes.dex */
public final class q5j extends uai {
    public final ulc d;
    public final n2g e;
    public final /* synthetic */ p6j f;
    public final /* synthetic */ p6j g;

    public q5j(p6j p6jVar, n2g n2gVar, String str) {
        this.g = p6jVar;
        ulc ulcVar = new ulc("OnRequestInstallCallback");
        this.f = p6jVar;
        super(2);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.d = ulcVar;
        this.e = n2gVar;
    }
}
