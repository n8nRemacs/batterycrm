package com.avito.android.advert.deeplinks.delivery_order;

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
public final class c extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f68987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(N.b bVar, a aVar) {
        super(bVar);
        this.f68987b = aVar;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        a aVar = this.f68987b;
        N0 n02 = aVar.f68981m;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        a.k(aVar, z.n(th2), th2);
    }
}
