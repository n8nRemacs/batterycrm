package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

/* renamed from: com.yandex.metrica.impl.ob.dc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38752dc extends Dc<C38727cc> {

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.gpllibrary.b f380368f;

    public C38752dc(@j.N Context context, @j.N Pc pc2, @j.N IHandlerExecutor iHandlerExecutor, @j.N C39267yd c39267yd) {
        this(context, pc2, iHandlerExecutor, c39267yd, new G1());
    }

    @Override // com.yandex.metrica.impl.ob.Dc
    public boolean a(@j.N C38727cc c38727cc) {
        C38727cc c38727cc2 = c38727cc;
        if (c38727cc2.f380312b != null && this.f377964b.a(this.f377963a)) {
            try {
                this.f380368f.startLocationUpdates(c38727cc2.f380312b.f380119a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.Dc
    public void b() {
        if (this.f377964b.a(this.f377963a)) {
            try {
                this.f380368f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private C38752dc(@j.N Context context, @j.N Pc pc2, @j.N IHandlerExecutor iHandlerExecutor, @j.N C39267yd c39267yd, @j.N G1 g12) {
        this(context, iHandlerExecutor, new C39290zc(pc2), g12.a(c39267yd));
    }

    @j.k0
    public C38752dc(@j.N Context context, @j.N IHandlerExecutor iHandlerExecutor, @j.N LocationListener locationListener, @j.N InterfaceC39291zd interfaceC39291zd) {
        this(context, iHandlerExecutor.getLooper(), locationListener, interfaceC39291zd, a(context, locationListener, iHandlerExecutor));
    }

    @Override // com.yandex.metrica.impl.ob.Dc
    public void a() {
        try {
            this.f380368f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    @j.N
    private static com.yandex.metrica.gpllibrary.b a(@j.N Context context, @j.N LocationListener locationListener, @j.N IHandlerExecutor iHandlerExecutor) {
        if (C38842h2.a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new com.yandex.metrica.gpllibrary.a(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, Dc.f377962e);
            } catch (Throwable unused) {
            }
        }
        return new Tb();
    }

    @j.k0
    public C38752dc(@j.N Context context, @j.N Looper looper, @j.N LocationListener locationListener, @j.N InterfaceC39291zd interfaceC39291zd, @j.N com.yandex.metrica.gpllibrary.b bVar) {
        super(context, locationListener, interfaceC39291zd, looper);
        this.f380368f = bVar;
    }
}
