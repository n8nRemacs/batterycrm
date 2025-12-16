package com.avito.android.rubricator;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpVerticalRubricatorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/Type;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Type {

    /* renamed from: b, reason: collision with root package name */
    public static final Type f255698b;

    /* renamed from: c, reason: collision with root package name */
    public static final Type f255699c;

    /* renamed from: d, reason: collision with root package name */
    public static final Type f255700d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Type[] f255701e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f255702f;

    static {
        Type type = new Type("CATEGORIES", 0);
        f255698b = type;
        Type type2 = new Type("GRID_SERVICES", 1);
        f255699c = type2;
        Type type3 = new Type("LINEAR_SERVICES", 2);
        f255700d = type3;
        Type[] typeArr = {type, type2, type3};
        f255701e = typeArr;
        f255702f = kotlin.enums.c.a(typeArr);
    }

    public Type() {
        throw null;
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) f255701e.clone();
    }
}
