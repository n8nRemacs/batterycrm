package com.avito.android.pinch_to_zoom;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.util.C1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z80.InterfaceC50396b;

/* compiled from: PinchToZoomHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/pinch_to_zoom/c;", "Lcom/avito/android/pinch_to_zoom/b;", "a", "b", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.pinch_to_zoom.b {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f219969C = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f219970A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f219971B;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f219972a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f219973b;

    /* renamed from: c, reason: collision with root package name */
    public float f219974c;

    /* renamed from: d, reason: collision with root package name */
    public float f219975d;

    /* renamed from: e, reason: collision with root package name */
    public float f219976e;

    /* renamed from: f, reason: collision with root package name */
    public float f219977f;

    /* renamed from: g, reason: collision with root package name */
    public float f219978g;

    /* renamed from: h, reason: collision with root package name */
    public float f219979h;

    /* renamed from: i, reason: collision with root package name */
    public float f219980i;

    /* renamed from: j, reason: collision with root package name */
    public float f219981j;

    /* renamed from: k, reason: collision with root package name */
    public int f219982k;

    /* renamed from: l, reason: collision with root package name */
    public int f219983l;

    /* renamed from: m, reason: collision with root package name */
    public float f219984m;

    /* renamed from: n, reason: collision with root package name */
    public float f219985n;

    /* renamed from: o, reason: collision with root package name */
    public float f219986o;

    /* renamed from: p, reason: collision with root package name */
    public float f219987p;

    /* renamed from: q, reason: collision with root package name */
    public int f219988q;

    /* renamed from: r, reason: collision with root package name */
    public int f219989r;

    /* renamed from: s, reason: collision with root package name */
    public int f219990s;

    /* renamed from: t, reason: collision with root package name */
    public int f219991t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public ValueAnimator f219992u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final ArrayList<InterfaceC50396b> f219993v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    @k
    public final ArrayList f219994w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    @l
    public b f219995x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public ImageView f219996y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public ImageView f219997z;

    /* compiled from: PinchToZoomHelper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/pinch_to_zoom/c$a;", "", "<init>", "()V", "", "FINISH_ANIMATION_DURATION", "J", "", "MAX_ALPHA", "I", "MAX_POINTERS_COUNT", "", "MINIMUM_DRAWING_STEP", "F", "MIN_PINCH_DISTANCE", "START_PINCH_SCALE", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PinchToZoomHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/pinch_to_zoom/c$b;", "Landroid/widget/FrameLayout;", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends FrameLayout {
        public b(@k Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDraw(@k Canvas canvas) {
            c cVar = c.this;
            if (cVar.f219992u == null) {
                float f12 = cVar.f219985n;
                if (f12 != 1.0f) {
                    float f13 = f12 + 0.07272727f;
                    cVar.f219985n = f13;
                    if (f13 > 1.0f) {
                        cVar.f219985n = 1.0f;
                    } else {
                        cVar.l();
                    }
                }
            }
            if (cVar.f219971B && cVar.f219996y != null) {
                cVar.n();
                float left = cVar.f219986o - getLeft();
                float top = cVar.f219987p - getTop();
                canvas.save();
                float f14 = cVar.f219981j;
                float f15 = cVar.f219984m;
                float f16 = ((f14 * f15) + 1.0f) - f15;
                canvas.scale(f16, f16, cVar.f219977f + left, cVar.f219978g + top);
                float f17 = cVar.f219979h;
                float f18 = cVar.f219984m;
                canvas.translate((f17 * f18) + left, (cVar.f219980i * f18) + top);
                ImageView imageView = cVar.f219997z;
                if (imageView != null) {
                    int i12 = cVar.f219988q;
                    int i13 = cVar.f219989r;
                    imageView.layout(i12, i13, cVar.f219991t + i12, cVar.f219990s + i13);
                    imageView.draw(canvas);
                }
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }
    }

    static {
        new a(null);
    }

    public c(boolean z12, @k d dVar) {
        this.f219972a = z12;
        this.f219973b = dVar;
    }

    public static float k(int i12, int i13, MotionEvent motionEvent) {
        return (float) Math.hypot(motionEvent.getX(i13) - motionEvent.getX(i12), motionEvent.getY(i13) - motionEvent.getY(i12));
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final void a(@k PinchToZoomSource pinchToZoomSource) {
        if (this.f219972a) {
            return;
        }
        this.f219973b.a(pinchToZoomSource);
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final boolean b(@k PinchToZoomSource pinchToZoomSource) {
        if (this.f219972a) {
            return true;
        }
        return this.f219973b.b(pinchToZoomSource);
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final void c(@k PinchToZoomSource pinchToZoomSource) {
        if (this.f219972a) {
            return;
        }
        this.f219973b.c(pinchToZoomSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0141 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0016, B:10:0x001c, B:12:0x0020, B:14:0x0029, B:16:0x0031, B:19:0x0039, B:21:0x0041, B:22:0x0045, B:26:0x004e, B:28:0x0066, B:30:0x006a, B:32:0x00b3, B:33:0x00b6, B:34:0x00b9, B:65:0x014f, B:67:0x0153, B:35:0x00f1, B:37:0x00f9, B:38:0x00fc, B:40:0x0100, B:42:0x0104, B:61:0x0141, B:63:0x0149, B:64:0x014c, B:44:0x010a, B:46:0x0111, B:49:0x0118, B:51:0x0120, B:54:0x0129, B:56:0x0131, B:59:0x013a, B:71:0x0159, B:73:0x015d, B:75:0x0163), top: B:79:0x0001 }] */
    @Override // com.avito.android.pinch_to_zoom.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(@Y61.k android.view.MotionEvent r11, @Y61.k android.widget.ImageView r12) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.pinch_to_zoom.c.d(android.view.MotionEvent, android.widget.ImageView):boolean");
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final void e(@k ViewGroup viewGroup) {
        this.f219994w.remove(viewGroup);
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final void f(@k InterfaceC50396b interfaceC50396b) {
        this.f219993v.add(interfaceC50396b);
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final void g(@k InterfaceC50396b interfaceC50396b) {
        this.f219993v.remove(interfaceC50396b);
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final boolean getEnabled() {
        return true;
    }

    @Override // com.avito.android.pinch_to_zoom.b
    public final void h(@k ViewGroup viewGroup) {
        this.f219994w.add(viewGroup);
    }

    public final void i() {
        if (this.f219971B) {
            Iterator<InterfaceC50396b> it = this.f219993v.iterator();
            while (it.hasNext()) {
                it.next().b(this.f219996y);
            }
            this.f219971B = false;
        }
        b bVar = this.f219995x;
        if (bVar != null && bVar.getParent() != null) {
            ((ViewGroup) C42745f0.Q(this.f219994w)).removeView(this.f219995x);
        }
        ImageView imageView = this.f219996y;
        if (imageView != null) {
            imageView.invalidate();
            this.f219996y = null;
        }
        ImageView imageView2 = this.f219997z;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
            this.f219997z = null;
        }
    }

    public final void j() {
        if (this.f219992u == null && this.f219971B) {
            C1.f318564a.getClass();
            if (!C1.a()) {
                i();
                return;
            }
            if (!n()) {
                i();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new AV.a(this, 14));
            valueAnimatorOfFloat.addListener(new C6612c());
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.start();
            this.f219992u = valueAnimatorOfFloat;
        }
    }

    public final void l() {
        b bVar = this.f219995x;
        Drawable background = bVar != null ? bVar.getBackground() : null;
        if (background != null) {
            background.setAlpha((int) (this.f219985n * 255));
        }
        b bVar2 = this.f219995x;
        if (bVar2 != null) {
            bVar2.invalidate();
        }
    }

    public final void m(ImageView imageView) {
        this.f219996y = imageView;
        this.f219988q = (int) imageView.getX();
        this.f219989r = (int) imageView.getY();
        this.f219991t = imageView.getWidth();
        this.f219990s = imageView.getHeight();
        ViewGroup viewGroup = (ViewGroup) C42745f0.Q(this.f219994w);
        ImageView imageView2 = new ImageView(viewGroup.getContext());
        try {
            imageView2.setImageBitmap(androidx.core.graphics.drawable.d.a(imageView.getDrawable(), this.f219991t, this.f219990s, Bitmap.Config.ARGB_8888));
        } catch (Throwable unused) {
            imageView2.setImageBitmap(androidx.core.graphics.drawable.d.a(imageView.getDrawable(), this.f219991t, this.f219990s, Bitmap.Config.RGB_565));
        }
        int i12 = this.f219988q;
        int i13 = this.f219989r;
        imageView2.layout(i12, i13, this.f219991t + i12, this.f219990s + i13);
        this.f219997z = imageView2;
        if (this.f219995x == null) {
            b bVar = new b(viewGroup.getContext());
            bVar.setBackgroundColor(bVar.getContext().getColor(R.color.overlayBackground));
            bVar.setFocusable(false);
            bVar.setFocusableInTouchMode(false);
            bVar.setEnabled(false);
            this.f219995x = bVar;
        }
        this.f219971B = true;
        viewGroup.addView(this.f219995x);
        Iterator<InterfaceC50396b> it = this.f219993v.iterator();
        while (it.hasNext()) {
            it.next().a(this.f219996y);
        }
        this.f219984m = 1.0f;
        this.f219985n = 0.0f;
    }

    public final boolean n() {
        float left = 0.0f;
        float top = 0.0f;
        for (View view = this.f219996y; view != C42745f0.Q(this.f219994w); view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            left += view.getLeft();
            top += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        this.f219986o = left;
        this.f219987p = top;
        return true;
    }

    /* compiled from: Animator.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "androidx/core/animation/j", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.pinch_to_zoom.c$c, reason: collision with other inner class name */
    public static final class C6612c implements Animator.AnimatorListener {
        public C6612c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c cVar = c.this;
            if (cVar.f219992u != null) {
                cVar.f219992u = null;
                cVar.i();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
