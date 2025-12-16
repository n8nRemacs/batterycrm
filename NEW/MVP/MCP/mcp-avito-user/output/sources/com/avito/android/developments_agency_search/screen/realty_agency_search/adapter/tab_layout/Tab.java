package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout;

import Y61.k;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabLayoutItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/tab_layout/Tab;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Tab {

    /* renamed from: c, reason: collision with root package name */
    public static final Tab f138450c;

    /* renamed from: d, reason: collision with root package name */
    public static final Tab f138451d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Tab[] f138452e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138453f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f138454b;

    static {
        Tab tab = new Tab(0, com.avito.android.printable_text.b.c(R.string.das_search_tab_developments, new Serializable[0]), "DEVELOPMENTS");
        f138450c = tab;
        Tab tab2 = new Tab(1, com.avito.android.printable_text.b.c(R.string.das_search_tab_lots, new Serializable[0]), "LOTS");
        f138451d = tab2;
        Tab[] tabArr = {tab, tab2};
        f138452e = tabArr;
        f138453f = kotlin.enums.c.a(tabArr);
    }

    public Tab(int i12, PrintableText printableText, String str) {
        this.f138454b = printableText;
    }

    public static Tab valueOf(String str) {
        return (Tab) Enum.valueOf(Tab.class, str);
    }

    public static Tab[] values() {
        return (Tab[]) f138452e.clone();
    }
}
