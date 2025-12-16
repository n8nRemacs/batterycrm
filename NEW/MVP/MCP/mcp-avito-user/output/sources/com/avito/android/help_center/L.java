package com.avito.android.help_center;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/L;", "Lcom/avito/android/help_center/K;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class L implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f161613a = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f161614b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f161615c = C42727D.c(new b());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.view.d f161616d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f161617e;

    /* renamed from: f, reason: collision with root package name */
    public final MenuItem f161618f;

    /* compiled from: HelpCenterView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            L.this.f161616d.f304687a.reload();
            return G0.f406611a;
        }
    }

    /* compiled from: HelpCenterView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<io.reactivex.rxjava3.core.z<PowerWebViewStateChangeEvent>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.z<PowerWebViewStateChangeEvent> invoke() {
            return L.this.f161616d.f304688b;
        }
    }

    public L(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f161616d = new com.avito.android.ui.view.d((PowerWebView) view.findViewById(R.id.webview));
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), R.id.webview, interfaceC28373a, 0, 0, 24, null);
        this.f161617e = lVar;
        toolbar.m(R.menu.help_center);
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.home);
        this.f161618f = menuItemFindItem;
        com.avito.android.ui.d.a(menuItemFindItem, new com.avito.android.advert.notes.x(this, 2));
        toolbar.setNavigationIcon(R.drawable.ic_back_24_blue);
        toolbar.setNavigationOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 17));
        lVar.f231600j = new a();
    }

    public final void a(@Y61.k String str) {
        this.f161616d.d(str);
    }
}
