package androidx.compose.material.ripple;

import Fc1.G3;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.o;
import androidx.compose.material.ripple.C;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: RippleHostView.android.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/material/ripple/u;", "Landroid/view/View;", "", "pressed", "Lkotlin/G0;", "setRippleState", "(Z)V", "a", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u extends View {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final int[] f34136g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final int[] f34137h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public C f34138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Boolean f34139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Long f34140d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public G3 f34141e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N f34142f;

    /* compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/material/ripple/u$a;", "", "<init>", "()V", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f34136g = new int[]{R.attr.state_pressed, R.attr.state_enabled};
        f34137h = new int[0];
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f34141e;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l12 = this.f34140d;
        long jLongValue = jCurrentAnimationTimeMillis - (l12 != null ? l12.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f34136g : f34137h;
            C c12 = this.f34138b;
            if (c12 != null) {
                c12.setState(iArr);
            }
        } else {
            G3 g32 = new G3(this, 7);
            this.f34141e = g32;
            postDelayed(g32, 50L);
        }
        this.f34140d = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(u uVar) {
        C c12 = uVar.f34138b;
        if (c12 != null) {
            c12.setState(f34137h);
        }
        uVar.f34141e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@Y61.k o.b bVar, boolean z12, long j12, int i12, long j13, float f12, @Y61.k Y41.a<G0> aVar) {
        if (this.f34138b == null || !Boolean.valueOf(z12).equals(this.f34139c)) {
            C c12 = new C(z12);
            setBackground(c12);
            this.f34138b = c12;
            this.f34139c = Boolean.valueOf(z12);
        }
        C c13 = this.f34138b;
        this.f34142f = (N) aVar;
        e(i12, j12, f12, j13);
        if (z12) {
            c13.setHotspot(l0.g.g(bVar.f28149a), l0.g.h(bVar.f28149a));
        } else {
            c13.setHotspot(c13.getBounds().centerX(), c13.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f34142f = null;
        G3 g32 = this.f34141e;
        if (g32 != null) {
            removeCallbacks(g32);
            this.f34141e.run();
        } else {
            C c12 = this.f34138b;
            if (c12 != null) {
                c12.setState(f34137h);
            }
        }
        C c13 = this.f34138b;
        if (c13 == null) {
            return;
        }
        c13.setVisible(false, false);
        unscheduleDrawable(c13);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i12, long j12, float f12, long j13) {
        C c12 = this.f34138b;
        if (c12 == null) {
            return;
        }
        Integer num = c12.f34054d;
        if (num == null || num.intValue() != i12) {
            c12.f34054d = Integer.valueOf(i12);
            C.b.f34056a.getClass();
            c12.setRadius(i12);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f12 *= 2;
        }
        long jC2 = T.c(j13, kotlin.ranges.s.c(f12, 1.0f));
        T t12 = c12.f34053c;
        if (!(t12 == null ? false : T.d(t12.f39331a, jC2))) {
            c12.f34053c = T.a(jC2);
            c12.setColor(ColorStateList.valueOf(V.j(jC2)));
        }
        Rect rect = new Rect(0, 0, kotlin.math.b.b(l0.n.e(j12)), kotlin.math.b.b(l0.n.c(j12)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c12.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@Y61.k Drawable drawable) {
        ?? r12 = this.f34142f;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
