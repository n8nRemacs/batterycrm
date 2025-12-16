package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.load.java.G;

/* compiled from: JavaTypeEnhancementState.kt */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f408422d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final z f408423e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C f408424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> f408425b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408426c;

    /* compiled from: JavaTypeEnhancementState.kt */
    public /* synthetic */ class a extends kotlin.jvm.internal.G implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f408427b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final kotlin.reflect.h getOwner() {
            return m0.f406844a.c(x.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // Y41.l
        public final ReportLevel invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = cVar;
            kotlin.reflect.jvm.internal.impl.name.c cVar3 = x.f408413a;
            G.f407948a.getClass();
            H h12 = G.a.f407950b;
            KotlinVersion kotlinVersion = new KotlinVersion(1, 7, 20);
            ReportLevel reportLevel = (ReportLevel) h12.f407952c.invoke(cVar2);
            if (reportLevel != null) {
                return reportLevel;
            }
            y yVar = (y) x.f408415c.f407952c.invoke(cVar2);
            if (yVar == null) {
                return ReportLevel.f407957c;
            }
            KotlinVersion kotlinVersion2 = yVar.f408420b;
            return (kotlinVersion2 == null || kotlinVersion2.compareTo(kotlinVersion) > 0) ? yVar.f408419a : yVar.f408421c;
        }
    }

    /* compiled from: JavaTypeEnhancementState.kt */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = x.f408413a;
        KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
        y yVar = x.f408416d;
        KotlinVersion kotlinVersion2 = yVar.f408420b;
        ReportLevel reportLevel = (kotlinVersion2 == null || kotlinVersion2.compareTo(kotlinVersion) > 0) ? yVar.f408419a : yVar.f408421c;
        f408423e = new z(new C(reportLevel, reportLevel == ReportLevel.f407958d ? null : reportLevel, null, 4, null), a.f408427b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.C r1, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.c, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f408424a = r1
            r0.f408425b = r2
            boolean r1 = r1.f407910e
            if (r1 != 0) goto L1a
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.x.f408413a
            kotlin.reflect.jvm.internal.impl.load.java.z$a r2 = (kotlin.reflect.jvm.internal.impl.load.java.z.a) r2
            java.lang.Object r1 = r2.invoke(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.f407957c
            if (r1 != r2) goto L18
            goto L1a
        L18:
            r1 = 0
            goto L1b
        L1a:
            r1 = 1
        L1b:
            r0.f408426c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.z.<init>(kotlin.reflect.jvm.internal.impl.load.java.C, Y41.l):void");
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaTypeEnhancementState(jsr305=");
        sb2.append(this.f408424a);
        sb2.append(", getReportLevelForAnnotation=");
        return androidx.compose.foundation.H.l(sb2, this.f408425b, ')');
    }
}
