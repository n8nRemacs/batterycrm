package com.avito.android.iac_dialer.impl_module.device_status.connection_status;

import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;

/* compiled from: IacConnectionStatusProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasCall", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f165962b;

    public h(b bVar) {
        this.f165962b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b bVar = this.f165962b;
        if (zBooleanValue) {
            N0 n02 = bVar.f165948i;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            bVar.f165948i = C43259k.d(U.a(EmptyCoroutineContext.INSTANCE), bVar.f165941b.a(), null, new g(bVar, null), 2);
            return;
        }
        N0 n03 = bVar.f165948i;
        if (n03 != null) {
            ((V0) n03).c(null);
        }
    }
}
