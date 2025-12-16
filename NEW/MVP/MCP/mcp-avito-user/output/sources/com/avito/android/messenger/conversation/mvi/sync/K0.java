package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;", "Lcom/avito/android/messenger/conversation/mvi/sync/v0;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class K0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194607b;

    public K0(C32293v0 c32293v0) {
        this.f194607b = c32293v0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C32293v0.d dVar = (C32293v0.d) obj;
        V2 v22 = V2.f318762a;
        int i12 = C32293v0.f194852a0;
        C32293v0 c32293v0 = this.f194607b;
        v22.c(c32293v0.f207131E, "Sending RequestMissingUsersAction for execution " + dVar, null);
        c32293v0.le().s(dVar);
    }
}
