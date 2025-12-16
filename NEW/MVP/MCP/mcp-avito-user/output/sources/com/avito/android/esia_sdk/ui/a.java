package com.avito.android.esia_sdk.ui;

import Lz.AbstractC14457a;
import Y61.k;
import com.esiasdk.android.EsiaErrorResponse;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.Metadata;

/* compiled from: EsiaSdkActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_sdk/ui/a;", "Lcom/esiasdk/android/esiaLoginClient/b;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.esiasdk.android.esiaLoginClient.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EsiaSdkActivity f148166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f148167b;

    public a(EsiaSdkActivity esiaSdkActivity, String str) {
        this.f148166a = esiaSdkActivity;
        this.f148167b = str;
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void a(@k EsiaErrorResponse esiaErrorResponse) {
        EsiaSdkActivity esiaSdkActivity = this.f148166a;
        String str = this.f148167b;
        int i12 = EsiaSdkActivity.f148156q;
        esiaSdkActivity.a2(str, "", "");
        esiaSdkActivity.b2().accept(new AbstractC14457a.c(esiaErrorResponse.toString()));
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void b(@k TokenParameters tokenParameters) {
        int i12 = EsiaSdkActivity.f148156q;
        this.f148166a.a2(this.f148167b, tokenParameters.f339699b, tokenParameters.f339700c);
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void c(@k EsiaErrorResponse esiaErrorResponse) {
        EsiaSdkActivity esiaSdkActivity = this.f148166a;
        String str = this.f148167b;
        int i12 = EsiaSdkActivity.f148156q;
        esiaSdkActivity.a2(str, "", "");
        esiaSdkActivity.b2().accept(new AbstractC14457a.c(esiaErrorResponse.toString()));
    }
}
