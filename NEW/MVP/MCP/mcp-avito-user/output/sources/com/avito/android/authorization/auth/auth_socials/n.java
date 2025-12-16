package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.remote.model.AuthSocialStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AuthSocialsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/AuthSocialStatus;", "invoke", "(Lcom/avito/android/remote/model/AuthSocialStatus;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class n extends N implements Y41.l<AuthSocialStatus, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final n f92911l = new n();

    public n() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(AuthSocialStatus authSocialStatus) {
        return Boolean.valueOf(L.f(authSocialStatus.getProvider(), "vk-id"));
    }
}
