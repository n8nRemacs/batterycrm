package Qc;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FirebaseAnalyticsEventTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<C14881a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f13933a;

    /* renamed from: b, reason: collision with root package name */
    public final u f13934b;

    public b(u uVar, Provider provider) {
        this.f13933a = provider;
        this.f13934b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14881a(this.f13933a.get(), (c) this.f13934b.get());
    }
}
