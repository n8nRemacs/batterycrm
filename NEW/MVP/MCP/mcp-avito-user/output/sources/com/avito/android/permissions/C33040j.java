package com.avito.android.permissions;

import com.avito.android.permissions.InterfaceC33034d;
import kotlin.Metadata;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "permissionsGranted", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.permissions.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33040j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33035e f215126b;

    public C33040j(C33035e c33035e) {
        this.f215126b = c33035e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC33034d.b bVar;
        if (!((Boolean) obj).booleanValue() || (bVar = this.f215126b.f215116c) == null) {
            return;
        }
        bVar.F0();
    }
}
