package com.avito.android.profile_phones.phones_list.device_list_item;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: DeviceListItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/device_list_item/h;", "Lcom/avito/android/profile_phones/phones_list/device_list_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f227657d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f227658b;

    /* renamed from: c, reason: collision with root package name */
    public final ListItem f227659c;

    public h(@k View view) {
        super(view);
        this.f227658b = view;
        this.f227659c = (ListItem) view.findViewById(R.id.device_list_item);
    }

    @Override // com.avito.android.profile_phones.phones_list.device_list_item.g
    public final void HP(@k String str, @l String str2) {
        ListItem listItem = this.f227659c;
        if (str2 != null) {
            listItem.setSubtitle(str2);
            listItem.setSubtitleColor(ColorStateList.valueOf(C35835l0.d(R.attr.gray54, this.f227658b.getContext())));
        }
        listItem.setTitle(str);
    }

    @Override // com.avito.android.profile_phones.phones_list.device_list_item.g
    public final void kn(@k Y41.a aVar, boolean z12) {
        ListItem listItem = this.f227659c;
        listItem.setClickable(z12);
        if (!z12) {
            ListItem.k(listItem, 0, 0, 1);
            return;
        }
        listItem.setOnClickListener(new com.avito.android.profile.edit.adapter.c(29, aVar));
        ListItem.k(listItem, 0, R.drawable.ic_more_horizontal_24, 1);
        listItem.setRightIconColor(ColorStateList.valueOf(C35835l0.d(R.attr.black, listItem.getContext())));
    }
}
