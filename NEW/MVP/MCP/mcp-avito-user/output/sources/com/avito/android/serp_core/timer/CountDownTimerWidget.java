package com.avito.android.serp_core.timer;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;
import ts0.C48712a;
import ts0.b;
import ts0.g;
import us0.C49107a;

/* compiled from: CountDownTimerWidget.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001d\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\fJ\u0017\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b \u0010\fJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/serp_core/timer/CountDownTimerWidget;", "Landroid/widget/LinearLayout;", "Lts0/g;", "LpK0/a;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "setCellBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "setSeparatorTextAppearance", "(I)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "", "hours", "setHours", "(Ljava/lang/String;)V", "minutes", "setMinutes", "seconds", "setSeconds", "Lkotlin/Function0;", "listener", "setOnFinishListener", "(LY41/a;)V", "setOnStepListener", "color", "setCellBackgroundColorTint", "setCellTextColor", "setSeparatorTextColor", "setCellTextAppearance", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "setSeparatorMargin", "a", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountDownTimerWidget extends LinearLayout implements g, InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f273978b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f273979c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f273980d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<TextView> f273981e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<TextView> f273982f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f273983g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f273984h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public C48712a f273985i;

    /* renamed from: j, reason: collision with root package name */
    public final int f273986j;

    /* renamed from: k, reason: collision with root package name */
    public final int f273987k;

    /* compiled from: CountDownTimerWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/serp_core/timer/CountDownTimerWidget$a;", "", "<init>", "()V", "", "INVALID_DIMEN", "I", "INVALID_RES", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public CountDownTimerWidget(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void d(CountDownTimerWidget countDownTimerWidget, long j12) {
        C48712a c48712a = countDownTimerWidget.f273985i;
        if (c48712a != null) {
            b bVar = c48712a.f439608g;
            if (bVar != null) {
                bVar.cancel();
            }
            c48712a.f439608g = null;
            c48712a.f439607f = null;
        }
        C48712a c48712a2 = new C48712a(j12, 1000L, 0L, null, null, 28, null);
        c48712a2.b(countDownTimerWidget);
        countDownTimerWidget.f273985i = c48712a2;
    }

    private final void setCellBackground(Drawable drawable) {
        if (drawable != null) {
            Iterator<T> it = this.f273981e.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setBackground(drawable);
            }
        }
    }

    private final void setSeparatorTextAppearance(@f0 int resId) {
        if (resId != -1) {
            Iterator<T> it = this.f273982f.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextAppearance(resId);
            }
        }
    }

    @Override // ts0.g
    public final void a() {
        Y41.a<G0> aVar = this.f273984h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void b(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(0);
        int i12 = this.f273986j;
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, i12);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(3, i12);
        int resourceId = typedArray.getResourceId(2, -1);
        int resourceId2 = typedArray.getResourceId(5, -1);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(4, this.f273987k);
        setCellBackground(drawable);
        c(dimensionPixelSize2, dimensionPixelSize);
        setCellTextAppearance(resourceId);
        setSeparatorTextAppearance(resourceId2);
        setSeparatorMargin(dimensionPixelSize3);
        typedArray.recycle();
    }

    public final void c(int i12, int i13) {
        int i14 = this.f273986j;
        if (i12 == i14 && i13 == i14) {
            return;
        }
        for (TextView textView : this.f273981e) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams());
            layoutParams.width = i12;
            layoutParams.height = i13;
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C48712a c48712a = this.f273985i;
        if (c48712a != null) {
            c48712a.b(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C48712a c48712a = this.f273985i;
        if (c48712a != null) {
            b bVar = c48712a.f439608g;
            if (bVar != null) {
                bVar.cancel();
            }
            c48712a.f439608g = null;
            c48712a.f439607f = null;
        }
    }

    @Override // ts0.g
    public final void s0() {
        Y41.a<G0> aVar = this.f273983g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) {
        b(getContext().obtainStyledAttributes(style, C49107a.f.f440312a));
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setCellBackgroundColorTint(@InterfaceC42156l int color) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        Iterator<T> it = this.f273981e.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setBackgroundTintList(colorStateListValueOf);
        }
    }

    public final void setCellTextAppearance(@f0 int resId) {
        if (resId != -1) {
            Iterator<T> it = this.f273981e.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextAppearance(resId);
            }
        }
    }

    public final void setCellTextColor(@InterfaceC42156l int color) {
        Iterator<T> it = this.f273981e.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(color);
        }
    }

    @Override // ts0.g
    public void setHours(@k String hours) {
        this.f273978b.setText(hours);
    }

    @Override // ts0.g
    public void setMinutes(@k String minutes) {
        this.f273979c.setText(minutes);
    }

    public final void setOnFinishListener(@l Y41.a<G0> listener) {
        this.f273983g = listener;
    }

    public final void setOnStepListener(@l Y41.a<G0> listener) {
        this.f273984h = listener;
    }

    @Override // ts0.g
    public void setSeconds(@k String seconds) {
        this.f273980d.setText(seconds);
    }

    public final void setSeparatorMargin(int margin) {
        if (margin != this.f273987k) {
            for (TextView textView : this.f273982f) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams());
                layoutParams.setMarginStart(margin);
                layoutParams.setMarginEnd(margin);
                textView.setLayoutParams(layoutParams);
            }
        }
    }

    public final void setSeparatorTextColor(@InterfaceC42156l int color) {
        Iterator<T> it = this.f273982f.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(color);
        }
    }

    public CountDownTimerWidget(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f273986j = context.getResources().getDimensionPixelSize(R.dimen.timer_section_size);
        this.f273987k = context.getResources().getDimensionPixelSize(R.dimen.timer_separator_margin);
        View.inflate(context, R.layout.countdown_timer_view, this);
        TextView textView = (TextView) findViewById(R.id.hours);
        this.f273978b = textView;
        TextView textView2 = (TextView) findViewById(R.id.minutes);
        this.f273979c = textView2;
        TextView textView3 = (TextView) findViewById(R.id.seconds);
        this.f273980d = textView3;
        this.f273981e = C42745f0.U(textView, textView2, textView3);
        this.f273982f = C42745f0.U((TextView) findViewById(R.id.hours_separator), (TextView) findViewById(R.id.minutes_separator));
        b(context.obtainStyledAttributes(attributeSet, C49107a.f.f440312a));
    }
}
