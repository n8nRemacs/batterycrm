package com.avito.android.publish.edit_advert_request;

import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.auction.remote.model.AuctionCheckResponse;
import com.avito.android.deep_linking.links.AuctionOfferLink;
import com.avito.android.publish.edit_advert_request.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.publish.EditAdvertResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionOfferChecker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/auction/remote/model/AuctionCheckResponse;", "checkResponse", "Lcom/avito/android/publish/edit_advert_request/a$a;", "apply", "(Lcom/avito/android/auction/remote/model/AuctionCheckResponse;)Lcom/avito/android/publish/edit_advert_request/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f235458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditAdvertResult.Ok f235459c;

    public b(EditAdvertResult.Ok ok2, String str) {
        this.f235458b = str;
        this.f235459c = ok2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zF2 = L.f(((AuctionCheckResponse) obj).getIsEnable(), Boolean.TRUE);
        EditAdvertResult.Ok ok2 = this.f235459c;
        if (!zF2) {
            return new a.InterfaceC7097a.b(new TypedResult.Success(ok2));
        }
        String str = this.f235458b;
        AuctionOfferLink auctionOfferLink = new AuctionOfferLink(str, null, "lot-from-item-edit", "lot-from-item-edit");
        AuctionOfferLink.b bVar = AuctionOfferLink.f133020f;
        C22777e.a();
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("previous_response_key", ok2);
        bundle.putString("item_id_key", str);
        return new a.InterfaceC7097a.C7098a(auctionOfferLink, bundle);
    }
}
