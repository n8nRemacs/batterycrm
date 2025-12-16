package com.avito.android.profile_vk_linking.group_management;

import Vc0.InterfaceC15664a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VkLinkingGroupManagementView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f231240l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15664a f231241m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, InterfaceC15664a interfaceC15664a) {
        super(0);
        this.f231240l = jVar;
        this.f231241m = interfaceC15664a;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f231240l.f231188c.accept(this.f231241m);
        return G0.f406611a;
    }
}
