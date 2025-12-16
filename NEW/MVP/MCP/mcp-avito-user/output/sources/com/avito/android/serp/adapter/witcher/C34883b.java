package com.avito.android.serp.adapter.witcher;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.witcher.WitcherItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WitcherAnalyticsFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/b;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34883b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f273846b;

    /* compiled from: WitcherAnalyticsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.witcher.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f273847a;

        static {
            int[] iArr = new int[WitcherItem.AnalyticsMode.values().length];
            try {
                WitcherItem.AnalyticsMode analyticsMode = WitcherItem.AnalyticsMode.f273831b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f273847a = iArr;
        }
    }

    @Inject
    public C34883b(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f273845a = gVar;
        this.f273846b = interfaceC28373a;
    }
}
