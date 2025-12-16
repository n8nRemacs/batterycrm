package FX0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes10.dex */
public final class d implements com.google.android.datatransport.runtime.dagger.internal.g<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Executor> f4743a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.backends.e> f4744b;

    /* renamed from: c, reason: collision with root package name */
    public final i f4745c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.d> f4746d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<GX0.a> f4747e;

    public d(Provider provider, Provider provider2, i iVar, Provider provider3, Provider provider4) {
        this.f4743a = provider;
        this.f4744b = provider2;
        this.f4745c = iVar;
        this.f4746d = provider3;
        this.f4747e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f4743a.get(), this.f4744b.get(), (m) this.f4745c.get(), this.f4746d.get(), this.f4747e.get());
    }
}
