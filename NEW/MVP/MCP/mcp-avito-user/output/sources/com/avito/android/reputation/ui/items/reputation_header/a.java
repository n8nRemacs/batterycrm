package com.avito.android.reputation.ui.items.reputation_header;

import Hm0.C14007a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: ReputationHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_header/a;", "Landroid/view/View;", "", "<set-?>", "b", "Lkotlin/properties/h;", "getLeftColor", "()I", "setLeftColor", "(I)V", "leftColor", "c", "getRightColor", "setRightColor", "rightColor", "", "d", "getCircleRadius", "()F", "setCircleRadius", "(F)V", "circleRadius", "a", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends View {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C7629a f254868i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f254869j;

    /* renamed from: k, reason: collision with root package name */
    public static final float f254870k;

    /* renamed from: l, reason: collision with root package name */
    public static final float f254871l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f254872m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f254873n;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f254874b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f254875c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d f254876d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Paint f254877e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Paint f254878f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Path f254879g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f254880h;

    /* compiled from: ReputationHeader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_header/a$a;", "", "<init>", "()V", "", "INNER_CORNER_RADIUS", "F", "OUTER_CORNER_RADIUS", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.reputation.ui.items.reputation_header.a$a, reason: collision with other inner class name */
    public static final class C7629a {
        public /* synthetic */ C7629a(C42822w c42822w) {
            this();
        }

        public C7629a() {
        }
    }

    static {
        Y y12 = new Y(a.class, "leftColor", "getLeftColor()I", 0);
        n0 n0Var = m0.f406844a;
        f254869j = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(a.class, "rightColor", "getRightColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "circleRadius", "getCircleRadius()F", 0, n0Var)};
        f254868i = new C7629a(null);
        f254870k = y6.b(28);
        f254871l = y6.b(13);
        f254872m = Color.parseColor("#DCFAEE");
        f254873n = Color.parseColor("#DCFAE0");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.reputationHeader : i12;
        super(context, attributeSet, i12, 0);
        this.f254874b = new d(0, this, new c(this));
        this.f254875c = new d(0, this, new e(this));
        this.f254876d = new d(Float.valueOf(0.0f), this, new b(this));
        this.f254877e = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(C35835l0.d(R.attr.white, context));
        this.f254878f = paint;
        this.f254879g = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14007a.e.f7688a, i12, 0);
        setCircleRadius(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        setLeftColor(typedArrayObtainStyledAttributes.getColor(1, f254872m));
        setRightColor(typedArrayObtainStyledAttributes.getColor(2, f254873n));
        typedArrayObtainStyledAttributes.recycle();
        this.f254880h = true;
    }

    public final float getCircleRadius() {
        return ((Number) this.f254876d.getValue(this, f254869j[2])).floatValue();
    }

    public final int getLeftColor() {
        return ((Number) this.f254874b.getValue(this, f254869j[0])).intValue();
    }

    public final int getRightColor() {
        return ((Number) this.f254875c.getValue(this, f254869j[1])).intValue();
    }

    @Override // android.view.View
    public final void invalidate() {
        float f12 = f254870k;
        super.invalidate();
        this.f254877e.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, getLeftColor(), getRightColor(), Shader.TileMode.CLAMP));
        Path path = this.f254879g;
        path.reset();
        if (getCircleRadius() == 0.0f) {
            path.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f12, f12}, Path.Direction.CW);
            return;
        }
        float f13 = 2;
        float width = (getWidth() / f13) - getCircleRadius();
        float circleRadius = getCircleRadius() + (getWidth() / f13);
        float height = getHeight();
        float f14 = f254871l;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(0.0f, 0.0f, width, height, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f14, f14, f12, f12}, direction);
        path.addRect(width, 0.0f, circleRadius, getHeight(), direction);
        path.addRoundRect(circleRadius, 0.0f, getWidth(), getHeight(), new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f14, f14}, direction);
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f254879g, this.f254877e);
        if (getCircleRadius() == 0.0f) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight(), getCircleRadius(), this.f254878f);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        invalidate();
    }

    public final void setCircleRadius(float f12) {
        this.f254876d.setValue(this, f254869j[2], Float.valueOf(f12));
    }

    public final void setLeftColor(int i12) {
        this.f254874b.setValue(this, f254869j[0], Integer.valueOf(i12));
    }

    public final void setRightColor(int i12) {
        this.f254875c.setValue(this, f254869j[1], Integer.valueOf(i12));
    }
}
