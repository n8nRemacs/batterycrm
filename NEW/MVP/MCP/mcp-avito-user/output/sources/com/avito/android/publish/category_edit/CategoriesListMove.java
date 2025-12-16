package com.avito.android.publish.category_edit;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CategoryEditViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/CategoriesListMove;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CategoriesListMove {

    /* renamed from: b, reason: collision with root package name */
    public static final CategoriesListMove f232320b;

    /* renamed from: c, reason: collision with root package name */
    public static final CategoriesListMove f232321c;

    /* renamed from: d, reason: collision with root package name */
    public static final CategoriesListMove f232322d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CategoriesListMove[] f232323e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f232324f;

    static {
        CategoriesListMove categoriesListMove = new CategoriesListMove("IN_PLACE", 0);
        f232320b = categoriesListMove;
        CategoriesListMove categoriesListMove2 = new CategoriesListMove("FORWARD", 1);
        f232321c = categoriesListMove2;
        CategoriesListMove categoriesListMove3 = new CategoriesListMove("BACKWARD", 2);
        f232322d = categoriesListMove3;
        CategoriesListMove[] categoriesListMoveArr = {categoriesListMove, categoriesListMove2, categoriesListMove3};
        f232323e = categoriesListMoveArr;
        f232324f = kotlin.enums.c.a(categoriesListMoveArr);
    }

    public CategoriesListMove() {
        throw null;
    }

    public static CategoriesListMove valueOf(String str) {
        return (CategoriesListMove) Enum.valueOf(CategoriesListMove.class, str);
    }

    public static CategoriesListMove[] values() {
        return (CategoriesListMove[]) f232323e.clone();
    }
}
