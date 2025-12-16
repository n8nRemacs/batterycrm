package com.avito.android.messenger.map.sharing;

import KY.a;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.messenger.map.sharing.K;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Lcom/avito/android/messenger/map/sharing/K$d;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C extends N implements Y41.l<K.d, io.reactivex.rxjava3.core.I<K.d>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f196634l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f196635m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AvitoMapCameraPosition f196636n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(boolean z12, z zVar, AvitoMapCameraPosition avitoMapCameraPosition) {
        super(1);
        this.f196634l = z12;
        this.f196635m = zVar;
        this.f196636n = avitoMapCameraPosition;
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.I<K.d> invoke(K.d dVar) {
        final K.d dVar2 = dVar;
        final boolean z12 = this.f196634l;
        if (z12 && (!z12 || !dVar2.f196660e)) {
            return io.reactivex.rxjava3.core.I.q(dVar2);
        }
        final z zVar = this.f196635m;
        s sVar = zVar.f196756V;
        final AvitoMapCameraPosition avitoMapCameraPosition = this.f196636n;
        return sVar.c(avitoMapCameraPosition.getMapPoint()).r(new B(avitoMapCameraPosition, dVar2, z12)).u(new l41.o() { // from class: com.avito.android.messenger.map.sharing.A
            @Override // l41.o
            public final Object apply(Object obj) {
                AvitoMapCameraPosition avitoMapCameraPosition2 = avitoMapCameraPosition;
                double latitude = avitoMapCameraPosition2.getMapPoint().getLatitude();
                double longitude = avitoMapCameraPosition2.getMapPoint().getLongitude();
                z zVar2 = zVar;
                MessageBody.Location location = new MessageBody.Location(latitude, longitude, zVar2.f196757W, null, null, 24, null);
                K.a aVar = new K.a(avitoMapCameraPosition2.getMapPoint().getLatitude(), avitoMapCameraPosition2.getMapPoint().getLongitude(), avitoMapCameraPosition2.getZoomLevel());
                K.d dVar3 = dVar2;
                boolean z13 = dVar3.f196657b;
                a.c.b.C0578a c0578a = new a.c.b.C0578a(zVar2.f196758X, zVar2.f196759Y, new com.avito.android.job.cv_info_actualization.ui.items.radio.h(22, zVar2, avitoMapCameraPosition2));
                return new K.d.c.a(location, aVar, dVar3.f196656a, z13, c0578a, dVar3.f196659d, false, z12);
            }
        });
    }
}
