package com.avito.android.cart_snippet_actions;

import En.C13507a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.cart_snippet_actions.Style;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CartActionsView.kt */
@s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J#\u0010\f\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/avito/android/cart_snippet_actions/CartActionsViewImpl;", "Lcom/avito/android/cart_snippet_actions/l;", "Landroid/widget/FrameLayout;", "", "value", "Lkotlin/G0;", "setStepperValue", "(I)V", "maxValue", "setStepperMaxValue", "Lkotlin/Function1;", "listener", "setStepperValueChangedListener", "(LY41/l;)V", "", "visible", "setStepperVisible", "(Z)V", "setAddToCartButtonVisible", "Landroid/view/View$OnClickListener;", "setOnAddToCartClickListener", "(Landroid/view/View$OnClickListener;)V", "isVisible", "setVisible", "_avito_cart-snippet-actions_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes12.dex */
public final class CartActionsViewImpl extends FrameLayout implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f116146e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f116147b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Stepper f116148c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f116149d;

    /* compiled from: CartActionsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Style.a aVar = Style.f116150b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @X41.j
    public CartActionsViewImpl(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void Hf(@Y61.l String str, boolean z12) {
        ComponentContainer componentContainer = this.f116147b;
        if (str == null || C43066x.K(str)) {
            componentContainer.q(componentContainer.f178848i);
            return;
        }
        if (z12) {
            str = null;
        }
        ComponentContainer.n(componentContainer, str, 2);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public final void Qr() {
        this.f116148c.setAllowOverrideConstraints(true);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setAddToCartButtonVisible(boolean visible) {
        D6.G(this.f116149d, visible);
        D6.G(this.f116147b, !visible);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setOnAddToCartClickListener(@Y61.l View.OnClickListener listener) {
        this.f116149d.setOnClickListener(listener != null ? new com.avito.android.body_condition.h(11, this, listener) : null);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setStepperMaxValue(int maxValue) {
        this.f116148c.setMaxValue(maxValue);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setStepperValue(int value) {
        this.f116148c.setValue(value);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setStepperValueChangedListener(@Y61.k Y41.l<? super Integer, G0> listener) {
        this.f116148c.setOnValueChangeListener(listener);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setStepperVisible(boolean visible) {
        D6.G(this.f116147b, visible);
        D6.G(this.f116149d, !visible);
    }

    @Override // com.avito.android.cart_snippet_actions.l
    public void setVisible(boolean isVisible) {
        if (isVisible) {
            D6.H(this);
        } else {
            D6.w(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.view.View, android.widget.TextView, com.avito.android.lib.design.text_view.a] */
    public CartActionsViewImpl(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        Button button;
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.cart_snippet_actions, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.snippet_stepper_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f116147b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.snippet_stepper);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.stepper.Stepper");
        }
        Stepper stepper = (Stepper) viewFindViewById2;
        m mVar = new m(this, stepper);
        stepper.setOnPlusClickListener(mVar);
        stepper.setOnMinusClickListener(mVar);
        this.f116148c = stepper;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13507a.f.f4227a, i12, i13);
        Style.a aVar = Style.f116150b;
        Style style = Style.f116151c;
        int i15 = typedArrayObtainStyledAttributes.getInt(3, 0);
        aVar.getClass();
        int iOrdinal = (i15 == 1 ? Style.f116152d : style).ordinal();
        if (iOrdinal == 0) {
            Button button2 = new Button(context, null, 0, 0, 14, null);
            button2.setId(R.id.snippet_button);
            button2.setText(typedArrayObtainStyledAttributes.getResourceId(1, R.string.add_to_cart_button_title));
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                button2.setAppearance(typedArrayObtainStyledAttributes.getResourceId(2, 0));
            } else {
                button2.setAppearanceFromAttr(R.attr.buttonSafedealSecondaryMedium);
            }
            D6.w(button2);
            button = button2;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ?? aVar2 = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
            aVar2.setId(R.id.snippet_button);
            aVar2.setText(typedArrayObtainStyledAttributes.getResourceId(1, R.string.add_to_cart_text_title));
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                aVar2.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
            }
            D6.w(aVar2);
            button = aVar2;
        }
        this.f116149d = button;
        addView(button);
        typedArrayObtainStyledAttributes.recycle();
    }
}
