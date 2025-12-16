package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class H0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378201a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final J0 f378202b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final d f378203c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Runnable f378204d = new a();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Runnable f378205e = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            H0.this.f378202b.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC39184v2) H0.this.f378203c).b()) {
                H0.this.f378204d.run();
            }
        }
    }

    public static class c {
        @j.N
        public H0 a(@j.N ICommonExecutor iCommonExecutor, @j.N J0 j02, @j.N d dVar) {
            return new H0(iCommonExecutor, j02, dVar);
        }
    }

    public interface d {
    }

    public H0(@j.N ICommonExecutor iCommonExecutor, @j.N J0 j02, @j.N d dVar) {
        this.f378201a = iCommonExecutor;
        this.f378202b = j02;
        this.f378203c = dVar;
    }

    public void d() {
        this.f378201a.remove(this.f378204d);
        this.f378201a.remove(this.f378205e);
    }

    public void a() {
        this.f378201a.remove(this.f378204d);
        this.f378201a.executeDelayed(this.f378204d, 90L, TimeUnit.SECONDS);
    }

    public void b() {
        this.f378201a.execute(this.f378205e);
    }

    public void c() {
        this.f378201a.remove(this.f378204d);
        this.f378201a.executeDelayed(this.f378204d, 90L, TimeUnit.SECONDS);
    }
}
