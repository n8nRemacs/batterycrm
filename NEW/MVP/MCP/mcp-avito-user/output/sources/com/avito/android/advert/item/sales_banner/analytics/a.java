package com.avito.android.advert.item.sales_banner.analytics;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.text.Attribute;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: StickedSalesBannerAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/sales_banner/analytics/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f79300a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79301b;

    /* compiled from: StickedSalesBannerAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/text/Attribute;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.sales_banner.analytics.a$a, reason: collision with other inner class name */
    public static final class C2342a extends N implements l<Attribute, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2342a f79302l = new C2342a();

        public C2342a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Attribute attribute) {
            return attribute.getTitle();
        }
    }

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a, @k @InterfaceC30174s String str) {
        this.f79300a = interfaceC28373a;
        this.f79301b = str;
    }

    public static String a(List list) {
        return C42745f0.O(list, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, C2342a.f79302l, 30);
    }
}
