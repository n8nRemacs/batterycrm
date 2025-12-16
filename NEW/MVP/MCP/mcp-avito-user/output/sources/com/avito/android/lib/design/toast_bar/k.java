package com.avito.android.lib.design.toast_bar;

import PK0.n;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.util.C35763c0;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarViewRe23.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/k;", "Lcom/avito/android/lib/design/toast_bar/i;", "Lcom/avito/android/lib/design/toast_bar/state/ToastBarState;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/lib/design/toast_bar/state/ToastBarState;)V", "LHV/a;", "newStyle", "setStyle", "(LHV/a;)V", "Landroid/view/ViewGroup;", "<set-?>", "I", "Landroid/view/ViewGroup;", "getRightItemContainer", "()Landroid/view/ViewGroup;", "rightItemContainer", "", "J", "Z", "isForceVerticalLayout", "()Z", "setForceVerticalLayout", "(Z)V", "getHasLeftContent", "hasLeftContent", "getHasRightContent", "hasRightContent", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends i {

    /* renamed from: F, reason: collision with root package name */
    @l
    public ToastBarState f181118F;

    /* renamed from: G, reason: collision with root package name */
    public ViewGroup f181119G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f181120H;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public ViewGroup rightItemContainer;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public boolean isForceVerticalLayout;

    /* compiled from: ToastBarViewRe23.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ToastBarState.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToastBarState.State state = ToastBarState.State.f181135b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.toastBar : i12);
    }

    private final boolean getHasLeftContent() {
        ViewGroup viewGroup = this.f181119G;
        if (viewGroup == null) {
            viewGroup = null;
        }
        return viewGroup.getChildCount() > 1;
    }

    private final boolean getHasRightContent() {
        return getRightItemContainer().getChildCount() > 0;
    }

    @Y61.k
    public final ViewGroup getRightItemContainer() {
        ViewGroup viewGroup = this.rightItemContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // com.avito.android.lib.design.toast_bar.i
    public final void h(@Y61.k LayoutInflater layoutInflater) {
        layoutInflater.inflate(R.layout.view_toast_bar_re23, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.toast_text);
        HV.a style = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        if (style != null) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), style.f7107g);
            n nVar = style.f7104d;
            if (nVar != null) {
                com.avito.android.lib.design.text_view.e.a(textView, nVar);
            }
        }
        this.f181120H = textView;
        this.f181119G = (ViewGroup) findViewById(R.id.toast_left_item_container);
        this.rightItemContainer = (ViewGroup) findViewById(R.id.toast_right_item_container);
    }

    @Override // com.avito.android.lib.design.toast_bar.i
    public final void i() {
        int i12;
        Integer numValueOf;
        HV.a style;
        HV.a style2;
        TextView textView = this.f181120H;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getText());
        TextView textView2 = this.f181120H;
        TextView textView3 = textView2 == null ? null : textView2;
        if (getHasLeftContent()) {
            HV.a style3 = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
            if (style3 != null) {
                i12 = style3.f7112l;
                numValueOf = Integer.valueOf(i12);
            }
            numValueOf = null;
        } else {
            HV.a style4 = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
            if (style4 != null) {
                i12 = style4.f7105e;
                numValueOf = Integer.valueOf(i12);
            }
            numValueOf = null;
        }
        int i13 = 0;
        D6.c(textView3, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0), null, null, null, 14);
        ViewGroup viewGroup = this.f181119G;
        ViewGroup viewGroup2 = viewGroup == null ? null : viewGroup;
        int i14 = (getHasLeftContent() || (style2 = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String()) == null) ? 0 : style2.f7106f;
        if (getHasLeftContent() && (style = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String()) != null) {
            i13 = style.f7111k;
        }
        D6.c(viewGroup2, Integer.valueOf(i13), Integer.valueOf(i14), null, null, 12);
        HV.a style5 = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        if (style5 != null) {
            n(style5);
        }
    }

    public final void l(@Y61.k List<? extends View> list) {
        TextView textView = this.f181120H;
        TextView textView2 = textView == null ? null : textView;
        HV.a style = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        D6.c(textView2, style != null ? Integer.valueOf(style.f7112l) : null, null, null, null, 14);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view = (View) obj;
            ViewGroup viewGroup = this.f181119G;
            if (viewGroup == null) {
                viewGroup = null;
            }
            viewGroup.addView(view, i12);
            i12 = i13;
        }
    }

    public final void m(HV.a aVar) {
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
        gradientDrawableE.setCornerRadius(aVar.f7122v);
        C35763c0 c35763c0 = aVar.f7121u;
        gradientDrawableE.setColor(c35763c0 != null ? c35763c0.b() : null);
        setBackground(gradientDrawableE);
    }

    public final void n(HV.a aVar) {
        if (getHasRightContent()) {
            boolean z12 = this.isForceVerticalLayout;
            boolean z13 = !z12;
            if (!z12) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup viewGroup = this.f181119G;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                viewGroup.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                getRightItemContainer().measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int displayWidthPx = (((getDisplayWidthPx() - aVar.f7117q) - aVar.f7118r) - aVar.f7113m) - aVar.f7114n;
                ViewGroup viewGroup2 = this.f181119G;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                z13 = (getRightItemContainer().getMeasuredWidth() + viewGroup2.getMeasuredWidth()) + aVar.f7108h <= displayWidthPx;
            }
            if (!z13) {
                setOrientation(1);
                D6.c(getRightItemContainer(), Integer.valueOf(getHasLeftContent() ? aVar.f7111k : aVar.f7105e), Integer.valueOf(aVar.f7109i), null, null, 12);
                return;
            }
            ViewGroup viewGroup3 = this.f181119G;
            View view = viewGroup3 != null ? viewGroup3 : null;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
            view.setLayoutParams(layoutParams2);
            D6.c(getRightItemContainer(), null, null, Integer.valueOf(-aVar.f7110j), null, 11);
        }
    }

    public final void setForceVerticalLayout(boolean z12) {
        this.isForceVerticalLayout = z12;
    }

    public k(@Y61.k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12, 0, 8, null);
        setOrientation(0);
        setGravity(8388627);
        HV.a style = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        if (style != null) {
            m(style);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    @Override // com.avito.android.lib.design.toast_bar.i, LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.lib.design.toast_bar.state.ToastBarState r7) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.toast_bar.k.setState(com.avito.android.lib.design.toast_bar.state.ToastBarState):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015b  */
    @Override // com.avito.android.lib.design.toast_bar.i, LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k HV.a r13) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.toast_bar.k.setStyle(HV.a):void");
    }
}
