package com.avito.android.component.advert_badge_bar.title;

import Y61.k;
import kotlin.Metadata;

/* compiled from: TitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/title/a;", "Lcom/avito/conveyor_item/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f125009b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f125010c;

    public a(@k String str, @k String str2) {
        this.f125009b = str;
        this.f125010c = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF125009b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF125009b() {
        return this.f125009b;
    }
}
