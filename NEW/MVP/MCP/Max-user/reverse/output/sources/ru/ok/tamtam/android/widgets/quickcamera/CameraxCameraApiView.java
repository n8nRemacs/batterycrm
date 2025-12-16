package ru.ok.tamtam.android.widgets.quickcamera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.a9c;
import defpackage.bwf;
import defpackage.da0;
import defpackage.dhd;
import defpackage.f32;
import defpackage.fb0;
import defpackage.hk1;
import defpackage.i02;
import defpackage.itc;
import defpackage.j02;
import defpackage.jei;
import defpackage.k;
import defpackage.lbh;
import defpackage.o22;
import defpackage.o38;
import defpackage.p22;
import defpackage.q22;
import defpackage.s6b;
import defpackage.u32;
import defpackage.wib;
import defpackage.wqi;
import defpackage.x8c;
import defpackage.xk6;
import defpackage.z7;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002$$J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010 *\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView;", "Landroid/widget/FrameLayout;", "Lj02;", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "Litc;", "sizeSelector", "Lqqg;", "setPictureSize", "(Litc;)V", "Llbh;", "videoQuality", "setVideoQuality", "(Llbh;)V", "Lq22;", "cameraListener", "setCameraListener", "(Lq22;)V", "", "flash", "setFlash", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "getStatusBarHeight", "()I", "Lxk6;", "getFreezeCameraDetector", "()Lxk6;", "getFreezeCameraDetector$delegate", "(Lru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView;)Ljava/lang/Object;", "freezeCameraDetector", "t32", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraxCameraApiView extends FrameLayout implements j02 {
    public static final /* synthetic */ int u0 = 0;
    public final Executor a;
    public final a9c b;
    public final o38 c;
    public final p22 d;
    public final bwf o;
    public q22 s0;
    public dhd t0;

    public CameraxCameraApiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xk6 getFreezeCameraDetector() {
        return (xk6) this.o.getValue();
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        Insets insets;
        Window window;
        Context context = getContext();
        View decorView = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = new Rect();
            if (decorView != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            return rect.top;
        }
        if (decorView == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (insets = rootWindowInsets.getInsets(1)) == null) {
            return 0;
        }
        return insets.top;
    }

    public final void b() {
        try {
            this.c.m(1);
        } catch (IllegalStateException e) {
            wqi.e(CameraxCameraApiView.class.getName(), "failed to enable photo-mode", e);
            q22 q22Var = this.s0;
            if (q22Var != null) {
                ((s6b) q22Var).c(new CameraExceptionImpl(e));
            }
        }
    }

    public final void c() {
        p22 p22Var = this.d;
        o38 o38Var = this.c;
        wqi.c(CameraxCameraApiView.class.getName(), "startPreviewCamera", new Object[0]);
        try {
            o38Var.getClass();
            jei.b();
            o38Var.H = p22Var;
            o38Var.r(null);
            p22Var.getClass();
            p22Var.a(new o22(p22Var, 0));
        } catch (IllegalStateException e) {
            wqi.e(CameraxCameraApiView.class.getName(), "failed to bind camera controller, start preview aborted", e);
            o38Var.w();
            q22 q22Var = this.s0;
            if (q22Var != null) {
                ((s6b) q22Var).c(new CameraExceptionImpl(e));
            }
        }
    }

    public final void d() {
        wqi.c(CameraxCameraApiView.class.getName(), "stopPreviewCamera", new Object[0]);
        p22 p22Var = this.d;
        p22Var.getClass();
        p22Var.a(new o22(p22Var, 2));
        if (this.o.e()) {
            getFreezeCameraDetector().a();
        }
    }

    @Override // android.view.View, defpackage.j02
    public View getRootView() {
        return this;
    }

    @Override // defpackage.j02
    public void setCameraListener(q22 cameraListener) {
        this.s0 = cameraListener;
    }

    @Override // defpackage.j02
    public void setFlash(String flash) {
        int iOrdinal = i02.valueOf(flash).ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            int i2 = 1;
            if (iOrdinal != 1) {
                i2 = 0;
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i = i2;
        }
        this.c.n(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        this.b.setOnClickListener(l);
    }

    public void setPictureSize(itc sizeSelector) {
    }

    public void setVideoQuality(lbh videoQuality) {
        int iOrdinal = videoQuality.ordinal();
        o38 o38Var = this.c;
        switch (iOrdinal) {
            case 0:
                o38Var.o(wib.w(fb0.h, da0.c));
                return;
            case 1:
                o38Var.o(wib.w(fb0.i, da0.c));
                return;
            case 2:
                o38Var.o(wib.w(fb0.h, da0.c));
                return;
            case 3:
                o38Var.o(wib.w(fb0.d, da0.c));
                return;
            case 4:
                o38Var.o(wib.w(fb0.e, da0.c));
                return;
            case 5:
                o38Var.o(wib.w(fb0.f, da0.c));
                return;
            case 6:
                o38Var.o(wib.w(fb0.g, da0.c));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public CameraxCameraApiView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.a = z7.d(context);
        a9c a9cVar = new a9c(context);
        this.b = a9cVar;
        o38 o38Var = new o38(context);
        this.c = o38Var;
        p22 p22Var = new p22();
        this.d = p22Var;
        this.o = new bwf(new hk1(5, this));
        a9cVar.setKeepScreenOn(true);
        addView(a9cVar, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels + getStatusBarHeight()));
        a9cVar.getPreviewStreamState().e(p22Var, new u32(new k(28, this)));
        a9cVar.setImplementationMode(x8c.COMPATIBLE);
        o38Var.l(f32.c);
        o38Var.m(1);
        a9cVar.getViewPort();
        jei.b();
        o38Var.w = true;
        a9cVar.setController(o38Var);
    }
}
