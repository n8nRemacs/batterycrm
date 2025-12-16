package com.avito.android.advert.deeplinks.want_to_buy;

import com.avito.android.advert.deeplinks.AdvertWantToBuyRequestLink;
import com.avito.android.error.z;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f69043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertWantToBuyRequestLink f69044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(N.b bVar, h hVar, AdvertWantToBuyRequestLink advertWantToBuyRequestLink) {
        super(bVar);
        this.f69043b = hVar;
        this.f69044c = advertWantToBuyRequestLink;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        h hVar = this.f69043b;
        N0 n02 = hVar.f69053l;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        h.k(hVar, z.n(th2), this.f69044c);
    }
}
