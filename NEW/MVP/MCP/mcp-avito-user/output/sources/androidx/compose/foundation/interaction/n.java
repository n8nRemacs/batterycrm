package androidx.compose.foundation.interaction;

import androidx.compose.runtime.F3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: InteractionSource.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/n;", "Landroidx/compose/foundation/interaction/m;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f28147a = f2.b(0, 16, BufferOverflow.f410778c, 1);

    @Override // androidx.compose.foundation.interaction.m
    public final boolean a(@Y61.k j jVar) {
        return this.f28147a.K5(jVar);
    }

    @Override // androidx.compose.foundation.interaction.m
    @Y61.l
    public final Object b(@Y61.k j jVar, @Y61.k Continuation<? super G0> continuation) {
        Object objEmit = this.f28147a.emit(jVar, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // androidx.compose.foundation.interaction.k
    public final InterfaceC43160i c() {
        return this.f28147a;
    }
}
