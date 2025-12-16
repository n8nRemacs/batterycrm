package com.avito.android.sx_address.deeplink;

import com.avito.android.remote.error.ApiError;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.util.C35936s;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.deeplink.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35174n extends AbstractCoroutineContextElement implements kotlinx.coroutines.N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35175o f292849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35174n(N.b bVar, C35175o c35175o) {
        super(bVar);
        this.f292849b = c35175o;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        ApiError apiErrorN = com.avito.android.error.z.n(th2);
        C35175o c35175o = this.f292849b;
        c35175o.getClass();
        c35175o.j(new SxAddressDeleteResult.Failure(C35936s.a(apiErrorN, null)));
    }
}
