package com.yandex.metrica.impl.ob;

import android.location.LocationManager;

/* loaded from: classes7.dex */
public class Cc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Sb f377899a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final LocationManager f377900b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final C38976mc f377901c;

    @j.k0
    public Cc(@j.N Sb sb2, @j.N C39057pi c39057pi, @j.P C38976mc c38976mc, @j.P LocationManager locationManager, @j.N Sc sc2, @j.N Rb rb2) {
        this.f377899a = sb2;
        this.f377901c = c38976mc;
        this.f377900b = locationManager;
    }

    public static Cc a(@j.N Nc nc2, @j.N Sc sc2, @j.N Rb rb2, @j.P LocationManager locationManager) {
        return new Cc(nc2.f378991a, nc2.f378992b, nc2.f378993c, locationManager, sc2, rb2);
    }
}
