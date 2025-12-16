package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class l5h extends FrameLayout {
    public final Object a;
    public final Object b;
    public ViewPropertyAnimator c;
    public final OneMeDraweeView d;
    public final a9c o;
    public final b6h s0;

    public l5h(Context context) {
        super(context);
        this.a = ipi.b(3, new p2f(context, 10));
        this.b = ipi.b(3, new kvf(15, this));
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setId(m1b.v);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        oneMeDraweeView.setVisibility(0);
        ((gr6) oneMeDraweeView.getHierarchy()).k(getShimmerDrawable());
        this.d = oneMeDraweeView;
        a9c a9cVar = new a9c(context);
        a9cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        a9cVar.setVisibility(4);
        this.o = a9cVar;
        b6h b6hVar = new b6h(context);
        b6hVar.setId(m1b.x);
        b6hVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b6hVar.setPausingEnabled(false);
        this.s0 = b6hVar;
        addView(a9cVar);
        addView(b6hVar);
        addView(oneMeDraweeView);
        setKeepScreenOn(true);
        setClipToOutline(true);
        setOutlineProvider(new f83(this, 5));
    }

    public static void a(l5h l5hVar) {
        l5hVar.d.setVisibility(8);
        l5hVar.getShimmerDrawable().d();
        l5hVar.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final m72 getAllPostProcessor() {
        return (m72) this.a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ewe getShimmerDrawable() {
        return (ewe) this.b.getValue();
    }

    private static /* synthetic */ void getShimmerDrawable$annotations() {
    }

    public final Bitmap getFrameAsBitmap() {
        a9c a9cVar = this.o;
        if (a9cVar.getPreviewStreamState().d() == z8c.b) {
            return a9cVar.getBitmap();
        }
        return null;
    }

    public final x26 getPreviewStreamState() {
        return lc4.b(this.o.getPreviewStreamState());
    }

    public final q8c getSurfaceProvider() {
        return this.o.getSurfaceProvider();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getShimmerDrawable().d();
    }

    public final void setPlaceholder(String str) {
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.o.setVisibility(4);
        OneMeDraweeView oneMeDraweeView = this.d;
        oneMeDraweeView.setVisibility(0);
        oneMeDraweeView.setAlpha(1.0f);
        if (str != null) {
            sf7 sf7VarD = sf7.d(Uri.parse(str));
            sf7VarD.k = getAllPostProcessor();
            oneMeDraweeView.i(sf7VarD.a(), null);
        } else {
            ((gr6) oneMeDraweeView.getHierarchy()).i(new wq0(getContext(), a93.s0.y(this).a().G().b.l, 44.0f, false), 1);
        }
        getShimmerDrawable().c();
    }

    public final void setZoomListener(em6 em6Var) {
        this.o.setOnTouchListener(new ml1(5, em6Var));
    }
}
