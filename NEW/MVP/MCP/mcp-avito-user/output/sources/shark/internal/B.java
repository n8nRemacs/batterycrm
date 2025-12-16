package shark.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.M1;

/* compiled from: DelegatingObjectReferenceReader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lshark/internal/B;", "Lshark/internal/E0;", "Lshark/M1;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class B implements E0<M1> {

    /* renamed from: a, reason: collision with root package name */
    public final A f438315a;

    /* renamed from: b, reason: collision with root package name */
    public final C48298v f438316b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f438317c;

    public B(@Y61.k A a12, @Y61.k C48298v c48298v, @Y61.k t0 t0Var) {
        this.f438315a = a12;
        this.f438316b = c48298v;
        this.f438317c = t0Var;
    }

    @Override // shark.internal.E0
    @Y61.k
    public final InterfaceC43030m<C0> b(@Y61.k M1 m12) {
        if (m12 instanceof M1.b) {
            return this.f438315a.b(m12);
        }
        if (m12 instanceof M1.c) {
            return this.f438316b.b(m12);
        }
        if (m12 instanceof M1.d) {
            return this.f438317c.b(m12);
        }
        if (m12 instanceof M1.e) {
            return C43033p.h();
        }
        throw new NoWhenBranchMatchedException();
    }
}
