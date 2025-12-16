package com.avito.android.connection_quality.connectivity;

import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: ConnectivityProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Z;", "Lcom/avito/android/connection_quality/reactive_network/a;", "connectivityResult", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.d<Z<com.avito.android.connection_quality.reactive_network.a>> f125703b;

    public g(com.jakewharton.rxrelay3.d<Z<com.avito.android.connection_quality.reactive_network.a>> dVar) {
        this.f125703b = dVar;
    }

    @Override // l41.g
    public final void accept(@Y61.k Object obj) {
        this.f125703b.accept(obj);
        Object obj2 = ((Z) obj).f406625b;
        if (!(obj2 instanceof Z.b)) {
            V2.f318762a.i("ConnectivityProvider", "Connectivity update received: " + ((com.avito.android.connection_quality.reactive_network.a) obj2), null);
        }
        Throwable thB = Z.b(obj2);
        if (thB != null) {
            V2.f318762a.i("ConnectivityProvider", "Connectivity update error: " + thB, null);
        }
    }
}
