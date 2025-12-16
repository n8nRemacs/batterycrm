package com.avito.android.advertising.adapter.items.buzzoola.premium.legal;

import Y61.k;
import Y61.l;
import android.net.Uri;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumLegalItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/legal/a;", "Lcom/avito/conveyor_item/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f87427b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Uri f87428c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f87429d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87430e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87431f;

    public a(int i12, int i13, @l Uri uri, @k String str, @k String str2) {
        this.f87427b = str;
        this.f87428c = uri;
        this.f87429d = str2;
        this.f87430e = i12;
        this.f87431f = i13;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF87427b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF87427b() {
        return this.f87427b;
    }
}
