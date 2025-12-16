package com.avito.android.profile_vk_linking.group_management.mvi;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: VkLinkingGroupManagementBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements com.avito.android.arch.mvi.b<Vc0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.group_management.b f231214a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f231215b;

    @Inject
    public i(@Y61.k com.avito.android.profile_vk_linking.group_management.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f231214a = bVar;
        this.f231215b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Vc0.b> a() {
        return C43175k.N(C43175k.B(new h(this, null), new g(y.a(this.f231215b.d9()))), this.f231214a.e());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
