package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s0;", "invoke", "()Landroidx/compose/foundation/lazy/layout/s0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class z0 extends kotlin.jvm.internal.N implements Y41.a<s0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.r f29558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.l f29559m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.compose.runtime.saveable.r rVar, androidx.compose.runtime.saveable.l lVar) {
        super(0);
        this.f29558l = rVar;
        this.f29559m = lVar;
    }

    @Override // Y41.a
    public final s0 invoke() {
        return new s0(this.f29558l, P0.c(), this.f29559m);
    }
}
