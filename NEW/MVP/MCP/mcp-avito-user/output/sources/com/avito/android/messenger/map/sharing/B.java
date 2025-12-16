package com.avito.android.messenger.map.sharing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.messenger.map.sharing.K;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "location", "Lcom/avito/android/messenger/map/sharing/K$d;", "apply", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;)Lcom/avito/android/messenger/map/sharing/K$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvitoMapCameraPosition f196631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K.d f196632c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f196633d;

    public B(AvitoMapCameraPosition avitoMapCameraPosition, K.d dVar, boolean z12) {
        this.f196631b = avitoMapCameraPosition;
        this.f196632c = dVar;
        this.f196633d = z12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessageBody.Location location = (MessageBody.Location) obj;
        AvitoMapCameraPosition avitoMapCameraPosition = this.f196631b;
        MessageBody.Location location2 = new MessageBody.Location(avitoMapCameraPosition.getMapPoint().getLatitude(), avitoMapCameraPosition.getMapPoint().getLongitude(), location.getTitle(), location.getKind(), null, 16, null);
        K.a aVar = new K.a(avitoMapCameraPosition.getMapPoint().getLatitude(), avitoMapCameraPosition.getMapPoint().getLongitude(), avitoMapCameraPosition.getZoomLevel());
        K.d dVar = this.f196632c;
        return new K.d.c.b(location2, aVar, dVar.f196656a, dVar.f196657b, location.getTitle(), false, this.f196633d);
    }
}
