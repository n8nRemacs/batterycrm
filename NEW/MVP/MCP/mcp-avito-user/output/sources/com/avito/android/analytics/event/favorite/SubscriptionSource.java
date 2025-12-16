package com.avito.android.analytics.event.favorite;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscriptionSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/favorite/SubscriptionSource;", "", "a", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubscriptionSource {

    /* renamed from: c, reason: collision with root package name */
    public static final SubscriptionSource f90035c;

    /* renamed from: d, reason: collision with root package name */
    public static final SubscriptionSource f90036d;

    /* renamed from: e, reason: collision with root package name */
    public static final SubscriptionSource f90037e;

    /* renamed from: f, reason: collision with root package name */
    public static final SubscriptionSource f90038f;

    /* renamed from: g, reason: collision with root package name */
    public static final SubscriptionSource f90039g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ SubscriptionSource[] f90040h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f90041i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90042b;

    /* compiled from: SubscriptionSource.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/event/favorite/SubscriptionSource$a;", "", "<init>", "()V", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SubscriptionSource subscriptionSource = new SubscriptionSource("FAVORITE_SELLERS", 0, "favorite_sellers");
        f90035c = subscriptionSource;
        SubscriptionSource subscriptionSource2 = new SubscriptionSource("FAVORITE_SELLERS_REC", 1, "favorite_sellers_rec");
        f90036d = subscriptionSource2;
        SubscriptionSource subscriptionSource3 = new SubscriptionSource("ADVERT_DETAILS", 2, "item");
        f90037e = subscriptionSource3;
        SubscriptionSource subscriptionSource4 = new SubscriptionSource("ADVERT_DETAILS_REC", 3, "item_rec");
        f90038f = subscriptionSource4;
        SubscriptionSource subscriptionSource5 = new SubscriptionSource("NEWS_FEED", 4, "news_feed");
        SubscriptionSource subscriptionSource6 = new SubscriptionSource("SHOP_PAGE", 5, "shop_page");
        SubscriptionSource subscriptionSource7 = new SubscriptionSource("EXTENDED_PROFILE", 6, "extended_profile");
        f90039g = subscriptionSource7;
        SubscriptionSource[] subscriptionSourceArr = {subscriptionSource, subscriptionSource2, subscriptionSource3, subscriptionSource4, subscriptionSource5, subscriptionSource6, subscriptionSource7, new SubscriptionSource("BRANDED_PROFILE", 7, "branded_profile"), new SubscriptionSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8, "unknown")};
        f90040h = subscriptionSourceArr;
        f90041i = c.a(subscriptionSourceArr);
        new a(null);
    }

    public SubscriptionSource(String str, int i12, String str2) {
        this.f90042b = str2;
    }

    public static SubscriptionSource valueOf(String str) {
        return (SubscriptionSource) Enum.valueOf(SubscriptionSource.class, str);
    }

    public static SubscriptionSource[] values() {
        return (SubscriptionSource[]) f90040h.clone();
    }
}
