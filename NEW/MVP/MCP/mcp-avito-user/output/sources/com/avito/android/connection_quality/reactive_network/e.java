package com.avito.android.connection_quality.reactive_network;

import android.net.NetworkInfo;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.C41861k0;
import kotlin.Metadata;
import l41.o;

/* compiled from: MarshmallowNetworkObservingStrategy.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000f\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0002\b\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/connection_quality/reactive_network/a;", "it", "Lorg/reactivestreams/c;", "Lj41/e;", "apply", "(Lcom/avito/android/connection_quality/reactive_network/a;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f125729b;

    public e(b bVar) {
        this.f125729b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        a aVar = (a) obj;
        a aVar2 = this.f125729b.f125724c;
        boolean z12 = aVar2.f125718c != aVar.f125718c;
        boolean z13 = aVar2.f125716a == NetworkInfo.State.CONNECTED;
        boolean z14 = aVar.f125716a == NetworkInfo.State.DISCONNECTED;
        boolean z15 = aVar.f125717b != NetworkInfo.DetailedState.IDLE;
        if (!z12 || !z13 || !z14 || !z15) {
            return AbstractC41777j.j(new a[]{aVar}[0]);
        }
        a[] aVarArr = {aVar, aVar2};
        int i12 = AbstractC41777j.f401972b;
        return new C41861k0(aVarArr);
    }
}
