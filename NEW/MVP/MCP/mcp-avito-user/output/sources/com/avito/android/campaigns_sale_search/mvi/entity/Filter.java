package com.avito.android.campaigns_sale_search.mvi.entity;

import Y61.k;
import com.avito.android.remote.model.ProfileTab;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CampaignsSaleSearchState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/Filter;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Filter {

    /* renamed from: d, reason: collision with root package name */
    public static final Filter f114746d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Filter[] f114747e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f114748f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114749b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f114750c;

    static {
        Filter filter = new Filter("ALL", 0, "Все", ProfileTab.ALL);
        f114746d = filter;
        Filter[] filterArr = {filter, new Filter("IN_SALE", 1, "Со скидкой", "in-sale"), new Filter("NO_SALE", 2, "Без скидки", "no-sale")};
        f114747e = filterArr;
        f114748f = c.a(filterArr);
    }

    public Filter(String str, int i12, String str2, String str3) {
        this.f114749b = str2;
        this.f114750c = str3;
    }

    public static Filter valueOf(String str) {
        return (Filter) Enum.valueOf(Filter.class, str);
    }

    public static Filter[] values() {
        return (Filter[]) f114747e.clone();
    }
}
