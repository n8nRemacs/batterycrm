package com.avito.android.profile_vk_linking.group_management;

import Vc0.InterfaceC15664a;
import android.content.DialogInterface;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VkLinkingGroupManagementView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f231232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VkPopup.CommonButton f231233m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f231234n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, VkPopup.CommonButton commonButton, DialogInterface dialogInterface) {
        super(0);
        this.f231232l = jVar;
        this.f231233m = commonButton;
        this.f231234n = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f231232l;
        InterfaceC15664a interfaceC15664aB = j.b(jVar, this.f231233m);
        if (interfaceC15664aB != null) {
            jVar.f231188c.accept(interfaceC15664aB);
            this.f231234n.dismiss();
        }
        return G0.f406611a;
    }
}
