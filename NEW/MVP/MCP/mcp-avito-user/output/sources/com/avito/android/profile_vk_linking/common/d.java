package com.avito.android.profile_vk_linking.common;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.profile_vk_linking.common.VkLinkingActivity;
import com.avito.android.profile_vk_linking.request_token.VkRequestTokenActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VkLinkingIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/d;", "Lcom/avito/android/profile_vk_linking/common/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f230952a;

    @Inject
    public d(@k Application application) {
        this.f230952a = application;
    }

    @Override // com.avito.android.profile_vk_linking.common.c
    @k
    public final Intent a() {
        VkLinkingActivity.ScreenMode[] screenModeArr = VkLinkingActivity.ScreenMode.f230924c;
        return new Intent(this.f230952a, (Class<?>) VkLinkingActivity.class).putExtra("key_screen_mode", "LINKED");
    }

    @Override // com.avito.android.profile_vk_linking.common.c
    @k
    public final Intent b() {
        VkLinkingActivity.ScreenMode[] screenModeArr = VkLinkingActivity.ScreenMode.f230924c;
        return new Intent(this.f230952a, (Class<?>) VkLinkingActivity.class).putExtra("key_screen_mode", "START");
    }

    @Override // com.avito.android.profile_vk_linking.common.c
    @k
    public final Intent c() {
        VkLinkingActivity.ScreenMode[] screenModeArr = VkLinkingActivity.ScreenMode.f230924c;
        return new Intent(this.f230952a, (Class<?>) VkLinkingActivity.class).putExtra("key_screen_mode", "GROUP_MANAGEMENT");
    }

    @Override // com.avito.android.profile_vk_linking.common.c
    @k
    public final Intent d(@k String str) {
        return new Intent(this.f230952a, (Class<?>) VkRequestTokenActivity.class).putExtra("extra_key", new VkRequestTokenActivity.Params(str));
    }
}
