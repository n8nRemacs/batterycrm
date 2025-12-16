package com.vk.id.refreshuser;

import Y61.k;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.vk.id.VKIDUser;
import kotlin.Metadata;

/* compiled from: VKIDGetUserCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/refreshuser/VKIDGetUserCallback;", "", "Lcom/vk/id/VKIDUser;", ChannelContext.UserToUser.TYPE, "Lkotlin/G0;", "onSuccess", "(Lcom/vk/id/VKIDUser;)V", "Lcom/vk/id/refreshuser/VKIDGetUserFail;", "fail", "onFail", "(Lcom/vk/id/refreshuser/VKIDGetUserFail;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VKIDGetUserCallback {
    void onFail(@k VKIDGetUserFail fail);

    void onSuccess(@k VKIDUser user);
}
