package com.avito.android.suggest_addresses.domain;

import Y61.k;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.suggest_addresses.model.ResolvedAddressResult;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tF.AbstractC48544a;

/* compiled from: SuggestAddressesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/a;", "", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @k
    InterfaceC43160i<TypedResult<AbstractC48544a.c>> a(@k String str);

    @k
    InterfaceC43160i<TypedResult<ResolvedAddressResult>> b(@k String str, @k String str2);
}
