package shark.internal;

import kotlin.Metadata;
import shark.K1;
import shark.M1;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/collections/H0;", "Lshark/M1$c;", "<name for destructuring parameter 0>", "Lshark/internal/C0;", "invoke", "(Lkotlin/collections/H0;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48280h0 extends kotlin.jvm.internal.N implements Y41.l<kotlin.collections.H0<? extends M1.c>, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48282i0 f438523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f438524m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48280h0(C48282i0 c48282i0, long j12) {
        super(1);
        this.f438523l = c48282i0;
        this.f438524m = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final C0 invoke(kotlin.collections.H0<? extends M1.c> h02) {
        kotlin.collections.H0<? extends M1.c> h03 = h02;
        M1.c cVar = (M1.c) h03.f406644b;
        C48282i0 c48282i0 = this.f438523l;
        K1 k1J = cVar.j(c48282i0.f438563c, c48282i0.f438564d);
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        Long lF2 = k1J.f438095c.f();
        if (lF2 != null) {
            return new C0(lF2.longValue(), false, new C48278g0(this, h03.f406643a));
        }
        return null;
    }
}
