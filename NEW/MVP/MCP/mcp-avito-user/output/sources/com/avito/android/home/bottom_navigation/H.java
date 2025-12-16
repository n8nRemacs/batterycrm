package com.avito.android.home.bottom_navigation;

import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NewTabScreenSpaceResolver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/bottom_navigation/H;", "", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bottom_navigation.G f162330a;

    /* compiled from: NewTabScreenSpaceResolver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<BottomNavigationSpace> f162331a = kotlin.enums.c.a(BottomNavigationSpace.values());
    }

    @Inject
    public H(@Y61.k com.avito.android.bottom_navigation.G g12) {
        this.f162330a = g12;
    }

    /* compiled from: NewTabScreenSpaceResolver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/bottom_navigation/H$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BottomNavigationSpace f162332a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final TabFragmentFactory.Data f162333b;

        public b(@Y61.k BottomNavigationSpace bottomNavigationSpace, @Y61.l TabFragmentFactory.Data data) {
            this.f162332a = bottomNavigationSpace;
            this.f162333b = data;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f162332a == bVar.f162332a && L.f(this.f162333b, bVar.f162333b);
        }

        public final int hashCode() {
            int iHashCode = this.f162332a.hashCode() * 31;
            TabFragmentFactory.Data data = this.f162333b;
            return iHashCode + (data == null ? 0 : data.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ResolveResult(space=" + this.f162332a + ", adjustTabData=" + this.f162333b + ')';
        }

        public /* synthetic */ b(BottomNavigationSpace bottomNavigationSpace, TabFragmentFactory.Data data, int i12, C42822w c42822w) {
            this(bottomNavigationSpace, (i12 & 2) != 0 ? null : data);
        }
    }
}
