package defpackage;

import android.view.View;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class no2 implements abh {
    public final /* synthetic */ ChatMediaViewerScreen a;

    public no2(ChatMediaViewerScreen chatMediaViewerScreen) {
        this.a = chatMediaViewerScreen;
    }

    @Override // defpackage.abh
    public final void a(g2h g2hVar) {
        ca9 ca9Var;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        if (!chatMediaViewerScreen.S0() || (ca9Var = chatMediaViewerScreen.B0) == null) {
            return;
        }
        ca9Var.b(4);
    }

    @Override // defpackage.abh
    public final void d() {
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (chatMediaViewerScreen.S0()) {
            ca9 ca9Var = chatMediaViewerScreen.B0;
            if (ca9Var != null) {
                ca9Var.b(2);
            }
            chatMediaViewerScreen.Q0().x();
        }
    }

    @Override // defpackage.abh
    public final void g() {
        ca9 ca9Var;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (!chatMediaViewerScreen.S0() || (ca9Var = chatMediaViewerScreen.B0) == null) {
            return;
        }
        ca9Var.b(2);
    }

    @Override // defpackage.abh
    public final void h(boolean z) {
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        if (chatMediaViewerScreen.S0()) {
            ca9 ca9Var = chatMediaViewerScreen.B0;
            if (ca9Var != null) {
                ca9Var.b(z ? 3 : 2);
            }
            ChatMediaViewerScreen.H0(chatMediaViewerScreen);
        }
    }

    @Override // defpackage.abh
    public final void o() {
        ca9 ca9Var;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (!chatMediaViewerScreen.S0() || (ca9Var = chatMediaViewerScreen.B0) == null) {
            return;
        }
        ca9Var.b(2);
    }

    @Override // defpackage.abh
    public final void r() {
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        if (chatMediaViewerScreen.O0().d() && chatMediaViewerScreen.S0()) {
            ca9 ca9Var = chatMediaViewerScreen.B0;
            if (ca9Var != null) {
                ca9Var.b(3);
            }
            ChatMediaViewerScreen.H0(chatMediaViewerScreen);
        }
    }

    @Override // defpackage.abh
    public final void w() {
        ca9 ca9Var;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        if (!chatMediaViewerScreen.S0() || (ca9Var = chatMediaViewerScreen.B0) == null) {
            return;
        }
        ca9Var.b(4);
    }

    @Override // defpackage.abh
    public final void z(Throwable th) {
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        if (chatMediaViewerScreen.S0()) {
            chatMediaViewerScreen.U0(true);
            ca9 ca9Var = chatMediaViewerScreen.B0;
            if (ca9Var != null) {
                ca9Var.b(5);
            }
        }
    }
}
