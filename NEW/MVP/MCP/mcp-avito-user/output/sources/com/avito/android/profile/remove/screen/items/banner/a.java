package com.avito.android.profile.remove.screen.items.banner;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.profile_removal.RemovalProcessItem;
import kotlin.Metadata;

/* compiled from: BannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f224058c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f224059d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final RemovalProcessItem.Banner.Link f224060e;

    public a(@k String str, @k String str2, @k String str3, @l RemovalProcessItem.Banner.Link link) {
        this.f224057b = str;
        this.f224058c = str2;
        this.f224059d = str3;
        this.f224060e = link;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF224057b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224057b() {
        return this.f224057b;
    }
}
