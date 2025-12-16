package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CreateExtendedProfileResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/CreateExtendedProfileResult;", "", "NeedVerification", "Ok", "Lcom/avito/android/remote/model/CreateExtendedProfileResult$NeedVerification;", "Lcom/avito/android/remote/model/CreateExtendedProfileResult$Ok;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CreateExtendedProfileResult {

    /* compiled from: CreateExtendedProfileResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/CreateExtendedProfileResult$NeedVerification;", "Lcom/avito/android/remote/model/CreateExtendedProfileResult;", "verificationDeeplink", "Lcom/avito/android/deep_linking/links/DeepLink;", "verificationDisclaimer", "Lcom/avito/android/remote/model/VerificationDisclaimer;", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/VerificationDisclaimer;)V", "getVerificationDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getVerificationDisclaimer", "()Lcom/avito/android/remote/model/VerificationDisclaimer;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NeedVerification implements CreateExtendedProfileResult {

        @c("verificationDeeplink")
        @k
        private final DeepLink verificationDeeplink;

        @c("verificationDisclaimer")
        @l
        private final VerificationDisclaimer verificationDisclaimer;

        public NeedVerification(@k DeepLink deepLink, @l VerificationDisclaimer verificationDisclaimer) {
            this.verificationDeeplink = deepLink;
            this.verificationDisclaimer = verificationDisclaimer;
        }

        @k
        public final DeepLink getVerificationDeeplink() {
            return this.verificationDeeplink;
        }

        @l
        public final VerificationDisclaimer getVerificationDisclaimer() {
            return this.verificationDisclaimer;
        }
    }

    /* compiled from: CreateExtendedProfileResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/CreateExtendedProfileResult$Ok;", "Lcom/avito/android/remote/model/CreateExtendedProfileResult;", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements CreateExtendedProfileResult {

        @k
        public static final Ok INSTANCE = new Ok();

        private Ok() {
        }
    }
}
