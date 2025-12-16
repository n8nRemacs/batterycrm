package mU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.datetime.api.model.TimeZone;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocalDateTimeToInstantFunction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU0/g;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f414538a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414539b = "LocalDateTimeToInstant";

    public g(@k RT0.e eVar) {
        this.f414538a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) throws BeduinPropertyException {
        String strL = mVar.l(zVar, "value");
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("timeZone");
            TimeZone timeZoneValueOf = null;
            if (dVarC != null) {
                v vVarQ = dVarC.q(zVar);
                String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                if (f336843b != null) {
                    timeZoneValueOf = TimeZone.valueOf(f336843b);
                }
            }
            if (timeZoneValueOf == null) {
                timeZoneValueOf = TimeZone.f336386b;
            }
            return C36273j.e(zVar, this.f414538a.f14449a.g(new ST0.f(strL), timeZoneValueOf).f14989a);
        } catch (Exception e12) {
            throw new BeduinPropertyException("timeZone", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF414539b() {
        return this.f414539b;
    }
}
