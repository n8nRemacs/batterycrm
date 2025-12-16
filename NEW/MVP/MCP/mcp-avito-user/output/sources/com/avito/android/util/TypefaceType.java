package com.avito.android.util;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypefaceType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/TypefaceType;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypefaceType {

    /* renamed from: c, reason: collision with root package name */
    public static final TypefaceType f318743c;

    /* renamed from: d, reason: collision with root package name */
    public static final TypefaceType f318744d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TypefaceType[] f318745e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f318746f;

    /* renamed from: b, reason: collision with root package name */
    public final int f318747b;

    static {
        TypefaceType typefaceType = new TypefaceType("Heavy", 0, R.attr.fontHeavy);
        f318743c = typefaceType;
        TypefaceType typefaceType2 = new TypefaceType("Regular", 1, R.attr.fontRegular);
        f318744d = typefaceType2;
        TypefaceType[] typefaceTypeArr = {typefaceType, typefaceType2};
        f318745e = typefaceTypeArr;
        f318746f = kotlin.enums.c.a(typefaceTypeArr);
    }

    public TypefaceType(@InterfaceC42150f String str, int i12, int i13) {
        this.f318747b = i13;
    }

    public static TypefaceType valueOf(String str) {
        return (TypefaceType) Enum.valueOf(TypefaceType.class, str);
    }

    public static TypefaceType[] values() {
        return (TypefaceType[]) f318745e.clone();
    }
}
