package com.avito.android.iac_dialer.impl_module.screens.call_screen.permission;

import Y41.l;
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
final class d extends N implements l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f166273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f166274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f166275n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, b bVar, String str2) {
        super(1);
        this.f166273l = str;
        this.f166274m = bVar;
        this.f166275n = str2;
    }

    @Override // Y41.l
    public final G0 invoke(C43501a c43501a) {
        SetFlowResultLink.b bVar = (SetFlowResultLink.b) c43501a.f413261b;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f166273l);
        sb2.append(" finished, flowResultKey=");
        String str = bVar.f169287b;
        sb2.append(str);
        bVar2.a("IacCallScreenPermissionRequester", sb2.toString(), null);
        boolean zF2 = L.f(str, "flow_result_key_granted");
        String str2 = this.f166275n;
        b bVar3 = this.f166274m;
        if (zF2) {
            bVar3.f166268b.a(new InterfaceC49852b.h(PermissionState.f215104b, str2), "IacCallScreenPermissionRequester");
        } else if (L.f(str, "flow_result_key_denied")) {
            bVar3.f166268b.a(new InterfaceC49852b.h(PermissionState.f215105c, str2), "IacCallScreenPermissionRequester");
        } else if (L.f(str, "flow_result_key_forever_denied")) {
            bVar3.f166268b.a(new InterfaceC49852b.h(PermissionState.f215106d, str2), "IacCallScreenPermissionRequester");
        }
        return G0.f406611a;
    }
}
