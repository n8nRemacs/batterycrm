package com.avito.android.beduin.common.component.payment_type_selector.item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.payment_type_selector.PaymentBadgeModel;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: PaymentMethodItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/payment_type_selector/item/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f101827f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f101828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f101829c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f101830d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Badge f101831e;

    public f(@k View view) {
        super(view);
        this.f101828b = view;
        this.f101829c = (ImageView) view.findViewById(R.id.icon);
        this.f101830d = (TextView) view.findViewById(R.id.title);
        this.f101831e = (Badge) view.findViewById(R.id.badge);
    }

    @Override // com.avito.android.beduin.common.component.payment_type_selector.item.e
    public final void B10(boolean z12) {
        this.f101828b.setSelected(z12);
    }

    @Override // com.avito.android.beduin.common.component.payment_type_selector.item.e
    public final void CH(@l PaymentBadgeModel paymentBadgeModel) throws Resources.NotFoundException {
        ColorStateList colorStateListE;
        Badge badge = this.f101831e;
        if (paymentBadgeModel == null) {
            badge.setVisibility(8);
            return;
        }
        Context context = this.f101828b.getContext();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(paymentBadgeModel.getTheme()));
        String style = paymentBadgeModel.getStyle();
        Integer numValueOf = style != null ? Integer.valueOf(com.avito.android.lib.util.f.a(contextThemeWrapper, style)) : null;
        UniversalColor color = paymentBadgeModel.getColor();
        if (color != null) {
            C48063a.f437606a.getClass();
            colorStateListE = C48063a.e(context, color);
        } else {
            colorStateListE = null;
        }
        Badge.e(badge, numValueOf != null ? numValueOf.intValue() : R.style.Re23_Badge_TextRedS, null, colorStateListE, 26);
        badge.setTitleText(paymentBadgeModel.getText());
        badge.setVisibility(0);
    }

    @Override // com.avito.android.beduin.common.component.payment_type_selector.item.e
    public final void a(@k Y41.a<G0> aVar) {
        this.f101828b.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(23, aVar));
    }

    @Override // com.avito.android.beduin.common.component.payment_type_selector.item.e
    public final void b(@l String str) {
        I5.a(this.f101830d, str, false);
    }

    @Override // com.avito.android.beduin.common.component.payment_type_selector.item.e
    public final void lK(@l Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.f101828b;
            view.getLayoutParams().width = y6.b(iIntValue);
            view.requestLayout();
        }
    }

    @Override // com.avito.android.beduin.common.component.payment_type_selector.item.e
    public final void x80(@l IconBase64 iconBase64) {
        BitmapDrawable bitmapDrawableB = v.b(this.f101828b.getContext(), iconBase64);
        if (bitmapDrawableB != null) {
            this.f101829c.setImageDrawable(bitmapDrawableB);
        }
    }
}
