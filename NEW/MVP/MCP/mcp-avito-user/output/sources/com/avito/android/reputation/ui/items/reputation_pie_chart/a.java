package com.avito.android.reputation.ui.items.reputation_pie_chart;

import Hm0.C14007a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ReputationPieChart.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_pie_chart/a;", "Landroid/view/View;", "", "<set-?>", "b", "Lkotlin/properties/h;", "getPercent", "()F", "setPercent", "(F)V", "percent", "", "c", "getColor", "()I", "setColor", "(I)V", "color", "a", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f254894h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f254895b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f254896c;

    /* renamed from: d, reason: collision with root package name */
    public float f254897d;

    /* renamed from: e, reason: collision with root package name */
    public float f254898e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Paint f254899f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f254900g;

    /* compiled from: ReputationPieChart.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_pie_chart/a$a;", "", "<init>", "()V", "", "PIE_CHART_BORDER_WIDTH_MULTIPLIER", "I", "", "PIE_CHART_START_ANGLE", "F", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.reputation.ui.items.reputation_pie_chart.a$a, reason: collision with other inner class name */
    public static final class C7630a {
        public /* synthetic */ C7630a(C42822w c42822w) {
            this();
        }

        public C7630a() {
        }
    }

    static {
        Y y12 = new Y(a.class, "percent", "getPercent()F", 0);
        n0 n0Var = m0.f406844a;
        f254894h = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(a.class, "color", "getColor()I", 0, n0Var)};
        new C7630a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.reputationPieChart : i12;
        super(context, attributeSet, i12, 0);
        this.f254895b = new c(Float.valueOf(0.0f), this, new d(this));
        this.f254896c = new c(0, this, new b(this));
        this.f254899f = new Paint(1);
        int iD2 = C35835l0.d(R.attr.gray20, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14007a.e.f7689b, i12, 0);
        setPercent(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        setColor(typedArrayObtainStyledAttributes.getColor(0, iD2));
        typedArrayObtainStyledAttributes.recycle();
        this.f254900g = true;
    }

    public final int getColor() {
        return ((Number) this.f254896c.getValue(this, f254894h[1])).intValue();
    }

    public final float getPercent() {
        return ((Number) this.f254895b.getValue(this, f254894h[0])).floatValue();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f254898e = getHeight() / 8;
        float f12 = 2;
        this.f254897d = (getHeight() / f12) - (this.f254898e / f12);
        this.f254899f.setColor(getColor());
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f254899f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f254898e);
        float f12 = 2;
        canvas.drawCircle(canvas.getWidth() / f12, canvas.getHeight() / f12, this.f254897d, paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), 270.0f, getPercent() * 360.0f, true, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        invalidate();
    }

    public final void setColor(int i12) {
        this.f254896c.setValue(this, f254894h[1], Integer.valueOf(i12));
    }

    public final void setPercent(float f12) {
        this.f254895b.setValue(this, f254894h[0], Float.valueOf(f12));
    }
}
