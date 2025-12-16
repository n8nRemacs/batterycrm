package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class nnd implements Parcelable {
    public static final Parcelable.Creator<nnd> CREATOR = new wcb(25);
    public final int a;

    public nnd(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
    }

    public final int a(Context context) {
        Intent intentRegisterReceiver;
        int intExtra;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i = this.a;
        int i2 = 0;
        if ((i & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
                i2 = i & 3;
            } else {
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                } catch (SecurityException unused) {
                }
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasCapability(16)) {
                        if ((i & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                            i2 = 2;
                        }
                    }
                }
                i2 = i & 3;
            }
        }
        if ((i & 8) != 0 && ((intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            if (!((PowerManager) systemService2).isDeviceIdleMode()) {
                i2 |= 4;
            }
        }
        return ((i & 16) == 0 || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i2 : i2 | 16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nnd.class == obj.getClass()) {
            if (this.a == ((nnd) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
