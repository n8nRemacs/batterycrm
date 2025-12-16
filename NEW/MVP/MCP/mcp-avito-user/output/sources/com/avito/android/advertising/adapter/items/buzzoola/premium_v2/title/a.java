package com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title;

import Y61.k;
import Y61.l;
import android.net.Uri;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumV2TitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/title/a;", "Lcom/avito/conveyor_item/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f87487b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.image_loader.a f87488c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f87489d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Uri f87490e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f87491f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f87492g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f87493h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f87494i;

    public a(@k String str, @l com.avito.android.image_loader.a aVar, @InterfaceC42165v @l Integer num, @l Uri uri, @k String str2, @l @InterfaceC42156l Integer num2, @k String str3, @l @InterfaceC42156l Integer num3) {
        this.f87487b = str;
        this.f87488c = aVar;
        this.f87489d = num;
        this.f87490e = uri;
        this.f87491f = str2;
        this.f87492g = num2;
        this.f87493h = str3;
        this.f87494i = num3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return getF87487b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF87487b() {
        return this.f87487b;
    }
}
