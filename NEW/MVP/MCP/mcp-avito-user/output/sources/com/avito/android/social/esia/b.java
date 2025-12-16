package com.avito.android.social.esia;

import Y61.k;
import android.content.Intent;
import com.avito.android.social.esia.EsiaAuthActivity;
import com.avito.android.social.esia.EsiaAuthResult;
import com.esiasdk.android.EsiaErrorResponse;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EsiaAuthActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/esia/b;", "Lcom/esiasdk/android/esiaLoginClient/b;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.esiasdk.android.esiaLoginClient.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EsiaAuthActivity f284386a;

    public b(EsiaAuthActivity esiaAuthActivity) {
        this.f284386a = esiaAuthActivity;
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void a(@k EsiaErrorResponse esiaErrorResponse) {
        EsiaAuthActivity.H1(this.f284386a, false, esiaErrorResponse);
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void b(@k TokenParameters tokenParameters) {
        EsiaAuthActivity.a aVar = EsiaAuthActivity.f284369e;
        EsiaAuthActivity esiaAuthActivity = this.f284386a;
        Intent intent = new Intent();
        intent.putExtra("esia_app_2_app_result", new EsiaAuthResult.Success(tokenParameters));
        G0 g02 = G0.f406611a;
        esiaAuthActivity.setResult(-1, intent);
        esiaAuthActivity.finish();
    }

    @Override // com.esiasdk.android.esiaLoginClient.b
    public final void c(@k EsiaErrorResponse esiaErrorResponse) {
        EsiaAuthActivity.H1(this.f284386a, true, esiaErrorResponse);
    }
}
