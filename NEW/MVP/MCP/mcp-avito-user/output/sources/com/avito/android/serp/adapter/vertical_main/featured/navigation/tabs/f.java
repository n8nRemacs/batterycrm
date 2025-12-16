package com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedTabsItem;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: FeaturedTabsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/tabs/f;", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/tabs/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f272925c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC43160i<String> f272926d;

    @Inject
    public f(@k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f272924b = gVar;
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f272925c = e2VarB;
        this.f272926d = C43175k.a(e2VarB);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        FeaturedTabsItem featuredTabsItem = (FeaturedTabsItem) aVar;
        List<FeaturedNavigation> list = featuredTabsItem.f272881c;
        Iterator<FeaturedNavigation> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (L.f(it.next().getF272877b(), featuredTabsItem.f272882d)) {
                break;
            } else {
                i13++;
            }
        }
        hVar.y6(list, i13, new e(i13, featuredTabsItem, this, i12));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs.d
    @k
    public final InterfaceC43160i<String> b6() {
        return this.f272926d;
    }
}
