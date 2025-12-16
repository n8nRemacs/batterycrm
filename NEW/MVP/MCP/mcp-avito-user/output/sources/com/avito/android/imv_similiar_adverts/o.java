package com.avito.android.imv_similiar_adverts;

import com.avito.android.di.B;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tk0.InterfaceC48681a;
import uk0.C49072b;

/* compiled from: ImvSimilarAdvertsInteractor.kt */
@B
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/o;", "Lcom/avito/android/imv_similiar_adverts/n;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48681a f170933a;

    @Inject
    public o(@Y61.k InterfaceC48681a interfaceC48681a) {
        this.f170933a = interfaceC48681a;
    }

    @Override // com.avito.android.imv_similiar_adverts.n
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<C49072b>> continuation) {
        return this.f170933a.a(str, str2, continuation);
    }
}
