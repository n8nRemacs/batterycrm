package com.avito.android.tariff_lf.edit_info.item.edit_package.regular;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: RegularEditPackageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298960b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f298961c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f298962d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f298963e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f298964f;

    /* renamed from: g, reason: collision with root package name */
    public final float f298965g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ProgressState f298966h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f298967i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TariffCountStatus f298968j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final DeepLink f298969k;

    public a(@k String str, @l ArrayList arrayList, @k String str2, @k String str3, @l String str4, float f12, @k ProgressState progressState, @l String str5, @k TariffCountStatus tariffCountStatus, @k DeepLink deepLink) {
        this.f298960b = str;
        this.f298961c = arrayList;
        this.f298962d = str2;
        this.f298963e = str3;
        this.f298964f = str4;
        this.f298965g = f12;
        this.f298966h = progressState;
        this.f298967i = str5;
        this.f298968j = tariffCountStatus;
        this.f298969k = deepLink;
    }

    @Override // TV0.a
    public final long getId() {
        return getF295013b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF295013b() {
        return this.f298960b;
    }
}
