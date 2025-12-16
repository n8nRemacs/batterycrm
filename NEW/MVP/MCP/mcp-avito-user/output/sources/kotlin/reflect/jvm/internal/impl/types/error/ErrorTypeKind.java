package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorTypeKind.kt */
/* loaded from: classes8.dex */
public final class ErrorTypeKind {

    /* renamed from: A, reason: collision with root package name */
    public static final ErrorTypeKind f410144A;

    /* renamed from: B, reason: collision with root package name */
    public static final ErrorTypeKind f410145B;

    /* renamed from: C, reason: collision with root package name */
    public static final ErrorTypeKind f410146C;

    /* renamed from: D, reason: collision with root package name */
    public static final ErrorTypeKind f410147D;

    /* renamed from: E, reason: collision with root package name */
    public static final ErrorTypeKind f410148E;

    /* renamed from: F, reason: collision with root package name */
    public static final ErrorTypeKind f410149F;

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ ErrorTypeKind[] f410150G;

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410151H;

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorTypeKind f410152d;

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorTypeKind f410153e;

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorTypeKind f410154f;

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorTypeKind f410155g;

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorTypeKind f410156h;

    /* renamed from: i, reason: collision with root package name */
    public static final ErrorTypeKind f410157i;

    /* renamed from: j, reason: collision with root package name */
    public static final ErrorTypeKind f410158j;

    /* renamed from: k, reason: collision with root package name */
    public static final ErrorTypeKind f410159k;

    /* renamed from: l, reason: collision with root package name */
    public static final ErrorTypeKind f410160l;

    /* renamed from: m, reason: collision with root package name */
    public static final ErrorTypeKind f410161m;

    /* renamed from: n, reason: collision with root package name */
    public static final ErrorTypeKind f410162n;

    /* renamed from: o, reason: collision with root package name */
    public static final ErrorTypeKind f410163o;

    /* renamed from: p, reason: collision with root package name */
    public static final ErrorTypeKind f410164p;

    /* renamed from: q, reason: collision with root package name */
    public static final ErrorTypeKind f410165q;

    /* renamed from: r, reason: collision with root package name */
    public static final ErrorTypeKind f410166r;

    /* renamed from: s, reason: collision with root package name */
    public static final ErrorTypeKind f410167s;

    /* renamed from: t, reason: collision with root package name */
    public static final ErrorTypeKind f410168t;

    /* renamed from: u, reason: collision with root package name */
    public static final ErrorTypeKind f410169u;

    /* renamed from: v, reason: collision with root package name */
    public static final ErrorTypeKind f410170v;

    /* renamed from: w, reason: collision with root package name */
    public static final ErrorTypeKind f410171w;

    /* renamed from: x, reason: collision with root package name */
    public static final ErrorTypeKind f410172x;

    /* renamed from: y, reason: collision with root package name */
    public static final ErrorTypeKind f410173y;

    /* renamed from: z, reason: collision with root package name */
    public static final ErrorTypeKind f410174z;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f410175b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410176c;

    static {
        ErrorTypeKind errorTypeKind = new ErrorTypeKind(0, "UNRESOLVED_TYPE", "Unresolved type for %s", true);
        ErrorTypeKind errorTypeKind2 = new ErrorTypeKind(1, "UNRESOLVED_TYPE_PARAMETER_TYPE", "Unresolved type parameter type", true);
        ErrorTypeKind errorTypeKind3 = new ErrorTypeKind(2, "UNRESOLVED_CLASS_TYPE", "Unresolved class %s", true);
        ErrorTypeKind errorTypeKind4 = new ErrorTypeKind(3, "UNRESOLVED_JAVA_CLASS", "Unresolved java class %s", true);
        f410152d = errorTypeKind4;
        ErrorTypeKind errorTypeKind5 = new ErrorTypeKind(4, "UNRESOLVED_DECLARATION", "Unresolved declaration %s", true);
        ErrorTypeKind errorTypeKind6 = new ErrorTypeKind(5, "UNRESOLVED_KCLASS_CONSTANT_VALUE", "Unresolved type for %s (arrayDimensions=%s)", true);
        f410153e = errorTypeKind6;
        ErrorTypeKind errorTypeKind7 = new ErrorTypeKind("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);
        boolean z12 = false;
        int i12 = 2;
        C42822w c42822w = null;
        ErrorTypeKind errorTypeKind8 = new ErrorTypeKind("RETURN_TYPE", 7, "Return type for %s cannot be resolved", z12, i12, c42822w);
        ErrorTypeKind errorTypeKind9 = new ErrorTypeKind("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);
        f410154f = errorTypeKind9;
        ErrorTypeKind errorTypeKind10 = new ErrorTypeKind("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", z12, i12, c42822w);
        boolean z13 = false;
        int i13 = 2;
        C42822w c42822w2 = null;
        ErrorTypeKind errorTypeKind11 = new ErrorTypeKind("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", z13, i13, c42822w2);
        ErrorTypeKind errorTypeKind12 = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", z12, i12, c42822w);
        ErrorTypeKind errorTypeKind13 = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", z13, i13, c42822w2);
        ErrorTypeKind errorTypeKind14 = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", z12, i12, c42822w);
        ErrorTypeKind errorTypeKind15 = new ErrorTypeKind("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", z13, i13, c42822w2);
        ErrorTypeKind errorTypeKind16 = new ErrorTypeKind("RECURSIVE_TYPE", 15, "Recursive type", z12, i12, c42822w);
        ErrorTypeKind errorTypeKind17 = new ErrorTypeKind("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", z13, i13, c42822w2);
        f410155g = errorTypeKind17;
        ErrorTypeKind errorTypeKind18 = new ErrorTypeKind("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);
        boolean z14 = false;
        int i14 = 2;
        C42822w c42822w3 = null;
        ErrorTypeKind errorTypeKind19 = new ErrorTypeKind("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", z14, i14, c42822w3);
        f410156h = errorTypeKind19;
        boolean z15 = false;
        int i15 = 2;
        C42822w c42822w4 = null;
        ErrorTypeKind errorTypeKind20 = new ErrorTypeKind("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", z15, i15, c42822w4);
        f410157i = errorTypeKind20;
        ErrorTypeKind errorTypeKind21 = new ErrorTypeKind("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", z14, i14, c42822w3);
        ErrorTypeKind errorTypeKind22 = new ErrorTypeKind("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", z15, i15, c42822w4);
        f410158j = errorTypeKind22;
        ErrorTypeKind errorTypeKind23 = new ErrorTypeKind("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", z14, i14, c42822w3);
        f410159k = errorTypeKind23;
        ErrorTypeKind errorTypeKind24 = new ErrorTypeKind("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", z15, i15, c42822w4);
        ErrorTypeKind errorTypeKind25 = new ErrorTypeKind("ERROR_EXPECTED_TYPE", 24, "Error expected type", z14, i14, c42822w3);
        ErrorTypeKind errorTypeKind26 = new ErrorTypeKind("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", z15, i15, c42822w4);
        ErrorTypeKind errorTypeKind27 = new ErrorTypeKind("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
        boolean z16 = false;
        int i16 = 2;
        C42822w c42822w5 = null;
        ErrorTypeKind errorTypeKind28 = new ErrorTypeKind("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", z16, i16, c42822w5);
        f410160l = errorTypeKind28;
        boolean z17 = false;
        int i17 = 2;
        C42822w c42822w6 = null;
        ErrorTypeKind errorTypeKind29 = new ErrorTypeKind("DONT_CARE", 28, "Special DONT_CARE type", z17, i17, c42822w6);
        f410161m = errorTypeKind29;
        ErrorTypeKind errorTypeKind30 = new ErrorTypeKind("STUB_TYPE", 29, "Stub type %s", z16, i16, c42822w5);
        ErrorTypeKind errorTypeKind31 = new ErrorTypeKind("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", z17, i17, c42822w6);
        ErrorTypeKind errorTypeKind32 = new ErrorTypeKind("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", z16, i16, c42822w5);
        ErrorTypeKind errorTypeKind33 = new ErrorTypeKind("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", z17, i17, c42822w6);
        ErrorTypeKind errorTypeKind34 = new ErrorTypeKind("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", z16, i16, c42822w5);
        f410162n = errorTypeKind34;
        ErrorTypeKind errorTypeKind35 = new ErrorTypeKind("ERROR_RAW_TYPE", 34, "Error raw type %s", z17, i17, c42822w6);
        f410163o = errorTypeKind35;
        ErrorTypeKind errorTypeKind36 = new ErrorTypeKind("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
        boolean z18 = false;
        int i18 = 2;
        C42822w c42822w7 = null;
        ErrorTypeKind errorTypeKind37 = new ErrorTypeKind("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", z18, i18, c42822w7);
        boolean z19 = false;
        int i19 = 2;
        C42822w c42822w8 = null;
        ErrorTypeKind errorTypeKind38 = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", z19, i19, c42822w8);
        f410164p = errorTypeKind38;
        ErrorTypeKind errorTypeKind39 = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", z18, i18, c42822w7);
        f410165q = errorTypeKind39;
        ErrorTypeKind errorTypeKind40 = new ErrorTypeKind("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", z19, i19, c42822w8);
        f410166r = errorTypeKind40;
        ErrorTypeKind errorTypeKind41 = new ErrorTypeKind("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", z18, i18, c42822w7);
        ErrorTypeKind errorTypeKind42 = new ErrorTypeKind("UNKNOWN_TYPE", 41, "Unknown type", z19, i19, c42822w8);
        f410167s = errorTypeKind42;
        ErrorTypeKind errorTypeKind43 = new ErrorTypeKind("NO_TYPE_SPECIFIED", 42, "No type specified for %s", z18, i18, c42822w7);
        ErrorTypeKind errorTypeKind44 = new ErrorTypeKind("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", z19, i19, c42822w8);
        ErrorTypeKind errorTypeKind45 = new ErrorTypeKind("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", false, 2, null);
        boolean z22 = false;
        int i22 = 2;
        C42822w c42822w9 = null;
        ErrorTypeKind errorTypeKind46 = new ErrorTypeKind("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", z22, i22, c42822w9);
        boolean z23 = false;
        int i23 = 2;
        C42822w c42822w10 = null;
        ErrorTypeKind errorTypeKind47 = new ErrorTypeKind("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", z23, i23, c42822w10);
        f410168t = errorTypeKind47;
        ErrorTypeKind errorTypeKind48 = new ErrorTypeKind("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", z22, i22, c42822w9);
        ErrorTypeKind errorTypeKind49 = new ErrorTypeKind("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", z23, i23, c42822w10);
        ErrorTypeKind errorTypeKind50 = new ErrorTypeKind("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", z22, i22, c42822w9);
        ErrorTypeKind errorTypeKind51 = new ErrorTypeKind("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", z23, i23, c42822w10);
        ErrorTypeKind errorTypeKind52 = new ErrorTypeKind("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", z22, i22, c42822w9);
        ErrorTypeKind errorTypeKind53 = new ErrorTypeKind("RETURN_NOT_ALLOWED", 52, "Return not allowed", z23, i23, c42822w10);
        ErrorTypeKind errorTypeKind54 = new ErrorTypeKind(53, "UNRESOLVED_PARCEL_TYPE", "Unresolved 'Parcel' type", true);
        ErrorTypeKind errorTypeKind55 = new ErrorTypeKind("KAPT_ERROR_TYPE", 54, "Kapt error type", false, 2, null);
        ErrorTypeKind errorTypeKind56 = new ErrorTypeKind("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", false, 2, null);
        ErrorTypeKind errorTypeKind57 = new ErrorTypeKind("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", false, 2, null);
        boolean z24 = false;
        int i24 = 2;
        C42822w c42822w11 = null;
        ErrorTypeKind errorTypeKind58 = new ErrorTypeKind("ERROR_EXPRESSION_TYPE", 57, "Error expression type", z24, i24, c42822w11);
        boolean z25 = false;
        int i25 = 2;
        C42822w c42822w12 = null;
        ErrorTypeKind errorTypeKind59 = new ErrorTypeKind("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", z25, i25, c42822w12);
        ErrorTypeKind errorTypeKind60 = new ErrorTypeKind("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", z24, i24, c42822w11);
        f410169u = errorTypeKind60;
        ErrorTypeKind errorTypeKind61 = new ErrorTypeKind("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", z25, i25, c42822w12);
        ErrorTypeKind errorTypeKind62 = new ErrorTypeKind("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", z24, i24, c42822w11);
        ErrorTypeKind errorTypeKind63 = new ErrorTypeKind("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", z25, i25, c42822w12);
        ErrorTypeKind errorTypeKind64 = new ErrorTypeKind("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", z24, i24, c42822w11);
        ErrorTypeKind errorTypeKind65 = new ErrorTypeKind("ERROR_TYPE_PARAMETER", 64, "Error type parameter", z25, i25, c42822w12);
        ErrorTypeKind errorTypeKind66 = new ErrorTypeKind("ERROR_TYPE_PROJECTION", 65, "Error type projection", false, 2, null);
        boolean z26 = false;
        int i26 = 2;
        C42822w c42822w13 = null;
        ErrorTypeKind errorTypeKind67 = new ErrorTypeKind("ERROR_SUPER_TYPE", 66, "Error super type", z26, i26, c42822w13);
        boolean z27 = false;
        int i27 = 2;
        C42822w c42822w14 = null;
        ErrorTypeKind errorTypeKind68 = new ErrorTypeKind("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", z27, i27, c42822w14);
        ErrorTypeKind errorTypeKind69 = new ErrorTypeKind("ERROR_PROPERTY_TYPE", 68, "Error property type", z26, i26, c42822w13);
        f410170v = errorTypeKind69;
        ErrorTypeKind errorTypeKind70 = new ErrorTypeKind("ERROR_CLASS", 69, "Error class", z27, i27, c42822w14);
        f410171w = errorTypeKind70;
        ErrorTypeKind errorTypeKind71 = new ErrorTypeKind("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", z26, i26, c42822w13);
        f410172x = errorTypeKind71;
        ErrorTypeKind errorTypeKind72 = new ErrorTypeKind("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", z27, i27, c42822w14);
        f410173y = errorTypeKind72;
        ErrorTypeKind errorTypeKind73 = new ErrorTypeKind("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", z26, i26, c42822w13);
        f410174z = errorTypeKind73;
        ErrorTypeKind errorTypeKind74 = new ErrorTypeKind("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", z27, i27, c42822w14);
        f410144A = errorTypeKind74;
        ErrorTypeKind errorTypeKind75 = new ErrorTypeKind("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
        f410145B = errorTypeKind75;
        boolean z28 = false;
        int i28 = 2;
        C42822w c42822w15 = null;
        ErrorTypeKind errorTypeKind76 = new ErrorTypeKind("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", z28, i28, c42822w15);
        f410146C = errorTypeKind76;
        boolean z29 = false;
        int i29 = 2;
        C42822w c42822w16 = null;
        ErrorTypeKind errorTypeKind77 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", z29, i29, c42822w16);
        ErrorTypeKind errorTypeKind78 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", z28, i28, c42822w15);
        ErrorTypeKind errorTypeKind79 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", z29, i29, c42822w16);
        ErrorTypeKind errorTypeKind80 = new ErrorTypeKind("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", z28, i28, c42822w15);
        f410147D = errorTypeKind80;
        ErrorTypeKind errorTypeKind81 = new ErrorTypeKind("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", z29, i29, c42822w16);
        f410148E = errorTypeKind81;
        ErrorTypeKind errorTypeKind82 = new ErrorTypeKind("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", z28, i28, c42822w15);
        f410149F = errorTypeKind82;
        ErrorTypeKind[] errorTypeKindArr = {errorTypeKind, errorTypeKind2, errorTypeKind3, errorTypeKind4, errorTypeKind5, errorTypeKind6, errorTypeKind7, errorTypeKind8, errorTypeKind9, errorTypeKind10, errorTypeKind11, errorTypeKind12, errorTypeKind13, errorTypeKind14, errorTypeKind15, errorTypeKind16, errorTypeKind17, errorTypeKind18, errorTypeKind19, errorTypeKind20, errorTypeKind21, errorTypeKind22, errorTypeKind23, errorTypeKind24, errorTypeKind25, errorTypeKind26, errorTypeKind27, errorTypeKind28, errorTypeKind29, errorTypeKind30, errorTypeKind31, errorTypeKind32, errorTypeKind33, errorTypeKind34, errorTypeKind35, errorTypeKind36, errorTypeKind37, errorTypeKind38, errorTypeKind39, errorTypeKind40, errorTypeKind41, errorTypeKind42, errorTypeKind43, errorTypeKind44, errorTypeKind45, errorTypeKind46, errorTypeKind47, errorTypeKind48, errorTypeKind49, errorTypeKind50, errorTypeKind51, errorTypeKind52, errorTypeKind53, errorTypeKind54, errorTypeKind55, errorTypeKind56, errorTypeKind57, errorTypeKind58, errorTypeKind59, errorTypeKind60, errorTypeKind61, errorTypeKind62, errorTypeKind63, errorTypeKind64, errorTypeKind65, errorTypeKind66, errorTypeKind67, errorTypeKind68, errorTypeKind69, errorTypeKind70, errorTypeKind71, errorTypeKind72, errorTypeKind73, errorTypeKind74, errorTypeKind75, errorTypeKind76, errorTypeKind77, errorTypeKind78, errorTypeKind79, errorTypeKind80, errorTypeKind81, errorTypeKind82, new ErrorTypeKind("NOT_FOUND_FQNAME", 82, "No fqName for %s", z29, i29, c42822w16), new ErrorTypeKind("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", false, 2, null)};
        f410150G = errorTypeKindArr;
        f410151H = kotlin.enums.c.a(errorTypeKindArr);
    }

    public ErrorTypeKind(int i12, String str, String str2, boolean z12) {
        this.f410175b = str2;
        this.f410176c = z12;
    }

    public static ErrorTypeKind valueOf(String str) {
        return (ErrorTypeKind) Enum.valueOf(ErrorTypeKind.class, str);
    }

    public static ErrorTypeKind[] values() {
        return (ErrorTypeKind[]) f410150G.clone();
    }

    public /* synthetic */ ErrorTypeKind(String str, int i12, String str2, boolean z12, int i13, C42822w c42822w) {
        this(i12, str, str2, (i13 & 2) != 0 ? false : z12);
    }
}
