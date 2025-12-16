package shark.internal;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.sequences.InterfaceC43030m;
import shark.K1;
import shark.M1;
import shark.X1;

/* compiled from: AndroidReferenceReaders.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/M1$c;", "entry", "Lkotlin/sequences/m;", "Lshark/internal/C0;", "invoke", "(Lshark/M1$c;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48292o extends kotlin.jvm.internal.N implements Y41.l<M1.c, InterfaceC43030m<? extends C0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f438578l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48292o(long j12) {
        super(1);
        this.f438578l = j12;
    }

    @Override // Y41.l
    public final InterfaceC43030m<? extends C0> invoke(M1.c cVar) {
        M1.c cVar2 = cVar;
        K1 k1J = cVar2.j("androidx.arch.core.internal.SafeIterableMap$Entry", "mKey");
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        X1 x12 = k1J.f438095c;
        Long lF2 = x12.f();
        if (lF2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        C0 c02 = new C0(lF2.longValue(), false, new C48289m(this));
        K1 k1J2 = cVar2.j("androidx.arch.core.internal.SafeIterableMap$Entry", "mValue");
        if (k1J2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        Long lF3 = k1J2.f438095c.f();
        if (lF3 != null) {
            return C42756l.f(new C0[]{c02, new C0(lF3.longValue(), false, new C48291n(this, x12))});
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
