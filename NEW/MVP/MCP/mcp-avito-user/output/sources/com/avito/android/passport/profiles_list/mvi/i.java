package com.avito.android.passport.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction;
import j60.InterfaceC42205b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PassportProfilesListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lj60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<PassportProfilesListInternalAction, InterfaceC42205b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213847b;

    @Inject
    public i(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f213847b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42205b b(PassportProfilesListInternalAction passportProfilesListInternalAction) {
        PassportProfilesListInternalAction passportProfilesListInternalAction2 = passportProfilesListInternalAction;
        if (passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.DeepLinkAction) {
            b.a.a(this.f213847b, ((PassportProfilesListInternalAction.DeepLinkAction) passportProfilesListInternalAction2).f213833b, null, null, 6);
            return InterfaceC42205b.C11548b.f405435a;
        }
        if (passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.Close) {
            return new InterfaceC42205b.a(((PassportProfilesListInternalAction.Close) passportProfilesListInternalAction2).f213830b);
        }
        if (passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.Error ? true : passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.NewSearch ? true : passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.Content ? true : passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.ContentV2 ? true : passportProfilesListInternalAction2 instanceof PassportProfilesListInternalAction.Loading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
