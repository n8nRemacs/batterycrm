package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.permissions.PermissionState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PermissionSystemSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class H extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f169116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PermissionSystemSettingsLink f169117m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(E e12, PermissionSystemSettingsLink permissionSystemSettingsLink) {
        super(1);
        this.f169116l = e12;
        this.f169117m = permissionSystemSettingsLink;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        E e12 = this.f169116l;
        PermissionSystemSettingsLink permissionSystemSettingsLink = this.f169117m;
        com.avito.android.permissions.u uVar = e12.f169107g;
        String str = permissionSystemSettingsLink.f169273b;
        if (uVar.b(str)) {
            e12.f169106f.c(PermissionState.f215104b, str);
            e12.k(PermissionSystemSettingsLink.ResultValue.f169280c);
        } else {
            e12.k(PermissionSystemSettingsLink.ResultValue.f169281d);
        }
        return G0.f406611a;
    }
}
