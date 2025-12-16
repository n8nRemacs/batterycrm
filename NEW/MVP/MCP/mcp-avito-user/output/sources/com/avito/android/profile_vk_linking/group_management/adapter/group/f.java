package com.avito.android.profile_vk_linking.group_management.adapter.group;

import Vc0.InterfaceC15664a;
import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/adapter/group/f;", "Lcom/avito/android/profile_vk_linking/group_management/adapter/group/d;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15664a, G0> f231108b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15664a, G0> lVar) {
        this.f231108b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        ((h) eVar).Dj(aVar2, !aVar2.f231101h ? new e(this, aVar2) : null);
    }
}
