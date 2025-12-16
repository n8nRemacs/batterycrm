package com.vk.id;

import Y61.k;
import com.vk.silentauth.SilentAuthInfo;
import kotlin.Metadata;

/* compiled from: VKIDUser.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVKIDUser", "Lcom/vk/id/VKIDUser;", "Lcom/vk/silentauth/SilentAuthInfo;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDUserKt {
    @k
    public static final VKIDUser toVKIDUser(@k SilentAuthInfo silentAuthInfo) {
        return new VKIDUser(silentAuthInfo.f367190f, silentAuthInfo.f367194j, silentAuthInfo.f367195k, silentAuthInfo.f367191g, silentAuthInfo.f367192h, silentAuthInfo.f367193i, null, 64, null);
    }
}
