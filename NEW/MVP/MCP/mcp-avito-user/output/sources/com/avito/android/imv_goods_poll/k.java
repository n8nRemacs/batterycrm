package com.avito.android.imv_goods_poll;

import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import rk0.InterfaceC47673a;

/* compiled from: ImvGoodsPollInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/k;", "Lcom/avito/android/imv_goods_poll/j;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47673a f170670a;

    @Inject
    public k(@Y61.k InterfaceC47673a interfaceC47673a) {
        this.f170670a = interfaceC47673a;
    }

    @Override // com.avito.android.imv_goods_poll.j
    @Y61.l
    public final Object a(long j12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k Continuation<? super TypedResult<G0>> continuation) {
        return this.f170670a.a(j12, str, str3, str2, continuation);
    }
}
