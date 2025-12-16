package com.avito.android.tariff.cpx.info.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.deeplink.TariffCpxInfoLink;
import ev.AbstractC40162b;
import jB0.InterfaceC42230a;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.o;

/* compiled from: TariffCpxInfoHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/deeplink/b;", "Lev/b;", "Lcom/avito/android/tariff/deeplink/TariffCpxInfoLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes4.dex */
public final class b extends AbstractC40162b<TariffCpxInfoLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f296357d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42230a f296358e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final o f296359f;

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC42230a interfaceC42230a, @k o oVar) {
        this.f296357d = interfaceC4053a;
        this.f296358e = interfaceC42230a;
        this.f296359f = oVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentA = this.f296358e.a();
        intentA.setFlags(603979776);
        intentA.putExtra("up_intent", this.f296359f.b());
        this.f296357d.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
