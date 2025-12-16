package com.avito.android.user_advert.advert.items.multiaddresses;

import Y61.l;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiAddressItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309670b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309671c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309672d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f309673e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f309674f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<MultiAddressesItem> f309675g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f309676h;

    public a(@Y61.k String str, @Y61.k String str2, @l String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k List<MultiAddressesItem> list, @Y61.k String str6) {
        this.f309670b = str;
        this.f309671c = str2;
        this.f309672d = str3;
        this.f309673e = str4;
        this.f309674f = str5;
        this.f309675g = list;
        this.f309676h = str6;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF309261b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309261b() {
        return this.f309670b;
    }
}
