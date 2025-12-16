package com.avito.android.edit_address.adapter.location;

import Y61.k;
import androidx.compose.runtime.internal.P;
import dy.InterfaceC39825a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: HeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_address/adapter/location/g;", "Lcom/avito/android/edit_address/adapter/location/d;", "Ldy/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements d, InterfaceC39825a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f145788b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public g() {
    }

    @Override // dy.InterfaceC39825a
    /* renamed from: F, reason: from getter */
    public final e2 getF145788b() {
        return this.f145788b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((i) eVar).iV((a) aVar, new e(this), new f(this));
    }
}
