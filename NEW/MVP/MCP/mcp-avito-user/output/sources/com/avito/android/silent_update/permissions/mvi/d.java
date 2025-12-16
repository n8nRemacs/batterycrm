package com.avito.android.silent_update.permissions.mvi;

import Fw0.InterfaceC13846a;
import Y61.k;
import Y61.l;
import com.avito.android.arch.mvi.a;
import com.avito.android.silent_update.permissions.SilentUpdatePermissions;
import com.avito.android.silent_update.permissions.mvi.entity.PermissionsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PermissionsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LFw0/a;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "LFw0/c;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC13846a, PermissionsInternalAction, Fw0.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.silent_update.permissions.i f283727a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Ew0.c f283728b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f283729c;

    @Inject
    public d(@k com.avito.android.silent_update.permissions.i iVar, @k Ew0.c cVar, @l String str) {
        this.f283727a = iVar;
        this.f283728b = cVar;
        this.f283729c = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PermissionsInternalAction> b(InterfaceC13846a interfaceC13846a, Fw0.c cVar) {
        return C43175k.G(new c(interfaceC13846a, cVar, this, null));
    }

    public final PermissionsInternalAction c() {
        com.avito.android.silent_update.permissions.i iVar = this.f283727a;
        return !iVar.a() ? PermissionsInternalAction.RequestDozeModePermission.f283733b : !iVar.b() ? PermissionsInternalAction.RequestInstallPermission.f283734b : d();
    }

    public final PermissionsInternalAction.SendPermissionsResultAndFinish d() {
        com.avito.android.silent_update.permissions.i iVar = this.f283727a;
        return new PermissionsInternalAction.SendPermissionsResultAndFinish(new SilentUpdatePermissions(iVar.c(), iVar.a(), iVar.b()));
    }
}
