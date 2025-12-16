package com.avito.android.profile_vk_linking.common.deep_linking.di;

import com.avito.android.profile_vk_linking.common.VkLinkingActivity;
import com.avito.android.profile_vk_linking.common.deep_linking.di.g;

/* compiled from: DaggerVkLinkingActivityComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVkLinkingActivityComponent.java */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.profile_vk_linking.common.deep_linking.di.g.a
        public final g a(h hVar) {
            return new c(hVar, null);
        }
    }

    /* compiled from: DaggerVkLinkingActivityComponent.java */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final h f230975a;

        public c(h hVar, C7033a c7033a) {
            this.f230975a = hVar;
        }

        @Override // com.avito.android.profile_vk_linking.common.deep_linking.di.g
        public final void a(VkLinkingActivity vkLinkingActivity) {
            vkLinkingActivity.f230923m = this.f230975a.E();
        }
    }

    public static g.a a() {
        return new b();
    }
}
