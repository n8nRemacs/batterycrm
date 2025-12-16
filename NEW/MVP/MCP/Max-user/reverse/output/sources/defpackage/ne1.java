package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;

/* loaded from: classes.dex */
public final class ne1 extends dtf implements sm6 {
    public final /* synthetic */ CallJoinLinkPreviewWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.X = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ne1 ne1Var = (ne1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ne1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ne1 ne1Var = new ne1(continuation, this.X);
        ne1Var.o = obj;
        return ne1Var;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ae1 ae1Var = (ae1) this.o;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.X;
        it1 it1Var = (it1) callJoinLinkPreviewWidget.u0.D(callJoinLinkPreviewWidget, CallJoinLinkPreviewWidget.A0[6]);
        it1Var.setAvatar(ae1Var.a);
        ms8 ms8Var = ae1Var.c;
        ms8 ms8Var2 = ms8.b;
        it1Var.setButtonAction(ms8Var == ms8Var2 ? uxg.b : uxg.d);
        it1Var.G(ms8Var == ms8Var2, ae1Var.d);
        it1Var.H(null, null);
        callJoinLinkPreviewWidget.A0().setText(ae1Var.e.b(callJoinLinkPreviewWidget.getContext()));
        CallJoinLinkPreviewWidget.D0(callJoinLinkPreviewWidget.y0(), (Drawable) callJoinLinkPreviewWidget.w0.getValue(), (Drawable) callJoinLinkPreviewWidget.v0.getValue(), ae1Var.b, new n5g(d3d.call_microphone_enabled_accessibility), new n5g(d3d.call_microphone_disabled_accessibility));
        CallJoinLinkPreviewWidget.D0(callJoinLinkPreviewWidget.B0(), (Drawable) callJoinLinkPreviewWidget.y0.getValue(), (Drawable) callJoinLinkPreviewWidget.x0.getValue(), ae1Var.c, new n5g(d3d.call_video_enabled_accessibility), new n5g(d3d.call_video_disabled_accessibility));
        kdb kdbVarZ0 = callJoinLinkPreviewWidget.z0();
        kdbVarZ0.setAvatars(ae1Var.f);
        kdbVarZ0.setTitle(ae1Var.g);
        return qqg.a;
    }
}
