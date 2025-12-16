package com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectionItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/selection/e;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/selection/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229576b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super yc0.k, G0> lVar) {
        this.f229576b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SelectionItem selectionItem = (SelectionItem) aVar;
        ((g) eVar).VZ(selectionItem, new d(this, selectionItem));
    }
}
