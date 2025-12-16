package com.google.accompanist.drawablepainter;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.B2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import l0.n;

/* compiled from: DrawablePainter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/a;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/runtime/B2;", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends androidx.compose.ui.graphics.painter.e implements B2 {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Drawable f342871g;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f342873i;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f342872h = C22126m3.g(0);

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC42726C f342874j = C42727D.c(new b());

    /* compiled from: DrawablePainter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.google.accompanist.drawablepainter.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10557a {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: DrawablePainter.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"com/google/accompanist/drawablepainter/b", "invoke", "()Lcom/google/accompanist/drawablepainter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.google.accompanist.drawablepainter.b> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.google.accompanist.drawablepainter.b invoke() {
            return new com.google.accompanist.drawablepainter.b(a.this);
        }
    }

    public a(@k Drawable drawable) {
        this.f342871g = drawable;
        this.f342873i = C22126m3.g(n.a(c.a(drawable)));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        this.f342871g.setAlpha(s.g(kotlin.math.b.b(f12 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.B2
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.f342874j.getValue();
        Drawable drawable = this.f342871g;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@l U u12) {
        this.f342871g.setColorFilter(u12 != null ? u12.f39333a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.B2
    public final void e() {
        Drawable drawable = this.f342871g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void f(@k LayoutDirection layoutDirection) {
        int i12;
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i12 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i12 = 0;
        }
        this.f342871g.setLayoutDirection(i12);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h */
    public final long getF39738j() {
        return ((n) ((C22082i3) this.f342873i).getF42167b()).f413404a;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@k g gVar) {
        M mA2 = gVar.getF39478c().a();
        ((Number) ((C22082i3) this.f342872h).getF42167b()).intValue();
        int iB2 = kotlin.math.b.b(n.e(gVar.i()));
        int iB3 = kotlin.math.b.b(n.c(gVar.i()));
        Drawable drawable = this.f342871g;
        drawable.setBounds(0, 0, iB2, iB3);
        try {
            mA2.k();
            Canvas canvas = C22247d.f39473a;
            drawable.draw(((C22245c) mA2).f39351a);
        } finally {
            mA2.i();
        }
    }
}
