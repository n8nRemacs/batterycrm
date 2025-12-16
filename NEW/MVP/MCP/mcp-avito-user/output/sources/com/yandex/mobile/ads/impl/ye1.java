package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ye1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f392007a;

    public ye1(int i12, @j.N String str) {
        this(str);
    }

    public static ye1 a() {
        return new ye1("Internal error. Failed to parse response");
    }

    public static ye1 b() {
        return new ye1("Server temporarily unavailable. Please, try again later.");
    }

    @j.N
    public final String c() {
        return this.f392007a;
    }

    private ye1(@j.N String str) {
        this.f392007a = str;
    }

    public static ye1 a(@j.N ms msVar) {
        return new ye1(msVar.getMessage() != null ? msVar.getMessage() : "Ad request completed successfully, but there are no ads available.");
    }

    public static ye1 b(@j.N String str) {
        return new ye1(str);
    }

    public static ye1 a(@j.P String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new ye1(str);
    }
}
