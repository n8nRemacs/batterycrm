package mU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.functions.datetime.model.DateUnit;
import com.avito.beduin.v2.functions.datetime.model.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocalDateTimeBetweenFunction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU0/a;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44015a extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f414523a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RT0.e f414524b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414525c = "LocalDateTimeBetween";

    /* compiled from: LocalDateTimeBetweenFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mU0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11829a {
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
            int[] iArr2 = new int[DateUnit.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DateUnit[] dateUnitArr = DateUnit.f337154b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DateUnit[] dateUnitArr2 = DateUnit.f337154b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C44015a(@k RT0.e eVar, @k RT0.e eVar2) {
        this.f414523a = eVar;
        this.f414524b = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z r6, @Y61.k com.avito.beduin.v2.engine.field.j r7, @Y61.k com.avito.beduin.v2.engine.field.m r8) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r5 = this;
            java.lang.String r7 = "value1"
            java.lang.String r7 = r8.l(r6, r7)
            java.lang.String r0 = "value2"
            java.lang.String r0 = r8.l(r6, r0)
            java.lang.String r1 = "timeUnit"
            com.avito.beduin.v2.engine.field.d r2 = r8.c(r1)     // Catch: java.lang.Exception -> L20
            r3 = 0
            if (r2 == 0) goto L2b
            com.avito.beduin.v2.engine.field.entity.v r2 = r2.q(r6)     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L23
            java.lang.String r2 = r2.getF336843b()     // Catch: java.lang.Exception -> L20
            goto L24
        L20:
            r6 = move-exception
            goto Lc3
        L23:
            r2 = r3
        L24:
            if (r2 == 0) goto L2b
            com.avito.beduin.v2.functions.datetime.model.TimeUnit r1 = com.avito.beduin.v2.functions.datetime.model.TimeUnit.valueOf(r2)     // Catch: java.lang.Exception -> L20
            goto L2c
        L2b:
            r1 = r3
        L2c:
            ST0.f r2 = new ST0.f
            r2.<init>(r7)
            ST0.f r7 = new ST0.f
            r7.<init>(r0)
            r0 = 2
            r4 = 1
            if (r1 == 0) goto L6f
            int r8 = r1.ordinal()
            RT0.e r1 = r5.f414523a
            if (r8 == 0) goto L64
            if (r8 == r4) goto L5d
            if (r8 == r0) goto L56
            r0 = 3
            if (r8 != r0) goto L50
            RT0.g r8 = r1.f14450b
            long r7 = r8.l(r2, r7)
            goto L6a
        L50:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L56:
            RT0.g r8 = r1.f14450b
            long r7 = r8.u(r2, r7)
            goto L6a
        L5d:
            RT0.g r8 = r1.f14450b
            long r7 = r8.v(r2, r7)
            goto L6a
        L64:
            RT0.g r8 = r1.f14450b
            long r7 = r8.r(r2, r7)
        L6a:
            com.avito.beduin.v2.engine.field.entity.v r6 = com.avito.beduin.v2.engine.C36273j.d(r6, r7)
            goto Lb4
        L6f:
            java.lang.String r1 = "dateUnit"
            com.avito.beduin.v2.engine.field.d r8 = r8.c(r1)     // Catch: java.lang.Exception -> L82
            if (r8 == 0) goto L84
            com.avito.beduin.v2.engine.field.entity.v r8 = r8.q(r6)     // Catch: java.lang.Exception -> L82
            if (r8 == 0) goto L84
            java.lang.String r3 = r8.getF336843b()     // Catch: java.lang.Exception -> L82
            goto L84
        L82:
            r6 = move-exception
            goto Lbd
        L84:
            if (r3 == 0) goto Lb5
            com.avito.beduin.v2.functions.datetime.model.DateUnit r8 = com.avito.beduin.v2.functions.datetime.model.DateUnit.valueOf(r3)     // Catch: java.lang.Exception -> L82
            int r8 = r8.ordinal()
            RT0.e r1 = r5.f414524b
            if (r8 == 0) goto Laa
            if (r8 == r4) goto La3
            if (r8 != r0) goto L9d
            RT0.c r8 = r1.f14451c
            int r7 = r8.M(r2, r7)
            goto Lb0
        L9d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        La3:
            RT0.c r8 = r1.f14451c
            int r7 = r8.c(r2, r7)
            goto Lb0
        Laa:
            RT0.c r8 = r1.f14451c
            int r7 = r8.J(r2, r7)
        Lb0:
            com.avito.beduin.v2.engine.field.entity.v r6 = com.avito.beduin.v2.engine.C36273j.c(r6, r7)
        Lb4:
            return r6
        Lb5:
            java.lang.String r6 = "Property dateUnit is mandatory"
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L82
            r7.<init>(r6)     // Catch: java.lang.Exception -> L82
            throw r7     // Catch: java.lang.Exception -> L82
        Lbd:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r7.<init>(r1, r6)
            throw r7
        Lc3:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r7.<init>(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mU0.C44015a.c(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF414532c() {
        return this.f414525c;
    }
}
