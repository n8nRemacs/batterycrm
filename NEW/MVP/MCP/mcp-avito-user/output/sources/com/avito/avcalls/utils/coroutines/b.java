package com.avito.avcalls.utils.coroutines;

import Y61.k;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.S;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f333658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(N.b bVar, c cVar) {
        super(bVar);
        this.f333658b = cVar;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
        com.avito.avcalls.logger.g gVar = com.avito.avcalls.logger.g.f332960a;
        String str = "Exception in " + coroutineContext.get(S.f410719c) + ", message=" + th2.getMessage();
        gVar.getClass();
        com.avito.avcalls.logger.g.a("AvCalls.ExceptionHandler", str, null);
        c cVar = this.f333658b;
        C43259k.d(cVar, cVar.f333659b, null, new a(cVar, th2, null), 2);
    }
}
