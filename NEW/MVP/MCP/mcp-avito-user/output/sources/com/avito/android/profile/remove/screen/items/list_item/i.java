package com.avito.android.profile.remove.screen.items.list_item;

import Y61.k;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ListItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/list_item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/remove/screen/items/list_item/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f224110c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f224111b;

    public i(@k ListItem listItem) {
        super(listItem);
        this.f224111b = listItem;
    }

    @Override // com.avito.android.profile.remove.screen.items.list_item.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f224111b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(8, aVar));
    }

    @Override // com.avito.android.profile.remove.screen.items.list_item.h
    public final void setTitle(@k String str) {
        this.f224111b.setTitle(str);
    }
}
