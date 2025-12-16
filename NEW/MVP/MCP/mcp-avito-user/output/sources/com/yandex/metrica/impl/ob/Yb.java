package com.yandex.metrica.impl.ob;

import android.location.Location;

/* loaded from: classes7.dex */
public class Yb extends V {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39242xc f379964b;

    public Yb(@j.P V v12, @j.N C39242xc c39242xc) {
        super(v12);
        this.f379964b = c39242xc;
    }

    @Override // com.yandex.metrica.impl.ob.V
    public void b(@j.P Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f379964b.b((C39242xc) location);
        }
    }
}
