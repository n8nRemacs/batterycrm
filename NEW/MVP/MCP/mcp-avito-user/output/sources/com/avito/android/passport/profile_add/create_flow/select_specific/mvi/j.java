package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import T50.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.entity.SelectSpecificInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectSpecificOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificInternalAction;", "LT50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<SelectSpecificInternalAction, T50.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f211759b;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f211759b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final T50.b b(SelectSpecificInternalAction selectSpecificInternalAction) {
        SelectSpecificInternalAction selectSpecificInternalAction2 = selectSpecificInternalAction;
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.Navigate) {
            return new b.a(((SelectSpecificInternalAction.Navigate) selectSpecificInternalAction2).f211744b);
        }
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.ActionError) {
            return new b.C1047b(((SelectSpecificInternalAction.ActionError) selectSpecificInternalAction2).f211738b);
        }
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.EmptySelectError ? true : selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.FinishActionInProgress ? true : selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.InitState ? true : selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.SelectSpecific ? true : selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.StartActionProgress) {
            return null;
        }
        if (!(selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.OpenDeepLink)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a.a(this.f211759b, ((SelectSpecificInternalAction.OpenDeepLink) selectSpecificInternalAction2).f211745b, null, null, 6);
        return null;
    }
}
