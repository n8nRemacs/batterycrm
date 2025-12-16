package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public enum p91 {
    f388745b("TLSv1.3"),
    f388746c("TLSv1.2"),
    f388747d("TLSv1.1"),
    f388748e("TLSv1"),
    f388749f("SSLv3");


    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f388751a;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @X41.n
        @Y61.k
        public static p91 a(@Y61.k String str) {
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return p91.f388747d;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return p91.f388746c;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return p91.f388745b;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return p91.f388748e;
                }
            } else if (str.equals("SSLv3")) {
                return p91.f388749f;
            }
            throw new IllegalArgumentException(up1.a("Unexpected TLS version: ", str));
        }
    }

    p91(String str) {
        this.f388751a = str;
    }

    @X41.i
    @Y61.k
    public final String a() {
        return this.f388751a;
    }
}
