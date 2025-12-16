package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.remote.model.AuthSocialInteractionStatus;
import com.avito.android.remote.model.AuthSocialStatus;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AuthSocialsGracefulDegradationGenerator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/i;", "Lcom/avito/android/authorization/auth/auth_socials/h;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.authorization.auth.auth_socials.h
    @Y61.k
    public final List<AuthSocialStatus> a() {
        AuthSocialInteractionStatus authSocialInteractionStatus = AuthSocialInteractionStatus.VISIBLE;
        return C42745f0.U(new AuthSocialStatus("vk-id", authSocialInteractionStatus, null, 4, null), new AuthSocialStatus("ok", authSocialInteractionStatus, null, 4, null));
    }
}
