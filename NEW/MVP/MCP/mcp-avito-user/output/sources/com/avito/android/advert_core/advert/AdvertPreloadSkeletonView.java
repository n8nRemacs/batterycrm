package com.avito.android.advert_core.advert;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertPreloadSkeletonView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertPreloadSkeletonView;", "Landroid/view/View;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertPreloadSkeletonView extends View {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Paint f82647b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RectF f82648c;

    /* renamed from: d, reason: collision with root package name */
    public final float f82649d;

    /* renamed from: e, reason: collision with root package name */
    public final float f82650e;

    /* renamed from: f, reason: collision with root package name */
    public final float f82651f;

    /* renamed from: g, reason: collision with root package name */
    public final float f82652g;

    /* renamed from: h, reason: collision with root package name */
    public final float f82653h;

    /* renamed from: i, reason: collision with root package name */
    public final float f82654i;

    /* renamed from: j, reason: collision with root package name */
    public final float f82655j;

    /* renamed from: k, reason: collision with root package name */
    public final float f82656k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ArrayList f82657l;

    /* compiled from: AdvertPreloadSkeletonView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertPreloadSkeletonView$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f82658a;

        /* renamed from: b, reason: collision with root package name */
        public final float f82659b;

        public a(float f12, float f13) {
            this.f82658a = f12;
            this.f82659b = f13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f82658a, aVar.f82658a) == 0 && Float.compare(this.f82659b, aVar.f82659b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82659b) + (Float.hashCode(this.f82658a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TableRow(col1Width=");
            sb2.append(this.f82658a);
            sb2.append(", col2Width=");
            return r.k(')', this.f82659b, sb2);
        }
    }

    @X41.j
    public AdvertPreloadSkeletonView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        float paddingTop = getPaddingTop();
        RectF rectF = this.f82648c;
        float paddingLeft = getPaddingLeft();
        float paddingLeft2 = getPaddingLeft() + this.f82655j;
        float f12 = this.f82650e;
        rectF.set(paddingLeft, paddingTop, paddingLeft2, paddingTop + f12);
        Paint paint = this.f82647b;
        float f13 = this.f82649d;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        float f14 = this.f82653h;
        float f15 = f12 + f14 + paddingTop;
        float paddingLeft3 = getPaddingLeft();
        float paddingLeft4 = getPaddingLeft() + this.f82656k;
        float f16 = this.f82651f;
        rectF.set(paddingLeft3, f15, paddingLeft4, f15 + f16);
        canvas.drawRoundRect(rectF, f13, f13, paint);
        float f17 = (2 * f14) + f16 + f15;
        Iterator it = this.f82657l.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            float paddingLeft5 = getPaddingLeft();
            float paddingLeft6 = getPaddingLeft() + aVar.f82658a;
            float f18 = this.f82652g;
            float f19 = f17 + f18;
            rectF.set(paddingLeft5, f17, paddingLeft6, f19);
            canvas.drawRoundRect(rectF, f13, f13, paint);
            float width = getWidth() - getPaddingRight();
            rectF.set(width - aVar.f82659b, f17, width, f19);
            canvas.drawRoundRect(rectF, f13, f13, paint);
            f17 += f18 + f14;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        int i16;
        super.onSizeChanged(i12, i13, i14, i15);
        ArrayList arrayList = this.f82657l;
        arrayList.clear();
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float paddingTop = getPaddingTop() + this.f82650e;
        float f12 = this.f82653h;
        float height = (getHeight() - ((2 * f12) + ((paddingTop + f12) + this.f82651f))) - getPaddingBottom();
        if (height > 0.0f && (i16 = (int) ((height + f12) / (this.f82652g + f12))) > 0) {
            float width = (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.f82654i) / 2.0f;
            for (int i17 = 0; i17 < i16; i17++) {
                kotlin.random.f.f406882b.getClass();
                kotlin.random.f fVar = kotlin.random.f.f406883c;
                arrayList.add(new a(((fVar.h() * 0.45f) + 0.4f) * width, ((fVar.h() * 0.45f) + 0.4f) * width));
            }
        }
    }

    public AdvertPreloadSkeletonView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f82647b = paint;
        this.f82648c = new RectF();
        this.f82657l = new ArrayList();
        paint.setColor(C35835l0.d(R.attr.gray8, context));
        this.f82649d = D6.i(4, context);
        float fI2 = D6.i(42, context);
        this.f82650e = fI2;
        float fI3 = D6.i(28, context);
        this.f82651f = fI3;
        this.f82652g = D6.i(18, context);
        this.f82653h = D6.i(12, context);
        this.f82654i = D6.i(12, context);
        kotlin.random.f.f406882b.getClass();
        kotlin.random.f fVar = kotlin.random.f.f406883c;
        this.f82655j = (fI2 / 1.5f) * fVar.l(5, 9);
        this.f82656k = (fI3 / 1.5f) * fVar.l(12, 18);
    }
}
