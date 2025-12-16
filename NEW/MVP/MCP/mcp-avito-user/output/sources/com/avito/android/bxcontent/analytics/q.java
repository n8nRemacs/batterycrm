package com.avito.android.bxcontent.analytics;

import com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import com.avito.konveyor.item_visibility_tracker.b;
import js0.InterfaceC42421a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: MiniMenuShowingAnalyticsFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/analytics/q;", "LWV0/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42421a f109505e;

    /* compiled from: MiniMenuShowingAnalyticsFilter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/serp/adapter/mini_menu/item/MiniMenuItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<MiniMenuItem, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f109506l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(MiniMenuItem miniMenuItem) {
            return miniMenuItem.f270347c;
        }
    }

    public q(@Y61.k InterfaceC42421a interfaceC42421a) {
        super(false, true, 0.0f, 0L, 4, null);
        this.f109505e = interfaceC42421a;
    }

    @Override // WV0.a
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof MiniMenuBlockItem;
    }

    @Override // WV0.a
    public final void b(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        MiniMenuBlockItem miniMenuBlockItem = interfaceC10495b instanceof MiniMenuBlockItem ? (MiniMenuBlockItem) interfaceC10495b : null;
        if (miniMenuBlockItem == null) {
            return;
        }
        this.f109505e.f(C42745f0.O(miniMenuBlockItem.f270308c, null, null, null, a.f109506l, 31));
    }
}
