package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionCookieProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/C0;", "Lcom/avito/android/remote/interceptor/B0;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class C0 implements B0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f253484a;

    @Inject
    public C0(@Y61.k com.avito.android.account.G g12) {
        this.f253484a = g12;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253513b() {
        return false;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "sessid";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue */
    public final String getF253512a() {
        return this.f253484a.i().c();
    }
}
