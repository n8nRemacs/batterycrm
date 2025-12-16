package com.avito.android.silent_update.permissions;

import Fw0.InterfaceC13846a;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.silent_update.permissions.PermissionsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PermissionsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity f283699l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PermissionsActivity permissionsActivity) {
        super(0);
        this.f283699l = permissionsActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PermissionsActivity.a aVar = PermissionsActivity.f283678t;
        PermissionsActivity permissionsActivity = this.f283699l;
        permissionsActivity.a2().accept(InterfaceC13846a.c.f6029a);
        Intent intent = new Intent();
        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + permissionsActivity.getPackageName()));
        permissionsActivity.startActivity(intent);
        permissionsActivity.f283682p = true;
        return G0.f406611a;
    }
}
