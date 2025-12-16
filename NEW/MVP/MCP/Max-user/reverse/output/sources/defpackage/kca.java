package defpackage;

/* loaded from: classes.dex */
public enum kca {
    WEBRTC("jingle_peerconnection_so"),
    TENSORFLOW("tensorflowlite");

    public final String a;
    public final String b;

    kca(String str) {
        this.a = str;
        this.b = ho7.i("lib", str, ".so");
    }
}
