package com.avito.android.social;

import com.avito.android.social.D;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthCallback;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VkIdSocialManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/T;", "Lcom/vk/id/auth/VKIDAuthCallback;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class T implements VKIDAuthCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f284291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<D.b, G0> f284292b;

    /* JADX WARN: Multi-variable type inference failed */
    public T(U u12, Y41.l<? super D.b, G0> lVar) {
        this.f284291a = u12;
        this.f284292b = lVar;
    }

    @Override // com.vk.id.auth.VKIDAuthCallback
    public final void onAuth(@Y61.k AccessToken accessToken) {
        this.f284291a.f284294b = accessToken;
        Y41.l<D.b, G0> lVar = this.f284292b;
        if (lVar != null) {
            lVar.invoke(D.b.c.f284271a);
        }
    }

    @Override // com.vk.id.auth.VKIDAuthCallback
    public final void onAuthCode(@Y61.k AuthCodeData authCodeData, boolean z12) {
        VKIDAuthCallback.DefaultImpls.onAuthCode(this, authCodeData, z12);
    }

    @Override // com.vk.id.auth.VKIDAuthCallback
    public final void onFail(@Y61.k VKIDAuthFail vKIDAuthFail) {
        boolean z12 = vKIDAuthFail instanceof VKIDAuthFail.Canceled;
        Y41.l<D.b, G0> lVar = this.f284292b;
        if (z12) {
            if (lVar != null) {
                lVar.invoke(D.b.a.f284269a);
            }
        } else if (lVar != null) {
            lVar.invoke(D.b.C8495b.f284270a);
        }
    }
}
