package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.reflect.jvm.internal.impl.builtins.n;

/* compiled from: JvmAnnotationNames.kt */
/* loaded from: classes8.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407933c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407934d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407935e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407936f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final List<kotlin.reflect.jvm.internal.impl.name.c> f407937g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407938h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407939i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final List<kotlin.reflect.jvm.internal.impl.name.c> f407940j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407941k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407942l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407943m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407944n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> f407945o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> f407946p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Object f407947q;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness.Nullable");
        f407931a = cVar;
        f407932b = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness.NullnessUnspecified");
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness.NullMarked");
        f407933c = cVar2;
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.annotations.Nullable");
        f407934d = cVar3;
        f407935e = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.annotations.NullnessUnspecified");
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.annotations.NullMarked");
        f407936f = cVar4;
        List<kotlin.reflect.jvm.internal.impl.name.c> listU = C42745f0.U(E.f407922i, new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("android.support.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("android.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("com.android.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("org.eclipse.jdt.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.qual.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.rxjava3.annotations.Nullable"));
        f407937g = listU;
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.Nonnull");
        f407938h = cVar5;
        f407939i = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.CheckForNull");
        List<kotlin.reflect.jvm.internal.impl.name.c> listU2 = C42745f0.U(E.f407921h, new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("android.support.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("android.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("com.android.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("org.eclipse.jdt.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.qual.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("lombok.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.rxjava3.annotations.NonNull"));
        f407940j = listU2;
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        f407941k = cVar6;
        kotlin.reflect.jvm.internal.impl.name.c cVar7 = new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f407942l = cVar7;
        kotlin.reflect.jvm.internal.impl.name.c cVar8 = new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNullable");
        f407943m = cVar8;
        kotlin.reflect.jvm.internal.impl.name.c cVar9 = new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNonNull");
        f407944n = cVar9;
        b1.i(b1.i(b1.i(b1.i(b1.i(b1.i(b1.i(b1.i(b1.h(b1.i(b1.h(new LinkedHashSet(), listU), cVar5), listU2), cVar6), cVar7), cVar8), cVar9), cVar), cVar2), cVar3), cVar4);
        f407945o = C42756l.l0(new kotlin.reflect.jvm.internal.impl.name.c[]{E.f407924k, E.f407925l});
        f407946p = C42756l.l0(new kotlin.reflect.jvm.internal.impl.name.c[]{E.f407923j, E.f407926m});
        f407947q = P0.g(new Q(E.f407916c, n.a.f407395u), new Q(E.f407917d, n.a.f407398x), new Q(E.f407918e, n.a.f407388n), new Q(E.f407919f, n.a.f407399y));
    }
}
