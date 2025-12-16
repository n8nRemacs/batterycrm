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

/* compiled from: LocalDateBetweenFunction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlU0/a;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43682a extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f413742a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f413743b = "LocalDateBetween";

    /* compiled from: LocalDateBetweenFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lU0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11786a {
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

    public C43682a(@k RT0.e eVar) {
        this.f413742a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) throws BeduinPropertyException {
        int iJ2;
        v vVarQ;
        String strL = mVar.l(zVar, "value1");
        String strL2 = mVar.l(zVar, "value2");
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
            ST0.e eVar = new ST0.e(strL);
            ST0.e eVar2 = new ST0.e(strL2);
            int iOrdinal = dateUnitValueOf.ordinal();
            RT0.e eVar3 = this.f413742a;
            if (iOrdinal == 0) {
                iJ2 = eVar3.f14451c.J(eVar, eVar2);
            } else if (iOrdinal == 1) {
                iJ2 = eVar3.f14451c.c(eVar, eVar2);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iJ2 = eVar3.f14451c.M(eVar, eVar2);
            }
            return C36273j.c(zVar, iJ2);
        } catch (Exception e12) {
            throw new BeduinPropertyException("dateUnit", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF413743b() {
        return this.f413743b;
    }
}
