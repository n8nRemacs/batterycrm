package com.avito.android.advertising.adapter.items.buzzoola.premium.juristic;

import Y61.k;
import Y61.l;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumJuristicItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/juristic/a;", "Lcom/avito/conveyor_item/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f87412b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f87413c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f87414d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f87415e;

    public a(@k String str, @k String str2, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2) {
        this.f87412b = str;
        this.f87413c = str2;
        this.f87414d = num;
        this.f87415e = num2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83668b() {
        return getF87412b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF87412b() {
        return this.f87412b;
    }
}
