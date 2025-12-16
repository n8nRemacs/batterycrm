package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.network.model.Action;
import com.avito.android.passport.network.model.ProfileCreationDuplicationOptionsResponse;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.Flow;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.PassportVrfActionItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BusinessVrfDuplicationProfileCreationReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create/business_vrf_duplication/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "LZ50/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<BusinessVrfDuplicationInternalAction, Z50.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Z50.c a(BusinessVrfDuplicationInternalAction businessVrfDuplicationInternalAction, Z50.c cVar) {
        BusinessVrfDuplicationInternalAction businessVrfDuplicationInternalAction2 = businessVrfDuplicationInternalAction;
        Z50.c cVar2 = cVar;
        if (businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.LoadingStarted) {
            return new Z50.c(true, cVar2.f19883c, cVar2.f19884d);
        }
        if (!(businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.ContentLoaded)) {
            if (businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.Error) {
                return new Z50.c(false, null, ((BusinessVrfDuplicationInternalAction.Error) businessVrfDuplicationInternalAction2).f212544b.getMessage());
            }
            if (businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.Init.f212548b) ? true : businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.Close.f212542b) ? true : businessVrfDuplicationInternalAction2.equals(BusinessVrfDuplicationInternalAction.OnFinal.f212549b) ? true : businessVrfDuplicationInternalAction2 instanceof BusinessVrfDuplicationInternalAction.HandleDeepLink) {
                return cVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ProfileCreationDuplicationOptionsResponse profileCreationDuplicationOptionsResponse = ((BusinessVrfDuplicationInternalAction.ContentLoaded) businessVrfDuplicationInternalAction2).f212543b;
        String title = profileCreationDuplicationOptionsResponse.getTitle();
        String subtitle = profileCreationDuplicationOptionsResponse.getSubtitle();
        AttributedText text = profileCreationDuplicationOptionsResponse.getText();
        List<Action> actions = profileCreationDuplicationOptionsResponse.getActions();
        ArrayList arrayList = new ArrayList(C42745f0.q(actions, 10));
        for (Action action : actions) {
            arrayList.add(new PassportVrfActionItem(action.getActionName(), action.getTitle(), action.getSubtitle(), action.getIconId(), action.getUrl(), null));
        }
        return new Z50.c(false, new Z50.d(null, null, null, title, subtitle, text, arrayList, Flow.f212550b, 7, null), null);
    }
}
