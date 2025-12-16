package com.avito.android.profile.remove.screen.items.header;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: HeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224074b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f224075c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f224076d;

    public a(@k String str, @k String str2, @l String str3) {
        this.f224074b = str;
        this.f224075c = str2;
        this.f224076d = str3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF224074b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224074b() {
        return this.f224074b;
    }
}
