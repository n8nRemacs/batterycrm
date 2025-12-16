package com.avito.android.avito_map.google;

import Y61.k;
import android.os.RemoteException;
import com.avito.android.avito_map.AvitoMapPolyline;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.j;
import kotlin.Metadata;

/* compiled from: GoogleAvitoMapPolyline.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/avito_map/google/GoogleAvitoMapPolyline;", "Lcom/avito/android/avito_map/AvitoMapPolyline;", "Lcom/google/android/gms/maps/model/j;", "polyline", "<init>", "(Lcom/google/android/gms/maps/model/j;)V", "", "color", "Lkotlin/G0;", "changeColor", "(I)V", "", "zIndex", "setZIndex", "(F)V", "Lcom/google/android/gms/maps/model/j;", "getPolyline", "()Lcom/google/android/gms/maps/model/j;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleAvitoMapPolyline implements AvitoMapPolyline {

    @k
    private final j polyline;

    public GoogleAvitoMapPolyline(@k j jVar) {
        this.polyline = jVar;
    }

    @Override // com.avito.android.avito_map.AvitoMapPolyline
    public void changeColor(int color) {
        j jVar = this.polyline;
        jVar.getClass();
        try {
            jVar.f354492a.setColor(color);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @k
    public final j getPolyline() {
        return this.polyline;
    }

    @Override // com.avito.android.avito_map.AvitoMapPolyline
    public void setZIndex(float zIndex) {
        j jVar = this.polyline;
        jVar.getClass();
        try {
            jVar.f354492a.setZIndex(zIndex);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
