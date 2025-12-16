package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* compiled from: GhostViewPort.java */
@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23511w extends ViewGroup implements InterfaceC23508t {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f54855h = 0;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f54856b;

    /* renamed from: c, reason: collision with root package name */
    public View f54857c;

    /* renamed from: d, reason: collision with root package name */
    public final View f54858d;

    /* renamed from: e, reason: collision with root package name */
    public int f54859e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Matrix f54860f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f54861g;

    /* compiled from: GhostViewPort.java */
    /* renamed from: androidx.transition.w$a */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            C23511w c23511w = C23511w.this;
            c23511w.postInvalidateOnAnimation();
            ViewGroup viewGroup = c23511w.f54856b;
            if (viewGroup == null || (view = c23511w.f54857c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            c23511w.f54856b.postInvalidateOnAnimation();
            c23511w.f54856b = null;
            c23511w.f54857c = null;
            return true;
        }
    }

    public C23511w(View view) {
        super(view.getContext());
        this.f54861g = new a();
        this.f54858d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // androidx.transition.InterfaceC23508t
    public final void a(View view, ViewGroup viewGroup) {
        this.f54856b = viewGroup;
        this.f54857c = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f54858d;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f54861g);
        h0.c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f54858d;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f54861g);
        h0.c(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C23493d.a(canvas, true);
        canvas.setMatrix(this.f54860f);
        View view = this.f54858d;
        h0.c(view, 0);
        view.invalidate();
        h0.c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        C23493d.a(canvas, false);
    }

    @Override // android.view.View, androidx.transition.InterfaceC23508t
    public final void setVisibility(int i12) {
        super.setVisibility(i12);
        View view = this.f54858d;
        if (((C23511w) view.getTag(R.id.ghost_view)) == this) {
            h0.c(view, i12 == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
