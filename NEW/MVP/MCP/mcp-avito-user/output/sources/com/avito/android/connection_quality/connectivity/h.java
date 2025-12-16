package com.avito.android.connection_quality.connectivity;

import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ConnectivityProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.d<Z<com.avito.android.connection_quality.reactive_network.a>> f125704b;

    public h(com.jakewharton.rxrelay3.d<Z<com.avito.android.connection_quality.reactive_network.a>> dVar) {
        this.f125704b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f125704b.accept(Z.a(new Z.b(th2)));
        V2.f318762a.a("ConnectivityProvider", "Network state subscription failed", th2);
    }
}
