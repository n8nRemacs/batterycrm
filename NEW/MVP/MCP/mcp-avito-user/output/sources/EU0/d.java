package eU0;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import eU0.AbstractC40054c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InteractionGroupStrategyFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeU0/d;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f395228a = new d();

    @k
    public static AbstractC40054c a(@k z zVar, @k m mVar) {
        A a12;
        v vVarQ;
        String strW = mVar.w(zVar, "strategy");
        if (strW != null) {
            int iHashCode = strW.hashCode();
            if (iHashCode != -1354795244) {
                if (iHashCode != 103785528) {
                    if (iHashCode == 542694985 && strW.equals("debounce")) {
                        f395228a.getClass();
                        try {
                            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("params");
                            Integer numValueOf = null;
                            if (dVarC != null && (a12 = dVarC.a(zVar)) != null) {
                                try {
                                    com.avito.beduin.v2.engine.field.d dVarC2 = a12.f336778b.c("delayMs");
                                    if (dVarC2 != null && (vVarQ = dVarC2.q(zVar)) != null) {
                                        numValueOf = Integer.valueOf(vVarQ.j());
                                    }
                                } catch (Exception e12) {
                                    throw new BeduinPropertyException("delayMs", e12);
                                }
                            }
                            return new AbstractC40054c.b(numValueOf != null ? numValueOf.intValue() : 0);
                        } catch (Exception e13) {
                            throw new BeduinPropertyException("params", e13);
                        }
                    }
                } else if (strW.equals("merge")) {
                    return AbstractC40054c.C11086c.f395227a;
                }
            } else if (strW.equals("concat")) {
                return AbstractC40054c.a.f395225a;
            }
        }
        return AbstractC40054c.C11086c.f395227a;
    }
}
