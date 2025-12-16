package com.avito.android.comfortable_deal.commission_details;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommissionDetailsDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CommissionDetailsDialog f120568l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommissionDetailsDialog commissionDetailsDialog) {
        super(1);
        this.f120568l = commissionDetailsDialog;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        CommissionDetailsDialog commissionDetailsDialog = this.f120568l;
        com.avito.android.deeplink_handler.handler.composite.a aVar = commissionDetailsDialog.f120562j0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink2, null, null, 6);
        commissionDetailsDialog.dismiss();
        return G0.f406611a;
    }
}
