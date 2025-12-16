package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Autofill.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/autofill/q;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f38892d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f38893e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AutofillType> f38894a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final l0.j f38895b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f38896c;

    /* compiled from: Autofill.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/autofill/q$a;", "", "<init>", "()V", "lock", "Ljava/lang/Object;", "", "previousId", "I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f38892d = aVar;
        f38893e = aVar;
    }

    public q() {
        throw null;
    }

    public q(List list, l0.j jVar, Y41.l lVar, int i12, C42822w c42822w) {
        list = (i12 & 1) != 0 ? C42784z0.f406748b : list;
        jVar = (i12 & 2) != 0 ? null : jVar;
        this.f38894a = list;
        this.f38895b = jVar;
        this.f38896c = lVar;
        if (androidx.compose.ui.l.f40322c) {
            androidx.compose.ui.semantics.r.f41791a.addAndGet(1);
        } else {
            f38892d.getClass();
            synchronized (f38893e) {
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f38894a, qVar.f38894a) && L.f(this.f38895b, qVar.f38895b) && this.f38896c == qVar.f38896c;
    }

    public final int hashCode() {
        int iHashCode = this.f38894a.hashCode() * 31;
        l0.j jVar = this.f38895b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Y41.l<String, G0> lVar = this.f38896c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
