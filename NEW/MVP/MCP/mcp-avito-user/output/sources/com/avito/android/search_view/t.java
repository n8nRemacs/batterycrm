package com.avito.android.search_view;

import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Toolbar23SearchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/t;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.search.b, G0> f264591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar23SearchView f264592b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Y41.l<? super com.avito.android.search.b, G0> lVar, Toolbar23SearchView toolbar23SearchView) {
        this.f264591a = lVar;
        this.f264592b = toolbar23SearchView;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        if (hVar instanceof com.avito.android.search.b) {
            this.f264591a.invoke(hVar);
            this.f264592b.f264445H.j();
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        if (hVar instanceof com.avito.android.search.b) {
            this.f264591a.invoke(hVar);
            this.f264592b.f264445H.j();
        }
    }
}
