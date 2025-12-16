package com.avito.android.serp.adapter.slider.sales_slider;

import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SalesSlider.kt */
@P
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u001b\u001cJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/SalesSlider;", "Landroid/widget/FrameLayout;", "LLV/a;", "Lcom/avito/android/serp/adapter/slider/sales_slider/p;", "Lcom/avito/android/serp/adapter/slider/sales_slider/q;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/serp/adapter/slider/sales_slider/q;)V", "newState", "setState", "(Lcom/avito/android/serp/adapter/slider/sales_slider/p;)V", "Lcom/avito/android/serp/adapter/slider/sales_slider/o;", "listener", "setSalesSliderListener", "(Lcom/avito/android/serp/adapter/slider/sales_slider/o;)V", "", "color", "setStartColor", "(I)V", "setImageBackgroundColor", "setEndColor", "setIconColor", "Lcom/avito/android/remote/model/UniversalImage;", "image", "setImage", "(Lcom/avito/android/remote/model/UniversalImage;)V", "a", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SalesSlider extends FrameLayout implements LV.a<p, q> {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f272283r = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public p f272284b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public q f272285c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272286d;

    /* renamed from: e, reason: collision with root package name */
    public final int f272287e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final i f272288f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final m f272289g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f272290h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public o f272291i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f272292j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f272293k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f272294l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public C43238h f272295m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public N0 f272296n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Vibrator f272297o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final GestureDetector f272298p;

    /* renamed from: q, reason: collision with root package name */
    public float f272299q;

    /* compiled from: SalesSlider.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/SalesSlider$a;", "", "<init>", "()V", "", "DEFAULT_VIBRATE_DURATION", "J", "", "INITIAL_FILL_PERCENT", "F", "", "SLIDE_ON_PERCENT", "I", "TICK_INTENSITY_MAX", "TICK_INTENSITY_MIN", "TICK_INTERVAL_MAX_MS", "TICK_INTERVAL_MIN_MS", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SalesSlider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/SalesSlider$b;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    static {
        new a(null);
    }

    @X41.j
    public SalesSlider(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setEndColor(int color) {
        this.f272288f.setBackgroundColor(color);
    }

    private final void setIconColor(int color) {
        this.f272289g.setIconColor(color);
    }

    private final void setImage(UniversalImage image) {
        this.f272289g.setImage(image);
    }

    private final void setImageBackgroundColor(int color) {
        this.f272289g.setImageBackgroundColor(color);
    }

    private final void setSalesSliderListener(o listener) {
        this.f272291i = listener;
    }

    private final void setStartColor(int color) {
        this.f272289g.setBackgroundColor(color);
    }

    public final void a(float f12, float f13) {
        float fMax = (f12 > 0.0f ? Math.max(0.0f, ((f13 - f12) / f13) * 100) : 100.0f) / 100;
        this.f272288f.setTextOverlayAlpha(fMax);
        this.f272289g.setIconAlpha(fMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f272295m = U.a(C43262l0.f411945a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C43238h c43238h = this.f272295m;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f272295m = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SalesSlider(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.salesSlider : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.f272286d = context.getResources().getDimensionPixelSize(R.dimen.slider_widget_offset_form_middle_of_button_to_edge);
        this.f272287e = context.getResources().getDimensionPixelSize(R.dimen.slider_widget_offset_form_button_to_arrow);
        m mVar = new m(context, attributeSet, i12, i13);
        this.f272289g = mVar;
        this.f272290h = mVar.getAnimatedContainer();
        this.f272297o = (Vibrator) context.getSystemService(Vibrator.class);
        this.f272298p = new GestureDetector(context, new e(this));
        i iVar = new i(context, attributeSet, i12, i13);
        iVar.setDefaultTextHorizontalOffset(mVar.getF272321b());
        this.f272288f = iVar;
        addView(iVar);
        addView(mVar);
        mVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.serp.adapter.slider.sales_slider.a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x01a6  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
                /*
                    Method dump skipped, instructions count: 505
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.slider.sales_slider.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.serp.adapter.slider.sales_slider.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SalesSlider salesSlider = this.f272301b;
                if (salesSlider.f272293k) {
                    return;
                }
                o oVar = salesSlider.f272291i;
                if (oVar != null) {
                    oVar.vk();
                }
                salesSlider.f272293k = true;
            }
        });
    }

    @Override // LV.b
    public void setState(@Y61.k p newState) {
        p pVar = this.f272284b;
        if (new com.avito.android.lib.util.c(newState, pVar).f181333c) {
            return;
        }
        this.f272284b = newState;
        AttributedText attributedText = pVar != null ? pVar.f272334a : null;
        AttributedText attributedText2 = newState.f272334a;
        if (!new com.avito.android.lib.util.c(attributedText2, attributedText).f181333c && attributedText2 != null) {
            TextView textView = this.f272288f.f272313d;
            com.avito.android.util.text.j.a(textView, attributedText2, null);
            CharSequence text = textView.getText();
            if (text != null) {
                text.toString();
            }
        }
        UniversalImage universalImage = pVar != null ? pVar.f272335b : null;
        UniversalImage universalImage2 = newState.f272335b;
        if (!new com.avito.android.lib.util.c(universalImage2, universalImage).f181333c && universalImage2 != null) {
            setImage(universalImage2);
        }
        com.avito.android.serp.adapter.slider.l lVar = pVar != null ? pVar.f272336c : null;
        com.avito.android.serp.adapter.slider.l lVar2 = newState.f272336c;
        if (!new com.avito.android.lib.util.c(lVar2, lVar).f181333c) {
            setSalesSliderListener(lVar2);
        }
        Boolean bool = Boolean.FALSE;
        if (!new com.avito.android.lib.util.c(bool, pVar != null ? bool : null).f181333c) {
            this.f272293k = false;
        }
        if (!new com.avito.android.lib.util.c(bool, pVar != null ? bool : null).f181333c) {
            this.f272292j = false;
        }
        boolean z12 = newState.f272337d;
        if (new com.avito.android.lib.util.c(Boolean.valueOf(z12), pVar != null ? Boolean.valueOf(pVar.f272337d) : null).f181333c) {
            return;
        }
        this.f272294l = z12;
    }

    @Override // LV.d
    public void setStyle(@Y61.k q newStyle) {
        q qVar = this.f272285c;
        if (new com.avito.android.lib.util.c(newStyle, qVar).f181333c) {
            return;
        }
        this.f272285c = newStyle;
        Integer numValueOf = Integer.valueOf(newStyle.f272338a);
        if (!new com.avito.android.lib.util.c(numValueOf, qVar != null ? Integer.valueOf(qVar.f272338a) : null).f181333c) {
            setStartColor(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(newStyle.f272339b);
        if (!new com.avito.android.lib.util.c(numValueOf2, qVar != null ? Integer.valueOf(qVar.f272339b) : null).f181333c) {
            setEndColor(numValueOf2.intValue());
        }
        Integer numValueOf3 = Integer.valueOf(newStyle.f272340c);
        if (!new com.avito.android.lib.util.c(numValueOf3, qVar != null ? Integer.valueOf(qVar.f272340c) : null).f181333c) {
            setIconColor(numValueOf3.intValue());
        }
        Integer numValueOf4 = Integer.valueOf(newStyle.f272341d);
        if (new com.avito.android.lib.util.c(numValueOf4, qVar != null ? Integer.valueOf(qVar.f272341d) : null).f181333c) {
            return;
        }
        setImageBackgroundColor(numValueOf4.intValue());
    }
}
