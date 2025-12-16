package com.avito.android.rating.user_contacts.mvi;

import Sg0.InterfaceC15184a;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: UserContactsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "LSg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements com.avito.android.arch.mvi.t<UserContactsInternalAction, InterfaceC15184a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f247865b;

    @Inject
    public q(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f247865b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15184a b(UserContactsInternalAction userContactsInternalAction) {
        UserContactsInternalAction userContactsInternalAction2 = userContactsInternalAction;
        if (userContactsInternalAction2 instanceof UserContactsInternalAction.HandleDeeplink) {
            UserContactsInternalAction.HandleDeeplink handleDeeplink = (UserContactsInternalAction.HandleDeeplink) userContactsInternalAction2;
            this.f247865b.r6(handleDeeplink.f247787c, handleDeeplink.f247786b, "req_key_user_contacts");
            G0 g02 = G0.f406611a;
            return null;
        }
        if (userContactsInternalAction2 instanceof UserContactsInternalAction.ShowErrorToast) {
            UserContactsInternalAction.ShowErrorToast showErrorToast = (UserContactsInternalAction.ShowErrorToast) userContactsInternalAction2;
            return new InterfaceC15184a.b(showErrorToast.f247795b, showErrorToast.f247796c, showErrorToast.f247797d, showErrorToast.f247798e);
        }
        if (userContactsInternalAction2 instanceof UserContactsInternalAction.ContactDeleted ? true : userContactsInternalAction2 instanceof UserContactsInternalAction.Loaded ? true : userContactsInternalAction2 instanceof UserContactsInternalAction.Loading ? true : userContactsInternalAction2 instanceof UserContactsInternalAction.RatingPublished ? true : userContactsInternalAction2 instanceof UserContactsInternalAction.ShowError ? true : userContactsInternalAction2.equals(UserContactsInternalAction.HideLoadingItem.f247788b) ? true : userContactsInternalAction2.equals(UserContactsInternalAction.ShowLoadingItem.f247800b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
