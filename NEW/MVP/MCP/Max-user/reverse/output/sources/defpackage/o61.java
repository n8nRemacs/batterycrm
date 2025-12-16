package defpackage;

import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class o61 implements mi4 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public o61(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // defpackage.mi4
    public final Object a() {
        CallIncomingScreen.s0.getClass();
        return new CallIncomingScreen(gwi.b(new imb("call_incoming_avatar", this.c), new imb("call_incoming_name", this.b), new imb("call_incoming_chat_id", Long.valueOf(this.a)), new imb("call_incoming_video", Boolean.valueOf(this.d))));
    }
}
