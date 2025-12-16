package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class m61 implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ m61(long j, boolean z, boolean z2, int i) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                CallScreen.N0.getClass();
                return new CallScreen(gwi.b(new imb("type", "ONE_TO_ONE"), new imb("opponent_id", Long.valueOf(this.b)), new imb("video_enabled", Boolean.valueOf(this.c)), new imb("microphone_enabled", Boolean.valueOf(this.d))));
            default:
                CallScreen.N0.getClass();
                return new CallScreen(gwi.b(new imb("type", "CHAT"), new imb("chat_id", Long.valueOf(this.b)), new imb("video_enabled", Boolean.valueOf(this.c)), new imb("microphone_enabled", Boolean.valueOf(this.d))));
        }
    }
}
