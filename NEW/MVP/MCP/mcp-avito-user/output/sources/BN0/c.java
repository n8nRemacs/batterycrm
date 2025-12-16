package BN0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientEditAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f1371a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1372b;

    public c(l lVar, Provider provider) {
        this.f1371a = provider;
        this.f1372b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f1371a.get(), (ClientEditArguments) this.f1372b.f393949a);
    }
}
