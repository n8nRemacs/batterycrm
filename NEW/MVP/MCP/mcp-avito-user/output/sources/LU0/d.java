package lU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.functions.datetime.model.DateUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: LocalDateMinusFunction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlU0/d;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f413748a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f413749b = "LocalDateMinus";

    /* compiled from: LocalDateMinusFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DateUnit.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DateUnit[] dateUnitArr = DateUnit.f337154b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DateUnit[] dateUnitArr2 = DateUnit.f337154b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(@k RT0.e eVar) {
        this.f413748a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) throws BeduinPropertyException {
        ST0.e eVar;
        v vVarQ;
        String strL = mVar.l(zVar, "value");
        long j12 = mVar.j(zVar, "minus");
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("dateUnit");
            String f336843b = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                f336843b = vVarQ.getF336843b();
            }
            if (f336843b == null) {
                throw new IllegalArgumentException("Property dateUnit is mandatory");
            }
            DateUnit dateUnitValueOf = DateUnit.valueOf(f336843b);
            ST0.e eVar2 = new ST0.e(strL);
            int iOrdinal = dateUnitValueOf.ordinal();
            RT0.e eVar3 = this.f413748a;
            if (iOrdinal == 0) {
                eVar = (ST0.e) eVar3.f14451c.F(eVar2, (int) j12);
            } else if (iOrdinal == 1) {
                eVar = (ST0.e) eVar3.f14451c.x(eVar2, (int) j12);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = (ST0.e) eVar3.f14451c.s(eVar2, (int) j12);
            }
            return C36273j.e(zVar, eVar.f14990a);
        } catch (Exception e12) {
            throw new BeduinPropertyException("dateUnit", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF413749b() {
        return this.f413749b;
    }
}
