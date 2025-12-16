package com.avito.android.review_gallery.fading_text;

import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FadingTextView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/review_gallery/fading_text/FadingTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FadingTextView extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearGradient f255493b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Matrix f255494c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f255495d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Rect f255496e;

    /* compiled from: FadingTextView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/review_gallery/fading_text/FadingTextView$a;", "", "<init>", "()V", "", "CHARACTERS", "I", "", "PERCENTAGE", "F", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public FadingTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@k Canvas canvas) {
        if (getLineCount() <= getMaxLines() || getRootView() == null || getText() == null) {
            super.onDraw(canvas);
            return;
        }
        Matrix matrix = this.f255494c;
        Layout layout = getLayout();
        int iMeasureText = (int) getPaint().measureText(getText(), getText().length() - 12, getText().length());
        int maxLines = getMaxLines() - 1;
        Rect rect = this.f255496e;
        getLineBounds(maxLines, rect);
        CharSequence charSequenceSubSequence = getText().subSequence(layout.getLineStart(maxLines), layout.getLineEnd(maxLines));
        int iMeasureText2 = rect.left + ((int) getPaint().measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length()));
        rect.right = iMeasureText2;
        rect.left = iMeasureText2 - iMeasureText;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        matrix.reset();
        matrix.setScale(iMeasureText, 1.0f);
        matrix.postTranslate(rect.left, 0.0f);
        this.f255493b.setLocalMatrix(matrix);
        canvas.drawRect(rect, this.f255495d);
        canvas.restoreToCount(iSaveLayer);
    }

    public FadingTextView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.textViewStyle : i12);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.4f, 0.0f, 0, C35835l0.d(com.avito.android.R.attr.constantBlack, context), Shader.TileMode.CLAMP);
        this.f255493b = linearGradient;
        this.f255494c = new Matrix();
        Paint paint = new Paint();
        this.f255495d = paint;
        this.f255496e = new Rect();
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
