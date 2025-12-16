package defpackage;

import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class eb1 implements ts1 {
    public final /* synthetic */ CallIncomingScreen a;

    public eb1(CallIncomingScreen callIncomingScreen) {
        this.a = callIncomingScreen;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ts1
    public final void j() {
        CallIncomingScreen callIncomingScreen = this.a;
        bsb bsbVar = callIncomingScreen.b;
        s2i s2iVar = (s2i) callIncomingScreen.Y.getValue();
        qsb qsbVarB = bsbVar.b();
        String[] strArr = qsb.m;
        if (!qsbVarB.c(strArr)) {
            qsb qsbVarB2 = bsbVar.b();
            qsbVarB2.getClass();
            qsb.n(qsbVarB2, s2iVar, strArr, 183, i4d.permissions_calls_video_preview_request, i4d.permissions_video_message_request_only_camera_title, 32);
        } else {
            mb1 mb1VarA0 = callIncomingScreen.A0();
            Object value = callIncomingScreen.A0().t0.getValue();
            mb1VarA0.u(!((value instanceof hb1 ? (hb1) value : null) == null ? false : r0.b));
        }
    }
}
