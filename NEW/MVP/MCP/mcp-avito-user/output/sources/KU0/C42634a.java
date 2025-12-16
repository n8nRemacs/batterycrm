package kU0;

import RT0.e;
import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.functions.datetime.model.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: InstantBetweenFunction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkU0/a;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42634a extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f406287a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f406288b = "InstantBetween";

    /* compiled from: InstantBetweenFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kU0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11617a {
        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeUnit[] timeUnitArr = TimeUnit.f337156b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TimeUnit[] timeUnitArr2 = TimeUnit.f337156b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TimeUnit[] timeUnitArr3 = TimeUnit.f337156b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C42634a(@k e eVar) {
        this.f406287a = eVar;
    }

    @Override // cU0.AbstractC27103a
    @k
    public final com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) throws BeduinPropertyException {
        long jR2;
        v vVarQ;
        String strL = mVar.l(zVar, "value1");
        String strL2 = mVar.l(zVar, "value2");
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("timeUnit");
            String f336843b = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                f336843b = vVarQ.getF336843b();
            }
            if (f336843b == null) {
                throw new IllegalArgumentException("Property timeUnit is mandatory");
            }
            TimeUnit timeUnitValueOf = TimeUnit.valueOf(f336843b);
            ST0.d dVar = new ST0.d(strL);
            ST0.d dVar2 = new ST0.d(strL2);
            int iOrdinal = timeUnitValueOf.ordinal();
            e eVar = this.f406287a;
            if (iOrdinal == 0) {
                jR2 = eVar.f14450b.r(dVar, dVar2);
            } else if (iOrdinal == 1) {
                jR2 = eVar.f14450b.v(dVar, dVar2);
            } else if (iOrdinal == 2) {
                jR2 = eVar.f14450b.u(dVar, dVar2);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jR2 = eVar.f14450b.l(dVar, dVar2);
            }
            return C36273j.d(zVar, jR2);
        } catch (Exception e12) {
            throw new BeduinPropertyException("timeUnit", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF406290b() {
        return this.f406288b;
    }
}
