package com.avito.android.search.filter;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/b1;", "Lcom/avito/android/search/filter/a1;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34549b1 implements InterfaceC34536a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f262659a;

    @Inject
    public C34549b1(@Y61.k Resources resources) {
        this.f262659a = resources;
    }

    @Override // com.avito.android.search.filter.InterfaceC34547b.InterfaceC7857b
    @Y61.k
    public final String a() {
        return this.f262659a.getString(R.string.search_filter_category);
    }

    @Override // com.avito.android.search.filter.InterfaceC34547b.InterfaceC7857b
    @Y61.k
    public final String b() {
        return this.f262659a.getString(R.string.search_filter_subcategory);
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0.a
    @Y61.k
    public final String c() {
        return this.f262659a.getString(R.string.search_filter_counter_button_default_text);
    }
}
