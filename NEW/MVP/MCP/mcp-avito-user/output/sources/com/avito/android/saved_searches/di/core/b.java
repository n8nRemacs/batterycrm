package com.avito.android.saved_searches.di.core;

import Bo0.b;
import Co0.InterfaceC13335b;
import Y61.k;
import com.avito.android.di.B;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.saved_searches.presentation.core.SavedSearchDialogFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SavedSearchCoreComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/di/core/b;", "", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SavedSearchCoreComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/di/core/b$a;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k SavedSearchParams savedSearchParams, @h31.b @k SavedSearchDialogFragment savedSearchDialogFragment, @k i iVar, @k InterfaceC39417a interfaceC39417a);
    }

    @k
    InterfaceC13335b.a a();

    void b(@k SavedSearchDialogFragment savedSearchDialogFragment);

    @k
    b.a c();
}
