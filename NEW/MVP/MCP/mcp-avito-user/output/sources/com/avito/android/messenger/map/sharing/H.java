package com.avito.android.messenger.map.sharing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.messenger.map.sharing.K;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/sharing/K$d;)Lcom/avito/android/messenger/map/sharing/K$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H extends N implements Y41.l<K.d, K.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f196642l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvitoMapPoint f196643m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(z zVar, AvitoMapPoint avitoMapPoint) {
        super(1);
        this.f196642l = zVar;
        this.f196643m = avitoMapPoint;
    }

    @Override // Y41.l
    public final K.d invoke(K.d dVar) {
        K.d dVar2 = dVar;
        boolean z12 = dVar2.f196660e;
        AvitoMapPoint avitoMapPoint = this.f196643m;
        z zVar = this.f196642l;
        if (z12) {
            zVar.Ja(true);
            zVar.u(new AvitoMapCameraPosition(avitoMapPoint, dVar2.f196657b ? 11.5f : 18.0f, 0.0f, null, null, 28, null), true);
        }
        return !kotlin.jvm.internal.L.f(dVar2.f196656a, avitoMapPoint) ? z.me(zVar, dVar2.b(avitoMapPoint)) : dVar2;
    }
}
