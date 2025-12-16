package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnnotationQualifierApplicabilityType.kt */
/* loaded from: classes8.dex */
public final class AnnotationQualifierApplicabilityType {

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f407897c;

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f407898d;

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f407899e;

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f407900f;

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f407901g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AnnotationQualifierApplicabilityType[] f407902h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407903i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f407904b;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
        f407897c = annotationQualifierApplicabilityType;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
        f407898d = annotationQualifierApplicabilityType2;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
        f407899e = annotationQualifierApplicabilityType3;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType4 = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
        f407900f = annotationQualifierApplicabilityType4;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType5 = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        f407901g = annotationQualifierApplicabilityType5;
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArr = {annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, annotationQualifierApplicabilityType4, annotationQualifierApplicabilityType5, new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
        f407902h = annotationQualifierApplicabilityTypeArr;
        f407903i = kotlin.enums.c.a(annotationQualifierApplicabilityTypeArr);
    }

    public AnnotationQualifierApplicabilityType(String str, int i12, String str2) {
        this.f407904b = str2;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) f407902h.clone();
    }
}
