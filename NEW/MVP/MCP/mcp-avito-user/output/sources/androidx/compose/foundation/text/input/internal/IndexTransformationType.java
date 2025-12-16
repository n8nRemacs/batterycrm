package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransformedTextFieldState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IndexTransformationType {

    /* renamed from: b, reason: collision with root package name */
    public static final IndexTransformationType f30841b;

    /* renamed from: c, reason: collision with root package name */
    public static final IndexTransformationType f30842c;

    /* renamed from: d, reason: collision with root package name */
    public static final IndexTransformationType f30843d;

    /* renamed from: e, reason: collision with root package name */
    public static final IndexTransformationType f30844e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ IndexTransformationType[] f30845f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f30846g;

    static {
        IndexTransformationType indexTransformationType = new IndexTransformationType("Untransformed", 0);
        f30841b = indexTransformationType;
        IndexTransformationType indexTransformationType2 = new IndexTransformationType("Insertion", 1);
        f30842c = indexTransformationType2;
        IndexTransformationType indexTransformationType3 = new IndexTransformationType("Replacement", 2);
        f30843d = indexTransformationType3;
        IndexTransformationType indexTransformationType4 = new IndexTransformationType("Deletion", 3);
        f30844e = indexTransformationType4;
        IndexTransformationType[] indexTransformationTypeArr = {indexTransformationType, indexTransformationType2, indexTransformationType3, indexTransformationType4};
        f30845f = indexTransformationTypeArr;
        f30846g = kotlin.enums.c.a(indexTransformationTypeArr);
    }

    public IndexTransformationType() {
        throw null;
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) f30845f.clone();
    }
}
