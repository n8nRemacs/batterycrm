package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.impl.Cif;
import j.N;
import j.P;
import java.util.Objects;

/* loaded from: classes8.dex */
public class AdInfo {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382646a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final AdSize f382647b;

    public AdInfo(@N String str, @P AdSize adSize) {
        this.f382646a = str;
        this.f382647b = adSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInfo adInfo = (AdInfo) obj;
        if (this.f382646a.equals(adInfo.f382646a)) {
            return Objects.equals(this.f382647b, adInfo.f382647b);
        }
        return false;
    }

    @P
    public AdSize getAdSize() {
        return this.f382647b;
    }

    @N
    public String getAdUnitId() {
        return this.f382646a;
    }

    public int hashCode() {
        int iHashCode = this.f382646a.hashCode() * 31;
        AdSize adSize = this.f382647b;
        return iHashCode + (adSize != null ? adSize.hashCode() : 0);
    }

    @N
    public String toString() {
        StringBuilder sbA = Cif.a("AdInfo{mAdUnitId='");
        sbA.append(this.f382646a);
        sbA.append('\'');
        sbA.append(", mAdSize=");
        sbA.append(this.f382647b);
        sbA.append('}');
        return sbA.toString();
    }
}
