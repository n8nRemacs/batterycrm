package com.avito.android.user_adverts.tab_actions.info.mvi;

import Y61.k;
import bJ0.C25520c;
import bJ0.InterfaceC25518a;
import com.avito.android.user_adverts.tab_actions.info.mvi.entity.UserAdvertsActionResultInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsActionResultActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LbJ0/a;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "LbJ0/c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC25518a, UserAdvertsActionResultInternalAction, C25520c> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a((C25520c) aVar.invoke(), null)), C43175k.C(new b(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UserAdvertsActionResultInternalAction> b(InterfaceC25518a interfaceC25518a, C25520c c25520c) {
        return C43175k.w();
    }
}
