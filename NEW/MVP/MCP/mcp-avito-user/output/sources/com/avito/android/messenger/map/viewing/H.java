package com.avito.android.messenger.map.viewing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.messenger.map.viewing.view.d;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlatformMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/viewing/view/d$b;)Lcom/avito/android/messenger/map/viewing/view/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H extends N implements Y41.l<d.b, d.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f196787l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvitoMapPoint f196788m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(A a12, AvitoMapPoint avitoMapPoint) {
        super(1);
        this.f196787l = a12;
        this.f196788m = avitoMapPoint;
    }

    @Override // Y41.l
    public final d.b invoke(d.b bVar) {
        d.b bVar2 = bVar;
        boolean z12 = bVar2.f196876g;
        AvitoMapPoint avitoMapPoint = this.f196788m;
        if (z12) {
            this.f196787l.u(new AvitoMapCameraPosition(avitoMapPoint, bVar2.f196874e ? 11.5f : 18.0f, 0.0f, null, null, 28, null), true);
        }
        return !kotlin.jvm.internal.L.f(bVar2.f196873d, avitoMapPoint) ? d.b.a(bVar2, null, null, null, avitoMapPoint, false, false, false, false, 247) : bVar2;
    }
}
