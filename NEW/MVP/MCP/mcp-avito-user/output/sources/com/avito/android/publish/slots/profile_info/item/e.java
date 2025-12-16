package com.avito.android.publish.slots.profile_info.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SellerRating;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/profile_info/item/e;", "Lcom/avito/android/publish/slots/profile_info/item/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Float fValueOf;
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.J(aVar2.f244696c);
        gVar.A60(com.avito.android.image_loader.b.b(aVar2.f244698e), aVar2.f244697d);
        SellerRating sellerRating = aVar2.f244699f;
        if (sellerRating == null || (fValueOf = sellerRating.getScoreFloat()) == null) {
            fValueOf = sellerRating != null ? Float.valueOf(sellerRating.getScore()) : null;
        }
        gVar.S2(sellerRating != null ? sellerRating.getText() : null, fValueOf);
    }
}
