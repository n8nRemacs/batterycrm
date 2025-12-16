package com.avito.android.gig_apply.deeplink_payment;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_apply.GigSlotReceivePaymentDeeplink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: GigSlotReceivePaymentDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/deeplink_payment/b;", "Lev/a;", "Lcom/avito/android/gig_apply/GigSlotReceivePaymentDeeplink;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40161a<GigSlotReceivePaymentDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.g f159592f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final HG.a f159593g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final x f159594h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final R0 f159595i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f159596j;

    @Inject
    public b(@k a.g gVar, @k HG.a aVar, @k x xVar, @k R0 r02) {
        this.f159592f = gVar;
        this.f159593g = aVar;
        this.f159594h = xVar;
        this.f159595i = r02;
        this.f159596j = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.a()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f159592f.g(null, true);
        C43259k.d(this.f159596j, null, null, new a(this, (GigSlotReceivePaymentDeeplink) deepLink, null), 3);
    }
}
