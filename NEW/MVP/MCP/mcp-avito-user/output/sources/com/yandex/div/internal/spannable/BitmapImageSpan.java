package com.yandex.div.internal.spannable;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.style.ReplacementSpan;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: BitmapImageSpan.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/spannable/BitmapImageSpan;", "Landroid/text/style/ReplacementSpan;", "AnchorPoint", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class BitmapImageSpan extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f370161b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AnchorPoint f370162c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BitmapDrawable f370163d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BitmapImageSpan.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/spannable/BitmapImageSpan$AnchorPoint;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AnchorPoint {

        /* renamed from: b, reason: collision with root package name */
        public static final AnchorPoint f370164b;

        /* renamed from: c, reason: collision with root package name */
        public static final AnchorPoint f370165c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AnchorPoint[] f370166d;

        static {
            AnchorPoint anchorPoint = new AnchorPoint("BASELINE", 0);
            f370164b = anchorPoint;
            AnchorPoint anchorPoint2 = new AnchorPoint("LINE_BOTTOM", 1);
            f370165c = anchorPoint2;
            f370166d = new AnchorPoint[]{anchorPoint, anchorPoint2};
        }

        public AnchorPoint() {
            throw null;
        }

        public static AnchorPoint valueOf(String str) {
            return (AnchorPoint) Enum.valueOf(AnchorPoint.class, str);
        }

        public static AnchorPoint[] values() {
            return (AnchorPoint[]) f370166d.clone();
        }
    }

    /* compiled from: BitmapImageSpan.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AnchorPoint.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
        }
    }

    public /* synthetic */ BitmapImageSpan(Context context, Bitmap bitmap, float f12, int i12, int i13, Integer num, PorterDuff.Mode mode, boolean z12, AnchorPoint anchorPoint, int i14, C42822w c42822w) {
        this(context, bitmap, (i14 & 4) != 0 ? 0.0f : f12, i12, i13, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? PorterDuff.Mode.SRC_IN : mode, (i14 & 128) != 0 ? true : z12, (i14 & 256) != 0 ? AnchorPoint.f370165c : anchorPoint);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        canvas.save();
        int iOrdinal = this.f370162c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i15 = i16;
        }
        BitmapDrawable bitmapDrawable = this.f370163d;
        canvas.translate(f12, (i15 - bitmapDrawable.getBounds().bottom) + this.f370161b);
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @k CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int iCeil;
        BitmapDrawable bitmapDrawable = this.f370163d;
        if (fontMetricsInt != null) {
            if (i12 == 0 && Build.VERSION.SDK_INT < 28) {
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.descent = 0;
                fontMetricsInt.leading = 0;
            }
            Long lValueOf = Long.valueOf(bitmapDrawable.getBounds().top);
            Long lValueOf2 = Long.valueOf(0);
            if (!lValueOf.equals(lValueOf2)) {
                com.yandex.div.internal.a.b(lValueOf, null, lValueOf2);
            }
            int i14 = bitmapDrawable.getBounds().bottom;
            AnchorPoint anchorPoint = this.f370162c;
            int iOrdinal = anchorPoint.ordinal();
            float f12 = this.f370161b;
            if (iOrdinal == 0) {
                dCeil = Math.ceil(i14 - f12);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                dCeil = Math.ceil((i14 - f12) - fontMetricsInt.bottom);
            }
            int i15 = -((int) dCeil);
            fontMetricsInt.ascent = Math.min(i15, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i15, fontMetricsInt.top);
            int iOrdinal2 = anchorPoint.ordinal();
            if (iOrdinal2 == 0) {
                iCeil = (int) Math.ceil(f12);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                iCeil = fontMetricsInt.bottom;
            }
            fontMetricsInt.descent = Math.max(iCeil, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(iCeil, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return bitmapDrawable.getBounds().right;
    }

    @j
    public BitmapImageSpan(@k Context context, @k Bitmap bitmap, float f12, int i12, int i13, @l @InterfaceC42156l Integer num, @k PorterDuff.Mode mode, boolean z12, @k AnchorPoint anchorPoint) {
        this.f370161b = f12;
        this.f370162c = anchorPoint;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        this.f370163d = bitmapDrawable;
        if (z12) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float fMax = Math.max(i12 > 0 ? width / i12 : 1.0f, i13 > 0 ? height / i13 : 1.0f);
            bitmapDrawable.setBounds(0, 0, (width <= 0 || fMax == 0.0f) ? 0 : (int) (width / fMax), (height <= 0 || fMax == 0.0f) ? 0 : (int) (height / fMax));
        } else {
            bitmapDrawable.setBounds(0, 0, i12, i13);
        }
        if (num != null) {
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), mode));
        }
    }
}
