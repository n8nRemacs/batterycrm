package com.yandex.metrica.gpllibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.C36799u;
import com.google.android.gms.location.InterfaceC36781b;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import j.N;

/* loaded from: classes7.dex */
public class a implements com.yandex.metrica.gpllibrary.b {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final InterfaceC36781b f377697a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final LocationListener f377698b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final LocationCallback f377699c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Looper f377700d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final IHandlerExecutor f377701e;

    /* renamed from: f, reason: collision with root package name */
    public final long f377702f;

    /* renamed from: com.yandex.metrica.gpllibrary.a$a, reason: collision with other inner class name */
    public static class C10949a {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final Context f377703a;

        public C10949a(@N Context context) {
            this.f377703a = context;
        }

        @N
        public final InterfaceC36781b a() {
            return new InterfaceC36781b(this.f377703a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f377704b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f377705c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f377706d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f377707e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f377708f;

        static {
            b bVar = new b("PRIORITY_NO_POWER", 0);
            f377704b = bVar;
            b bVar2 = new b("PRIORITY_LOW_POWER", 1);
            f377705c = bVar2;
            b bVar3 = new b("PRIORITY_BALANCED_POWER_ACCURACY", 2);
            f377706d = bVar3;
            b bVar4 = new b("PRIORITY_HIGH_ACCURACY", 3);
            f377707e = bVar4;
            f377708f = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f377708f.clone();
        }
    }

    public a(@N Context context, @N LocationListener locationListener, @N Looper looper, @N IHandlerExecutor iHandlerExecutor, long j12) {
        this.f377697a = new C10949a(context).a();
        this.f377698b = locationListener;
        this.f377700d = looper;
        this.f377701e = iHandlerExecutor;
        this.f377702f = j12;
        this.f377699c = new GplLocationCallback(locationListener);
    }

    @Override // com.yandex.metrica.gpllibrary.b
    @SuppressLint({"MissingPermission"})
    public final void startLocationUpdates(@N b bVar) {
        LocationRequest locationRequestH = LocationRequest.h();
        locationRequestH.j(this.f377702f);
        int iOrdinal = bVar.ordinal();
        int i12 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? 105 : 100 : 102 : 104;
        C36799u.a(i12);
        locationRequestH.f354220b = i12;
        this.f377697a.requestLocationUpdates(locationRequestH, this.f377699c, this.f377700d);
    }

    @Override // com.yandex.metrica.gpllibrary.b
    public final void stopLocationUpdates() {
        this.f377697a.removeLocationUpdates(this.f377699c);
    }

    @Override // com.yandex.metrica.gpllibrary.b
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        this.f377697a.getLastLocation().h(this.f377701e, new GplOnSuccessListener(this.f377698b));
    }
}
