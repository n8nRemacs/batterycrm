package com.avito.android.vas_discount.ui.dialog;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DiscountDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "kotlin.jvm.PlatformType", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DiscountDialogFragment f319694l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DiscountDialogFragment discountDialogFragment) {
        super(1);
        this.f319694l = discountDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        DiscountDialogFragment discountDialogFragment = this.f319694l;
        com.avito.android.lib.design.bottom_sheet.d dVar = discountDialogFragment.f319688p0;
        if (dVar != null) {
            dVar.R(new b(discountDialogFragment, deepLink2));
            dVar.r();
        }
        return G0.f406611a;
    }
}
