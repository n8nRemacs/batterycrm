package one.me.sdk.gallery;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.b1e;
import defpackage.bwf;
import defpackage.bz8;
import defpackage.cm6;
import defpackage.cz8;
import defpackage.dwa;
import defpackage.dz8;
import defpackage.ez8;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hab;
import defpackage.ho7;
import defpackage.imb;
import defpackage.io6;
import defpackage.iv8;
import defpackage.jp6;
import defpackage.k18;
import defpackage.kp6;
import defpackage.m01;
import defpackage.ma1;
import defpackage.mp6;
import defpackage.pt1;
import defpackage.qn2;
import defpackage.qp6;
import defpackage.rf5;
import defpackage.rsb;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tq6;
import defpackage.vid;
import defpackage.vpi;
import defpackage.wqi;
import defpackage.xfh;
import defpackage.xo6;
import defpackage.yf5;
import defpackage.yvi;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/gallery/MediaGalleryWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Lxo6;", "galleryMode", "(Ljava/lang/String;Lxo6;Ltk4;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaGalleryWidget extends Widget {
    public static final /* synthetic */ yy7[] Y;
    public final ma1 X;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final bwf d;
    public final sn0 o;

    static {
        toc tocVar = new toc(MediaGalleryWidget.class, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0);
        vid.a.getClass();
        Y = new yy7[]{tocVar};
    }

    public MediaGalleryWidget(String str, xo6 xo6Var, tk4 tk4Var) {
        this(gwi.b(new imb("arg_scope_id", new b1e(str)), new imb("arg_gallery_mode", xo6Var)));
    }

    public final tq6 A0() {
        return (tq6) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(y0());
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) throws Resources.NotFoundException {
        super.onViewCreated(view);
        tq6 tq6VarA0 = A0();
        qp6 qp6VarA = dwa.a(tq6VarA0.c);
        tq6VarA0.x0 = qp6VarA;
        wqi.c("tq6", "did recalculate uiOptions: " + qp6VarA, new Object[0]);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new pt1(this, 1, view));
        } else {
            int i = A0().x0.c;
            xfh.r(z0().c, new jp6((view.getWidth() / i) - (A0().x0.d - (A0().x0.d / i))));
            xfh.r(z0().c, new kp6(-y0().computeVerticalScrollOffset()));
        }
        yf5 yf5VarY0 = y0();
        yf5VarY0.setPager(this.X);
        yf5VarY0.setProgressView(hab.a);
        yf5VarY0.setHasFixedSize(true);
        yf5VarY0.setThreshold(A0().x0.b);
        yf5VarY0.setAdapter((io6) this.d.getValue());
        yf5VarY0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(A0().x0.c);
        gridLayoutManager.C = A0().x0.c * 4;
        yf5VarY0.setLayoutManager(gridLayoutManager);
        yf5VarY0.j(new m01(A0().x0.c, A0().x0.d, 5));
        A0().x0.getClass();
        yf5VarY0.setItemAnimator(null);
        yf5VarY0.m(new rf5(3, this));
        gw0.w(new g56(A0().w0, new bz8(this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(A0().D0, new cz8(this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(A0().z0, new dz8(this, null), 1), getViewLifecycleScope());
        vpi.b(new g56(z0().d, new ez8(this, null), 1), getViewLifecycleScope());
    }

    public final yf5 y0() {
        yy7 yy7Var = Y[0];
        return (yf5) this.o.getValue();
    }

    public final mp6 z0() {
        return (mp6) this.b.getValue();
    }

    public MediaGalleryWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = rsb.a.a();
        Object objA = yvi.a(bundle, "arg_scope_id", b1e.class);
        if (objA != null) {
            this.b = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, mp6.class, null);
            this.c = createViewModelLazy(tq6.class, new iv8(4, new qn2(bundle, 25, this)));
            final int i = 0;
            this.d = new bwf(new cm6(this) { // from class: az8
                public final /* synthetic */ MediaGalleryWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.cm6
                public final Object invoke() {
                    int i2 = i;
                    MediaGalleryWidget mediaGalleryWidget = this.b;
                    switch (i2) {
                        case 0:
                            yy7[] yy7VarArr = MediaGalleryWidget.Y;
                            return new io6(mediaGalleryWidget.A0());
                        default:
                            yy7[] yy7VarArr2 = MediaGalleryWidget.Y;
                            yf5 yf5Var = new yf5(mediaGalleryWidget.getContext(), null);
                            yf5Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            return yf5Var;
                    }
                }
            });
            final int i2 = 1;
            this.o = binding(new cm6(this) { // from class: az8
                public final /* synthetic */ MediaGalleryWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.cm6
                public final Object invoke() {
                    int i22 = i2;
                    MediaGalleryWidget mediaGalleryWidget = this.b;
                    switch (i22) {
                        case 0:
                            yy7[] yy7VarArr = MediaGalleryWidget.Y;
                            return new io6(mediaGalleryWidget.A0());
                        default:
                            yy7[] yy7VarArr2 = MediaGalleryWidget.Y;
                            yf5 yf5Var = new yf5(mediaGalleryWidget.getContext(), null);
                            yf5Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            return yf5Var;
                    }
                }
            });
            this.X = new ma1(this, 4);
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaGalleryWidget(String str, xo6 xo6Var, int i, tk4 tk4Var) {
        if ((i & 2) != 0) {
            Parcelable.Creator<xo6> creator = xo6.CREATOR;
            xo6Var = xo6.u0;
        }
        this(str, xo6Var, null);
    }
}
