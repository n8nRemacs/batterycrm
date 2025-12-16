package com.avito.android.photo_gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.avito.android.lib.design.zoom.ZoomableDraweeView;
import com.avito.android.util.p6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoGallerySwipeCloseView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/android/photo_gallery/PhotoGallerySwipeCloseView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "Lkotlin/G0;", "newOnSwipeCloseListener", "setOnSwipeCloseListener", "(LY41/a;)V", "a", "b", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoGallerySwipeCloseView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f216672b;

    /* renamed from: c, reason: collision with root package name */
    public int f216673c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final OverScroller f216674d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public b f216675e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f216676f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216677g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ZoomableDraweeView f216678h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Boolean f216679i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final GestureDetector f216680j;

    /* compiled from: PhotoGallerySwipeCloseView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_gallery/PhotoGallerySwipeCloseView$a;", "", "<init>", "()V", "", "CLOSE_THRESHOLD", "F", "SWIPE_THRESHOLD", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoGallerySwipeCloseView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/PhotoGallerySwipeCloseView$b;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f216681a;

        /* renamed from: b, reason: collision with root package name */
        public final float f216682b;

        public b(float f12, float f13) {
            this.f216681a = f12;
            this.f216682b = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f216681a, bVar.f216681a) == 0 && Float.compare(this.f216682b, bVar.f216682b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f216682b) + (Float.hashCode(this.f216681a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EventCoordinates(x=");
            sb2.append(this.f216681a);
            sb2.append(", y=");
            return androidx.appcompat.app.r.k(')', this.f216682b, sb2);
        }
    }

    static {
        new a(null);
    }

    public PhotoGallerySwipeCloseView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f216674d = new OverScroller(getContext());
        this.f216680j = new GestureDetector(getContext(), new J(this));
    }

    public final void a(float f12) {
        if (getScrollY() == 0 && f12 == 0.0f) {
            return;
        }
        this.f216674d.fling(0, getScrollY(), 0, -((int) f12), 0, 0, 0, 0, 0, getMeasuredHeight());
    }

    public final boolean b(MotionEvent motionEvent, float f12, ViewGroup viewGroup) {
        p6 p6Var = new p6(viewGroup);
        while (p6Var.hasNext()) {
            View view = (View) p6Var.next();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (viewGroup2.onInterceptTouchEvent(motionEvent) || b(motionEvent, f12, viewGroup2)) {
                    return true;
                }
            }
            if (view instanceof ZoomableDraweeView) {
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) view;
                if (zoomableDraweeView.getZoomableController().getScaleFactor() > 1.0f) {
                    this.f216678h = zoomableDraweeView;
                    if (f12 > 0.0f) {
                        this.f216679i = Boolean.TRUE;
                        return view.canScrollVertically(1);
                    }
                    this.f216679i = Boolean.FALSE;
                    return view.canScrollVertically(-1);
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f216674d;
        if (!overScroller.computeScrollOffset() || this.f216672b) {
            return;
        }
        if (Math.abs(getScrollY()) >= getMeasuredHeight() * 0.2f && this.f216678h == null) {
            overScroller.forceFinished(true);
            Y41.a<G0> aVar = this.f216676f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        scrollTo(0, overScroller.getCurrY());
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(@Y61.k android.view.MotionEvent r7) {
        /*
            r6 = this;
            Y41.a<kotlin.G0> r0 = r6.f216676f
            if (r0 != 0) goto L9
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L9:
            int r0 = r7.getActionMasked()
            android.view.GestureDetector r1 = r6.f216680j
            r2 = 0
            if (r0 == 0) goto La7
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L92
            r5 = 2
            if (r0 == r5) goto L32
            r5 = 3
            if (r0 == r5) goto L92
            r1 = 5
            if (r0 == r1) goto L2b
            r1 = 6
            if (r0 == r1) goto L24
            goto Lbb
        L24:
            int r0 = r6.f216673c
            int r0 = r0 - r4
            r6.f216673c = r0
            goto Lbb
        L2b:
            int r0 = r6.f216673c
            int r0 = r0 + r4
            r6.f216673c = r0
            goto Lbb
        L32:
            int r0 = r6.f216673c
            if (r0 > 0) goto L8d
            boolean r0 = r6.f216677g
            if (r0 == 0) goto L3b
            goto L8d
        L3b:
            boolean r0 = r6.f216672b
            if (r0 == 0) goto L40
            return r4
        L40:
            com.avito.android.photo_gallery.PhotoGallerySwipeCloseView$b r0 = r6.f216675e
            if (r0 == 0) goto L88
            float r1 = r7.getY()
            float r2 = r0.f216682b
            float r2 = r2 - r1
            r6.f216678h = r3
            r6.f216679i = r3
            boolean r1 = r6.b(r7, r2, r6)
            if (r1 == 0) goto L5c
            r6.f216677g = r4
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L5c:
            float r1 = java.lang.Math.abs(r2)
            float r2 = r7.getX()
            float r0 = r0.f216681a
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L78
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L78
            r6.f216672b = r4
            return r4
        L78:
            com.avito.android.photo_gallery.PhotoGallerySwipeCloseView$b r0 = new com.avito.android.photo_gallery.PhotoGallerySwipeCloseView$b
            float r1 = r7.getX()
            float r2 = r7.getY()
            r0.<init>(r1, r2)
            r6.f216675e = r0
            goto Lbb
        L88:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L8d:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L92:
            r6.f216675e = r3
            r6.f216677g = r2
            boolean r0 = r6.f216672b
            if (r0 == 0) goto La3
            r6.f216672b = r2
            r0 = 0
            r6.a(r0)
            r6.postInvalidateOnAnimation()
        La3:
            r1.onTouchEvent(r7)
            goto Lbb
        La7:
            r6.f216677g = r2
            com.avito.android.photo_gallery.PhotoGallerySwipeCloseView$b r0 = new com.avito.android.photo_gallery.PhotoGallerySwipeCloseView$b
            float r2 = r7.getX()
            float r3 = r7.getY()
            r0.<init>(r2, r3)
            r6.f216675e = r0
            r1.onTouchEvent(r7)
        Lbb:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.PhotoGallerySwipeCloseView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (this.f216676f == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            this.f216675e = null;
            this.f216677g = false;
            if (this.f216672b) {
                this.f216672b = false;
                a(0.0f);
                postInvalidateOnAnimation();
            }
        }
        return this.f216680j.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void setOnSwipeCloseListener(@Y61.k Y41.a<G0> newOnSwipeCloseListener) {
        this.f216676f = newOnSwipeCloseListener;
    }
}
