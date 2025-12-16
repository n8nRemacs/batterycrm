package com.esiasdk.android.esiaLoginClient;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EsiaLoginManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/esiasdk/android/esiaLoginClient/TokenParameters;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class d extends N implements Y41.a<TokenParameters> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Intent f339704l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Intent intent) {
        super(0);
        this.f339704l = intent;
    }

    @Override // Y41.a
    public final TokenParameters invoke() {
        Bundle extras;
        Intent intent = this.f339704l;
        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("EXTRA_TOKEN_PARAMS");
        if (obj instanceof TokenParameters) {
            return (TokenParameters) obj;
        }
        return null;
    }
}
