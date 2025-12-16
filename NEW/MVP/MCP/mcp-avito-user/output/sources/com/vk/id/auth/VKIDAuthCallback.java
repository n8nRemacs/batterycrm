package com.vk.id.auth;

import Y61.k;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import kotlin.Metadata;

/* compiled from: VKIDAuthCallback.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/vk/id/auth/VKIDAuthCallback;", "", "Lcom/vk/id/AccessToken;", "accessToken", "Lkotlin/G0;", "onAuth", "(Lcom/vk/id/AccessToken;)V", "Lcom/vk/id/auth/AuthCodeData;", "data", "", "isCompletion", "onAuthCode", "(Lcom/vk/id/auth/AuthCodeData;Z)V", "Lcom/vk/id/VKIDAuthFail;", "fail", "onFail", "(Lcom/vk/id/VKIDAuthFail;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VKIDAuthCallback {
    void onAuth(@k AccessToken accessToken);

    void onAuthCode(@k AuthCodeData data, boolean isCompletion);

    void onFail(@k VKIDAuthFail fail);

    /* compiled from: VKIDAuthCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAuthCode(@k VKIDAuthCallback vKIDAuthCallback, @k AuthCodeData authCodeData, boolean z12) {
        }
    }
}
