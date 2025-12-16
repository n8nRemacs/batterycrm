package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* loaded from: classes2.dex */
public final class nt8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarPermissionWidget X;
    public final /* synthetic */ FrameLayout Y;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt8(MediaBarPermissionWidget mediaBarPermissionWidget, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.X = mediaBarPermissionWidget;
        this.Y = frameLayout;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        nt8 nt8Var = (nt8) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nt8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nt8 nt8Var = new nt8(this.X, this.Y, continuation);
        nt8Var.o = ((Boolean) obj).booleanValue();
        return nt8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        View rootView;
        g8j.b(obj);
        boolean z = this.o;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.X;
        if (z) {
            rootView = ((j02) mediaBarPermissionWidget.d.getValue()).getRootView();
            f8j.d(rootView, 300L, new mt8(mediaBarPermissionWidget, 2));
        } else {
            sn0 sn0Var = mediaBarPermissionWidget.c;
            yy7 yy7Var = MediaBarPermissionWidget.Y[0];
            rootView = (LinearLayout) sn0Var.getValue();
        }
        FrameLayout frameLayout = this.Y;
        frameLayout.removeAllViews();
        frameLayout.addView(rootView);
        return qqg.a;
    }
}
