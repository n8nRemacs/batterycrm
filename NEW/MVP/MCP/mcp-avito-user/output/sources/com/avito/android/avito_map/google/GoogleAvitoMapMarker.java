package com.avito.android.avito_map.google;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.model.C36817a;
import com.google.android.gms.maps.model.C36818b;
import com.google.android.gms.maps.model.C36824h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import kotlin.Metadata;

/* compiled from: GoogleAvitoMapMarker.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/avito/android/avito_map/google/GoogleAvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/google/android/gms/maps/model/h;", "marker", "<init>", "(Lcom/google/android/gms/maps/model/h;)V", "Landroid/graphics/Bitmap;", "icon", "Lkotlin/G0;", "changeIcon", "(Landroid/graphics/Bitmap;)V", "", "imageId", "", "zIndex", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "(Landroid/graphics/Bitmap;Ljava/lang/String;FLcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;)V", "", "visible", "setVisibility", "(Z)V", "isVisible", "()Z", "setZIndex", "(F)V", "", "data", "setData", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getPosition", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "position", "setPosition", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "Lcom/google/android/gms/maps/model/h;", "getMarker", "()Lcom/google/android/gms/maps/model/h;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleAvitoMapMarker implements AvitoMapMarker {

    @k
    private final C36824h marker;

    public GoogleAvitoMapMarker(@k C36824h c36824h) {
        this.marker = c36824h;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void changeIcon(@l Bitmap icon) {
        C36824h c36824h = this.marker;
        C36817a c36817aA = C36818b.a(icon);
        try {
            c36824h.f354490a.zzg(c36817aA.f354484a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    @l
    public Object getData() {
        C36824h c36824h = this.marker;
        c36824h.getClass();
        try {
            return f.g4(c36824h.f354490a.zzk());
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @k
    public final C36824h getMarker() {
        return this.marker;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    @k
    public AvitoMapPoint getPosition() {
        C36824h c36824h = this.marker;
        c36824h.getClass();
        try {
            return AvitoGoogleMapKt.toAvitoMapPoint(c36824h.f354490a.getPosition());
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public boolean isVisible() {
        C36824h c36824h = this.marker;
        c36824h.getClass();
        try {
            return c36824h.f354490a.isVisible();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setData(@k Object data) {
        C36824h c36824h = this.marker;
        c36824h.getClass();
        try {
            c36824h.f354490a.zze(new f(data));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setPosition(@k AvitoMapPoint position) {
        C36824h c36824h = this.marker;
        LatLng latLng = new LatLng(position.getLatitude(), position.getLongitude());
        c36824h.getClass();
        try {
            c36824h.f354490a.setPosition(latLng);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setVisibility(boolean visible) {
        C36824h c36824h = this.marker;
        c36824h.getClass();
        try {
            c36824h.f354490a.setVisible(visible);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setZIndex(float zIndex) {
        this.marker.b(zIndex);
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void changeIcon(@k Bitmap icon, @k String imageId, float zIndex, @k AvitoMapMarker.AvitoMapAnchor anchor) {
        changeIcon(icon);
    }
}
