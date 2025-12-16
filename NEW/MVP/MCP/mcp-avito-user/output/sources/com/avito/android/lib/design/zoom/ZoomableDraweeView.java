package com.avito.android.lib.design.zoom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.view.T;
import com.avito.android.lib.design.zoom.k;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import uW0.C48986a;

/* loaded from: classes14.dex */
public class ZoomableDraweeView extends SimpleDraweeView implements T {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f181289t = 0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f181290j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f181291k;

    /* renamed from: l, reason: collision with root package name */
    public k f181292l;

    /* renamed from: m, reason: collision with root package name */
    public final GestureDetector f181293m;

    /* renamed from: n, reason: collision with root package name */
    public j f181294n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181296p;

    /* renamed from: q, reason: collision with root package name */
    public final com.facebook.drawee.controller.e f181297q;

    /* renamed from: r, reason: collision with root package name */
    public final k.a f181298r;

    /* renamed from: s, reason: collision with root package name */
    public final g f181299s;

    public class a extends com.facebook.drawee.controller.d<Object> {
        public a() {
        }

        @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
        public final void c(String str) {
            int i12 = ZoomableDraweeView.f181289t;
            ZoomableDraweeView zoomableDraweeView = ZoomableDraweeView.this;
            C48986a.g(Integer.valueOf(zoomableDraweeView.hashCode()), zoomableDraweeView.getLogTag(), "onRelease: view %x");
            zoomableDraweeView.f181292l.setEnabled(false);
        }

        @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
        public final void f(String str, @I41.h Object obj, @I41.h Animatable animatable) {
            int i12 = ZoomableDraweeView.f181289t;
            ZoomableDraweeView zoomableDraweeView = ZoomableDraweeView.this;
            C48986a.g(Integer.valueOf(zoomableDraweeView.hashCode()), zoomableDraweeView.getLogTag(), "onFinalImageSet: view %x");
            if (zoomableDraweeView.f181292l.isEnabled()) {
                return;
            }
            zoomableDraweeView.f181292l.setEnabled(true);
            zoomableDraweeView.g();
        }
    }

    public class b implements k.a {
        public b() {
        }
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.f181290j = new RectF();
        this.f181291k = new RectF();
        this.f181295o = true;
        this.f181296p = false;
        this.f181297q = new a();
        b bVar = new b();
        this.f181298r = bVar;
        g gVar = new g();
        this.f181299s = gVar;
        c(context, attributeSet);
        d dVarY = d.y();
        this.f181292l = dVarY;
        dVarY.f181313b = bVar;
        this.f181293m = new GestureDetector(getContext(), gVar);
    }

    @Override // com.facebook.drawee.view.e
    public final void c(Context context, @I41.h AttributeSet attributeSet) throws Throwable {
        GW0.b bVar = new GW0.b(context.getResources());
        bVar.f6547l = (s.a) s.c.f340133e;
        GW0.c.e(bVar, context, attributeSet);
        setAspectRatio(bVar.f6538c);
        setHierarchy(bVar.a());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return this.f181292l.f();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return this.f181292l.i();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return this.f181292l.l();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return this.f181292l.e();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.f181292l.j();
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f181292l.k();
    }

    public final void f(@I41.h IW0.a aVar) {
        IW0.a controller = getController();
        boolean z12 = controller instanceof com.facebook.drawee.controller.b;
        com.facebook.drawee.controller.e eVar = this.f181297q;
        if (z12) {
            ((com.facebook.drawee.controller.b) controller).v(eVar);
        }
        if (aVar instanceof com.facebook.drawee.controller.b) {
            ((com.facebook.drawee.controller.b) aVar).a(eVar);
        }
        super.setController(aVar);
    }

    public final void g() {
        RectF rectF = this.f181290j;
        getHierarchy().j(rectF);
        RectF rectF2 = this.f181291k;
        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f181292l.m(rectF);
        this.f181292l.b(rectF2);
        C48986a.f(getLogTag(), "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    public Class<?> getLogTag() {
        return ZoomableDraweeView.class;
    }

    public k getZoomableController() {
        return this.f181292l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) throws Exception {
        int iSave = canvas.save();
        canvas.concat(this.f181292l.a());
        try {
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Exception e12) {
            IW0.a controller = getController();
            if (controller != null && (controller instanceof com.facebook.drawee.controller.b)) {
            }
            throw e12;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        C48986a.g(Integer.valueOf(hashCode()), getLogTag(), "onLayout: view %x");
        super.onLayout(z12, i12, i13, i14, i15);
        g();
    }

    @Override // com.facebook.drawee.view.d, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C48986a.e(getLogTag(), "onTouchEvent: %d, view %x, received", Integer.valueOf(actionMasked), Integer.valueOf(hashCode()));
        if (!this.f181296p && this.f181293m.onTouchEvent(motionEvent)) {
            C48986a.e(getLogTag(), "onTouchEvent: %d, view %x, handled by tap gesture detector", Integer.valueOf(actionMasked), Integer.valueOf(hashCode()));
            return true;
        }
        if (!this.f181296p && this.f181292l.g2(motionEvent)) {
            C48986a.e(getLogTag(), "onTouchEvent: %d, view %x, handled by zoomable controller", Integer.valueOf(actionMasked), Integer.valueOf(hashCode()));
            if (!this.f181295o && !this.f181292l.d()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (super.onTouchEvent(motionEvent)) {
            C48986a.e(getLogTag(), "onTouchEvent: %d, view %x, handled by the super", Integer.valueOf(actionMasked), Integer.valueOf(hashCode()));
            return true;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        this.f181293m.onTouchEvent(motionEventObtain);
        this.f181292l.g2(motionEventObtain);
        motionEventObtain.recycle();
        return false;
    }

    public void setAllowTouchInterceptionWhileZoomed(boolean z12) {
        this.f181295o = z12;
    }

    @Override // com.facebook.drawee.view.d
    public void setController(@I41.h IW0.a aVar) {
        f(null);
        this.f181292l.setEnabled(false);
        f(aVar);
    }

    public void setIsDialtoneEnabled(boolean z12) {
        this.f181296p = z12;
    }

    public void setIsLongpressEnabled(boolean z12) {
        this.f181293m.setIsLongpressEnabled(z12);
    }

    public void setTapListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f181299s.f181323b = simpleOnGestureListener;
    }

    public void setZoomListener(j jVar) {
        this.f181294n = jVar;
    }

    public void setZoomableController(k kVar) {
        kVar.getClass();
        this.f181292l.g(null);
        this.f181292l = kVar;
        kVar.g(this.f181298r);
    }
}
