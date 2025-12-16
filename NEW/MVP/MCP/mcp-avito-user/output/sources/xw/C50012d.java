package xw;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealCabinetAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: xw.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50012d implements dagger.internal.h<C50011c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f442700a;

    /* renamed from: b, reason: collision with root package name */
    public final l f442701b;

    public C50012d(l lVar, Provider provider) {
        this.f442700a = provider;
        this.f442701b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C50011c(this.f442700a.get(), (DealCabinetArguments) this.f442701b.f393949a);
    }
}
