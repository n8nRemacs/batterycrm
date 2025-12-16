package com.avito.android.profile.remove.screen.items.spacer;

import Y61.k;
import kotlin.Metadata;

/* compiled from: SpacerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/spacer/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224112b;

    /* renamed from: c, reason: collision with root package name */
    public final int f224113c;

    public a(@k String str, int i12) {
        this.f224112b = str;
        this.f224113c = i12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF224112b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224112b() {
        return this.f224112b;
    }
}
