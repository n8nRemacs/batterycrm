package com.avito.android.favorites;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoritesSpace.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/FavoritesSpace;", "", "_avito-discouraged_avito-libs_favorite-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesSpace {

    /* renamed from: f, reason: collision with root package name */
    public static final FavoritesSpace f156264f;

    /* renamed from: g, reason: collision with root package name */
    public static final FavoritesSpace f156265g;

    /* renamed from: h, reason: collision with root package name */
    public static final FavoritesSpace f156266h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ FavoritesSpace[] f156267i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156268j;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f156270c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f156271d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156272e;

    static {
        FavoritesSpace favoritesSpace = new FavoritesSpace("Default", 0, false, null, null, false, 15, null);
        f156264f = favoritesSpace;
        FavoritesSpace favoritesSpace2 = new FavoritesSpace(1, "AvitoForBusiness", "avitoForBusiness", "avitoForBusiness", false, false);
        f156265g = favoritesSpace2;
        FavoritesSpace favoritesSpace3 = new FavoritesSpace("Global", 2, false, null, null, false, 15, null);
        f156266h = favoritesSpace3;
        FavoritesSpace[] favoritesSpaceArr = {favoritesSpace, favoritesSpace2, favoritesSpace3};
        f156267i = favoritesSpaceArr;
        f156268j = kotlin.enums.c.a(favoritesSpaceArr);
    }

    public FavoritesSpace(int i12, String str, String str2, String str3, boolean z12, boolean z13) {
        this.f156269b = z12;
        this.f156270c = str2;
        this.f156271d = str3;
        this.f156272e = z13;
    }

    public static FavoritesSpace valueOf(String str) {
        return (FavoritesSpace) Enum.valueOf(FavoritesSpace.class, str);
    }

    public static FavoritesSpace[] values() {
        return (FavoritesSpace[]) f156267i.clone();
    }

    public /* synthetic */ FavoritesSpace(String str, int i12, boolean z12, String str2, String str3, boolean z13, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 1) != 0 ? true : z12, (i13 & 8) != 0 ? true : z13);
    }
}
