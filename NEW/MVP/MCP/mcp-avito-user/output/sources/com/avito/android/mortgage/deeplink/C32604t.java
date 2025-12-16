package com.avito.android.mortgage.deeplink;

import android.content.res.Resources;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageConsultationDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/t;", "Lev/a;", "Lcom/avito/android/mortgage/deeplink/MortgageConsultationLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.deeplink.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32604t extends AbstractC40161a<MortgageConsultationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f198889f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.e f198890g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f198891h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f198892i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Resources f198893j;

    @Inject
    public C32604t(@Y61.k a.d dVar, @Y61.k a.e eVar, @Y61.k a.i iVar, @Y61.k C25719a c25719a, @Y61.k Resources resources) {
        this.f198889f = dVar;
        this.f198890g = eVar;
        this.f198891h = iVar;
        this.f198892i = c25719a;
        this.f198893j = resources;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MortgageConsultationLink mortgageConsultationLink = (MortgageConsultationLink) deepLink;
        this.f198892i.b(mortgageConsultationLink, this, null, new C32603s(this, mortgageConsultationLink));
    }
}
