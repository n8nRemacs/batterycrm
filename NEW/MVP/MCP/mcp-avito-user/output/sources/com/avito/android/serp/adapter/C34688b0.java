package com.avito.android.serp.adapter;

import com.avito.android.C36135w2;
import com.avito.android.remote.model.developments_catalog.serp.FiltersTabs;
import com.avito.android.remote.model.developments_catalog.serp.FiltersTabsKt;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import com.avito.android.serp.adapter.developments_catalog.filters.tab_group.FiltersTabGroupItem;
import com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image.FiltersTabsItem;
import com.avito.android.serp.adapter.filters_tabs_chips.FiltersTabsChipsItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: FiltersTabsConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/b0;", "Lcom/avito/android/serp/adapter/a0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34688b0 implements InterfaceC34680a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f268986a;

    /* compiled from: FiltersTabsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.b0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f268987a;

        static {
            int[] iArr = new int[FiltersTabs.Configuration.Type.values().length];
            try {
                iArr[FiltersTabs.Configuration.Type.Tabs.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FiltersTabs.Configuration.Type.Chips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f268987a = iArr;
        }
    }

    public C34688b0(@Y61.k C36135w2 c36135w2) {
        this.f268986a = c36135w2;
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34680a0
    @Y61.k
    public final PersistableSerpItem a(@Y61.k FiltersTabs filtersTabs) {
        boolean z12;
        long jA2 = N0.a(filtersTabs.getUniqueId(), ((Tab) C42745f0.E(filtersTabs.getTabs())).getTitle());
        List<Tab> tabs = filtersTabs.getTabs();
        if ((tabs instanceof Collection) && tabs.isEmpty()) {
            z12 = true;
        } else {
            Iterator<T> it = tabs.iterator();
            while (it.hasNext()) {
                if (((Tab) it.next()).getImage() != null) {
                    z12 = false;
                    break;
                }
            }
            z12 = true;
        }
        FiltersTabs.Configuration configuration = filtersTabs.getConfiguration();
        int i12 = a.f268987a[FiltersTabsKt.orDefault(configuration != null ? configuration.getType() : null).ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return new FiltersTabsChipsItem(jA2, String.valueOf(jA2), filtersTabs.getTabs(), filtersTabs.getAnalytics(), filtersTabs.getSettings());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z12) {
            C36135w2 c36135w2 = this.f268986a;
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[30];
            if (((Boolean) c36135w2.f327458A.a().invoke()).booleanValue()) {
                return new FiltersTabGroupItem(jA2, String.valueOf(jA2), filtersTabs.getTabs(), 6, filtersTabs.getAnalytics(), filtersTabs.getSettings());
            }
        }
        return new FiltersTabsItem(jA2, String.valueOf(jA2), filtersTabs.getTabs(), 6, filtersTabs.getAnalytics(), filtersTabs.getSettings());
    }
}
