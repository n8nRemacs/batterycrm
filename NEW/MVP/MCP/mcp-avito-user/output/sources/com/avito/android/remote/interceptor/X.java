package com.avito.android.remote.interceptor;

import com.avito.android.di.module.M4;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FixedDeviceIdHeaderProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/X;", "Lcom/avito/android/remote/interceptor/I;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class X implements I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f253516a;

    @Inject
    public X(@M4 @Y61.k String str) {
        this.f253516a = str;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253495a() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "X-DeviceId";
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    /* renamed from: getValue, reason: from getter */
    public final String getF253516a() {
        return this.f253516a;
    }
}
