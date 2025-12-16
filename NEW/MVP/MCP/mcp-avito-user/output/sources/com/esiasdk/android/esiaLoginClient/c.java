package com.esiasdk.android.esiaLoginClient;

import android.content.Intent;
import com.esiasdk.android.EsiaErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EsiaLoginManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/esiasdk/android/EsiaErrorResponse;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<EsiaErrorResponse> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Intent f339703l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Intent intent) {
        super(0);
        this.f339703l = intent;
    }

    @Override // Y41.a
    public final EsiaErrorResponse invoke() {
        Intent intent = this.f339703l;
        EsiaErrorResponse esiaErrorResponse = intent == null ? null : (EsiaErrorResponse) intent.getParcelableExtra("EXTRA_ERROR_CODE");
        return esiaErrorResponse == null ? new EsiaErrorResponse(null, null, null, 7, null) : esiaErrorResponse;
    }
}
