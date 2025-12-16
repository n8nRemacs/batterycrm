package com.avito.android.lib.design.accordion;

import A91.p;
import J11.c;
import PK0.n;
import QU.b;
import QU.d;
import X41.j;
import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.a;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.lib.util.f;
import com.avito.android.util.C1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Accordion.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R/\u0010/\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0015*\u0004\b-\u0010.R*\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u0010\u000f¨\u00065"}, d2 = {"Lcom/avito/android/lib/design/accordion/Accordion;", "Landroid/widget/LinearLayout;", "LLV/a;", "LQU/d;", "Lcom/avito/android/lib/design/accordion/a;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/accordion/a;)V", "newState", "setState", "(LQU/d;)V", "", "isLoading", "setLoading", "(Z)V", "hasCustomContent", "setHasCustomContent", "", "text", "setTitleText", "(Ljava/lang/CharSequence;)V", "Landroid/view/View;", "accessory", "setTitleAccessory", "(Landroid/view/View;)V", "customContent", "setCustomContent", "", "titleTextIcon", "setTitleIcon", "(Ljava/lang/Integer;)V", "Landroid/widget/FrameLayout;", "i", "Landroid/widget/FrameLayout;", "getCustomContentContainer", "()Landroid/widget/FrameLayout;", "customContentContainer", "j", "getAccessoryContainer", "accessoryContainer", "<set-?>", "getContentText", "()Ljava/lang/CharSequence;", "setContentText", "getContentText$delegate", "(Lcom/avito/android/lib/design/accordion/Accordion;)Ljava/lang/Object;", "contentText", "value", "isArrowAlignedEnd", "Z", "()Z", "setArrowAlignedEnd", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Accordion extends LinearLayout implements LV.a<d, a> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f178177n = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f178178b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public d f178179c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f178180d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public CharSequence f178181e;

    /* renamed from: f, reason: collision with root package name */
    @f0
    @l
    public Integer f178182f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AccordionTitleView f178183g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f178184h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public final FrameLayout customContentContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    public final FrameLayout accessoryContainer;

    /* renamed from: k, reason: collision with root package name */
    public long f178187k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public ValueAnimator f178188l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f178189m;

    @j
    public Accordion(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setCustomContent(View customContent) {
        FrameLayout frameLayout = this.customContentContainer;
        frameLayout.removeAllViews();
        setHasCustomContent(customContent != null);
        if (customContent != null) {
            frameLayout.addView(customContent);
        }
    }

    private final void setTitleAccessory(View accessory) {
        this.f178183g.setAccessoryView(accessory);
    }

    private final void setTitleIcon(@InterfaceC42150f Integer titleTextIcon) {
        this.f178182f = titleTextIcon != null ? Integer.valueOf(C35835l0.j(titleTextIcon.intValue(), getContext())) : null;
        b();
    }

    public final void a(boolean z12, boolean z13) {
        ValueAnimator valueAnimator;
        if (this.f178189m == z12) {
            return;
        }
        this.f178189m = z12;
        C1.f318564a.getClass();
        this.f178183g.f178192d.animate().rotation(z12 ? 180.0f : 0.0f).setDuration(C1.a() && z13 ? 200L : 0L).start();
        View view = this.f178180d ? this.customContentContainer : this.f178184h;
        ValueAnimator valueAnimator2 = this.f178188l;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f178188l) != null) {
            valueAnimator.end();
        }
        if (!C1.a() || !z13) {
            if (!z12) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            if (view.getLayoutParams().height != -2) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (z12) {
            if (!D6.y(view) || view.getLayoutParams().height == -2) {
                view.post(new c(3, this, view));
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = -2;
            view.setLayoutParams(layoutParams2);
            return;
        }
        if (D6.y(view)) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getHeight(), 0);
            valueAnimatorOfInt.setDuration(this.f178187k);
            valueAnimatorOfInt.addUpdateListener(new QU.a(view, 0));
            valueAnimatorOfInt.addListener(new b(view, this));
            valueAnimatorOfInt.start();
            this.f178188l = valueAnimatorOfInt;
        }
    }

    public final void b() {
        CharSequence charSequenceH;
        Integer num = this.f178182f;
        if (num != null) {
            int iIntValue = num.intValue();
            FV.a aVar = FV.a.f4720a;
            charSequenceH = this.f178181e;
            Context context = getContext();
            aVar.getClass();
            String strP = f.p(iIntValue, context);
            if (strP != null) {
                charSequenceH = FV.a.h(strP, charSequenceH, FV.a.f4721b);
            }
        } else {
            charSequenceH = this.f178181e;
        }
        this.f178183g.setTitleText(charSequenceH);
    }

    @k
    public final FrameLayout getAccessoryContainer() {
        return this.accessoryContainer;
    }

    @l
    public final CharSequence getContentText() {
        return this.f178184h.getText();
    }

    @k
    public final FrameLayout getCustomContentContainer() {
        return this.customContentContainer;
    }

    public final void setArrowAlignedEnd(boolean z12) {
        this.f178183g.setArrowAlignmentEnd(z12);
    }

    public final void setContentText(@l CharSequence charSequence) {
        this.f178184h.setText(charSequence);
    }

    public final void setHasCustomContent(boolean hasCustomContent) {
        this.f178180d = hasCustomContent;
        if (this.f178189m) {
            this.f178184h.setVisibility(!hasCustomContent ? 0 : 8);
            this.customContentContainer.setVisibility(hasCustomContent ? 0 : 8);
        }
    }

    public final void setLoading(boolean isLoading) {
        this.f178183g.setLoading(isLoading);
    }

    public final void setTitleText(@l CharSequence text) {
        if (text == null) {
            text = "";
        }
        this.f178181e = text;
        b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Accordion(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet);
        this.f178181e = "";
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178956a, i12, i13);
        a.f178201p.getClass();
        a aVarC = a.C5252a.c(typedArrayObtainStyledAttributes, context);
        String string = typedArrayObtainStyledAttributes.getString(16);
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.view_design_accordion, (ViewGroup) this, true);
        AccordionTitleView accordionTitleView = (AccordionTitleView) viewInflate.findViewById(R.id.accordion_title);
        this.f178183g = accordionTitleView;
        if (string != null) {
            setTitleText(string);
        }
        accordionTitleView.setLoading(z12);
        int i15 = aVarC.f178214m;
        if (i15 != 0) {
            accordionTitleView.setAccessoryView(layoutInflaterFrom.inflate(i15, (ViewGroup) null, false));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.accordion_content_text);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(string2);
        n nVar = aVarC.f178213l;
        if (nVar != null) {
            e.a(textView, nVar);
        }
        this.f178184h = textView;
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.accordion_custom_content_container);
        this.customContentContainer = frameLayout;
        this.accessoryContainer = accordionTitleView.getAccessoryContainer();
        setStyle(aVarC);
        setOnClickListener(new p(this, 11));
        int i16 = aVarC.f178212k;
        if (i16 != 0) {
            this.f178180d = true;
            layoutInflaterFrom.inflate(i16, (ViewGroup) frameLayout, true);
        }
        this.f178189m = textView.getVisibility() == 0 || frameLayout.getVisibility() == 0;
    }

    @Override // LV.b
    public void setState(@k QU.d newState) {
        G0 g02;
        QU.d dVar = this.f178179c;
        if (new com.avito.android.lib.util.c(newState, dVar).f181333c) {
            return;
        }
        this.f178179c = newState;
        String str = dVar != null ? dVar.f13731a : null;
        String str2 = newState.f13731a;
        if (!new com.avito.android.lib.util.c(str2, str).f181333c && str2 != null) {
            setTitleText(str2);
        }
        String str3 = dVar != null ? dVar.f13737g : null;
        String str4 = newState.f13737g;
        if (!new com.avito.android.lib.util.c(str4, str3).f181333c) {
            setContentText(str4);
        }
        Integer num = dVar != null ? dVar.f13732b : null;
        Integer num2 = newState.f13732b;
        if (!new com.avito.android.lib.util.c(num2, num).f181333c) {
            setTitleIcon(num2);
        }
        boolean z12 = newState.f13733c;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z12), dVar != null ? Boolean.valueOf(dVar.f13733c) : null).f181333c) {
            setArrowAlignedEnd(z12);
        }
        boolean z13 = newState.f13735e;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z13), dVar != null ? Boolean.valueOf(dVar.f13735e) : null).f181333c) {
            setLoading(z13);
        }
        Y41.a<G0> aVar = dVar != null ? dVar.f13740j : null;
        Y41.a<G0> aVar2 = newState.f13740j;
        if (!new com.avito.android.lib.util.c(aVar2, aVar).f181333c) {
            Y41.a<G0> aVar3 = aVar2;
            if (aVar3 != null) {
                setOnClickListener(new Ae0.b(17, aVar3));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                setOnClickListener(null);
            }
        }
        View view = dVar != null ? dVar.f13736f : null;
        View view2 = newState.f13736f;
        if (!new com.avito.android.lib.util.c(view2, view).f181333c) {
            setCustomContent(view2);
        }
        View view3 = dVar != null ? dVar.f13738h : null;
        View view4 = newState.f13738h;
        if (!new com.avito.android.lib.util.c(view4, view3).f181333c) {
            setTitleAccessory(view4);
        }
        boolean z14 = newState.f13734d;
        if (Boolean.valueOf(z14).equals(dVar != null ? Boolean.valueOf(dVar.f13734d) : null)) {
            return;
        }
        a(z14, newState.f13739i);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.accordion.a r13) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.accordion.Accordion.setStyle(com.avito.android.lib.design.accordion.a):void");
    }
}
