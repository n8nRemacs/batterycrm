package com.avito.android.remote.interceptor;

import com.avito.android.remote.t1;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAgentHeaderProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/V0;", "Lcom/avito/android/remote/interceptor/U0;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class V0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f253512a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f253513b = true;

    @Inject
    public V0(@Y61.k t1 t1Var) {
        this.f253512a = t1Var.a();
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b, reason: from getter */
    public final boolean getF253513b() {
        return this.f253513b;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "User-Agent";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue, reason: from getter */
    public final String getF253512a() {
        return this.f253512a;
    }
}
