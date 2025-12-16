package com.avito.android.widget_filters.mvi.entity;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetFiltersState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/LoadingType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadingType {

    /* renamed from: b, reason: collision with root package name */
    public static final LoadingType f329980b;

    /* renamed from: c, reason: collision with root package name */
    public static final LoadingType f329981c;

    /* renamed from: d, reason: collision with root package name */
    public static final LoadingType f329982d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LoadingType[] f329983e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f329984f;

    static {
        LoadingType loadingType = new LoadingType("FILTERS_INIT", 0);
        f329980b = loadingType;
        LoadingType loadingType2 = new LoadingType("FILTERS_UPDATE", 1);
        f329981c = loadingType2;
        LoadingType loadingType3 = new LoadingType("FILTERS_RELOAD", 2);
        f329982d = loadingType3;
        LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3};
        f329983e = loadingTypeArr;
        f329984f = kotlin.enums.c.a(loadingTypeArr);
    }

    public LoadingType() {
        throw null;
    }

    public static LoadingType valueOf(String str) {
        return (LoadingType) Enum.valueOf(LoadingType.class, str);
    }

    public static LoadingType[] values() {
        return (LoadingType[]) f329983e.clone();
    }
}
