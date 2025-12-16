package com.vk.id.refresh;

import Y61.k;
import com.vk.id.AccessToken;
import kotlin.Metadata;

/* compiled from: VKIDRefreshTokenCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/refresh/VKIDRefreshTokenCallback;", "", "Lcom/vk/id/AccessToken;", "token", "Lkotlin/G0;", "onSuccess", "(Lcom/vk/id/AccessToken;)V", "Lcom/vk/id/refresh/VKIDRefreshTokenFail;", "fail", "onFail", "(Lcom/vk/id/refresh/VKIDRefreshTokenFail;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VKIDRefreshTokenCallback {
    void onFail(@k VKIDRefreshTokenFail fail);

    void onSuccess(@k AccessToken token);
}
