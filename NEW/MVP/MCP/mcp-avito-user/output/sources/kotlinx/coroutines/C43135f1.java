package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: NonCancellable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/f1;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43135f1 extends AbstractCoroutineContextElement implements N0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C43135f1 f411090b = new C43135f1();

    public C43135f1() {
        super(N0.f410716u2);
    }

    @Override // kotlinx.coroutines.N0
    @Y61.l
    @InterfaceC42830m
    public final Object A(@Y61.k Continuation<? super kotlin.G0> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    @InterfaceC42830m
    public final CancellationException J() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    @InterfaceC42830m
    public final InterfaceC43308w L(@Y61.k V0 v02) {
        return C43224g1.f411855b;
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    @InterfaceC42830m
    public final InterfaceC43268o0 Q(boolean z12, boolean z13, @Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        return C43224g1.f411855b;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean c0() {
        return false;
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43030m<N0> getChildren() {
        return C43033p.h();
    }

    @Override // kotlinx.coroutines.N0
    @Y61.l
    public final N0 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    @InterfaceC42830m
    public final InterfaceC43268o0 k(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        return C43224g1.f411855b;
    }

    @Override // kotlinx.coroutines.N0
    @InterfaceC42830m
    public final boolean start() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.N0
    @InterfaceC42830m
    public final void c(@Y61.l CancellationException cancellationException) {
    }
}
