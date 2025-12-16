package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class m10 {
    @X41.n
    public static final boolean a(@Y61.k String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static boolean b(@Y61.k String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(@Y61.k String str) {
        return str.equals("PROPFIND");
    }

    @X41.n
    public static final boolean d(@Y61.k String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
