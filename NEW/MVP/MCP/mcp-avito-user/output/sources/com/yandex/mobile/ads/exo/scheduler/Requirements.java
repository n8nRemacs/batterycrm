package com.yandex.mobile.ads.exo.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import j.P;

/* loaded from: classes8.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f383144a;

    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i12) {
            return new Requirements[i12];
        }
    }

    public Requirements(int i12) {
        this.f383144a = (i12 & 2) != 0 ? i12 | 1 : i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r8) {
        /*
            r7 = this;
            boolean r0 = r7.e()
            r1 = 0
            r2 = 2
            if (r0 != 0) goto L9
            goto L49
        L9:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L4b
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L4b
            int r3 = com.yandex.mobile.ads.impl.pc1.f388768a
            r4 = 24
            if (r3 >= r4) goto L27
            goto L3c
        L27:
            android.net.Network r3 = r0.getActiveNetwork()
            if (r3 != 0) goto L2e
            goto L4b
        L2e:
            android.net.NetworkCapabilities r3 = r0.getNetworkCapabilities(r3)     // Catch: java.lang.SecurityException -> L3c
            if (r3 == 0) goto L4b
            r4 = 16
            boolean r3 = r3.hasCapability(r4)     // Catch: java.lang.SecurityException -> L3c
            if (r3 == 0) goto L4b
        L3c:
            int r3 = r7.f383144a
            r3 = r3 & r2
            if (r3 == 0) goto L49
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L49
            r0 = r2
            goto L4f
        L49:
            r0 = r1
            goto L4f
        L4b:
            int r0 = r7.f383144a
            r0 = r0 & 3
        L4f:
            boolean r3 = r7.c()
            r4 = 0
            if (r3 == 0) goto L73
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r5)
            android.content.Intent r3 = r8.registerReceiver(r4, r3)
            if (r3 != 0) goto L64
            goto L71
        L64:
            java.lang.String r5 = "status"
            r6 = -1
            int r3 = r3.getIntExtra(r5, r6)
            if (r3 == r2) goto L73
            r2 = 5
            if (r3 != r2) goto L71
            goto L73
        L71:
            r0 = r0 | 8
        L73:
            boolean r2 = r7.d()
            r3 = 1
            if (r2 == 0) goto La8
            java.lang.String r2 = "power"
            java.lang.Object r2 = r8.getSystemService(r2)
            r2.getClass()
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            int r5 = com.yandex.mobile.ads.impl.pc1.f388768a
            r6 = 23
            if (r5 < r6) goto L90
            boolean r2 = r2.isDeviceIdleMode()
            goto La4
        L90:
            r6 = 20
            if (r5 < r6) goto L9b
            boolean r2 = r2.isInteractive()
            if (r2 != 0) goto La3
            goto La1
        L9b:
            boolean r2 = r2.isScreenOn()
            if (r2 != 0) goto La3
        La1:
            r2 = r3
            goto La4
        La3:
            r2 = r1
        La4:
            if (r2 != 0) goto La8
            r0 = r0 | 4
        La8:
            boolean r2 = r7.f()
            if (r2 == 0) goto Lc0
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.DEVICE_STORAGE_LOW"
            r2.<init>(r5)
            android.content.Intent r8 = r8.registerReceiver(r4, r2)
            if (r8 != 0) goto Lbc
            r1 = r3
        Lbc:
            if (r1 != 0) goto Lc0
            r0 = r0 | 16
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.scheduler.Requirements.a(android.content.Context):int");
    }

    public final boolean c() {
        return (this.f383144a & 8) != 0;
    }

    public final boolean d() {
        return (this.f383144a & 4) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (this.f383144a & 1) != 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f383144a == ((Requirements) obj).f383144a;
    }

    public final boolean f() {
        return (this.f383144a & 16) != 0;
    }

    public final int hashCode() {
        return this.f383144a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f383144a);
    }
}
