package shark.internal;

import kotlin.Metadata;
import kotlin.sequences.C43028k;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.K1;
import shark.M1;
import shark.internal.C48298v;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/a0;", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48266a0 implements C48298v.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f438488a;

    /* renamed from: b, reason: collision with root package name */
    public final long f438489b;

    /* renamed from: c, reason: collision with root package name */
    public final String f438490c;

    /* renamed from: d, reason: collision with root package name */
    public final String f438491d;

    public C48266a0(@Y61.k String str, long j12, @Y61.k String str2, @Y61.l String str3) {
        this.f438488a = str;
        this.f438489b = j12;
        this.f438490c = str2;
        this.f438491d = str3;
    }

    @Override // shark.internal.C48298v.a
    public final boolean a(@Y61.k M1.c cVar) {
        return cVar.f438150d.f438474b == this.f438489b;
    }

    @Override // shark.internal.E0
    public final InterfaceC43030m b(M1 m12) {
        InterfaceC43030m interfaceC43030mF;
        M1.c cVar = (M1.c) m12;
        long j12 = cVar.f438150d.f438474b;
        String str = this.f438490c;
        String str2 = this.f438488a;
        K1 k1J = cVar.j(str2, str);
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.d dVarB = k1J.b();
        if (dVarB == null) {
            return C43033p.h();
        }
        String str3 = this.f438491d;
        if (str3 != null) {
            K1 k1J2 = cVar.j(str2, str3);
            if (k1J2 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            Integer numB = k1J2.f438095c.b();
            if (numB == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            interfaceC43030mF = C43033p.C(dVarB.f(), numB.intValue());
        } else {
            interfaceC43030mF = dVarB.f();
        }
        return C43033p.y(new C43028k(interfaceC43030mF), new Z(j12));
    }
}
