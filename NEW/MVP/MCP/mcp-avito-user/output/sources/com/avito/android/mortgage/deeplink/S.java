package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.mortgage.landing.model.LandingArguments;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: MortgageLandingV2DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class S extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f198771l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageLandingV2Link f198772m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t12, MortgageLandingV2Link mortgageLandingV2Link) {
        super(0);
        this.f198771l = t12;
        this.f198772m = mortgageLandingV2Link;
    }

    @Override // Y41.a
    public final G0 invoke() {
        T t12 = this.f198771l;
        MortgageLandingV2Link mortgageLandingV2Link = this.f198772m;
        t12.f198773f.R(t12.f198774g.c(new LandingArguments(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mortgageLandingV2Link.f198744e, mortgageLandingV2Link.f198742c, mortgageLandingV2Link.f198743d, mortgageLandingV2Link.f198741b, false, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, null)), com.avito.android.deeplink_handler.view.b.f134588l);
        t12.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
