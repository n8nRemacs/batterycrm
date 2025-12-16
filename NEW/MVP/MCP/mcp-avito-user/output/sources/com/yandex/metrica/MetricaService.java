package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.C38916k2;
import com.yandex.metrica.impl.ob.C39064q1;
import com.yandex.metrica.impl.ob.C39087r1;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Vl;
import j.N;

/* loaded from: classes7.dex */
public class MetricaService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public static C39064q1 f377505d;

    /* renamed from: b, reason: collision with root package name */
    public final d f377506b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final IMetricaService.a f377507c = new b();

    public class a implements d {
        public a() {
        }

        @Override // com.yandex.metrica.MetricaService.d
        public final void a(int i12) {
            MetricaService.this.stopSelfResult(i12);
        }
    }

    public static class c extends Binder {
    }

    public interface d {
        void a(int i12);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder cVar = "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(intent.getAction()) ? new c() : this.f377507c;
        f377505d.a(intent);
        return cVar;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f377505d.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        F0.a(getApplicationContext());
        Vl.a(getApplicationContext());
        C39064q1 c39064q1 = f377505d;
        d dVar = this.f377506b;
        if (c39064q1 == null) {
            f377505d = new C39064q1(new C39087r1(getApplicationContext(), dVar));
        } else {
            c39064q1.a(dVar);
        }
        f377505d.a();
        F0.g().a(new C38916k2(f377505d));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f377505d.b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
        f377505d.c(intent);
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i12) {
        f377505d.a(intent, i12);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i12, int i13) {
        f377505d.a(intent, i12, i13);
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        f377505d.b(intent);
        return ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(intent.getAction()) || intent.getData() == null) ? false : true;
    }

    public class b extends IMetricaService.a {
        @Override // com.yandex.metrica.IMetricaService
        public final void a(int i12, Bundle bundle) {
            MetricaService.f377505d.a(i12, bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public final void b(@N Bundle bundle) {
            MetricaService.f377505d.b(bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public final void reportData(Bundle bundle) {
            MetricaService.f377505d.reportData(bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public final void a(@N Bundle bundle) {
            MetricaService.f377505d.a(bundle);
        }
    }
}
