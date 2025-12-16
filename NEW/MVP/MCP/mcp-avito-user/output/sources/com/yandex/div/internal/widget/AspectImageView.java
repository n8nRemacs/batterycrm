package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.yandex.div.core.widget.F;
import com.yandex.div.core.widget.InterfaceC38049e;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import q21.e;

/* compiled from: AspectImageView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/yandex/div/core/widget/e;", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lkotlin/G0;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "", "<set-?>", "b", "Lkotlin/properties/h;", "getGravity", "()I", "setGravity", "(I)V", "gravity", "", "c", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "d", "getImageScale", "()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "setImageScale", "(Lcom/yandex/div/internal/widget/AspectImageView$Scale;)V", "imageScale", "Scale", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class AspectImageView extends AppCompatImageView implements InterfaceC38049e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f370226g;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final kotlin.properties.h gravity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final kotlin.properties.h aspectRatio;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final kotlin.properties.h imageScale;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Matrix f370230e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f370231f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AspectImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Scale {

        /* renamed from: b, reason: collision with root package name */
        public static final Scale f370232b;

        /* renamed from: c, reason: collision with root package name */
        public static final Scale f370233c;

        /* renamed from: d, reason: collision with root package name */
        public static final Scale f370234d;

        /* renamed from: e, reason: collision with root package name */
        public static final Scale f370235e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Scale[] f370236f;

        static {
            Scale scale = new Scale("NO_SCALE", 0);
            f370232b = scale;
            Scale scale2 = new Scale("FIT", 1);
            f370233c = scale2;
            Scale scale3 = new Scale("FILL", 2);
            f370234d = scale3;
            Scale scale4 = new Scale("STRETCH", 3);
            f370235e = scale4;
            f370236f = new Scale[]{scale, scale2, scale3, scale4};
        }

        public Scale() {
            throw null;
        }

        public static Scale valueOf(String str) {
            return (Scale) Enum.valueOf(Scale.class, str);
        }

        public static Scale[] values() {
            return (Scale[]) f370236f.clone();
        }
    }

    /* compiled from: AspectImageView.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f370237a;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f370237a = iArr;
        }
    }

    /* compiled from: AspectImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "value", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f370238l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            return Float.valueOf(kotlin.ranges.s.a(f12.floatValue(), 0.0f));
        }
    }

    static {
        Y y12 = new Y(AspectImageView.class, "gravity", "getGravity()I", 0);
        n0 n0Var = m0.f406844a;
        f370226g = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0, n0Var)};
    }

    public /* synthetic */ AspectImageView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f370226g[1])).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getGravity() {
        return ((Number) this.gravity.getValue(this, f370226g[0])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final Scale getImageScale() {
        return (Scale) this.imageScale.getValue(this, f370226g[2]);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f370231f = true;
    }

    public boolean k(int i12) {
        return View.MeasureSpec.getMode(i12) != 1073741824;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        float fMin;
        Matrix imageMatrix = getImageMatrix();
        Matrix matrix = this.f370230e;
        if ((imageMatrix == null || L.f(getImageMatrix(), matrix)) && this.f370231f && getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable != null) {
                float paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (height - getPaddingTop()) - getPaddingBottom();
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int gravity = getGravity();
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                int absoluteGravity = Gravity.getAbsoluteGravity(gravity, getLayoutDirection());
                int iOrdinal = getImageScale().ordinal();
                if (iOrdinal == 0) {
                    fMin = 1.0f;
                } else if (iOrdinal == 1) {
                    fMin = Math.min(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else if (iOrdinal == 2) {
                    fMin = Math.max(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fMin = paddingLeft / intrinsicWidth;
                }
                float f12 = a.f370237a[getImageScale().ordinal()] == 4 ? paddingTop / intrinsicHeight : fMin;
                int i12 = absoluteGravity & 7;
                float f13 = 0.0f;
                float f14 = i12 != 1 ? i12 != 5 ? 0.0f : paddingLeft - (intrinsicWidth * fMin) : (paddingLeft - (intrinsicWidth * fMin)) / 2;
                int i13 = absoluteGravity & 112;
                if (i13 == 16) {
                    f13 = (paddingTop - (intrinsicHeight * f12)) / 2;
                } else if (i13 == 80) {
                    f13 = paddingTop - (intrinsicHeight * f12);
                }
                matrix.reset();
                matrix.postScale(fMin, f12);
                matrix.postTranslate(f14, f13);
                setImageMatrix(matrix);
            }
            this.f370231f = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        this.f370231f = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        boolean zK2 = k(i12);
        boolean z12 = View.MeasureSpec.getMode(i13) != 1073741824;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!zK2 && !z12) {
            measuredHeight = kotlin.math.b.b(measuredWidth / aspectRatio);
        } else if (!zK2 && z12) {
            measuredHeight = kotlin.math.b.b(measuredWidth / aspectRatio);
        } else if (zK2 && !z12) {
            measuredWidth = kotlin.math.b.b(measuredHeight * aspectRatio);
        } else if (zK2 && z12) {
            measuredHeight = kotlin.math.b.b(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        this.f370231f = true;
    }

    @Override // com.yandex.div.core.widget.InterfaceC38049e
    public final void setAspectRatio(float f12) {
        this.aspectRatio.setValue(this, f370226g[1], Float.valueOf(f12));
    }

    public final void setGravity(int i12) {
        this.gravity.setValue(this, f370226g[0], Integer.valueOf(i12));
    }

    public final void setImageScale(@Y61.k Scale scale) {
        this.imageScale.setValue(this, f370226g[2], scale);
    }

    @X41.j
    public AspectImageView(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.gravity = F.a();
        this.aspectRatio = F.b(b.f370238l);
        this.imageScale = F.c();
        this.f370230e = new Matrix();
        this.f370231f = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.f428996a, i12, 0);
            try {
                setGravity(typedArrayObtainStyledAttributes.getInt(0, 0));
                setAspectRatio(typedArrayObtainStyledAttributes.getFloat(2, 0.0f));
                setImageScale(Scale.values()[typedArrayObtainStyledAttributes.getInteger(3, 0)]);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Y61.l ImageView.ScaleType scaleType) {
    }
}
