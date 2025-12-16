package com.avito.android.related_products.generated.api.favorites_complementary_on_app;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoritesComplementaryOnAppRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/UseCase;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ConstructionFavoritesComplementary", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UseCase {

    @c("construction.favorites_complementary")
    public static final UseCase ConstructionFavoritesComplementary;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ UseCase[] f253002c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f253003d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f253004b;

    static {
        UseCase useCase = new UseCase("ConstructionFavoritesComplementary", 0, "construction.favorites_complementary");
        ConstructionFavoritesComplementary = useCase;
        UseCase[] useCaseArr = {useCase};
        f253002c = useCaseArr;
        f253003d = kotlin.enums.c.a(useCaseArr);
    }

    private UseCase(String str, int i12, String str2) {
        this.f253004b = str2;
    }

    public static UseCase valueOf(String str) {
        return (UseCase) Enum.valueOf(UseCase.class, str);
    }

    public static UseCase[] values() {
        return (UseCase[]) f253002c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f253004b.toString();
    }
}
