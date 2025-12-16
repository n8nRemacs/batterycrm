package com.avito.android.iac_dialer_finished.impl_module.messenger_link;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_finished.public_module.messenger_link.OpenChannelIfExistLink;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.A;
import ru.avito.messenger.api.entity.GetChannelFilters;

/* compiled from: OpenChannelIfExistLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/messenger_link/b;", "Lev/a;", "Lcom/avito/android/iac_dialer_finished/public_module/messenger_link/OpenChannelIfExistLink;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40161a<OpenChannelIfExistLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A f166515f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f166516g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f166517h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public b(@k A a12, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f166515f = a12;
        this.f166516g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OpenChannelIfExistLink openChannelIfExistLink = (OpenChannelIfExistLink) deepLink;
        this.f166517h.b(A1.g(this.f166515f.c(null, null, 100, new GetChannelFilters(null, null, null, Collections.singletonList(openChannelIfExistLink.getItemId()), 7, null)), null, new a(this, openChannelIfExistLink), 1));
    }
}
