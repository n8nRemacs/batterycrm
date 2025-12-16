package com.avito.android.advert_stats.item;

import android.content.res.Resources;
import com.avito.android.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatisticStringResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/E;", "Lcom/avito/android/advert_stats/item/D;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f86687a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f86688b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f86689c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f86690d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f86691e;

    @Inject
    public E(@Y61.k Resources resources) {
        this.f86687a = resources;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("ru", "RU"));
        decimalFormat.setGroupingSize(3);
        decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        this.f86688b = decimalFormat;
        this.f86689c = resources.getString(R.string.legend_general_view);
        this.f86690d = resources.getString(R.string.legend_predict_views);
        this.f86691e = resources.getString(R.string.views_title);
    }

    @Override // com.avito.android.advert_stats.item.D
    @Y61.k
    public final String a(int i12) {
        return this.f86687a.getQuantityString(R.plurals.favorites, i12, this.f86688b.format(Integer.valueOf(i12)));
    }

    @Override // com.avito.android.advert_stats.item.D
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF86689c() {
        return this.f86689c;
    }

    @Override // com.avito.android.advert_stats.item.D
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF86690d() {
        return this.f86690d;
    }

    @Override // com.avito.android.advert_stats.item.D
    @Y61.k
    public final String d(int i12) {
        return this.f86687a.getQuantityString(R.plurals.views, i12, this.f86688b.format(Integer.valueOf(i12)));
    }

    @Override // com.avito.android.advert_stats.item.D
    @Y61.k
    public final String e(int i12) {
        return this.f86687a.getQuantityString(R.plurals.contacts, i12, this.f86688b.format(Integer.valueOf(i12)));
    }

    @Override // com.avito.android.advert_stats.item.D
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF86691e() {
        return this.f86691e;
    }
}
