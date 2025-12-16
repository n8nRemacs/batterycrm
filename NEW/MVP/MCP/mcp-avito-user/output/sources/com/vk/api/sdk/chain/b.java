package com.vk.api.sdk.chain;

import com.vk.api.sdk.p;
import com.vk.api.sdk.z;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ApiMethodPriorityChainCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/chain/b;", "T", "Lcom/vk/api/sdk/chain/d;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b<T> extends d<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f366547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.vk.api.sdk.utils.b f366548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366549d;

    public b(@Y61.k p pVar, @Y61.k o oVar, @Y61.k z zVar, @Y61.k com.vk.api.sdk.utils.b bVar) {
        super(pVar);
        this.f366547b = oVar;
        this.f366548c = bVar;
        this.f366549d = C42727D.c(new a(this));
    }

    @Override // com.vk.api.sdk.chain.d
    @Y61.l
    public final T a(@Y61.k c cVar) throws InterruptedException {
        com.vk.api.sdk.utils.b bVar = this.f366548c;
        boolean zIsActive = bVar.isActive();
        o oVar = this.f366547b;
        if (!zIsActive) {
            return (T) oVar.a(cVar);
        }
        while (bVar.a()) {
            if (Thread.interrupted()) {
                throw new InterruptedException("request interrupted");
            }
            ((Number) this.f366549d.getValue()).intValue();
            bVar.c();
        }
        return (T) oVar.a(cVar);
    }
}
