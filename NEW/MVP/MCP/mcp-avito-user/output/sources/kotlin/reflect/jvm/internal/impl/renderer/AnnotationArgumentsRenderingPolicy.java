package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes8.dex */
public final class AnnotationArgumentsRenderingPolicy {

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f409423d;

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f409424e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] f409425f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409426g;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f409427b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f409428c;

    static {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, false, false, 3, null);
        f409423d = annotationArgumentsRenderingPolicy;
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy2 = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, true, false, 2, null);
        f409424e = annotationArgumentsRenderingPolicy2;
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArr = {annotationArgumentsRenderingPolicy, annotationArgumentsRenderingPolicy2, new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true)};
        f409425f = annotationArgumentsRenderingPolicyArr;
        f409426g = kotlin.enums.c.a(annotationArgumentsRenderingPolicyArr);
    }

    public AnnotationArgumentsRenderingPolicy(String str, int i12, boolean z12, boolean z13) {
        this.f409427b = z12;
        this.f409428c = z13;
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) f409425f.clone();
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? false : z12, (i13 & 2) != 0 ? false : z13);
    }
}
