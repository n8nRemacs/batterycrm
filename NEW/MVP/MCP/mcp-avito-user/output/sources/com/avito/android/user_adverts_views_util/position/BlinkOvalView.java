package com.avito.android.user_adverts_views_util.position;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_util/position/BlinkOvalView;", "Landroid/view/View;", "a", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BlinkOvalView extends View {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RectF f316746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f316747c;

    /* compiled from: SearchPositionView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts_views_util/position/BlinkOvalView$a;", "", "<init>", "()V", "", "OVAL_RATIO", "F", "ROTATION", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @j
    public BlinkOvalView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        RectF rectF = this.f316746b;
        try {
            canvas.rotate(40.0f, rectF.centerX(), rectF.centerY());
            canvas.drawOval(rectF, this.f316747c);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        float measuredWidth = getMeasuredWidth() * 0.3f;
        float measuredWidth2 = (getMeasuredWidth() / 2.0f) - (measuredWidth / 2.0f);
        this.f316746b.set(measuredWidth2, 0.0f, measuredWidth + measuredWidth2, getMeasuredHeight());
    }

    public BlinkOvalView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f316746b = new RectF();
        float fB2 = y6.b(2);
        Paint paint = new Paint(1);
        paint.setColor(getContext().getColor(R.color.user_adverts_views_util_color_blink_oval));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setMaskFilter(new BlurMaskFilter(fB2, BlurMaskFilter.Blur.NORMAL));
        this.f316747c = paint;
    }
}
