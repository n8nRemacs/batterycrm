package com.avito.android.verification.links.tinkoff_finish_web;

import com.avito.android.remote.model.VerificationTinkoffPayloadResult;
import com.avito.android.util.rx3.g1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: VerificationTinkoffFinishWebLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/VerificationTinkoffPayloadResult;", "tokenResponse", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;", "apply", "(Lcom/avito/android/remote/model/VerificationTinkoffPayloadResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f324630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f324631c;

    public g(f fVar, LinkedHashMap linkedHashMap) {
        this.f324630b = fVar;
        this.f324631c = linkedHashMap;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        VerificationTinkoffPayloadResult verificationTinkoffPayloadResult = (VerificationTinkoffPayloadResult) obj;
        String accessToken = verificationTinkoffPayloadResult.getAccessToken();
        LinkedHashMap linkedHashMap = this.f324631c;
        if (accessToken != null) {
            linkedHashMap.put("access_token", accessToken);
        }
        String refreshToken = verificationTinkoffPayloadResult.getRefreshToken();
        if (refreshToken != null) {
            linkedHashMap.put("refresh_token", refreshToken);
        }
        String id_token = verificationTinkoffPayloadResult.getId_token();
        if (id_token != null) {
            linkedHashMap.put("id_token", id_token);
        }
        Integer expiresIn = verificationTinkoffPayloadResult.getExpiresIn();
        if (expiresIn != null) {
            linkedHashMap.put("expires_in", String.valueOf(expiresIn.intValue()));
        }
        f fVar = this.f324630b;
        return g1.a(fVar.f324625b.f(linkedHashMap)).z(fVar.f324624a.a());
    }
}
