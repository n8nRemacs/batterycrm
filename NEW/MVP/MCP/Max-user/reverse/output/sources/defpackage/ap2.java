package defpackage;

import android.animation.Animator;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class ap2 implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    public ap2(float f, ChatMediaViewerScreen chatMediaViewerScreen, boolean z) {
        this.d = f;
        this.b = chatMediaViewerScreen;
        this.c = z;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ca9 ca9Var;
        switch (this.a) {
            case 0:
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
                if (this.d == 0.0f) {
                    yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
                    chatMediaViewerScreen.P0().setVisibility(8);
                    chatMediaViewerScreen.N0().setVisibility(8);
                    d52 d52VarL0 = chatMediaViewerScreen.L0();
                    if (d52VarL0 != null) {
                        d52VarL0.setVisibility(8);
                    }
                    if (this.c && (ca9Var = chatMediaViewerScreen.B0) != null) {
                        ca9Var.c(false);
                    }
                    za0 za0Var = chatMediaViewerScreen.C0;
                    if (za0Var != null) {
                        za0Var.e(false);
                    }
                    chatMediaViewerScreen.K0(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationStart(android.animation.Animator r8) {
        /*
            r7 = this;
            int r8 = r7.a
            r0 = 8
            r1 = 0
            boolean r2 = r7.c
            float r3 = r7.d
            java.lang.Object r4 = r7.b
            switch(r8) {
                case 0: goto La8;
                case 1: goto L1a;
                default: goto Le;
            }
        Le:
            bgb r4 = (defpackage.bgb) r4
            r4.setAlpha(r3)
            if (r2 == 0) goto L16
            r0 = r1
        L16:
            r4.setVisibility(r0)
            return
        L1a:
            one.me.chatmedia.viewer.ChatMediaViewerScreen r4 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r4
            yy7[] r8 = one.me.chatmedia.viewer.ChatMediaViewerScreen.Q0
            yfb r8 = r4.P0()
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L29
            goto L30
        L29:
            yfb r8 = r4.P0()
            r8.setVisibility(r1)
        L30:
            dk7 r8 = r4.N0()
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L3b
            goto L42
        L3b:
            dk7 r8 = r4.N0()
            r8.setVisibility(r1)
        L42:
            d52 r8 = r4.L0()
            r5 = 1
            if (r8 == 0) goto L75
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L50
            goto L75
        L50:
            d52 r8 = r4.L0()
            if (r8 == 0) goto L75
            d52 r6 = r4.L0()
            if (r6 == 0) goto L72
            yta r6 = r6.F0
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L6d
            boolean r6 = defpackage.vmf.F(r6)
            if (r6 == 0) goto L6b
            goto L6d
        L6b:
            r6 = r1
            goto L6e
        L6d:
            r6 = r5
        L6e:
            r6 = r6 ^ r5
            if (r6 != r5) goto L72
            r0 = r1
        L72:
            r8.setVisibility(r0)
        L75:
            if (r2 == 0) goto L7e
            ca9 r8 = r4.B0
            if (r8 == 0) goto L7e
            r8.c(r5)
        L7e:
            za0 r8 = r4.C0
            if (r8 == 0) goto L9c
            d52 r0 = r4.L0()
            if (r0 == 0) goto L98
            d52 r0 = r4.L0()
            if (r0 == 0) goto L93
            b52 r0 = r0.getState()
            goto L94
        L93:
            r0 = 0
        L94:
            b52 r2 = defpackage.b52.a
            if (r0 != r2) goto L99
        L98:
            r1 = r5
        L99:
            r8.e(r1)
        L9c:
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 != 0) goto La8
            r4.K0(r5)
            r4.W0()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap2.onAnimationStart(android.animation.Animator):void");
    }

    public ap2(bgb bgbVar, float f, boolean z) {
        this.b = bgbVar;
        this.d = f;
        this.c = z;
    }

    public ap2(ChatMediaViewerScreen chatMediaViewerScreen, boolean z, float f) {
        this.b = chatMediaViewerScreen;
        this.c = z;
        this.d = f;
    }
}
