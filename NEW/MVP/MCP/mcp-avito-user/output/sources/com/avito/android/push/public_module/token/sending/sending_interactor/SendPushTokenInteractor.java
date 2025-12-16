package com.avito.android.push.public_module.token.sending.sending_interactor;

import Y61.k;
import ig0.AbstractC41398a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: SendPushTokenInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor;", "", "TokenRegistrationResult", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface SendPushTokenInteractor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SendPushTokenInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor$TokenRegistrationResult;", "", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TokenRegistrationResult {

        /* renamed from: b, reason: collision with root package name */
        public static final TokenRegistrationResult f246086b;

        /* renamed from: c, reason: collision with root package name */
        public static final TokenRegistrationResult f246087c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TokenRegistrationResult[] f246088d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f246089e;

        static {
            TokenRegistrationResult tokenRegistrationResult = new TokenRegistrationResult("Registered", 0);
            f246086b = tokenRegistrationResult;
            TokenRegistrationResult tokenRegistrationResult2 = new TokenRegistrationResult("NotNeeded", 1);
            f246087c = tokenRegistrationResult2;
            TokenRegistrationResult[] tokenRegistrationResultArr = {tokenRegistrationResult, tokenRegistrationResult2};
            f246088d = tokenRegistrationResultArr;
            f246089e = c.a(tokenRegistrationResultArr);
        }

        public TokenRegistrationResult() {
            throw null;
        }

        public static TokenRegistrationResult valueOf(String str) {
            return (TokenRegistrationResult) Enum.valueOf(TokenRegistrationResult.class, str);
        }

        public static TokenRegistrationResult[] values() {
            return (TokenRegistrationResult[]) f246088d.clone();
        }
    }

    @k
    I<TokenRegistrationResult> a(@k AbstractC41398a abstractC41398a, boolean z12);
}
