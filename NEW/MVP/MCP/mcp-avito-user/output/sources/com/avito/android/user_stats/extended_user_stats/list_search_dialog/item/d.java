package com.avito.android.user_stats.extended_user_stats.list_search_dialog.item;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckBoxPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/d;", "Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/c;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public com.avito.android.user_stats.extended_user_stats.list_search_dialog.d f317265b;

    @Inject
    public d() {
    }

    @Override // com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.c
    public final void G3(@k com.avito.android.user_stats.extended_user_stats.list_search_dialog.d dVar) {
        this.f317265b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        CheckBoxData checkBoxData = (CheckBoxData) aVar;
        com.avito.android.user_stats.extended_user_stats.list_search_dialog.d dVar = this.f317265b;
        if (dVar == null) {
            dVar = null;
        }
        fVar.VI(checkBoxData, dVar);
    }
}
