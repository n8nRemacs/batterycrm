package com.avito.android.verification.links.esia.apptoapp;

import Y61.k;
import com.avito.android.verification.links.esia.apptoapp.VerificationEsiaFinishResult;
import com.esiasdk.android.EsiaErrorResponse;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.Metadata;

/* compiled from: VerificationEsiaAuthActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/a;", "Lcom/esiasdk/android/esiaLoginClient/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.esiasdk.android.esiaLoginClient.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerificationEsiaAuthActivity f324230a;

    public a(VerificationEsiaAuthActivity verificationEsiaAuthActivity) {
        this.f324230a = verificationEsiaAuthActivity;
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void a(@k EsiaErrorResponse esiaErrorResponse) {
        VerificationEsiaAuthActivity.H1(this.f324230a, new VerificationEsiaFinishResult.Canceled(esiaErrorResponse));
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void b(@k TokenParameters tokenParameters) {
        VerificationEsiaAuthActivity.H1(this.f324230a, new VerificationEsiaFinishResult.Success(tokenParameters));
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void c(@k EsiaErrorResponse esiaErrorResponse) {
        VerificationEsiaAuthActivity.H1(this.f324230a, new VerificationEsiaFinishResult.Failed(esiaErrorResponse));
    }
}
