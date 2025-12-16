package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class l61 implements mi4 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean o;

    public l61(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.o = z4;
        this.X = z5;
    }

    @Override // defpackage.mi4
    public final Object a() {
        CallScreen.N0.getClass();
        return new CallScreen(gwi.b(new imb("type", "LINK"), new imb("link", this.a), new imb("is_video_call", Boolean.valueOf(this.b)), new imb("video_enabled", Boolean.valueOf(this.c)), new imb("microphone_enabled", Boolean.valueOf(this.d)), new imb("front_camera_enabled", Boolean.valueOf(this.o)), new imb("is_new", Boolean.valueOf(this.X))));
    }
}
