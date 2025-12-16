package com.avito.android.analytics;

import Fc1.G3;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkTypeProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/J;", "Lcom/avito/android/analytics/H;", "_common_network-type_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class J implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f89656a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f89657b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NetworkRequest f89658c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public volatile NetworkType f89659d;

    public J(Application application, com.avito.android.util.C c12, InterfaceC35745a5 interfaceC35745a5, NetworkRequest networkRequest, int i12, C42822w c42822w) {
        networkRequest = (i12 & 8) != 0 ? new NetworkRequest.Builder().build() : networkRequest;
        this.f89656a = application;
        this.f89657b = c12;
        this.f89658c = networkRequest;
        this.f89659d = NetworkType.f89676n;
        interfaceC35745a5.a().d(new G3(this, 27));
    }

    @Override // com.avito.android.analytics.H
    @Y61.k
    public final String a() {
        return this.f89659d.f89679b;
    }

    @Override // com.avito.android.analytics.H
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final NetworkType getF89659d() {
        return this.f89659d;
    }

    public final NetworkType c(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(1)) {
            return NetworkType.f89674l;
        }
        if (!networkCapabilities.hasTransport(0)) {
            return NetworkType.f89676n;
        }
        boolean z12 = this.f89657b.j() < 29;
        Application application = this.f89656a;
        if (androidx.core.content.d.checkSelfPermission(application, "android.permission.READ_PHONE_STATE") == 0) {
            switch (((TelephonyManager) application.getSystemService("phone")).getDataNetworkType()) {
                case 1:
                    return NetworkType.f89667e;
                case 2:
                case 7:
                    return NetworkType.f89669g;
                case 3:
                case 5:
                case 9:
                case 17:
                    return NetworkType.f89670h;
                case 4:
                case 11:
                case 16:
                    return NetworkType.f89668f;
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                    return NetworkType.f89671i;
                case 13:
                    return NetworkType.f89672j;
                case 18:
                    return NetworkType.f89674l;
                case 19:
                default:
                    return NetworkType.f89676n;
                case 20:
                    return NetworkType.f89673k;
            }
        }
        if (!z12) {
            return NetworkType.f89675m;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) application.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return NetworkType.f89666d;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? type != 6 ? NetworkType.f89676n : NetworkType.f89672j : NetworkType.f89674l;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
                return NetworkType.f89667e;
            case 2:
            case 7:
                return NetworkType.f89669g;
            case 3:
            case 5:
            case 9:
            case 17:
                return NetworkType.f89670h;
            case 4:
            case 11:
            case 16:
                return NetworkType.f89668f;
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 15:
                return NetworkType.f89671i;
            case 13:
                return NetworkType.f89672j;
            case 18:
                return NetworkType.f89674l;
            case 19:
            default:
                return NetworkType.f89676n;
            case 20:
                return NetworkType.f89673k;
        }
    }
}
