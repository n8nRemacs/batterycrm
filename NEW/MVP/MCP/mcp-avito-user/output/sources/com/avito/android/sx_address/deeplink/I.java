package com.avito.android.sx_address.deeplink;

import com.avito.android.sx_address.SxAddressRevalidateResult;
import com.avito.android.util.C35936s;
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
/* loaded from: classes4.dex */
public final class I extends AbstractCoroutineContextElement implements kotlinx.coroutines.N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f292792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(N.b bVar, J j12) {
        super(bVar);
        this.f292792b = j12;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        J j12 = this.f292792b;
        N0 n02 = j12.f292795h;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        j12.j(new SxAddressRevalidateResult.Failure(C35936s.a(com.avito.android.error.z.n(th2), null)));
    }
}
