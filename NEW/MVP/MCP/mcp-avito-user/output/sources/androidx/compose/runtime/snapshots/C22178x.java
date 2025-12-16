package androidx.compose.runtime.snapshots;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "T", "Landroidx/compose/runtime/snapshots/t;", "invalid", "invoke", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.snapshots.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22178x extends kotlin.jvm.internal.N implements Y41.l<C22174t, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f38764l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22178x(Y41.l<? super C22174t, Object> lVar) {
        super(1);
        this.f38764l = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Object invoke(C22174t c22174t) {
        AbstractC22167l abstractC22167l = (AbstractC22167l) this.f38764l.invoke(c22174t);
        synchronized (C22176v.f38750c) {
            C22176v.f38751d = C22176v.f38751d.g(abstractC22167l.getF38722b());
            G0 g02 = G0.f406611a;
        }
        return abstractC22167l;
    }
}
