package com.avito.android.user_adverts.tab_actions.host.domain;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import hm0.InterfaceC40961a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserAdvertsActionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/domain/a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {
    @l
    Object a(@k Set<String> set, @k Continuation<? super TypedResult<DeepLink>> continuation);

    @l
    Object b(@k Set<String> set, boolean z12, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @l
    Object c(@k Set<String> set, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @l
    TypedResult.Success d(@l DeepLink deepLink, @k Set set);

    @l
    Object e(@k Set<String> set, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation);

    @l
    Object f(@k Set set, @l Map map, @k SuspendLambda suspendLambda);
}
