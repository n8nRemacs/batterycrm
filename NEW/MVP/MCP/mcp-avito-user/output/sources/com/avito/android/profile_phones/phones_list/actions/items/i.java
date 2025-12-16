package com.avito.android.profile_phones.phones_list.actions.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/items/i;", "Lcom/avito/android/profile_phones/phones_list/actions/items/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f227508c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f227509b;

    public i(@k ListItem listItem) {
        super(listItem);
        this.f227509b = listItem;
    }

    @Override // com.avito.android.profile_phones.phones_list.actions.items.h
    public final void BG() {
        ListItem listItem = this.f227509b;
        listItem.setTitleColor(C35835l0.e(R.attr.red, listItem.getContext()));
    }

    @Override // com.avito.android.profile_phones.phones_list.actions.items.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f227509b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(28, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f227509b.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_phones.phones_list.actions.items.h
    public final void jB() {
        ListItem listItem = this.f227509b;
        listItem.setTitleColor(C35835l0.e(R.attr.black, listItem.getContext()));
    }

    @Override // com.avito.android.profile_phones.phones_list.actions.items.h
    public final void setTitle(@l CharSequence charSequence) {
        this.f227509b.setTitle(charSequence);
    }
}
