package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/Q;", "Lkotlinx/coroutines/u1;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@IgnoreJRERequirement
@kotlin.X
/* loaded from: classes8.dex */
public final /* data */ class Q extends AbstractCoroutineContextElement implements u1<String> {

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/Q$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Q;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements CoroutineContext.Key<Q> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // kotlinx.coroutines.u1
    public final String R(CoroutineContext coroutineContext) {
        String str;
        S s5 = (S) coroutineContext.get(S.f410719c);
        if (s5 == null || (str = s5.f410720b) == null) {
            str = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iN2 = C43066x.N(6, name, " @");
        if (iN2 < 0) {
            iN2 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + iN2 + 10);
        sb2.append(name.substring(0, iN2));
        sb2.append(" @");
        sb2.append(str);
        sb2.append("#0");
        threadCurrentThread.setName(sb2.toString());
        return name;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        ((Q) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    @Override // kotlinx.coroutines.u1
    public final void o(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    @Y61.k
    public final String toString() {
        return "CoroutineId(0)";
    }
}
