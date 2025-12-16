package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.E;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/F", "Lkotlinx/coroutines/internal/E$a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class W0 extends E.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V0 f410743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F0 f410744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(U0 u02, V0 v02, F0 f02) {
        super(u02);
        this.f410743d = v02;
        this.f410744e = f02;
    }

    @Override // kotlinx.coroutines.internal.AbstractC43232b
    public final Object c(kotlinx.coroutines.internal.E e12) {
        if (this.f410743d.j0() == this.f410744e) {
            return null;
        }
        return kotlinx.coroutines.internal.D.f411860a;
    }
}
