package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.BusinessVrfDuplicationAction;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.PassportVrfActionItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BusinessVrfDuplicationReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "LZ50/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<BusinessVrfDuplicationInternalAction, Z50.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final BusinessVrfDuplication f212572b;

    @Inject
    public m(@Y61.l BusinessVrfDuplication businessVrfDuplication) {
        this.f212572b = businessVrfDuplication;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Z50.c a(BusinessVrfDuplicationInternalAction businessVrfDuplicationInternalAction, Z50.c cVar) {
        BusinessVrfDuplicationInternalAction businessVrfDuplicationInternalAction2 = businessVrfDuplicationInternalAction;
        Z50.c cVar2 = cVar;
        if (!businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.Init.f212548b)) {
            if (businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.Close.f212542b) ? true : businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.OnFinal.f212549b) ? true : businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.HandleDeepLink ? true : businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.LoadingStarted ? true : businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.ContentLoaded ? true : businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.Error) {
                return cVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        BusinessVrfDuplication businessVrfDuplication = this.f212572b;
        if (businessVrfDuplication == null) {
            return cVar2;
        }
        String title = businessVrfDuplication.getProfile().getTitle();
        String name = businessVrfDuplication.getProfile().getName();
        PassportListAvatar avatar = businessVrfDuplication.getProfile().getAvatar();
        String title2 = businessVrfDuplication.getTitle();
        AttributedText text = businessVrfDuplication.getText();
        List<BusinessVrfDuplicationAction> actions = businessVrfDuplication.getActions();
        ArrayList arrayList = new ArrayList(C42745f0.q(actions, 10));
        for (BusinessVrfDuplicationAction businessVrfDuplicationAction : actions) {
            arrayList.add(new PassportVrfActionItem(businessVrfDuplicationAction.getActionName(), businessVrfDuplicationAction.getTitle(), businessVrfDuplicationAction.getSubtitle(), businessVrfDuplicationAction.getIconId(), businessVrfDuplicationAction.getDeeplink(), businessVrfDuplicationAction.getPassportUserDialogWithProfile()));
        }
        return new Z50.c(false, new Z50.d(title, name, avatar, title2, null, text, arrayList, null, 144, null), null);
    }
}
