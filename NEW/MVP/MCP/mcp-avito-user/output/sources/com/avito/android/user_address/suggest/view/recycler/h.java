package com.avito.android.user_address.suggest.view.recycler;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/view/recycler/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_address/suggest/view/recycler/g;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f308183c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f308184b;

    public h(@k ListItem listItem) {
        super(listItem);
        this.f308184b = listItem;
    }

    @Override // com.avito.android.user_address.suggest.view.recycler.g
    public final void Va(@k l<? super View, G0> lVar) {
        this.f308184b.setOnClickListener(new com.avito.android.seller_promotions.b(19, lVar));
    }

    @Override // com.avito.android.user_address.suggest.view.recycler.g
    public final void f(@k String str) {
        this.f308184b.setSubtitle(str);
    }

    @Override // com.avito.android.user_address.suggest.view.recycler.g
    public final void setTitle(@k String str) {
        this.f308184b.setTitle(str);
    }
}
