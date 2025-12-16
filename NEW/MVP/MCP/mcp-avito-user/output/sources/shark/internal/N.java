package shark.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import shark.M1;

/* compiled from: GcRootProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1;", "graphObject", "", "invoke", "(Lshark/M1;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<M1, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final N f438404l = new N();

    public N() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(M1 m12) {
        M1 m13 = m12;
        if (m13 instanceof M1.b) {
            return ((M1.b) m13).g();
        }
        if (m13 instanceof M1.c) {
            return ((M1.c) m13).f();
        }
        if (m13 instanceof M1.d) {
            return ((M1.d) m13).e();
        }
        if (m13 instanceof M1.e) {
            return ((M1.e) m13).e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
