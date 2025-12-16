package com.avito.android.extended_profile_ui_components;

import aX0.C19831b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BadgeBarV3View.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/BadgeBarV3View;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeBarV3View extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final int f153279n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f153280o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f153281p;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Object f153282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f153283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f153284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RectF f153285e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Path f153286f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Paint f153287g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Paint f153288h;

    /* renamed from: i, reason: collision with root package name */
    public final float f153289i;

    /* renamed from: j, reason: collision with root package name */
    public float f153290j;

    /* renamed from: k, reason: collision with root package name */
    public float f153291k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f153292l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final b f153293m;

    /* compiled from: BadgeBarV3View.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/BadgeBarV3View$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "", "CIRCLE_SIZE", "I", "IMAGE_SIZE", "MAX_VISIBLE_BADGES", "", "NETWORK_FETCH_PRODUCER", "Ljava/lang/String;", "OVERLAP", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BadgeBarV3View.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_ui_components/BadgeBarV3View$b", "LaX0/b;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C19831b {
        public b() {
        }

        @Override // aX0.C19831b, com.facebook.imagepipeline.producers.n0
        public final void c(@Y61.k String str, @Y61.k String str2, boolean z12) {
            BadgeBarV3View.this.f153292l.set(str2.equals("NetworkFetchProducer"));
        }
    }

    static {
        new a(null);
        f153279n = y6.b(40);
        f153280o = y6.b(36);
        f153281p = y6.b(12);
    }

    public /* synthetic */ BadgeBarV3View(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    public static final void a(BadgeBarV3View badgeBarV3View, ArrayList arrayList) {
        badgeBarV3View.f153283c = arrayList;
        if (badgeBarV3View.getWidth() <= 0) {
            badgeBarV3View.getViewTreeObserver().addOnGlobalLayoutListener(new g(badgeBarV3View));
            return;
        }
        if (badgeBarV3View.f153292l.get()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AV.a(badgeBarV3View, 6));
            valueAnimatorOfFloat.start();
        } else {
            badgeBarV3View.f153290j = 1.0f;
            badgeBarV3View.f153291k = 0.0f;
            badgeBarV3View.invalidate();
        }
        badgeBarV3View.requestLayout();
    }

    public final void b(Canvas canvas, float f12, String str) {
        float f13 = f153279n / 2.0f;
        float f14 = f12 + f13;
        canvas.drawCircle(f14, f13, f153280o / 2.0f, this.f153287g);
        if (str == null || C43066x.K(str)) {
            return;
        }
        canvas.drawText(str, f14 - y6.a(1.5f), (f13 - y6.a(0.5f)) - this.f153289i, this.f153288h);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        float f12 = this.f153291k;
        Paint paint = this.f153288h;
        Paint paint2 = this.f153287g;
        int i12 = f153281p;
        int i13 = f153279n;
        if (f12 != 0.0f) {
            float f13 = 255;
            paint2.setAlpha((int) (f12 * f13));
            paint.setAlpha((int) (this.f153291k * f13));
            int iMin = Math.min(this.f153282b.size(), 5);
            String str = this.f153284d;
            int i14 = ((str == null || C43066x.K(str)) ? iMin : iMin + 1) - 1;
            float f14 = (i13 * i14) - (i14 * i12);
            String str2 = this.f153284d;
            if (str2 != null && !C43066x.K(str2)) {
                b(canvas, f14, this.f153284d);
                f14 -= i13 - i12;
            }
            for (int i15 = 0; i15 < iMin; i15++) {
                b(canvas, f14, null);
                f14 -= i13 - i12;
            }
        }
        if (this.f153283c.isEmpty()) {
            return;
        }
        float f15 = this.f153290j;
        if (f15 == 0.0f) {
            return;
        }
        float f16 = 255;
        paint2.setAlpha((int) (f15 * f16));
        paint.setAlpha((int) (this.f153290j * f16));
        String str3 = this.f153284d;
        int size = ((str3 == null || C43066x.K(str3)) ? this.f153283c.size() : this.f153283c.size() + 1) - 1;
        float f17 = (i13 * size) - (size * i12);
        String str4 = this.f153284d;
        if (str4 != null && !C43066x.K(str4)) {
            b(canvas, f17, this.f153284d);
            f17 -= i13 - i12;
        }
        for (Bitmap bitmap : C42745f0.k(this.f153283c)) {
            RectF rectF = this.f153285e;
            float f18 = i13;
            rectF.set(f17, 0.0f, f17 + f18, f18);
            Path path = this.f153286f;
            path.reset();
            path.addRect(rectF, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
                canvas.restoreToCount(iSave);
                f17 -= i13 - i12;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = this.f153283c.size();
        String str = this.f153284d;
        int i14 = size + (((str == null || C43066x.K(str)) ? 1 : 0) ^ 1);
        int i15 = f153279n;
        setMeasuredDimension(H.b(i14, 1, i15 - f153281p, i15), i15);
    }

    @X41.j
    public BadgeBarV3View(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f153282b = c42784z0;
        this.f153283c = c42784z0;
        this.f153285e = new RectF();
        this.f153286f = new Path();
        Paint paint = new Paint(1);
        paint.setColor(C35835l0.d(R.attr.warmGray4, context));
        this.f153287g = paint;
        Paint paint2 = new Paint(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextAppearance(C35835l0.j(R.attr.textH70, context));
        paint2.setTextSize(appCompatTextView.getTextSize());
        paint2.setTypeface(appCompatTextView.getTypeface());
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(C35835l0.d(R.attr.gray54, context));
        this.f153289i = (paint2.ascent() + paint2.descent()) / 2;
        this.f153288h = paint2;
        this.f153291k = 1.0f;
        this.f153292l = new AtomicBoolean(false);
        this.f153293m = new b();
    }
}
