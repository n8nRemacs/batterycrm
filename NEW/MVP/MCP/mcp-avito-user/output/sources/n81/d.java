package N81;

import Y61.k;
import Y61.l;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.view.C22832m;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingToolbarScrollViewOnTouchListener.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LN81/d;", "Landroid/view/View$OnTouchListener;", "LN81/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements View.OnTouchListener, e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScrollView f11234b;

    /* renamed from: c, reason: collision with root package name */
    public int f11235c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f11236d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C22832m f11237e;

    /* compiled from: FloatingToolbarScrollViewOnTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"N81/d$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(@l MotionEvent motionEvent, @k MotionEvent motionEvent2, float f12, float f13) {
            d dVar = d.this;
            int scrollY = dVar.f11234b.getScrollY();
            dVar.f11235c = scrollY;
            dVar.f11236d.b((int) f13, scrollY);
            return super.onScroll(motionEvent, motionEvent2, f12, f13);
        }
    }

    public d(@k ScrollView scrollView, @k View view, @k View view2, @k View view3, boolean z12) {
        this.f11234b = scrollView;
        this.f11236d = new b(view, view2, view3, z12);
        this.f11237e = new C22832m(scrollView.getContext(), new a(), null);
    }

    @Override // N81.e
    public final void b() {
        b bVar = this.f11236d;
        View view = bVar.f11223a;
        if (view.getTranslationY() == 0.0f) {
            return;
        }
        bVar.c(true);
        view.setTranslationY(0.0f);
    }

    @Override // N81.e
    public final boolean f() {
        return this.f11235c != 0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@k View view, @k MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f11236d.a();
            view.performClick();
        }
        return this.f11237e.f45080a.onTouchEvent(motionEvent);
    }

    public /* synthetic */ d(ScrollView scrollView, View view, View view2, View view3, boolean z12, int i12, C42822w c42822w) {
        this(scrollView, view, view2, view3, (i12 & 16) != 0 ? true : z12);
    }
}
