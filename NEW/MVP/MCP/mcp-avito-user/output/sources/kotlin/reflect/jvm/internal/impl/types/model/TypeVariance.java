package kotlin.reflect.jvm.internal.impl.types.model;

import Y61.k;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes8.dex */
public final class TypeVariance {

    /* renamed from: c, reason: collision with root package name */
    public static final TypeVariance f410229c;

    /* renamed from: d, reason: collision with root package name */
    public static final TypeVariance f410230d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeVariance f410231e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TypeVariance[] f410232f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f410233g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f410234b;

    static {
        TypeVariance typeVariance = new TypeVariance("IN", 0, "in");
        f410229c = typeVariance;
        TypeVariance typeVariance2 = new TypeVariance("OUT", 1, "out");
        f410230d = typeVariance2;
        TypeVariance typeVariance3 = new TypeVariance("INV", 2, "");
        f410231e = typeVariance3;
        TypeVariance[] typeVarianceArr = {typeVariance, typeVariance2, typeVariance3};
        f410232f = typeVarianceArr;
        f410233g = c.a(typeVarianceArr);
    }

    public TypeVariance(String str, int i12, String str2) {
        this.f410234b = str2;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) f410232f.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f410234b;
    }
}
