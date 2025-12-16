package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KotlinTarget.kt */
@s0
/* loaded from: classes8.dex */
public final class KotlinTarget {

    /* renamed from: A, reason: collision with root package name */
    public static final KotlinTarget f407472A;

    /* renamed from: B, reason: collision with root package name */
    public static final KotlinTarget f407473B;

    /* renamed from: C, reason: collision with root package name */
    public static final KotlinTarget f407474C;

    /* renamed from: D, reason: collision with root package name */
    public static final KotlinTarget f407475D;

    /* renamed from: E, reason: collision with root package name */
    public static final KotlinTarget f407476E;

    /* renamed from: F, reason: collision with root package name */
    public static final KotlinTarget f407477F;

    /* renamed from: G, reason: collision with root package name */
    public static final KotlinTarget f407478G;

    /* renamed from: H, reason: collision with root package name */
    public static final KotlinTarget f407479H;

    /* renamed from: I, reason: collision with root package name */
    public static final KotlinTarget f407480I;

    /* renamed from: J, reason: collision with root package name */
    public static final KotlinTarget f407481J;

    /* renamed from: K, reason: collision with root package name */
    public static final KotlinTarget f407482K;

    /* renamed from: L, reason: collision with root package name */
    public static final KotlinTarget f407483L;

    /* renamed from: M, reason: collision with root package name */
    public static final KotlinTarget f407484M;

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ KotlinTarget[] f407485N;

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407486O;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final HashMap<String, KotlinTarget> f407487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Set<KotlinTarget> f407488d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Set<KotlinTarget> f407489e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407490f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407491g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407492h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407493i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407494j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407495k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407496l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407497m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407498n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407499o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407500p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final List<KotlinTarget> f407501q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Object f407502r;

    /* renamed from: s, reason: collision with root package name */
    public static final KotlinTarget f407503s;

    /* renamed from: t, reason: collision with root package name */
    public static final KotlinTarget f407504t;

    /* renamed from: u, reason: collision with root package name */
    public static final KotlinTarget f407505u;

    /* renamed from: v, reason: collision with root package name */
    public static final KotlinTarget f407506v;

    /* renamed from: w, reason: collision with root package name */
    public static final KotlinTarget f407507w;

    /* renamed from: x, reason: collision with root package name */
    public static final KotlinTarget f407508x;

    /* renamed from: y, reason: collision with root package name */
    public static final KotlinTarget f407509y;

    /* renamed from: z, reason: collision with root package name */
    public static final KotlinTarget f407510z;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f407511b;

    /* compiled from: KotlinTarget.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        KotlinTarget kotlinTarget = new KotlinTarget("CLASS", 0, "class", false, 2, null);
        f407503s = kotlinTarget;
        boolean z12 = false;
        int i12 = 2;
        C42822w c42822w = null;
        KotlinTarget kotlinTarget2 = new KotlinTarget("ANNOTATION_CLASS", 1, "annotation class", z12, i12, c42822w);
        f407504t = kotlinTarget2;
        KotlinTarget kotlinTarget3 = new KotlinTarget("TYPE_PARAMETER", 2, false);
        f407505u = kotlinTarget3;
        KotlinTarget kotlinTarget4 = new KotlinTarget("PROPERTY", 3, "property", z12, i12, c42822w);
        f407506v = kotlinTarget4;
        boolean z13 = false;
        int i13 = 2;
        C42822w c42822w2 = null;
        KotlinTarget kotlinTarget5 = new KotlinTarget("FIELD", 4, "field", z13, i13, c42822w2);
        f407507w = kotlinTarget5;
        KotlinTarget kotlinTarget6 = new KotlinTarget("LOCAL_VARIABLE", 5, "local variable", z12, i12, c42822w);
        f407508x = kotlinTarget6;
        KotlinTarget kotlinTarget7 = new KotlinTarget("VALUE_PARAMETER", 6, "value parameter", z13, i13, c42822w2);
        f407509y = kotlinTarget7;
        KotlinTarget kotlinTarget8 = new KotlinTarget("CONSTRUCTOR", 7, "constructor", z12, i12, c42822w);
        f407510z = kotlinTarget8;
        boolean z14 = false;
        int i14 = 2;
        C42822w c42822w3 = null;
        KotlinTarget kotlinTarget9 = new KotlinTarget("FUNCTION", 8, "function", z14, i14, c42822w3);
        f407472A = kotlinTarget9;
        KotlinTarget kotlinTarget10 = new KotlinTarget("PROPERTY_GETTER", 9, "getter", false, 2, null);
        f407473B = kotlinTarget10;
        KotlinTarget kotlinTarget11 = new KotlinTarget("PROPERTY_SETTER", 10, "setter", z14, i14, c42822w3);
        f407474C = kotlinTarget11;
        KotlinTarget kotlinTarget12 = new KotlinTarget(CredentialProviderBaseController.TYPE_TAG, 11, false);
        f407475D = kotlinTarget12;
        KotlinTarget kotlinTarget13 = new KotlinTarget("EXPRESSION", 12, false);
        KotlinTarget kotlinTarget14 = new KotlinTarget("FILE", 13, false);
        f407476E = kotlinTarget14;
        KotlinTarget kotlinTarget15 = new KotlinTarget("TYPEALIAS", 14, false);
        KotlinTarget kotlinTarget16 = new KotlinTarget("TYPE_PROJECTION", 15, false);
        KotlinTarget kotlinTarget17 = new KotlinTarget("STAR_PROJECTION", 16, false);
        KotlinTarget kotlinTarget18 = new KotlinTarget("PROPERTY_PARAMETER", 17, false);
        KotlinTarget kotlinTarget19 = new KotlinTarget("CLASS_ONLY", 18, false);
        f407477F = kotlinTarget19;
        KotlinTarget kotlinTarget20 = new KotlinTarget("OBJECT", 19, false);
        f407478G = kotlinTarget20;
        KotlinTarget kotlinTarget21 = new KotlinTarget("STANDALONE_OBJECT", 20, false);
        f407479H = kotlinTarget21;
        KotlinTarget kotlinTarget22 = new KotlinTarget("COMPANION_OBJECT", 21, false);
        f407480I = kotlinTarget22;
        KotlinTarget kotlinTarget23 = new KotlinTarget("INTERFACE", 22, false);
        f407481J = kotlinTarget23;
        KotlinTarget kotlinTarget24 = new KotlinTarget("ENUM_CLASS", 23, false);
        f407482K = kotlinTarget24;
        KotlinTarget kotlinTarget25 = new KotlinTarget("ENUM_ENTRY", 24, false);
        f407483L = kotlinTarget25;
        KotlinTarget kotlinTarget26 = new KotlinTarget("LOCAL_CLASS", 25, false);
        f407484M = kotlinTarget26;
        KotlinTarget[] kotlinTargetArr = {kotlinTarget, kotlinTarget2, kotlinTarget3, kotlinTarget4, kotlinTarget5, kotlinTarget6, kotlinTarget7, kotlinTarget8, kotlinTarget9, kotlinTarget10, kotlinTarget11, kotlinTarget12, kotlinTarget13, kotlinTarget14, kotlinTarget15, kotlinTarget16, kotlinTarget17, kotlinTarget18, kotlinTarget19, kotlinTarget20, kotlinTarget21, kotlinTarget22, kotlinTarget23, kotlinTarget24, kotlinTarget25, kotlinTarget26, new KotlinTarget("LOCAL_FUNCTION", 26, false), new KotlinTarget("MEMBER_FUNCTION", 27, false), new KotlinTarget("TOP_LEVEL_FUNCTION", 28, false), new KotlinTarget("MEMBER_PROPERTY", 29, false), new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false), new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, false), new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, false), new KotlinTarget("TOP_LEVEL_PROPERTY", 33, false), new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false), new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false), new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false), new KotlinTarget("BACKING_FIELD", 37, "backing field", false, 2, null), new KotlinTarget("INITIALIZER", 38, false), new KotlinTarget("DESTRUCTURING_DECLARATION", 39, false), new KotlinTarget("LAMBDA_EXPRESSION", 40, false), new KotlinTarget("ANONYMOUS_FUNCTION", 41, false), new KotlinTarget("OBJECT_LITERAL", 42, false)};
        f407485N = kotlinTargetArr;
        f407486O = kotlin.enums.c.a(kotlinTargetArr);
        new a(null);
        f407487c = new HashMap<>();
        for (KotlinTarget kotlinTarget27 : values()) {
            f407487c.put(kotlinTarget27.name(), kotlinTarget27);
        }
        KotlinTarget[] kotlinTargetArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget28 : kotlinTargetArrValues) {
            if (kotlinTarget28.f407511b) {
                arrayList.add(kotlinTarget28);
            }
        }
        f407488d = C42745f0.P0(arrayList);
        f407489e = C42756l.l0(values());
        KotlinTarget kotlinTarget29 = f407504t;
        KotlinTarget kotlinTarget30 = f407503s;
        f407490f = C42745f0.U(kotlinTarget29, kotlinTarget30);
        f407491g = C42745f0.U(f407484M, kotlinTarget30);
        f407492h = C42745f0.U(f407477F, kotlinTarget30);
        KotlinTarget kotlinTarget31 = f407480I;
        KotlinTarget kotlinTarget32 = f407478G;
        f407493i = C42745f0.U(kotlinTarget31, kotlinTarget32, kotlinTarget30);
        f407494j = C42745f0.U(f407479H, kotlinTarget32, kotlinTarget30);
        f407495k = C42745f0.U(f407481J, kotlinTarget30);
        f407496l = C42745f0.U(f407482K, kotlinTarget30);
        KotlinTarget kotlinTarget33 = f407483L;
        KotlinTarget kotlinTarget34 = f407506v;
        KotlinTarget kotlinTarget35 = f407507w;
        f407497m = C42745f0.U(kotlinTarget33, kotlinTarget34, kotlinTarget35);
        KotlinTarget kotlinTarget36 = f407474C;
        f407498n = Collections.singletonList(kotlinTarget36);
        KotlinTarget kotlinTarget37 = f407473B;
        f407499o = Collections.singletonList(kotlinTarget37);
        f407500p = Collections.singletonList(f407472A);
        KotlinTarget kotlinTarget38 = f407476E;
        f407501q = Collections.singletonList(kotlinTarget38);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.f407461i;
        KotlinTarget kotlinTarget39 = f407509y;
        f407502r = P0.g(new Q(annotationUseSiteTarget, kotlinTarget39), new Q(AnnotationUseSiteTarget.f407455c, kotlinTarget35), new Q(AnnotationUseSiteTarget.f407457e, kotlinTarget34), new Q(AnnotationUseSiteTarget.f407456d, kotlinTarget38), new Q(AnnotationUseSiteTarget.f407458f, kotlinTarget37), new Q(AnnotationUseSiteTarget.f407459g, kotlinTarget36), new Q(AnnotationUseSiteTarget.f407460h, kotlinTarget39), new Q(AnnotationUseSiteTarget.f407462j, kotlinTarget39), new Q(AnnotationUseSiteTarget.f407463k, kotlinTarget35));
    }

    public /* synthetic */ KotlinTarget(String str, int i12, String str2, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 2) != 0 ? true : z12);
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) f407485N.clone();
    }

    public KotlinTarget(String str, int i12, boolean z12) {
        this.f407511b = z12;
    }
}
