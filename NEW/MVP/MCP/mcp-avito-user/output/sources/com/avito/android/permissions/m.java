package com.avito.android.permissions;

import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33035e f215129b;

    public m(C33035e c33035e) {
        this.f215129b = c33035e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        InterfaceC33034d.c cVar = this.f215129b.f215117d;
        if (cVar != null) {
            cVar.d(th2.getMessage());
        }
        V2.f318762a.f(th2);
    }
}
