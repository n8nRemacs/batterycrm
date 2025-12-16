package com.avito.android.user_adverts.tab_actions.info.mvi;

import Y61.k;
import aJ0.C19781a;
import bJ0.C25520c;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.user_adverts.model.UserAdvertActionPendingResult;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfo;
import com.avito.android.user_adverts.tab_actions.info.mvi.entity.UserAdvertsActionResultInternalAction;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsActionResultReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "LbJ0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements u<UserAdvertsActionResultInternalAction, C25520c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f314687b;

    @Inject
    public h(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f314687b = interfaceC35863o4;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25520c a(UserAdvertsActionResultInternalAction userAdvertsActionResultInternalAction, C25520c c25520c) {
        UserAdvertsActionResultInternalAction userAdvertsActionResultInternalAction2 = userAdvertsActionResultInternalAction;
        C25520c c25520c2 = c25520c;
        if (!(userAdvertsActionResultInternalAction2 instanceof UserAdvertsActionResultInternalAction.Init)) {
            if (userAdvertsActionResultInternalAction2 instanceof UserAdvertsActionResultInternalAction.NoChange) {
                return c25520c2;
            }
            throw new NoWhenBranchMatchedException();
        }
        UserAdvertsActionResultInfo userAdvertsActionResultInfo = c25520c2.f57035b;
        UserAdvertActionPendingResult.Info info = userAdvertsActionResultInfo.f314611b;
        return new C25520c(userAdvertsActionResultInfo, new C25520c.a.C1998a(C42745f0.h0(b(info.f312168e), b(info.f312167d))));
    }

    public final List<com.avito.conveyor_item.a> b(UserAdvertActionPendingResult.Block block) {
        DimmedImage image;
        if (block == null) {
            return C42784z0.f406748b;
        }
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.add(new com.avito.android.user_adverts.tab_actions.info.items.block.a(this.f314687b.a(), block.f312157b, block.f312158c));
        Iterable iterable = block.f312159d;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable<UserAdvertActionPendingResult.Advert> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        for (UserAdvertActionPendingResult.Advert advert : iterable2) {
            String str = advert.f312151b;
            AdvertImage advertImage = advert.f312156g;
            arrayList.add(new C19781a(str, (advertImage == null || (image = advertImage.getImage()) == null) ? null : image.getImage(), advert.f312154e, advert.f312153d, advert.f312155f));
        }
        bVarT.addAll(arrayList);
        return C42745f0.p(bVarT);
    }
}
