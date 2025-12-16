package shark.internal;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import shark.K1;
import shark.M1;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lshark/M1$c;", "node", "invoke", "(Lshark/M1$c;)Lshark/M1$c;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48276f0 extends kotlin.jvm.internal.N implements Y41.l<M1.c, M1.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48282i0 f438517l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f438518m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48276f0(C48282i0 c48282i0, LinkedHashSet linkedHashSet) {
        super(1);
        this.f438517l = c48282i0;
        this.f438518m = linkedHashSet;
    }

    @Override // Y41.l
    public final M1.c invoke(M1.c cVar) {
        K1 k1J = cVar.j(this.f438517l.f438563c, "next");
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1J.a();
        if (cVarA == null) {
            return null;
        }
        if (this.f438518m.add(Long.valueOf(cVarA.f438151e))) {
            return cVarA;
        }
        return null;
    }
}
