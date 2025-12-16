package com.avito.android.avito_map.google;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.os.RemoteException;
import com.adjust.sdk.Constants;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.R;
import com.google.android.gms.common.util.q;
import com.google.android.gms.maps.C36806c;
import com.google.android.gms.maps.C36826n;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: GoogleAvitoMapUiSettings.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/avito_map/google/GoogleAvitoMapUiSettings;", "Lcom/avito/android/avito_map/AvitoMapUiSettings;", "Lcom/google/android/gms/maps/c;", "map", "Landroid/content/Context;", "context", "<init>", "(Lcom/google/android/gms/maps/c;Landroid/content/Context;)V", "", "enable", "Lkotlin/G0;", "isMapToolbarEnabled", "(Z)V", "isRotateGesturesEnabled", "isZoomControlsEnabled", "isZoomGesturesEnabled", "isFastTapEnabled", "isMyLocationButtonEnabled", "isCompassEnabled", "isTiltGesturesEnabled", "isMoveGesturesEnabled", "isDarkModeEnabled", "Lcom/google/android/gms/maps/c;", "getMap", "()Lcom/google/android/gms/maps/c;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/google/android/gms/maps/n;", "settings", "Lcom/google/android/gms/maps/n;", "getSettings", "()Lcom/google/android/gms/maps/n;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleAvitoMapUiSettings implements AvitoMapUiSettings {

    @k
    private final Context context;

    @l
    private final C36806c map;

    @l
    private final C36826n settings;

    public GoogleAvitoMapUiSettings(@l C36806c c36806c, @k Context context) {
        C36826n c36826n;
        this.map = c36806c;
        this.context = context;
        if (c36806c != null) {
            try {
                if (c36806c.f354355b == null) {
                    c36806c.f354355b = new C36826n(c36806c.f354354a.getUiSettings());
                }
                c36826n = c36806c.f354355b;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        } else {
            c36826n = null;
        }
        this.settings = c36826n;
    }

    @k
    public final Context getContext() {
        return this.context;
    }

    @l
    public final C36806c getMap() {
        return this.map;
    }

    @l
    public final C36826n getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isCompassEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.F3(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isDarkModeEnabled(boolean enable) throws Resources.NotFoundException {
        int i12 = enable ? R.raw.google_mapstyle_dark : R.raw.google_mapstyle_light;
        Context context = this.context;
        Parcelable.Creator<MapStyleOptions> creator = MapStyleOptions.CREATOR;
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i12);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i13 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i13 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i13);
                    }
                } catch (Throwable th2) {
                    q.a(inputStreamOpenRawResource);
                    q.a(byteArrayOutputStream);
                    throw th2;
                }
            }
            q.a(inputStreamOpenRawResource);
            q.a(byteArrayOutputStream);
            MapStyleOptions mapStyleOptions = new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), Constants.ENCODING));
            C36806c c36806c = this.map;
            if (c36806c != null) {
                try {
                    c36806c.f354354a.A1(mapStyleOptions);
                } catch (RemoteException e12) {
                    throw new RuntimeRemoteException(e12);
                }
            }
        } catch (IOException e13) {
            String strValueOf = String.valueOf(e13);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
            sb2.append("Failed to read resource ");
            sb2.append(i12);
            sb2.append(": ");
            sb2.append(strValueOf);
            throw new Resources.NotFoundException(sb2.toString());
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isMapToolbarEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.d1(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isMoveGesturesEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.setScrollGesturesEnabled(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isMyLocationButtonEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.W2(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isRotateGesturesEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.setRotateGesturesEnabled(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isTiltGesturesEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.setTiltGesturesEnabled(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isZoomControlsEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.D1(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isZoomGesturesEnabled(boolean enable) {
        C36826n c36826n = this.settings;
        if (c36826n == null) {
            return;
        }
        try {
            c36826n.f354493a.setZoomGesturesEnabled(enable);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isFastTapEnabled(boolean enable) {
    }
}
