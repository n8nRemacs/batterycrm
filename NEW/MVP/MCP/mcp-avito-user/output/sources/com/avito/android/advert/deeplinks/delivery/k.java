package com.avito.android.advert.deeplinks.delivery;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.deep_linking.links.RequestDeliveryLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RequestDeliveryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f68939l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RequestDeliveryLink f68940m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, RequestDeliveryLink requestDeliveryLink) {
        super(2);
        this.f68939l = aVar;
        this.f68940m = requestDeliveryLink;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setImage(R.drawable.ic_delivery_request);
        bVar2.setTitle(R.string.advert_details_delivery_req_dialog_title);
        bVar2.setSubtitle(R.string.advert_details_delivery_req_dialog_message);
        bVar2.setButtonsOrientation(1);
        a aVar = this.f68939l;
        RequestDeliveryLink requestDeliveryLink = this.f68940m;
        bVar2.O3(R.string.advert_details_delivery_req_dialog_agree_button, new h(aVar, requestDeliveryLink, dialogInterface2));
        bVar2.T3(R.string.advert_details_delivery_req_dialog_cancel_button, new j(aVar, requestDeliveryLink, dialogInterface2));
        return G0.f406611a;
    }
}
