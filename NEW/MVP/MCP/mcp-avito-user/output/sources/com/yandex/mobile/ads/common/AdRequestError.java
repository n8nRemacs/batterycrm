package com.yandex.mobile.ads.common;

import AK.c;
import j.N;
import j.P;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class AdRequestError {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382682a;

    /* renamed from: b, reason: collision with root package name */
    private final int f382683b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final String f382684c;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    public AdRequestError(int i12, @P String str) {
        this(i12, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestError.class != obj.getClass()) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f382683b == adRequestError.f382683b && Objects.equals(this.f382684c, adRequestError.f382684c)) {
            return this.f382682a.equals(adRequestError.f382682a);
        }
        return false;
    }

    @P
    public String getAdUnitId() {
        return this.f382684c;
    }

    public int getCode() {
        return this.f382683b;
    }

    @N
    public String getDescription() {
        return this.f382682a;
    }

    public int hashCode() {
        int iHashCode = ((this.f382682a.hashCode() * 31) + this.f382683b) * 31;
        String str = this.f382684c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @N
    public String toString() {
        Locale locale = Locale.US;
        int i12 = this.f382683b;
        String str = this.f382682a;
        String str2 = this.f382684c;
        StringBuilder sb2 = new StringBuilder("AdRequestError (code: ");
        sb2.append(i12);
        sb2.append(", description: ");
        sb2.append(str);
        sb2.append(", adUnitId: ");
        return c.s(sb2, str2, ")");
    }

    public AdRequestError(int i12, @P String str, @P String str2) {
        this.f382683b = i12;
        this.f382682a = str == null ? "Unknown reason" : str;
        this.f382684c = str2;
    }
}
