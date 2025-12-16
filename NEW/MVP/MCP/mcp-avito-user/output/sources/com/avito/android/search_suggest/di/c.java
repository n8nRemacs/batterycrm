package com.avito.android.search_suggest.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.search_suggest.SearchSuggestArguments;
import com.avito.android.search_suggest.SearchSuggestFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SearchSuggestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_suggest/di/c;", "", "a", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SearchSuggestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/di/c$a;", "", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@k InterfaceC39417a interfaceC39417a, @k d dVar, @h31.b @k SearchSuggestArguments searchSuggestArguments, @h31.b @k C28478k c28478k, @h31.b @k l lVar, @b @h31.b boolean z12);
    }

    void a(@k SearchSuggestFragment searchSuggestFragment);
}
