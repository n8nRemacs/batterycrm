package com.avito.android.profile_vk_linking.linked_group.mvi;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VkLinkedGroupBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/linked_group/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "LXc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.b<Xc0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.linked_group.c f231301a;

    @Inject
    public c(@Y61.k com.avito.android.profile_vk_linking.linked_group.c cVar) {
        this.f231301a = cVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Xc0.b> a() {
        return this.f231301a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
