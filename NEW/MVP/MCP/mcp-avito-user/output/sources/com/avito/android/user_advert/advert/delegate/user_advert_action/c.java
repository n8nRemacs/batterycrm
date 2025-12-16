package com.avito.android.user_advert.advert.delegate.user_advert_action;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.profile.ItemActivateResponse;
import com.avito.android.user_advert.advert.delegate.user_advert_action.i;
import com.avito.android.util.P2;
import fH0.InterfaceC40292b;
import kI0.InterfaceC42585a;
import kotlin.Metadata;

/* compiled from: UserAdvertActionPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/profile/ItemActivateResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f308853b;

    public c(b bVar) {
        this.f308853b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.c;
        b bVar = this.f308853b;
        if (z12) {
            bVar.f308834e.H();
            return;
        }
        if (p22 instanceof P2.a) {
            InterfaceC42585a interfaceC42585a = bVar.f308834e;
            ApiError apiError = ((P2.a) p22).f318719a;
            interfaceC42585a.o(apiError);
            InterfaceC42585a interfaceC42585a2 = bVar.f308834e;
            interfaceC42585a2.R();
            bVar.f395801b.accept(new i.b(apiError));
            interfaceC42585a2.s(apiError);
            return;
        }
        if (p22 instanceof P2.b) {
            ItemActivateResponse itemActivateResponse = (ItemActivateResponse) ((P2.b) p22).f318720a;
            if (!itemActivateResponse.getSuccess()) {
                DeepLink deepLink = itemActivateResponse.getDeepLink();
                if (deepLink != null) {
                    bVar.f395801b.accept(new InterfaceC40292b.a(deepLink));
                    return;
                }
                return;
            }
            bVar.f308834e.z();
            InterfaceC42585a interfaceC42585a3 = bVar.f308834e;
            interfaceC42585a3.R();
            bVar.f395801b.accept(new i.c(new SuccessResult(itemActivateResponse.getMessage())));
            interfaceC42585a3.f();
        }
    }
}
