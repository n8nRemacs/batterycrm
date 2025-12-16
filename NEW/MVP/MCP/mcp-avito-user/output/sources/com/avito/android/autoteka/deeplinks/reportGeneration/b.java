package com.avito.android.autoteka.deeplinks.reportGeneration;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaReportGenerationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaReportGenerationDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/reportGeneration/b;", "Lev/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaReportGenerationLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AutotekaReportGenerationLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f96310f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f96311g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f96312h;

    @Inject
    public b(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f96310f = context;
        this.f96311g = interfaceC4053a;
        this.f96312h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutotekaReportGenerationLink autotekaReportGenerationLink = (AutotekaReportGenerationLink) deepLink;
        this.f96312h.a(autotekaReportGenerationLink, this, AuthSource.f92691Z, new a(this, autotekaReportGenerationLink));
    }
}
