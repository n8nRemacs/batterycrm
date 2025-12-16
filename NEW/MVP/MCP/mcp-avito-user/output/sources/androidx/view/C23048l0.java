package androidx.view;

import X41.i;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.Lifecycle;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;

/* compiled from: PausingDispatcher.jvm.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* renamed from: androidx.lifecycle.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23048l0 {
    @l
    @InterfaceC42830m
    public static final Object a(@k Lifecycle lifecycle, @k Lifecycle.State state, @k p pVar, @k SuspendLambda suspendLambda) {
        c cVar = C43262l0.f411945a;
        return C43259k.g(K.f411877a.y(), new C23046k0(lifecycle, state, pVar, null), suspendLambda);
    }
}
