package com.avito.android.cart_sheet_after_adding.ui.components;

import android.text.TextUtils;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DiscountOnDelivery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class s extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final s f115583l = new s();

    public s() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        aVar2.setId(R.id.cart_sheet_after_adding_discount_on_delivery_text);
        aVar2.setMaxLines(1);
        aVar2.setEllipsize(TextUtils.TruncateAt.END);
        return G0.f406611a;
    }
}
