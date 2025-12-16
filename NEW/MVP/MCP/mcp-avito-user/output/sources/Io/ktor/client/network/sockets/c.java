package io.ktor.client.network.sockets;

import Y61.k;
import io.ktor.client.request.e0;
import io.ktor.util.InterfaceC41603j0;
import io.ktor.util.s0;
import io.ktor.utils.io.C41714z1;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.Z;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: TimeoutExceptionsCommon.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {
    @InterfaceC41603j0
    @k
    public static final Z a(@k C43238h c43238h, @k W0 w02, @k e0 e0Var) {
        s0.f400547a.getClass();
        Z z12 = new Z(new d(e0Var));
        C41714z1.a(c43238h, EmptyCoroutineContext.INSTANCE, z12, false, new a(w02, z12, null));
        return z12;
    }
}
