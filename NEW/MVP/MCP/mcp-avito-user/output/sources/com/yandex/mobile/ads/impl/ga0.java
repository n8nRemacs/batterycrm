package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class ga0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ca0 f385625a = new ca0();

    @j.P
    public final Location a(@j.N ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f385625a.getClass();
            if (ca0.b(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
