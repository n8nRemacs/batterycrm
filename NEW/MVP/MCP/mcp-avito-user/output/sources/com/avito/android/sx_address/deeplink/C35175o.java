package com.avito.android.sx_address.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddressDeleteLink;
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

/* compiled from: SxAddressDeleteDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/o;", "Lev/a;", "Lcom/avito/android/SxAddressDeleteLink;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.deeplink.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35175o extends AbstractC40161a<SxAddressDeleteLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.domain.b f292850f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final R0 f292851g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public N0 f292852h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f292853i;

    @Inject
    public C35175o(@Y61.k com.avito.android.sx_address.list.domain.b bVar, @Y61.k R0 r02) {
        this.f292850f = bVar;
        this.f292851g = r02;
        this.f292853i = U.a(r02.a().plus(new C35174n(kotlinx.coroutines.N.f410714t2, this)));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SxAddressDeleteLink sxAddressDeleteLink = (SxAddressDeleteLink) deepLink;
        N0 n02 = this.f292852h;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f292852h = C43259k.d(this.f292853i, null, null, new C35173m(this, sxAddressDeleteLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        N0 n02 = this.f292852h;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        U.b(this.f292853i, null);
    }
}
