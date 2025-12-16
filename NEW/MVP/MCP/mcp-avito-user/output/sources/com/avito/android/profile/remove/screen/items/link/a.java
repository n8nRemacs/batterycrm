package com.avito.android.profile.remove.screen.items.link;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: LinkItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/link/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224084b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f224085c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f224086d;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f224084b = str;
        this.f224085c = str2;
        this.f224086d = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF224084b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224084b() {
        return this.f224084b;
    }
}
