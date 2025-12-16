package MU0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.f;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatePatchInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMU0/b;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f10690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10692c;

    /* compiled from: StatePatchInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMU0/b$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f10693b = new a();

        public a() {
            super("StatePatch");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            if (zVar.getF336594a().getF336545b().f336476c) {
                throw new UnsupportedOperationException("StatePatch is prohibited in this scenario. Cause: disableStatePatch feature");
            }
            try {
                d dVarC = mVar.c("patch");
                f<d> fVarM = dVarC != null ? dVarC.m(zVar) : null;
                if (fVarM == null) {
                    throw new IllegalArgumentException("Property patch is mandatory");
                }
                String strW = mVar.w(zVar, "targetId");
                Boolean boolO = mVar.o(zVar, "shouldAddToBackStack");
                boolean zBooleanValue = boolO != null ? boolO.booleanValue() : false;
                Boolean boolO2 = mVar.o(zVar, "shouldClearBackStack");
                return new b(fVarM, strW, zBooleanValue, boolO2 != null ? boolO2.booleanValue() : false);
            } catch (Exception e12) {
                throw new BeduinPropertyException("patch", e12);
            }
        }
    }

    public /* synthetic */ b(f fVar, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(fVar, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f10690a, bVar.f10690a) && this.f10691b == bVar.f10691b && this.f10692c == bVar.f10692c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10692c) + r.i(this.f10690a.hashCode() * 31, 31, this.f10691b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatePatchInteraction(payload=");
        sb2.append(this.f10690a);
        sb2.append(", shouldAddToBackStack=");
        sb2.append(this.f10691b);
        sb2.append(", shouldClearBackStack=");
        return r.x(sb2, this.f10692c, ')');
    }

    public b(@k f<?> fVar, @l String str, boolean z12, boolean z13) {
        if (str == null && (str = fVar.getF336820b().c()) == null) {
            str = "params";
        }
        this.f10690a = new u(str, fVar);
        this.f10691b = z12;
        this.f10692c = z13;
    }
}
