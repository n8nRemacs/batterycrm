package com.avito.android.sx_address.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddressRevalidateLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SxAddressRevalidateDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/J;", "Lev/a;", "Lcom/avito/android/SxAddressRevalidateLink;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class J extends AbstractC40161a<SxAddressRevalidateLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.domain.b f292793f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final R0 f292794g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public N0 f292795h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f292796i;

    @Inject
    public J(@Y61.k com.avito.android.sx_address.list.domain.b bVar, @Y61.k R0 r02) {
        this.f292793f = bVar;
        this.f292794g = r02;
        this.f292796i = U.a(r02.a());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SxAddressRevalidateLink sxAddressRevalidateLink = (SxAddressRevalidateLink) deepLink;
        N0 n02 = this.f292795h;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f292795h = C43259k.d(U.f(this.f292796i, new I(kotlinx.coroutines.N.f410714t2, this)), null, null, new H(this, sxAddressRevalidateLink, null), 3);
    }
}
