package com.avito.android.photo_list_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import sK0.C48063a;

/* compiled from: ImageLabelsView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/photo_list_view/ImageLabelsView;", "Landroid/view/View;", "", "Lcom/avito/android/photo_list_view/b$a;", "newLabels", "Lkotlin/G0;", "setLabels", "(Ljava/util/List;)V", "getCurrentLabels", "()Ljava/util/List;", "currentLabels", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageLabelsView extends View {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f218081b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f218082c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Paint f218083d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Paint f218084e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RectF f218085f;

    /* renamed from: g, reason: collision with root package name */
    public final float f218086g;

    /* renamed from: h, reason: collision with root package name */
    public final float f218087h;

    /* renamed from: i, reason: collision with root package name */
    public final float f218088i;

    /* renamed from: j, reason: collision with root package name */
    public final float f218089j;

    /* renamed from: k, reason: collision with root package name */
    public final float f218090k;

    /* renamed from: l, reason: collision with root package name */
    public final float f218091l;

    @X41.j
    public ImageLabelsView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Y61.k
    public final List<InterfaceC33208b.a> getCurrentLabels() {
        return C42745f0.M0(this.f218082c);
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        float intrinsicHeight;
        float intrinsicWidth;
        float f12;
        int i12;
        Paint paint;
        int iA2;
        super.onDraw(canvas);
        int width = getWidth();
        Iterator it = this.f218082c.iterator();
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (it.hasNext()) {
            InterfaceC33208b.a aVar = (InterfaceC33208b.a) it.next();
            PrintableText printableText = aVar.f218110a;
            Drawable drawable = null;
            String strK0 = printableText != null ? printableText.k0(getContext()) : null;
            boolean z12 = strK0 == null || strK0.length() == 0;
            Paint paint2 = this.f218083d;
            Integer num = aVar.f218111b;
            if (num != null) {
                LinkedHashMap linkedHashMap = this.f218081b;
                Drawable drawable2 = (Drawable) linkedHashMap.get(num);
                if (drawable2 != null) {
                    drawable = drawable2;
                } else {
                    drawable2 = androidx.core.content.d.getDrawable(getContext(), num.intValue());
                    if (drawable2 != null) {
                        drawable2.setTint(paint2.getColor());
                        linkedHashMap.put(num, drawable2);
                        drawable = drawable2;
                    }
                }
            }
            float f15 = drawable == null ? 0.0f : this.f218090k;
            if (drawable == null) {
                intrinsicWidth = 0.0f;
                intrinsicHeight = 0.0f;
            } else {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                intrinsicHeight = this.f218088i;
                if (intrinsicWidth2 > intrinsicHeight2) {
                    intrinsicWidth = intrinsicHeight / (drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight());
                } else {
                    intrinsicHeight /= drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
                    intrinsicWidth = intrinsicHeight;
                }
            }
            float fMeasureText = !z12 ? paint2.measureText(strK0) : 0.0f;
            float f16 = this.f218091l;
            Iterator it2 = it;
            float f17 = this.f218087h;
            float f18 = !z12 ? f16 + intrinsicHeight + f15 + fMeasureText + f16 : f17;
            float f19 = f13 + f18;
            float f22 = f13;
            float f23 = width;
            float f24 = this.f218089j;
            if (f19 > f23) {
                f14 += f17 + f24;
                i12 = width;
                f12 = 0.0f;
            } else {
                f12 = f22;
                i12 = width;
            }
            RectF rectF = this.f218085f;
            String str = strK0;
            rectF.set(f12, f14, f12 + f18, f14 + f17);
            Paint paint3 = this.f218084e;
            UniversalColor universalColor = aVar.f218112c;
            if (universalColor == null) {
                iA2 = androidx.core.content.d.getColor(getContext(), R.color.gray92);
                paint = paint2;
            } else {
                paint = paint2;
                iA2 = C48063a.f437606a.a(getContext(), universalColor);
            }
            paint3.setColor(iA2);
            float f25 = this.f218086g;
            canvas.drawRoundRect(rectF, f25, f25, paint3);
            float f26 = 2;
            float f27 = (f17 / f26) + f14;
            if (drawable != null) {
                float f28 = f27 - (intrinsicWidth / f26);
                float f29 = (!z12 ? f16 : (f18 - intrinsicHeight) / f26) + f12;
                drawable.setBounds((int) f29, (int) f28, (int) (f29 + intrinsicHeight), (int) (f28 + intrinsicWidth));
                drawable.draw(canvas);
            }
            if (!z12) {
                canvas.drawText(str == null ? "" : str, f16 + f12 + intrinsicHeight + f15, f27 - ((paint.ascent() + paint.descent()) / f26), paint);
            }
            f13 = f18 + f24 + f12;
            it = it2;
            width = i12;
        }
    }

    public final void setLabels(@Y61.k List<InterfaceC33208b.a> newLabels) {
        ArrayList arrayList = this.f218082c;
        arrayList.clear();
        arrayList.addAll(newLabels);
        invalidate();
    }

    public ImageLabelsView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f218081b = new LinkedHashMap();
        this.f218082c = new ArrayList();
        Paint paint = new Paint(1);
        paint.setColor(androidx.core.content.d.getColor(context, R.color.white));
        paint.setTextSize(TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
        paint.setTextAlign(Paint.Align.LEFT);
        this.f218083d = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(androidx.core.content.d.getColor(context, R.color.gray92));
        paint2.setStyle(Paint.Style.FILL);
        this.f218084e = paint2;
        this.f218085f = new RectF();
        this.f218086g = D6.j(this, 6);
        this.f218087h = D6.j(this, 20);
        this.f218088i = D6.j(this, 11);
        this.f218089j = D6.j(this, 4);
        this.f218090k = D6.j(this, 3);
        this.f218091l = D6.j(this, 7);
    }
}
