package com.yandex.metrica.impl.ob;

import android.location.Location;

/* loaded from: classes7.dex */
public final class K2 extends Location {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final String f378655a;

    private K2(@j.N Location location, @j.P String str) {
        super(location);
        this.f378655a = str;
    }

    public static K2 b(@j.N Location location) {
        return new K2(new Location(location), "");
    }

    @j.P
    public String a() {
        return this.f378655a;
    }

    public static K2 a(@j.N Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new K2(location2, provider);
    }
}
