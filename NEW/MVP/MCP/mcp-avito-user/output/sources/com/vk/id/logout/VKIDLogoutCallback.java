package com.vk.id.logout;

import Y61.k;
import kotlin.Metadata;

/* compiled from: VKIDLogoutCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutCallback;", "", "Lkotlin/G0;", "onSuccess", "()V", "Lcom/vk/id/logout/VKIDLogoutFail;", "fail", "onFail", "(Lcom/vk/id/logout/VKIDLogoutFail;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VKIDLogoutCallback {
    void onFail(@k VKIDLogoutFail fail);

    void onSuccess();
}
