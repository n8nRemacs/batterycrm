package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39229x {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final LocationManager f382155a;

    public C39229x(@j.N Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    @j.N
    public List<String> a() {
        List<String> providers;
        LocationManager locationManager = this.f382155a;
        List<String> listEmptyList = Collections.emptyList();
        if (locationManager != null) {
            try {
                providers = locationManager.getProviders(true);
            } catch (Throwable unused) {
            }
        } else {
            providers = null;
        }
        return providers == null ? listEmptyList : providers;
    }

    @j.k0
    public C39229x(@j.P LocationManager locationManager) {
        this.f382155a = locationManager;
    }
}
