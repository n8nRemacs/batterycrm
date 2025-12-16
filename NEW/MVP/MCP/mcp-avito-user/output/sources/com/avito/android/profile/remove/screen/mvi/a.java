package com.avito.android.profile.remove.screen.mvi;

import M90.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.profile.remove.screen.mvi.entity.ProfileRemoveItemsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileRemoveItemsActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LM90/a;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "LM90/c;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<M90.a, ProfileRemoveItemsInternalAction, M90.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ProfileRemoveItemsInternalAction> b(M90.a aVar, M90.c cVar) {
        M90.a aVar2 = aVar;
        if (aVar2 instanceof a.C0660a) {
            return new C43210w(new ProfileRemoveItemsInternalAction.OpenScreen(((a.C0660a) aVar2).f10420a));
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(new ProfileRemoveItemsInternalAction.FollowDeeplink(((a.b) aVar2).f10421a));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(ProfileRemoveItemsInternalAction.OpenHowToReturnMoneyScreen.f224178b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
