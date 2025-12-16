package com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: RealtyPlusEditPackageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/realty_plus/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298936b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f298937c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f298938d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f298939e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f298940f;

    public a(@k DeepLink deepLink, @k String str, @k String str2, @k String str3, @l ArrayList arrayList) {
        this.f298936b = str;
        this.f298937c = arrayList;
        this.f298938d = str2;
        this.f298939e = str3;
        this.f298940f = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF291445k().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF291445k() {
        return this.f298936b;
    }
}
