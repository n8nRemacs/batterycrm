package com.avito.android.profile_settings_extended;

import com.avito.android.profile_settings.u;
import com.avito.android.util.InterfaceC35863o4;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: ProfileSettingsStateProviderImpl.kt */
@androidx.compose.runtime.internal.P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/X;", "Lcom/avito/android/profile_settings/u;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes16.dex */
public final class X implements com.avito.android.profile_settings.u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f229083a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<u.a> f229084b;

    @Inject
    public X(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f229083a = interfaceC35863o4;
        this.f229084b = p2.a(new u.a(interfaceC35863o4.a()));
    }

    @Override // com.avito.android.profile_settings.u
    public final void a() {
        u.a value;
        String strA;
        Z1<u.a> z12 = this.f229084b;
        do {
            value = z12.getValue();
            strA = this.f229083a.a();
            value.getClass();
        } while (!z12.N3(value, new u.a(strA)));
    }

    @Override // com.avito.android.profile_settings.u
    @Y61.k
    public final n2<u.a> b() {
        return this.f229084b;
    }
}
