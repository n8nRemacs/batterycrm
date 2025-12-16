package com.avito.android.vas_discount.ui.dialog;

import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DiscountDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DiscountDialogFragment f319692l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f319693m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DiscountDialogFragment discountDialogFragment, DeepLink deepLink) {
        super(0);
        this.f319692l = discountDialogFragment;
        this.f319693m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Bundle bundle;
        DiscountDialogFragment discountDialogFragment = this.f319692l;
        ActivityC22955m activityC22955mL1 = discountDialogFragment.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
        DeepLink deepLink = this.f319693m;
        if (deepLink instanceof MyAdvertDetailsLink) {
            bundle = new Bundle();
            bundle.putParcelable("up_intent", null);
        } else {
            bundle = null;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = discountDialogFragment.f319685m0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, bundle, 2);
        return G0.f406611a;
    }
}
