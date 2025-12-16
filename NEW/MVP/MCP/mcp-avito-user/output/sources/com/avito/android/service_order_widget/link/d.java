package com.avito.android.service_order_widget.link;

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
/* loaded from: classes3.dex */
public final class d extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f278972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f278973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(N.b bVar, b bVar2, String str) {
        super(bVar);
        this.f278972b = bVar2;
        this.f278973c = str;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        b bVar = this.f278972b;
        N0 n02 = bVar.f278960n;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        b.a(bVar, z.n(th2), this.f278973c);
    }
}
