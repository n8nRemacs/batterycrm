package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.yandex.mobile.ads.impl.jd0;
import j.InterfaceC42154j;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class lt extends zs0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f387702c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f387703d;

    /* renamed from: e, reason: collision with root package name */
    public final int f387704e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final vw f387705f;

    /* renamed from: g, reason: collision with root package name */
    public final int f387706g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final fd0 f387707h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f387708i;

    private lt(int i12, Throwable th2, int i13) {
        this(i12, th2, null, i13, null, -1, null, 4, false);
    }

    public static lt a(IOException iOException, int i12) {
        return new lt(0, iOException, i12);
    }

    private lt(int i12, @j.P Throwable th2, @j.P String str, int i13, @j.P String str2, int i14, @j.P vw vwVar, int i15, boolean z12) {
        this(a(i12, str, str2, i14, vwVar, i15), th2, i13, i12, str2, i14, vwVar, i15, null, SystemClock.elapsedRealtime(), z12);
    }

    public static lt a(Exception exc, String str, int i12, @j.P vw vwVar, int i13, boolean z12, int i14) {
        return new lt(1, exc, null, i14, str, i12, vwVar, vwVar == null ? 4 : i13, z12);
    }

    public static lt a(RuntimeException runtimeException, int i12) {
        return new lt(2, runtimeException, i12);
    }

    private lt(Bundle bundle) {
        super(bundle);
        this.f387702c = bundle.getInt(zs0.a(1001), 2);
        this.f387703d = bundle.getString(zs0.a(1002));
        this.f387704e = bundle.getInt(zs0.a(ErrorCodes.MALFORMED_URL_EXCEPTION), -1);
        Bundle bundle2 = bundle.getBundle(zs0.a(ErrorCodes.PROTOCOL_EXCEPTION));
        this.f387705f = bundle2 == null ? null : (vw) vw.f391163H.fromBundle(bundle2);
        this.f387706g = bundle.getInt(zs0.a(1005), 4);
        this.f387708i = bundle.getBoolean(zs0.a(ErrorCodes.SSL_HANDSHAKE_EXCEPTION), false);
        this.f387707h = null;
    }

    public static lt a() {
        return new lt(3, null, "Video load error occurred", 1001, null, -1, null, 4, false);
    }

    @InterfaceC42154j
    public final lt a(@j.P jd0.b bVar) {
        String message = getMessage();
        int i12 = pc1.f388768a;
        return new lt(message, getCause(), this.f392346a, this.f387702c, this.f387703d, this.f387704e, this.f387705f, this.f387706g, bVar, this.f392347b, this.f387708i);
    }

    private static String a(int i12, @j.P String str, @j.P String str2, int i13, @j.P vw vwVar, int i14) {
        String string;
        String str3;
        if (i12 == 0) {
            string = "Source error";
        } else if (i12 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i13);
            sb2.append(", format=");
            sb2.append(vwVar);
            sb2.append(", format_supported=");
            int i15 = pc1.f388768a;
            if (i14 == 0) {
                str3 = "NO";
            } else if (i14 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i14 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i14 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i14 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        } else if (i12 != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        return !TextUtils.isEmpty(str) ? androidx.appcompat.app.r.r(string, ": ", str) : string;
    }

    private lt(String str, @j.P Throwable th2, int i12, int i13, @j.P String str2, int i14, @j.P vw vwVar, int i15, @j.P jd0.b bVar, long j12, boolean z12) {
        super(str, th2, i12, j12);
        db.a(!z12 || i13 == 1);
        db.a(th2 != null || i13 == 3);
        this.f387702c = i13;
        this.f387703d = str2;
        this.f387704e = i14;
        this.f387705f = vwVar;
        this.f387706g = i15;
        this.f387707h = bVar;
        this.f387708i = z12;
    }
}
