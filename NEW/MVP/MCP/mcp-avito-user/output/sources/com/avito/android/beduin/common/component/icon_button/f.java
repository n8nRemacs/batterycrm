package com.avito.android.beduin.common.component.icon_button;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.utils.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: BeduinIconButtonLayout.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/f;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setSpinnerAppearance", "(Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;)V", "", "isEnabled", "setEnabled", "(Z)V", "isLoading", "setLoading", "Lkotlin/Function0;", "listener", "setButtonClickListener", "(LY41/a;)V", "Lcom/avito/android/lib/design/button/Button;", "b", "Lcom/avito/android/lib/design/button/Button;", "getButton", "()Lcom/avito/android/lib/design/button/Button;", "button", "Lcom/avito/android/lib/design/spinner/Spinner;", "c", "Lcom/avito/android/lib/design/spinner/Spinner;", "getSpinner", "()Lcom/avito/android/lib/design/spinner/Spinner;", "spinner", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f101443d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final Button button;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final Spinner spinner;

    public f(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setClipToPadding(false);
        setClipChildren(false);
        Button button = new Button(context, null, 0, 0, 14, null);
        button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        View viewFindViewById = button.findViewById(R.id.image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        imageView.setMinimumHeight(0);
        imageView.setMinimumWidth(0);
        View viewFindViewById2 = button.findViewById(R.id.spinner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.spinner = (Spinner) viewFindViewById2;
        this.button = button;
        addView(button);
    }

    private final void setSpinnerAppearance(BeduinIconButtonModel.Style style) {
        Integer size;
        BeduinIconButtonModel.Style.Spinner spinner = style != null ? style.getSpinner() : null;
        ColorStateList colorStateListA = C48065c.a(getContext(), spinner != null ? spinner.getColor() : null, R.attr.black);
        Spinner spinner2 = this.spinner;
        spinner2.setTintColor(colorStateListA);
        spinner2.setSize((spinner == null || (size = spinner.getSize()) == null) ? 0 : y6.b(size.intValue()));
    }

    public final void a(@l BeduinIconButtonModel.Style style) {
        p.b(this.button, style);
        setSpinnerAppearance(style);
    }

    @k
    public final Button getButton() {
        return this.button;
    }

    @k
    public final Spinner getSpinner() {
        return this.spinner;
    }

    public final void setButtonClickListener(@k Y41.a<G0> listener) {
        this.button.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(22, listener));
    }

    @Override // android.view.View
    public void setEnabled(boolean isEnabled) {
        this.button.setEnabled(isEnabled);
    }

    public final void setLoading(boolean isLoading) {
        Button button = this.button;
        button.setLoading(isLoading);
        button.setClickable(!isLoading);
    }
}
