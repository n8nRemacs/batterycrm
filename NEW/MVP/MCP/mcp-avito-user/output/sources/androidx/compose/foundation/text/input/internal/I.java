package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.Q1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CursorAnimationState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/I;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30838a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<kotlinx.coroutines.N0> f30839b = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f30840c = Q1.a(0.0f);

    public I(boolean z12) {
        this.f30838a = z12;
    }

    @Y61.l
    public final Object a(@Y61.k SuspendLambda suspendLambda) {
        Object objC = kotlinx.coroutines.U.c(new H(this, null), suspendLambda);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
