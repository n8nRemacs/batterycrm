package com.avito.android.home.tabs_item;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.HomeTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SectionTabsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/home/tabs_item/c;", "LTV0/d;", "Lcom/avito/android/home/tabs_item/f;", "Lcom/avito/android/serp/adapter/home_section_tab/a;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c extends TV0.d<f, com.avito.android.serp.adapter.home_section_tab.a> {

    /* compiled from: SectionTabsItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/tabs_item/c$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final HomeTabItem f162478a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HomeTabItem f162479b;

        public a(@l HomeTabItem homeTabItem, @k HomeTabItem homeTabItem2) {
            this.f162478a = homeTabItem;
            this.f162479b = homeTabItem2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f162478a, aVar.f162478a) && L.f(this.f162479b, aVar.f162479b);
        }

        public final int hashCode() {
            HomeTabItem homeTabItem = this.f162478a;
            return this.f162479b.hashCode() + ((homeTabItem == null ? 0 : homeTabItem.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "ClickInfo(previousTab=" + this.f162478a + ", newTab=" + this.f162479b + ')';
        }
    }

    @k
    InterfaceC43160i<a> A();
}
