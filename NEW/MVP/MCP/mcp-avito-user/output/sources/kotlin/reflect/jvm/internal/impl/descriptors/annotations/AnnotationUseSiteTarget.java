package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.C42822w;
import v51.C49167a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes8.dex */
public final class AnnotationUseSiteTarget {

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407455c;

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407456d;

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407457e;

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407458f;

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407459g;

    /* renamed from: h, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407460h;

    /* renamed from: i, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407461i;

    /* renamed from: j, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407462j;

    /* renamed from: k, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f407463k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AnnotationUseSiteTarget[] f407464l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407465m;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f407466b;

    static {
        AnnotationUseSiteTarget annotationUseSiteTarget = new AnnotationUseSiteTarget("FIELD", 0, null, 1, null);
        f407455c = annotationUseSiteTarget;
        AnnotationUseSiteTarget annotationUseSiteTarget2 = new AnnotationUseSiteTarget("FILE", 1, null, 1, null);
        f407456d = annotationUseSiteTarget2;
        AnnotationUseSiteTarget annotationUseSiteTarget3 = new AnnotationUseSiteTarget("PROPERTY", 2, null, 1, null);
        f407457e = annotationUseSiteTarget3;
        AnnotationUseSiteTarget annotationUseSiteTarget4 = new AnnotationUseSiteTarget("PROPERTY_GETTER", 3, "get");
        f407458f = annotationUseSiteTarget4;
        AnnotationUseSiteTarget annotationUseSiteTarget5 = new AnnotationUseSiteTarget("PROPERTY_SETTER", 4, "set");
        f407459g = annotationUseSiteTarget5;
        AnnotationUseSiteTarget annotationUseSiteTarget6 = new AnnotationUseSiteTarget("RECEIVER", 5, null, 1, null);
        f407460h = annotationUseSiteTarget6;
        AnnotationUseSiteTarget annotationUseSiteTarget7 = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 6, "param");
        f407461i = annotationUseSiteTarget7;
        AnnotationUseSiteTarget annotationUseSiteTarget8 = new AnnotationUseSiteTarget("SETTER_PARAMETER", 7, "setparam");
        f407462j = annotationUseSiteTarget8;
        AnnotationUseSiteTarget annotationUseSiteTarget9 = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        f407463k = annotationUseSiteTarget9;
        AnnotationUseSiteTarget[] annotationUseSiteTargetArr = {annotationUseSiteTarget, annotationUseSiteTarget2, annotationUseSiteTarget3, annotationUseSiteTarget4, annotationUseSiteTarget5, annotationUseSiteTarget6, annotationUseSiteTarget7, annotationUseSiteTarget8, annotationUseSiteTarget9};
        f407464l = annotationUseSiteTargetArr;
        f407465m = kotlin.enums.c.a(annotationUseSiteTargetArr);
    }

    public AnnotationUseSiteTarget(String str, int i12, String str2) {
        this.f407466b = str2 == null ? C49167a.c(name()) : str2;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) f407464l.clone();
    }

    public /* synthetic */ AnnotationUseSiteTarget(String str, int i12, String str2, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? null : str2);
    }
}
