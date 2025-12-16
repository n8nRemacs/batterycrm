package SU0;

import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessResponsePredicate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/a;", "LSU0/q;", "<init>", "()V", "serialization-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f14997a = new a();

    public final boolean a(int i12, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        v vVarQ;
        boolean z12 = 200 <= i12 && i12 < 300;
        if (!(dVar instanceof A)) {
            return false;
        }
        com.avito.beduin.v2.engine.field.m mVar = ((A) dVar).f336778b;
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("status");
        return z12 && (L.f((dVarC == null || (vVarQ = dVarC.q(F.f336593b)) == null) ? null : vVarQ.getF336843b(), "ok") || (mVar.c("success") != null));
    }
}
