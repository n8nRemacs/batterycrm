package com.avito.android.avito_map.google;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.model.C36819c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import kotlin.Metadata;

/* compiled from: GoogleAvitoMapCircle.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b\u001f\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/avito/android/avito_map/google/GoogleAvitoMapCircle;", "Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/google/android/gms/maps/model/c;", "circle", "<init>", "(Lcom/google/android/gms/maps/model/c;)V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getPosition", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "position", "Lkotlin/G0;", "setPosition", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "", "data", "setData", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "", "visible", "setVisibility", "(Z)V", "", "zIndex", "setZIndex", "(F)V", "isVisible", "()Z", "Landroid/graphics/Bitmap;", "icon", "changeIcon", "(Landroid/graphics/Bitmap;)V", "", "imageId", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "(Landroid/graphics/Bitmap;Ljava/lang/String;FLcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;)V", "Lcom/google/android/gms/maps/model/c;", "getCircle", "()Lcom/google/android/gms/maps/model/c;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleAvitoMapCircle implements AvitoMapMarker {

    @k
    private final C36819c circle;

    public GoogleAvitoMapCircle(@k C36819c c36819c) {
        this.circle = c36819c;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void changeIcon(@l Bitmap icon) {
    }

    @k
    public final C36819c getCircle() {
        return this.circle;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    @l
    public Object getData() {
        C36819c c36819c = this.circle;
        c36819c.getClass();
        try {
            return f.g4(c36819c.f354486a.zzk());
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    @k
    public AvitoMapPoint getPosition() {
        C36819c c36819c = this.circle;
        c36819c.getClass();
        try {
            return AvitoGoogleMapKt.toAvitoMapPoint(c36819c.f354486a.getCenter());
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public boolean isVisible() {
        C36819c c36819c = this.circle;
        c36819c.getClass();
        try {
            return c36819c.f354486a.isVisible();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setData(@k Object data) {
        C36819c c36819c = this.circle;
        c36819c.getClass();
        try {
            c36819c.f354486a.zze(new f(data));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setPosition(@k AvitoMapPoint position) {
        C36819c c36819c = this.circle;
        LatLng latLng = position.toLatLng();
        c36819c.getClass();
        try {
            c36819c.f354486a.setCenter(latLng);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setVisibility(boolean visible) {
        C36819c c36819c = this.circle;
        c36819c.getClass();
        try {
            c36819c.f354486a.setVisible(visible);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setZIndex(float zIndex) {
        C36819c c36819c = this.circle;
        c36819c.getClass();
        try {
            c36819c.f354486a.setZIndex(zIndex);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void changeIcon(@k Bitmap icon, @k String imageId, float zIndex, @k AvitoMapMarker.AvitoMapAnchor anchor) {
    }
}
