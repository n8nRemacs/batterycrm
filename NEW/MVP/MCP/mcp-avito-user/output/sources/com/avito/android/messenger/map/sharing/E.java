package com.avito.android.messenger.map.sharing;

import com.avito.android.messenger.map.sharing.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/sharing/K$d;)Lcom/avito/android/messenger/map/sharing/K$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E extends N implements Y41.l<K.d, K.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f196638l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f196639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(boolean z12, z zVar) {
        super(1);
        this.f196638l = z12;
        this.f196639m = zVar;
    }

    @Override // Y41.l
    public final K.d invoke(K.d dVar) {
        K.d dVar2 = dVar;
        dVar2.f196657b = this.f196638l;
        boolean z12 = dVar2 instanceof K.d.a;
        boolean z13 = dVar2.f196660e;
        if (z12 && !z13) {
            return dVar2;
        }
        z zVar = this.f196639m;
        zVar.f196764d0.postValue(G0.f406611a);
        return !z13 ? z.me(zVar, dVar2.a(true)) : dVar2;
    }
}
