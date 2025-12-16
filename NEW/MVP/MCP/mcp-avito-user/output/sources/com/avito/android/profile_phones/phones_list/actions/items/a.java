package com.avito.android.profile_phones.phones_list.actions.items;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import kotlin.Metadata;

/* compiled from: ActionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/items/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f227497b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f227498c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PhoneListItem.Action f227499d;

    public a(@k String str, @k String str2, @k PhoneListItem.Action action) {
        this.f227497b = str;
        this.f227498c = str2;
        this.f227499d = action;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return getF223079b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223079b() {
        return this.f227497b;
    }
}
