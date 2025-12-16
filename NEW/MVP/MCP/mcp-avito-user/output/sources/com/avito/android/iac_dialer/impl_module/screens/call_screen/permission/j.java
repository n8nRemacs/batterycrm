package com.avito.android.iac_dialer.impl_module.screens.call_screen.permission;

import Y41.l;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import com.avito.android.permissions.PermissionState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kv.C43501a;
import xK.InterfaceC49852b;

/* compiled from: IacCallScreenPermissionRequesterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f166285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f166286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, b bVar) {
        super(1);
        this.f166285l = str;
        this.f166286m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(C43501a c43501a) {
        SetFlowResultLink.b bVar = (SetFlowResultLink.b) c43501a.f413261b;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f166285l);
        sb2.append(" finished, flowResultKey=");
        String str = bVar.f169287b;
        sb2.append(str);
        bVar2.a("IacCallScreenPermissionRequester", sb2.toString(), null);
        boolean zF2 = L.f(str, "flow_result_key_granted");
        b bVar3 = this.f166286m;
        if (zF2) {
            bVar3.f166268b.a(new InterfaceC49852b.n(PermissionState.f215104b, IacCallDirection.OUTGOING), "IacCallScreenPermissionRequester");
        } else if (L.f(str, "flow_result_key_denied")) {
            bVar3.f166268b.a(new InterfaceC49852b.n(PermissionState.f215105c, IacCallDirection.OUTGOING), "IacCallScreenPermissionRequester");
        } else if (L.f(str, "flow_result_key_forever_denied")) {
            bVar3.f166268b.a(new InterfaceC49852b.n(PermissionState.f215106d, IacCallDirection.OUTGOING), "IacCallScreenPermissionRequester");
        } else if (L.f(str, "flow_result_key_routed_to_settings")) {
            bVar3.f166268b.a(new InterfaceC49852b.o(IacCallDirection.OUTGOING), "IacCallScreenPermissionRequester");
        }
        return G0.f406611a;
    }
}
