package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* loaded from: classes.dex */
public final class qt1 extends FrameLayout implements eob {
    public static final /* synthetic */ int y0 = 0;
    public final bwf a;
    public final Handler b;
    public TextureViewRenderer c;
    public ot1 d;
    public cm6 o;
    public txg s0;
    public boolean t0;
    public vch u0;
    public final Object v0;
    public boolean w0;
    public boolean x0;

    public qt1(Context context) {
        x4h videoLayoutUpdatesController;
        super(context, null, 0);
        this.a = new bwf(new jl1(14));
        this.b = new Handler(Looper.getMainLooper());
        this.v0 = ipi.b(3, new hk1(2, this));
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(new es0(4, this));
        if (!isLaidOut() || this.c == null || (videoLayoutUpdatesController = getVideoLayoutUpdatesController()) == null) {
            return;
        }
        videoLayoutUpdatesController.a(this, this.u0);
    }

    public static void a(qt1 qt1Var) {
        qt1Var.b.post(qt1Var.getUpdateWhenReadyRunnable());
    }

    public static void b(qt1 qt1Var) {
        if (qt1Var.x0) {
            return;
        }
        ot1 ot1Var = qt1Var.d;
        if (ot1Var != null) {
            ot1Var.c(true);
        }
        qt1Var.x0 = true;
        x4h videoLayoutUpdatesController = qt1Var.getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            ((hw1) ((tv1) videoLayoutUpdatesController.d.getValue())).U0 = true;
        }
    }

    private final FrameLayout.LayoutParams getParams() {
        if (this.w0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Runnable getUpdateWhenReadyRunnable() {
        return (Runnable) this.v0.getValue();
    }

    private final fob getVideoController() {
        return (fob) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x4h getVideoLayoutUpdatesController() {
        cm6 cm6Var = this.o;
        if (cm6Var != null) {
            return (x4h) cm6Var.invoke();
        }
        return null;
    }

    public final void d() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            vch vchVar = this.u0;
            if (vchVar != null) {
                fob videoController = getVideoController();
                ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = vchVar.b;
                gob gobVar = (gob) videoController;
                gobVar.getClass();
                gobVar.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
            }
            x4h videoLayoutUpdatesController = getVideoLayoutUpdatesController();
            if (videoLayoutUpdatesController != null) {
                videoLayoutUpdatesController.c(textureViewRenderer);
            }
            ((gob) getVideoController()).getClass();
            textureViewRenderer.release();
            removeAllViews();
        }
        ot1 ot1Var = this.d;
        if (ot1Var != null) {
            ot1Var.c(false);
        }
        this.u0 = null;
        this.c = null;
        this.x0 = false;
        this.b.removeCallbacks(getUpdateWhenReadyRunnable());
        ((gob) getVideoController()).o.remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt1.e():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
        x4h videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.a(this, this.u0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x4h videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.c(this);
        }
        d();
    }

    public final void setFullScreen(boolean z) {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            setLayoutParams(getParams());
            textureViewRenderer.setLayoutParams(layoutParams);
        }
        this.w0 = z;
    }

    public final void setListener(ot1 ot1Var) {
        this.d = ot1Var;
    }

    public final void setVideoLayoutUpdatesControllerProvider(cm6 cm6Var) {
        this.o = cm6Var;
    }
}
