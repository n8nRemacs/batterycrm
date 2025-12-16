package mU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.functions.datetime.model.DateUnit;
import com.avito.beduin.v2.functions.datetime.model.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocalDateTimeMinusFunction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmU0/d;", "LcU0/a;", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RT0.e f414530a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RT0.e f414531b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414532c = "LocalDateTimeMinus";

    /* compiled from: LocalDateTimeMinusFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
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

    public d(@k RT0.e eVar, @k RT0.e eVar2) {
        this.f414530a = eVar;
        this.f414531b = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z r7, @Y61.k com.avito.beduin.v2.engine.field.j r8, @Y61.k com.avito.beduin.v2.engine.field.m r9) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r6 = this;
            java.lang.String r8 = "value"
            java.lang.String r8 = r9.l(r7, r8)
            java.lang.String r0 = "minus"
            long r0 = r9.j(r7, r0)
            java.lang.String r2 = "timeUnit"
            com.avito.beduin.v2.engine.field.d r3 = r9.c(r2)     // Catch: java.lang.Exception -> L20
            r4 = 0
            if (r3 == 0) goto L2b
            com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r7)     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L23
            java.lang.String r3 = r3.getF336843b()     // Catch: java.lang.Exception -> L20
            goto L24
        L20:
            r7 = move-exception
            goto Ld3
        L23:
            r3 = r4
        L24:
            if (r3 == 0) goto L2b
            com.avito.beduin.v2.functions.datetime.model.TimeUnit r2 = com.avito.beduin.v2.functions.datetime.model.TimeUnit.valueOf(r3)     // Catch: java.lang.Exception -> L20
            goto L2c
        L2b:
            r2 = r4
        L2c:
            ST0.f r3 = new ST0.f
            r3.<init>(r8)
            r8 = 2
            r5 = 1
            if (r2 == 0) goto L74
            int r9 = r2.ordinal()
            RT0.e r2 = r6.f414530a
            if (r9 == 0) goto L65
            if (r9 == r5) goto L5c
            if (r9 == r8) goto L53
            r8 = 3
            if (r9 != r8) goto L4d
            RT0.g r8 = r2.f14450b
            ST0.h r8 = r8.G(r3, r0)
            ST0.f r8 = (ST0.f) r8
            goto L6d
        L4d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L53:
            RT0.g r8 = r2.f14450b
            ST0.h r8 = r8.z(r3, r0)
            ST0.f r8 = (ST0.f) r8
            goto L6d
        L5c:
            RT0.g r8 = r2.f14450b
            ST0.h r8 = r8.t(r3, r0)
            ST0.f r8 = (ST0.f) r8
            goto L6d
        L65:
            RT0.g r8 = r2.f14450b
            ST0.h r8 = r8.H(r3, r0)
            ST0.f r8 = (ST0.f) r8
        L6d:
            java.lang.String r8 = r8.f14991a
            com.avito.beduin.v2.engine.field.entity.v r7 = com.avito.beduin.v2.engine.C36273j.e(r7, r8)
            goto Lc4
        L74:
            java.lang.String r2 = "dateUnit"
            com.avito.beduin.v2.engine.field.d r9 = r9.c(r2)     // Catch: java.lang.Exception -> L87
            if (r9 == 0) goto L89
            com.avito.beduin.v2.engine.field.entity.v r9 = r9.q(r7)     // Catch: java.lang.Exception -> L87
            if (r9 == 0) goto L89
            java.lang.String r4 = r9.getF336843b()     // Catch: java.lang.Exception -> L87
            goto L89
        L87:
            r7 = move-exception
            goto Lcd
        L89:
            if (r4 == 0) goto Lc5
            com.avito.beduin.v2.functions.datetime.model.DateUnit r9 = com.avito.beduin.v2.functions.datetime.model.DateUnit.valueOf(r4)     // Catch: java.lang.Exception -> L87
            int r9 = r9.ordinal()
            RT0.e r2 = r6.f414531b
            if (r9 == 0) goto Lb5
            if (r9 == r5) goto Lab
            if (r9 != r8) goto La5
            int r8 = (int) r0
            RT0.c r9 = r2.f14451c
            ST0.a r8 = r9.s(r3, r8)
            ST0.f r8 = (ST0.f) r8
            goto Lbe
        La5:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lab:
            int r8 = (int) r0
            RT0.c r9 = r2.f14451c
            ST0.a r8 = r9.x(r3, r8)
            ST0.f r8 = (ST0.f) r8
            goto Lbe
        Lb5:
            int r8 = (int) r0
            RT0.c r9 = r2.f14451c
            ST0.a r8 = r9.F(r3, r8)
            ST0.f r8 = (ST0.f) r8
        Lbe:
            java.lang.String r8 = r8.f14991a
            com.avito.beduin.v2.engine.field.entity.v r7 = com.avito.beduin.v2.engine.C36273j.e(r7, r8)
        Lc4:
            return r7
        Lc5:
            java.lang.String r7 = "Property dateUnit is mandatory"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L87
            r8.<init>(r7)     // Catch: java.lang.Exception -> L87
            throw r8     // Catch: java.lang.Exception -> L87
        Lcd:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r8 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r8.<init>(r2, r7)
            throw r8
        Ld3:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r8 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r8.<init>(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mU0.d.c(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType, reason: from getter */
    public final String getF414537c() {
        return this.f414532c;
    }
}
