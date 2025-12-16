package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
@s0
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f408413a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c[] f408414b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final H f408415c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final y f408416d;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness");
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.annotations");
        f408413a = cVar2;
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.rxjava3.annotations");
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.compatqual");
        String strB = cVar3.b();
        f408414b = new kotlin.reflect.jvm.internal.impl.name.c[]{new kotlin.reflect.jvm.internal.impl.name.c(strB.concat(".Nullable")), new kotlin.reflect.jvm.internal.impl.name.c(strB.concat(".NonNull"))};
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = new kotlin.reflect.jvm.internal.impl.name.c("org.jetbrains.annotations");
        y.f408417d.getClass();
        y yVar = y.f408418e;
        Q q12 = new Q(cVar5, yVar);
        Q q13 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation"), yVar);
        Q q14 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("android.support.annotation"), yVar);
        Q q15 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("android.annotation"), yVar);
        Q q16 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("com.android.annotations"), yVar);
        Q q17 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("org.eclipse.jdt.annotation"), yVar);
        Q q18 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.qual"), yVar);
        Q q19 = new Q(cVar4, yVar);
        Q q22 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation"), yVar);
        Q q23 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations"), yVar);
        Q q24 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.annotations"), yVar);
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.f407958d;
        Q q25 = new Q(cVar6, new y(reportLevel, null, null, 4, null));
        Q q26 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNonNull"), new y(reportLevel, null, null, 4, null));
        Q q27 = new Q(new kotlin.reflect.jvm.internal.impl.name.c("lombok"), yVar);
        KotlinVersion kotlinVersion = new KotlinVersion(2, 0);
        ReportLevel reportLevel2 = ReportLevel.f407959e;
        f408415c = new H(P0.g(q12, q13, q14, q15, q16, q17, q18, q19, q22, q23, q24, q25, q26, q27, new Q(cVar, new y(reportLevel, kotlinVersion, reportLevel2)), new Q(cVar2, new y(reportLevel, new KotlinVersion(2, 0), reportLevel2)), new Q(cVar3, new y(reportLevel, new KotlinVersion(1, 8), reportLevel2))));
        f408416d = new y(reportLevel, null, null, 4, null);
    }
}
