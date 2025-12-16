package com.avito.android.autoteka.deeplinks.buyReportLink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.L;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;

/* compiled from: AutotekaBuyReportLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/buyReportLink/b;", "Lev/b;", "Lcom/avito/android/autoteka/deeplinks/AutotekaBuyReportLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40162b<AutotekaBuyReportLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f96246d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f96247e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final L f96248f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f96249g;

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC35845m2 interfaceC35845m2, @k L l12, @k a.i iVar) {
        this.f96246d = interfaceC4053a;
        this.f96247e = interfaceC35845m2;
        this.f96248f = l12;
        this.f96249g = iVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [Ju.d$c, T] */
    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        AutotekaBuyReportLink autotekaBuyReportLink = (AutotekaBuyReportLink) deepLink;
        Intent intentY = this.f96247e.y(autotekaBuyReportLink.f96212b, this.f96248f.a(autotekaBuyReportLink, !C43066x.q(r2, "?", false)));
        l0.h hVar = new l0.h();
        hVar.f406842b = AbstractC14250d.c.f9171c;
        C35974x2.d(intentY);
        this.f96246d.R(intentY, new a(hVar, this));
        return (InterfaceC14249c.b) hVar.f406842b;
    }
}
