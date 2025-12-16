package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public class zd7 extends OneMeDraweeView {
    public static final /* synthetic */ yy7[] N0 = {new z8a(zd7.class, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;"), u45.h(vid.a, zd7.class, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new z8a(zd7.class, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;"), new z8a(zd7.class, "remoteImageState", "getRemoteImageState()Lone/me/messages/list/ui/view/attach/ImageAttachDraweeView$RemoteImageState;")};
    public static final oh9 O0 = new oh9();
    public final yd7 C0;
    public final yd7 D0;
    public cm6 E0;
    public final yd7 F0;
    public boolean G0;
    public final yd7 H0;
    public pe4 I0;
    public int J0;
    public int K0;
    public final Object L0;
    public final Object M0;

    public zd7(Context context) {
        super(context);
        this.C0 = new yd7(this, 1);
        this.D0 = new yd7(od7.n, this);
        this.E0 = new i77(2);
        this.F0 = new yd7(this, 0);
        this.H0 = new yd7(this, 3);
        this.L0 = ipi.b(3, new ns2(context, 11));
        this.M0 = ipi.b(3, new e44(27, this));
        setId(j7b.M);
        up5 up5Var = ((gr6) getHierarchy()).e;
        up5Var.v0 = 0;
        if (up5Var.u0 == 1) {
            up5Var.u0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final w2c getDownloadDrawable() {
        return (w2c) this.L0.getValue();
    }

    private final td7 getRemoteImageState() {
        yy7 yy7Var = N0[3];
        return (td7) this.H0.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemoteImageState(td7 td7Var) {
        this.H0.O(this, N0[3], td7Var);
    }

    @Override // defpackage.o45
    public final void d() {
        super.d();
        pe4 pe4Var = this.I0;
        if (pe4Var != null) {
            pe4Var.close();
        }
        this.I0 = null;
    }

    public final od7 getImageAttach() {
        yy7 yy7Var = N0[1];
        return (od7) this.D0.b;
    }

    public final pe7 getImageInfo() {
        yy7 yy7Var = N0[2];
        return (pe7) this.F0.b;
    }

    public final int getMeasuredLayoutHeight() {
        return this.J0;
    }

    public final int getMeasuredLayoutWidth() {
        return this.K0;
    }

    public final cm6 getOnFinalImageSetCallback() {
        return this.E0;
    }

    public final Drawable getOverlayDrawable() {
        yy7 yy7Var = N0[0];
        return (Drawable) this.C0.b;
    }

    public final boolean getShowProgress() {
        return this.G0;
    }

    @Override // one.me.sdk.uikit.common.views.OneMeDraweeView
    public final void j(pe7 pe7Var, Animatable animatable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            if (getImageAttach().e && animatable != null) {
                animatable.start();
            }
            setImageInfo(pe7Var);
            getOnFinalImageSetCallback().invoke();
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new vd7(this, animatable, pe7Var, 0));
        } else {
            post(new vd7(this, animatable, pe7Var, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, k18] */
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!(getRemoteImageState() instanceof rd7) || !((r00) this.M0.getValue()).getBounds().contains(x, y)) {
            if (!(getRemoteImageState() instanceof sd7) || !getDownloadDrawable().getBounds().contains(x, y)) {
                return false;
            }
            n(getImageAttach(), true);
            return true;
        }
        pe4 pe4Var = this.I0;
        if (pe4Var != null) {
            pe4Var.close();
        }
        this.I0 = null;
        setRemoteImageState(sd7.a);
        return true;
    }

    public final void n(od7 od7Var, boolean z) {
        sf7 sf7VarD;
        sf7 sf7VarD2;
        pe4 pe4Var = this.I0;
        if (pe4Var != null) {
            pe4Var.close();
            this.I0 = null;
        }
        gr6 gr6Var = (gr6) getHierarchy();
        tyd tydVar = od7Var.j;
        ynd yndVar = od7Var.i;
        boolean z2 = od7Var.g;
        gr6Var.h(tydVar);
        setRemoteImageState(z2 ? sd7.a : this.G0 ? rd7.a : null);
        if (!z2 || z) {
            sf7VarD = sf7.d(od7Var.b);
            sf7VarD.d = yndVar;
        } else {
            sf7VarD = null;
        }
        Uri uri = od7Var.h;
        if (uri != null) {
            sf7VarD2 = sf7.d(uri);
            sf7VarD2.d = yndVar;
        } else {
            sf7VarD2 = null;
        }
        if (sf7VarD != null) {
            sf7VarD.l = new wd7(this);
        }
        i(sf7VarD != null ? sf7VarD.a() : null, sf7VarD2 != null ? sf7VarD2.a() : null);
        pe4 currentDataSource = getCurrentDataSource();
        this.I0 = currentDataSource;
        if (!this.G0 || currentDataSource == null) {
            return;
        }
        ((r0) currentDataSource).l(new nu5(1, this), yu1.a);
    }

    @Override // defpackage.o45, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i4 = getImageAttach().c;
        int i5 = getImageAttach().d;
        if (i4 <= 0 || i5 <= 0) {
            i5 = size / 2;
            i3 = size;
        } else {
            i3 = i4;
        }
        int i6 = i5;
        int i7 = getImageAttach().f;
        int iD = kti.d(120 * vw4.d().getDisplayMetrics().density);
        oh9 oh9Var = O0;
        qvi.b(size, size, i3, i6, iD, i7, oh9Var);
        this.J0 = oh9Var.b;
        this.K0 = oh9Var.a;
        setMeasuredDimension(oh9Var.c, oh9Var.d);
    }

    public final void setImageAttach(od7 od7Var) {
        this.D0.O(this, N0[1], od7Var);
    }

    public final void setImageInfo(pe7 pe7Var) {
        this.F0.O(this, N0[2], pe7Var);
    }

    public final void setMeasuredLayoutHeight(int i) {
        this.J0 = i;
    }

    public final void setMeasuredLayoutWidth(int i) {
        this.K0 = i;
    }

    public final void setOnFinalImageSetCallback(cm6 cm6Var) {
        this.E0 = cm6Var;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.C0.O(this, N0[0], drawable);
    }

    public final void setShowProgress(boolean z) {
        this.G0 = z;
    }
}
