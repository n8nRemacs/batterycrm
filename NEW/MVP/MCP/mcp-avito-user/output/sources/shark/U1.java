package shark;

import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.sequences.InterfaceC43030m;
import shark.M1;

/* compiled from: HeapObject.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/M1$b;", "heapClass", "Lkotlin/sequences/m;", "Lshark/K1;", "invoke", "(Lshark/M1$b;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class U1 extends kotlin.jvm.internal.N implements Y41.l<M1.b, InterfaceC43030m<? extends K1>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M1.c f438213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f438214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(M1.c cVar, InterfaceC42726C interfaceC42726C) {
        super(1);
        this.f438213l = cVar;
        this.f438214m = interfaceC42726C;
    }

    @Override // Y41.l
    public final InterfaceC43030m<? extends K1> invoke(M1.b bVar) {
        M1.b bVar2 = bVar;
        return new kotlin.sequences.o0(new C42770s0(bVar2.k()), new T1(this, bVar2));
    }
}
