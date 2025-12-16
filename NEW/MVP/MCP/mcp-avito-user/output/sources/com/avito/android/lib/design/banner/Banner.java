package com.avito.android.lib.design.banner;

import A91.p;
import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.blurlayout.BlurLayout;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.c;
import com.avito.android.lib.design.close_button.CloseButton;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.android.material.shape.q;
import j.I;
import j.InterfaceC42150f;
import j.U;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Banner.kt */
@s0
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010\u0018J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u00109\u001a\u0002042\u0006\u0010.\u001a\u0002048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/avito/android/lib/design/banner/Banner;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LpK0/a;", "Lcom/avito/android/blurlayout/BlurLayout$c;", "Lcom/avito/android/blurlayout/BlurLayout$a;", "LLV/a;", "LTU/a;", "Lcom/avito/android/lib/design/banner/a;", "", "visible", "Lkotlin/G0;", "setCloseButtonVisible", "(Z)V", "Landroid/view/View$OnClickListener;", "listener", "setCloseButtonListener", "(Landroid/view/View$OnClickListener;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "", "textStyle", "setTitleTextAppearance", "(I)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/banner/a;)V", "newState", "setState", "(LTU/a;)V", "Landroid/view/View;", "view", "setContentView", "(Landroid/view/View;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "LPK0/n;", "textStyleData", "setTitleTextStyleData", "(LPK0/n;)V", "Lcom/google/android/material/shape/q$b;", "backgroundShapeBuilder", "setBackgroundShape", "(Lcom/google/android/material/shape/q$b;)V", "Landroid/content/Context;", "<set-?>", "b", "Landroid/content/Context;", "getThemedContext", "()Landroid/content/Context;", "themedContext", "Landroid/view/ViewGroup;", "c", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "container", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Banner extends ConstraintLayout implements InterfaceC46971a, BlurLayout.c, BlurLayout.a, LV.a<TU.a, a> {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f178430s = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public Context themedContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public ViewGroup container;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f178433d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TU.a f178434e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public CloseButton f178435f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public TextView f178436g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Guideline f178437h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public View f178438i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public q f178439j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public ColorStateList f178440k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public ColorStateList f178441l;

    /* renamed from: m, reason: collision with root package name */
    public float f178442m;

    /* renamed from: n, reason: collision with root package name */
    public int f178443n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f178444o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f178445p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f178446q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final c f178447r;

    @j
    public Banner(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void h(Banner banner, ColorStateList colorStateList) {
        banner.f178440k = colorStateList;
        banner.f178441l = null;
        q qVar = banner.f178439j;
        banner.f178439j = qVar != null ? banner.g(qVar.f(), banner.f178440k, banner.f178441l, banner.f178442m, banner.f178445p, banner.f178446q) : null;
    }

    public static /* synthetic */ void m(Banner banner, Integer num, int i12) {
        banner.l(null, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : 0, num);
    }

    private final void setBackgroundShape(q.b backgroundShapeBuilder) {
        this.f178439j = g(backgroundShapeBuilder, this.f178440k, this.f178441l, this.f178442m, this.f178445p, this.f178446q);
    }

    private final void setTitleTextStyleData(n textStyleData) {
        TextView textView = this.f178436g;
        if (textView != null) {
            e.a(textView, textStyleData);
        }
    }

    public final void Tz(boolean z12, boolean z13) {
        if (this.f178445p == z12 && this.f178446q == z13) {
            return;
        }
        this.f178445p = z12;
        this.f178446q = z13;
        q qVar = this.f178439j;
        this.f178439j = qVar != null ? g(qVar.f(), this.f178440k, this.f178441l, this.f178442m, this.f178445p, this.f178446q) : null;
    }

    @Override // com.avito.android.blurlayout.BlurLayout.c
    /* renamed from: a, reason: from getter */
    public final float getF178442m() {
        return this.f178442m;
    }

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.container) {
            this.container = (ViewGroup) view;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.close_button) {
            this.f178435f = (CloseButton) view;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.title) {
            this.f178436g = (TextView) view;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.guideline_top_padding) {
            this.f178437h = (Guideline) view;
        } else if (numValueOf == null || numValueOf.intValue() != R.id.container_top_barrier) {
            throw new UnsupportedOperationException("Operation addView isn't supported. You should use setContentByRes " + view);
        }
        super.addView(view, i12, layoutParams);
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        this.f178447r.a(canvas, this);
        super.draw(canvas);
    }

    @Override // com.avito.android.blurlayout.BlurLayout.a
    /* renamed from: f, reason: from getter */
    public final int getF178443n() {
        return this.f178443n;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.material.shape.q g(com.google.android.material.shape.q.b r16, android.content.res.ColorStateList r17, android.content.res.ColorStateList r18, float r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            boolean r2 = r0.f178444o
            r3 = 0
            if (r2 == 0) goto L3e
            com.avito.android.lib.design.banner.a r2 = r0.f178433d
            r4 = 0
            if (r2 == 0) goto L10
            android.graphics.drawable.Drawable r2 = r2.f178451c
            goto L11
        L10:
            r2 = r4
        L11:
            if (r2 == 0) goto L14
            goto L3e
        L14:
            java.lang.Float r2 = java.lang.Float.valueOf(r19)
            if (r20 == 0) goto L1b
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L23
            float r2 = r2.floatValue()
            goto L24
        L23:
            r2 = r3
        L24:
            java.lang.Float r5 = java.lang.Float.valueOf(r19)
            if (r21 == 0) goto L2b
            r4 = r5
        L2b:
            if (r4 == 0) goto L31
            float r3 = r4.floatValue()
        L31:
            r1.m(r2)
            r1.p(r2)
            r1.g(r3)
            r1.j(r3)
            goto L41
        L3e:
            r1.c(r3)
        L41:
            com.google.android.material.shape.q r1 = r16.a()
            com.avito.android.lib.design.banner.a r2 = r0.f178433d
            if (r2 == 0) goto L4d
            android.graphics.drawable.Drawable r2 = r2.f178451c
            if (r2 != 0) goto L60
        L4d:
            wK0.c$a r4 = wK0.AbstractC49528c.f441377b
            r12 = 0
            r13 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r14 = 414(0x19e, float:5.8E-43)
            r5 = r1
            r10 = r17
            r11 = r18
            android.graphics.drawable.LayerDrawable r2 = wK0.AbstractC49528c.a.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L60:
            r15.setBackground(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.banner.Banner.g(com.google.android.material.shape.q$b, android.content.res.ColorStateList, android.content.res.ColorStateList, float, boolean, boolean):com.google.android.material.shape.q");
    }

    @k
    public final ViewGroup getContainer() {
        return this.container;
    }

    @k
    public final Context getThemedContext() {
        return this.themedContext;
    }

    public final void i(@I int i12, @InterfaceC42150f int i13) {
        j(i12, C35835l0.j(i13, getContext()));
    }

    public final void j(@I int i12, @f0 int i13) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.n.f178966f, 0, i13);
        a.C5258a c5258a = a.f178448x;
        Context context = getContext();
        c5258a.getClass();
        setStyle(a.C5258a.c(typedArrayObtainStyledAttributes, context));
        TU.a aVar = this.f178434e;
        if (aVar != null) {
            setState(TU.a.a(aVar, null, i12, 3));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k() {
        int i12;
        TU.a aVar = this.f178434e;
        if (aVar == null || (i12 = aVar.f15676c) == 0) {
            return;
        }
        this.f178438i = LayoutInflater.from(this.themedContext).inflate(i12, this.container, false);
        this.container.removeAllViews();
        this.container.addView(this.f178438i, 0);
    }

    public final void l(@U @l Integer num, @U @l Integer num2, @U @l Integer num3, @U @l Integer num4) {
        if (num != null) {
            setPadding(num.intValue(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        if (num2 != null) {
            int iIntValue = num2.intValue();
            Guideline guideline = this.f178437h;
            if (guideline != null) {
                guideline.setGuidelineBegin(iIntValue);
            }
        }
        if (num3 != null) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) this.container.getLayoutParams())).rightMargin = num3.intValue();
            TextView textView = this.f178436g;
            if (textView == null) {
                throw new IllegalStateException("PromoBlock hasn't been initialized yet");
            }
            ((ConstraintLayout.b) textView.getLayoutParams()).f44156C = num3.intValue();
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), num4.intValue());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f178447r.d(this);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178966f);
        a.C5258a c5258a = a.f178448x;
        Context context = getContext();
        c5258a.getClass();
        setStyle(a.C5258a.c(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setCloseButtonListener(@l View.OnClickListener listener) {
        CloseButton closeButton = this.f178435f;
        if (closeButton != null) {
            closeButton.setOnClickListener(listener);
        }
    }

    public final void setCloseButtonVisible(boolean visible) {
        CloseButton closeButton = this.f178435f;
        if (closeButton != null) {
            D6.G(closeButton, visible);
        }
    }

    public final void setContentView(@k View view) {
        this.f178438i = view;
        TU.a aVar = this.f178434e;
        if (aVar != null) {
            setState(TU.a.a(aVar, null, 0, 3));
        }
        this.container.removeAllViews();
        this.container.addView(this.f178438i, 0);
    }

    public final void setTitle(@l CharSequence title) {
        TextView textView = this.f178436g;
        if (textView != null) {
            I5.a(textView, title, false);
        }
    }

    public final void setTitleTextAppearance(@f0 int textStyle) {
        TextView textView = this.f178436g;
        if (textView != null) {
            textView.setTextAppearance(textStyle);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Banner(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.banner : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_Banner : i13;
        super(context, attributeSet, i12);
        this.themedContext = context;
        this.f178444o = true;
        this.f178445p = true;
        this.f178446q = true;
        this.f178447r = new c();
        LayoutInflater.from(context).inflate(R.layout.design_promo_block, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178966f, i12, i13);
        this.container = (ViewGroup) findViewById(R.id.container);
        this.f178434e = new TU.a(null, null, typedArrayObtainStyledAttributes.getResourceId(17, 0), 3, null);
        a.f178448x.getClass();
        setStyle(a.C5258a.c(typedArrayObtainStyledAttributes, context));
        k();
        String string = typedArrayObtainStyledAttributes.getString(27);
        setTitle(string);
        TU.a aVar = this.f178434e;
        this.f178434e = aVar != null ? TU.a.a(aVar, string, 0, 6) : null;
        CloseButton closeButton = this.f178435f;
        if (closeButton != null) {
            D6.G(closeButton, typedArrayObtainStyledAttributes.getBoolean(16, false));
        }
        Tz(typedArrayObtainStyledAttributes.getBoolean(29, this.f178445p), typedArrayObtainStyledAttributes.getBoolean(10, this.f178446q));
        typedArrayObtainStyledAttributes.recycle();
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // LV.b
    public void setState(@k TU.a newState) {
        TU.a aVar = this.f178434e;
        if (new com.avito.android.lib.util.c(newState, aVar).f181333c) {
            return;
        }
        this.f178434e = newState;
        String str = aVar != null ? aVar.f15674a : null;
        String str2 = newState.f15674a;
        if (!new com.avito.android.lib.util.c(str2, str).f181333c) {
            setTitle(str2);
        }
        if (!new com.avito.android.lib.util.c(Integer.valueOf(newState.f15676c), aVar != null ? Integer.valueOf(aVar.f15676c) : null).f181333c) {
            k();
        }
        Y41.a<G0> aVar2 = aVar != null ? aVar.f15675b : null;
        Y41.a<G0> aVar3 = newState.f15675b;
        if (L.f(aVar3, aVar2)) {
            return;
        }
        if (aVar3 != null) {
            setCloseButtonListener(new p(newState, 15));
        } else {
            setCloseButtonListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.banner.a r19) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.banner.Banner.setStyle(com.avito.android.lib.design.banner.a):void");
    }
}
