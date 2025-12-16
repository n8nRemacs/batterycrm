package com.vk.id.internal.auth.app;

import Y41.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SilentAuthServicesProvider f366969c;

    public /* synthetic */ a(SilentAuthServicesProvider silentAuthServicesProvider, int i12) {
        this.f366968b = i12;
        this.f366969c = silentAuthServicesProvider;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f366968b) {
            case 0:
                return Boolean.valueOf(this.f366969c.isAllowedToOpenWebAuth((VkAuthProviderInfo) obj));
            default:
                return Boolean.valueOf(SilentAuthServicesProvider.excludeCurrentApp$lambda$4(this.f366969c, (VkAuthProviderInfo) obj));
        }
    }
}
