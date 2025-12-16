package com.avito.android.remote;

import com.avito.android.remote.model.VerificationTinkoffPayloadResult;
import kotlin.Metadata;

/* compiled from: TinkoffApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/p1;", "", "", "authHeader", "grantType", "code", "redirectUri", "codeVerifier", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/VerificationTinkoffPayloadResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface p1 {
    @J81.o("/auth/token")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<VerificationTinkoffPayloadResult> a(@J81.i("Authorization") @Y61.k String authHeader, @J81.c("grant_type") @Y61.k String grantType, @J81.c("code") @Y61.k String code, @J81.c("redirect_uri") @Y61.k String redirectUri, @J81.c("code_verifier") @Y61.k String codeVerifier);
}
