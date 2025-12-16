package com.avito.android.tariff_lf.bar;

import Y61.l;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import kotlin.Metadata;

/* compiled from: BarItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/bar/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f298724b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f298725c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f298726d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f298727e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TariffCountStatus f298728f;

    /* renamed from: g, reason: collision with root package name */
    public final float f298729g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ProgressState f298730h;

    public a(@Y61.k String str, @Y61.k String str2, @l String str3, @l String str4, @l TariffCountStatus tariffCountStatus, float f12, @Y61.k ProgressState progressState) {
        this.f298724b = str;
        this.f298725c = str2;
        this.f298726d = str3;
        this.f298727e = str4;
        this.f298728f = tariffCountStatus;
        this.f298729g = f12;
        this.f298730h = progressState;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return getF295013b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF295013b() {
        return this.f298724b;
    }
}
