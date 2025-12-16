package com.avito.android.sx_address.list.domain;

import com.avito.android.R;
import j.e0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Filter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/Filter;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Filter {

    /* renamed from: c, reason: collision with root package name */
    public static final Filter f293146c;

    /* renamed from: d, reason: collision with root package name */
    public static final Filter f293147d;

    /* renamed from: e, reason: collision with root package name */
    public static final Filter f293148e;

    /* renamed from: f, reason: collision with root package name */
    public static final Filter f293149f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Filter[] f293150g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f293151h;

    /* renamed from: b, reason: collision with root package name */
    public final int f293152b;

    static {
        Filter filter = new Filter("ALL", 0, R.string.sx_address_list_filter_menu_all_item);
        f293146c = filter;
        Filter filter2 = new Filter("CONFIRMED", 1, R.string.sx_address_list_filter_menu_confirmed_item);
        f293147d = filter2;
        Filter filter3 = new Filter("ON_VERIFICATION", 2, R.string.sx_address_list_filter_menu_on_verification_item);
        f293148e = filter3;
        Filter filter4 = new Filter("DECLINED", 3, R.string.sx_address_list_filter_menu_declined_item);
        f293149f = filter4;
        Filter[] filterArr = {filter, filter2, filter3, filter4};
        f293150g = filterArr;
        f293151h = kotlin.enums.c.a(filterArr);
    }

    public Filter(@e0 String str, int i12, int i13) {
        this.f293152b = i13;
    }

    public static Filter valueOf(String str) {
        return (Filter) Enum.valueOf(Filter.class, str);
    }

    public static Filter[] values() {
        return (Filter[]) f293150g.clone();
    }
}
