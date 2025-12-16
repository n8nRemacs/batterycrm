package com.avito.android.lib.design.surface;

import DV.a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.lib.design.button.e;
import com.avito.android.util.B;
import com.avito.android.util.C35763c0;
import com.avito.beduin.v2.component.box.android_view.f;
import com.google.android.material.shape.q;
import com.google.android.material.shape.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Surface.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/surface/Surface;", "Lcom/avito/beduin/v2/component/box/android_view/f;", "", "enabled", "Lkotlin/G0;", "setShadowEnabled", "(Z)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Surface extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f180656i = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public q f180657c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f180658d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f180659e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Path f180660f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final r f180661g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Rect f180662h;

    @j
    public Surface(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(@k q qVar, @k C35763c0 c35763c0, @k C35763c0 c35763c02, @l B b12, @l Drawable drawable) {
        this.f180657c = qVar;
        this.f180658d.f178654i = qVar;
        a aVar = this.f180659e;
        aVar.f3179a = qVar;
        Drawable drawable2 = drawable;
        if (drawable == null) {
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVar);
            kVar.n(c35763c0.b());
            drawable2 = kVar;
        }
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(qVar);
        kVar2.setTint(d.getColor(getContext(), R.color.common_white));
        kVar2.p(Paint.Style.FILL);
        if (b12 != null) {
            int i12 = b12.f318556b.f318848a;
            aVar.f3180b = Integer.valueOf(i12);
            aVar.f3181c = b12.f318555a * 2;
            Paint paint = aVar.f3182d;
            paint.setColor(i12);
            paint.setStrokeWidth(aVar.f3181c);
        }
        setBackground(new RippleDrawable(ColorStateList.valueOf(c35763c02.f318848a), drawable2, kVar2));
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        this.f180658d.a(canvas, this);
        canvas.save();
        canvas.clipPath(this.f180660f);
        super.draw(canvas);
        a aVar = this.f180659e;
        if (aVar.f3180b != null && aVar.f3181c != 0.0f) {
            canvas.drawPath(aVar.f3184f, aVar.f3182d);
        }
        canvas.restore();
    }

    @Override // com.avito.beduin.v2.component.box.android_view.f, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f180658d.d(this);
        a aVar = this.f180659e;
        aVar.getClass();
        Rect rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        aVar.f3183e.a(aVar.f3179a, 1.0f, new RectF(rect), null, aVar.f3184f);
        Rect rect2 = this.f180662h;
        rect2.top = 0;
        rect2.left = 0;
        rect2.right = getMeasuredWidth();
        rect2.bottom = getMeasuredHeight();
        this.f180661g.a(this.f180657c, 1.0f, new RectF(rect2), null, this.f180660f);
    }

    public final void setShadowEnabled(boolean enabled) {
        this.f180658d.f178646a = enabled;
        requestLayout();
    }

    public Surface(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f180657c = new q();
        new C35763c0(0, null, null, null, 14, null);
        new VU.d(0, 0, 0, 0, 15, null);
        new VU.d(0, 0, 0, 0, 15, null);
        this.f180658d = new e();
        this.f180659e = new a();
        setWillNotDraw(false);
        this.f180660f = new Path();
        this.f180661g = new r();
        this.f180662h = new Rect();
    }
}
