package shark.internal;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.sequences.C43028k;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.K1;
import shark.M1;
import shark.internal.C48298v;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/i0;", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48282i0 implements C48298v.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f438561a;

    /* renamed from: b, reason: collision with root package name */
    public final String f438562b;

    /* renamed from: c, reason: collision with root package name */
    public final String f438563c;

    /* renamed from: d, reason: collision with root package name */
    public final String f438564d;

    public C48282i0(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f438561a = j12;
        this.f438562b = str;
        this.f438563c = str2;
        this.f438564d = str3;
    }

    @Override // shark.internal.C48298v.a
    public final boolean a(@Y61.k M1.c cVar) {
        return cVar.f438150d.f438474b == this.f438561a;
    }

    @Override // shark.internal.E0
    public final InterfaceC43030m b(M1 m12) {
        M1.c cVar = (M1.c) m12;
        long j12 = cVar.f438150d.f438474b;
        K1 k1J = cVar.j("java.util.LinkedList", this.f438562b);
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1J.a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cVarA != null) {
            linkedHashSet.add(Long.valueOf(cVarA.f438151e));
        }
        return C43033p.y(new C43028k(C43033p.u(new C48276f0(this, linkedHashSet), cVarA)), new C48280h0(this, j12));
    }
}
