package shark;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.sequences.C43033p;
import shark.AbstractC48345t2;
import shark.M1;

/* compiled from: AndroidResourceIdNames.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lshark/AndroidResourceIdNames;", "invoke"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.k1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48309k1 extends kotlin.jvm.internal.N implements Y41.a<AndroidResourceIdNames> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48240c2 f438642l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48309k1(C48240c2 c48240c2) {
        super(0);
        this.f438642l = c48240c2;
    }

    @Override // Y41.a
    public final AndroidResourceIdNames invoke() {
        String name = AndroidResourceIdNames.class.getName();
        M1.b bVarC = this.f438642l.c(name);
        if (bVarC == null) {
            return null;
        }
        K1 k1L = bVarC.l("holderField");
        if (k1L == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1L.a();
        if (cVarA == null) {
            return null;
        }
        K1 k1J = cVarA.j(name, "resourceIds");
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1 m1E = k1J.f438095c.e();
        M1.e eVar = (m1E == null || !(m1E instanceof M1.e)) ? null : (M1.e) m1E;
        if (eVar == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        C48240c2 c48240c2 = eVar.f438155c;
        c48240c2.getClass();
        AbstractC48345t2.b.c.d dVar = (AbstractC48345t2.b.c.d) c48240c2.m(eVar.f438157e, eVar.f438156d, C48326o2.f438663l);
        if (dVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type shark.HprofRecord.HeapDumpRecord.ObjectRecord.PrimitiveArrayDumpRecord.IntArrayDump");
        }
        AbstractC48345t2.b.c.d.f fVar = (AbstractC48345t2.b.c.d.f) dVar;
        K1 k1J2 = cVarA.j(name, "names");
        if (k1J2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.d dVarB = k1J2.b();
        if (dVarB == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        Object[] array = C43033p.D(new kotlin.sequences.o0(dVarB.f(), C48305j1.f438636l)).toArray(new String[0]);
        if (array != null) {
            return new AndroidResourceIdNames(fVar.f438750c, (String[]) array, null);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
