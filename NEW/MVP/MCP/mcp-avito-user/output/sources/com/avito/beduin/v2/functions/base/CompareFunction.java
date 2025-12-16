package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import kotlin.Metadata;

/* compiled from: CompareFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/functions/base/CompareFunction;", "LcU0/a;", "<init>", "()V", "ClauseType", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompareFunction extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final CompareFunction f336941a = new CompareFunction();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336942b = "Compare";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CompareFunction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/functions/base/CompareFunction$ClauseType;", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClauseType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ClauseType[] f336943b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f336944c;

        static {
            ClauseType[] clauseTypeArr = {new ClauseType("Less", 0), new ClauseType("LessOrEquals", 1), new ClauseType("Equals", 2), new ClauseType("MoreOrEquals", 3), new ClauseType("More", 4)};
            f336943b = clauseTypeArr;
            f336944c = kotlin.enums.c.a(clauseTypeArr);
        }

        public ClauseType() {
            throw null;
        }

        public static ClauseType valueOf(String str) {
            return (ClauseType) Enum.valueOf(ClauseType.class, str);
        }

        public static ClauseType[] values() {
            return (ClauseType[]) f336943b.clone();
        }
    }

    /* compiled from: CompareFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ClauseType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClauseType[] clauseTypeArr = ClauseType.f336943b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ClauseType[] clauseTypeArr2 = ClauseType.f336943b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ClauseType[] clauseTypeArr3 = ClauseType.f336943b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ClauseType[] clauseTypeArr4 = ClauseType.f336943b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z r7, @Y61.k com.avito.beduin.v2.engine.field.j r8, @Y61.k com.avito.beduin.v2.engine.field.m r9) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r6 = this;
            java.lang.String r8 = "clause"
            com.avito.beduin.v2.engine.field.d r0 = r9.c(r8)     // Catch: java.lang.Exception -> L14
            r1 = 0
            if (r0 == 0) goto L16
            com.avito.beduin.v2.engine.field.entity.v r0 = r0.q(r7)     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.getF336843b()     // Catch: java.lang.Exception -> L14
            goto L16
        L14:
            r7 = move-exception
            goto L68
        L16:
            if (r1 == 0) goto L60
            com.avito.beduin.v2.functions.base.CompareFunction$ClauseType r8 = com.avito.beduin.v2.functions.base.CompareFunction.ClauseType.valueOf(r1)     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = "value1"
            long r0 = r9.j(r7, r0)
            java.lang.String r2 = "value2"
            long r2 = r9.j(r7, r2)
            int r8 = r8.ordinal()
            r9 = 0
            r4 = 1
            if (r8 == 0) goto L56
            if (r8 == r4) goto L51
            r5 = 2
            if (r8 == r5) goto L4c
            r5 = 3
            if (r8 == r5) goto L47
            r5 = 4
            if (r8 != r5) goto L41
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L5b
        L3f:
            r9 = r4
            goto L5b
        L41:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L47:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L5b
            goto L3f
        L4c:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L5b
            goto L3f
        L51:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 > 0) goto L5b
            goto L3f
        L56:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L5b
            goto L3f
        L5b:
            com.avito.beduin.v2.engine.field.entity.v r7 = com.avito.beduin.v2.engine.C36273j.f(r7, r9)
            return r7
        L60:
            java.lang.String r7 = "Property clause is mandatory"
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L14
            r9.<init>(r7)     // Catch: java.lang.Exception -> L14
            throw r9     // Catch: java.lang.Exception -> L14
        L68:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r9 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r9.<init>(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.functions.base.CompareFunction.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f336942b;
    }
}
