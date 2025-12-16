package shark.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import shark.AbstractC48368z1;
import shark.C48369z2;
import shark.M1;
import shark.N2;
import shark.g3;
import shark.internal.K;

/* compiled from: GcRootProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lshark/M1;", "Lshark/z1;", "<name for destructuring parameter 0>", "Lshark/internal/K$a;", "invoke", "(Lkotlin/Q;)Lshark/internal/K$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class L extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends M1, ? extends AbstractC48368z1>, K.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f438389l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(K k12) {
        super(1);
        this.f438389l = k12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final K.a invoke(kotlin.Q<? extends M1, ? extends AbstractC48368z1> q12) {
        K.a aVar;
        g3 g3Var;
        kotlin.Q<? extends M1, ? extends AbstractC48368z1> q13 = q12;
        M1 m12 = (M1) q13.f406619b;
        AbstractC48368z1 abstractC48368z1 = (AbstractC48368z1) q13.f406620c;
        if (abstractC48368z1 instanceof AbstractC48368z1.d) {
            aVar = new K.a(abstractC48368z1, true, null);
        } else if (abstractC48368z1 instanceof AbstractC48368z1.e) {
            boolean z12 = m12 instanceof M1.b;
            K k12 = this.f438389l;
            if (z12) {
                g3Var = (g3) k12.f438383a.get(((M1.b) m12).g());
            } else if (m12 instanceof M1.c) {
                g3Var = (g3) k12.f438383a.get(((M1.c) m12).f());
            } else if (m12 instanceof M1.d) {
                g3Var = (g3) k12.f438383a.get(((M1.d) m12).e());
            } else {
                if (!(m12 instanceof M1.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                g3Var = (g3) k12.f438383a.get(((M1.e) m12).e());
            }
            if (g3Var instanceof C48369z2) {
                return null;
            }
            if (g3Var instanceof N2) {
                return new K.a(abstractC48368z1, true, (N2) g3Var);
            }
            aVar = new K.a(abstractC48368z1, false, null);
        } else {
            aVar = new K.a(abstractC48368z1, false, null);
        }
        return aVar;
    }
}
