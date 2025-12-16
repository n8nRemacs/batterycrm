package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42910c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407996a = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407997b = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407998c = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407999d = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final List<AnnotationQualifierApplicabilityType> f408000e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Object f408001f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f408002g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> f408003h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f407899e;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.f407897c;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.f407898d;
        List<AnnotationQualifierApplicabilityType> listU = C42745f0.U(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.f407901g, AnnotationQualifierApplicabilityType.f407900f);
        f408000e = listU;
        kotlin.reflect.jvm.internal.impl.name.c cVar = F.f407933c;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.f408313d;
        List<AnnotationQualifierApplicabilityType> list = listU;
        Map mapG = P0.g(new Q(cVar, new t(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j(nullabilityQualifier, false, 2, null), list, false)), new Q(F.f407936f, new t(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j(nullabilityQualifier, false, 2, null), list, false)));
        f408001f = mapG;
        f408002g = P0.k(P0.g(new Q(new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.ParametersAreNullableByDefault"), new t(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j(NullabilityQualifier.f408312c, false, 2, null), Collections.singletonList(annotationQualifierApplicabilityType3), false, 4, null)), new Q(new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.ParametersAreNonnullByDefault"), new t(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j(nullabilityQualifier, false, 2, null), Collections.singletonList(annotationQualifierApplicabilityType3), false, 4, null))), mapG);
        f408003h = C42756l.l0(new kotlin.reflect.jvm.internal.impl.name.c[]{F.f407938h, F.f407939i});
    }
}
