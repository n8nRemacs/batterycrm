package shark.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.C48240c2;
import shark.L1;
import shark.M1;
import shark.internal.ApacheHarmonyInstanceRefReaders;
import shark.internal.C0;
import shark.internal.C48298v;
import shark.internal.OpenJdkInstanceRefReaders;

/* compiled from: InternalSharkCollectionsHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/j0;", "", "<init>", "()V", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48284j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C48284j0 f438566a = new C48284j0();

    /* compiled from: InternalSharkCollectionsHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/internal/C0;", "reference", "", "invoke", "(Lshark/internal/C0;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.j0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C0, String> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L1 f438567l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1 l12) {
            super(1);
            this.f438567l = l12;
        }

        @Override // Y41.l
        public final String invoke(C0 c02) {
            String strE;
            C0 c03 = c02;
            M1 m1F = this.f438567l.f(c03.f438335a);
            C0.a aVarA = c03.f438337c.a();
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(aVarA.f438338a);
            sb2.append("] = ");
            C48284j0.f438566a.getClass();
            if (m1F instanceof M1.b) {
                strE = ((M1.b) m1F).g();
            } else if (m1F instanceof M1.c) {
                strE = ((M1.c) m1F).f();
            } else if (m1F instanceof M1.d) {
                strE = ((M1.d) m1F).e();
            } else {
                if (!(m1F instanceof M1.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                strE = ((M1.e) m1F).e();
            }
            sb2.append(strE);
            return sb2.toString();
        }
    }

    @Y61.k
    public static InterfaceC43030m a(@Y61.k M1.c cVar) {
        OpenJdkInstanceRefReaders.a aVar = (OpenJdkInstanceRefReaders.a) OpenJdkInstanceRefReaders.f438405b;
        C48240c2 c48240c2 = cVar.f438149c;
        C48298v.a aVarA = aVar.a(c48240c2);
        if (aVarA == null) {
            aVarA = ((ApacheHarmonyInstanceRefReaders.a) ApacheHarmonyInstanceRefReaders.f438308b).a(c48240c2);
        }
        if (aVarA == null) {
            return C43033p.h();
        }
        C48266a0 c48266a0 = (C48266a0) aVarA;
        return !c48266a0.a(cVar) ? C43033p.h() : new kotlin.sequences.o0(c48266a0.b(cVar), new a(c48240c2));
    }
}
