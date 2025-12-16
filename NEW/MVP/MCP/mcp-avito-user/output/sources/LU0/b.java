package LU0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.n;
import com.avito.beduin.v2.engine.p;
import com.avito.beduin.v2.engine.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShowComponentAsScreenInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLU0/b;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f9964a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9965b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9966c;

    /* compiled from: ShowComponentAsScreenInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLU0/b$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f9967b = new a();

        public a() {
            super("ShowComponentAsScreen");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            com.avito.beduin.v2.engine.field.entity.c cVarF = mVar.f(zVar);
            Boolean boolO = mVar.o(zVar, "shouldAddToBackStack");
            boolean zBooleanValue = boolO != null ? boolO.booleanValue() : true;
            Boolean boolO2 = mVar.o(zVar, "shouldClearBackStack");
            return new b(t.a.a(t.f336899f, null, p.a(zVar).a(zVar.A(), cVarF.f336788c, cVarF.f336790e.f336867a), zVar.getF336594a().getF336545b().f336474a, zVar.getF336594a().getF336545b().f336475b, 3), zBooleanValue, boolO2 != null ? boolO2.booleanValue() : false);
        }
    }

    public b(@k n nVar, boolean z12, boolean z13) {
        this.f9964a = nVar;
        this.f9965b = z12;
        this.f9966c = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f9964a, bVar.f9964a) && this.f9965b == bVar.f9965b && this.f9966c == bVar.f9966c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9966c) + r.i(this.f9964a.hashCode() * 31, 31, this.f9965b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowComponentAsScreenInteraction(engineState=");
        sb2.append(this.f9964a);
        sb2.append(", shouldAddToBackStack=");
        sb2.append(this.f9965b);
        sb2.append(", shouldClearBackStack=");
        return r.x(sb2, this.f9966c, ')');
    }

    public /* synthetic */ b(n nVar, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(nVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13);
    }
}
