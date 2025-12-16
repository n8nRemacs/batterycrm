package q5;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FairPriceAnalyticsInteractor_Factory.java */
@e
@y
@x
/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47202b implements h<C47201a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f429034a;

    /* renamed from: b, reason: collision with root package name */
    public final l f429035b;

    public C47202b(l lVar, Provider provider) {
        this.f429034a = provider;
        this.f429035b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47201a(this.f429034a.get(), (String) this.f429035b.f393949a);
    }
}
