package com.avito.android.extended_profile.data;

import Y61.l;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.public_profile.ui.tab.TabItem;
import com.avito.android.remote.model.ExtendedProfile;
import com.avito.android.remote.model.Sharing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileConvertedData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/data/b;", "", "a", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<g> f149466a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final a f149467b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Sharing f149468c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f149469d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ExtendedProfile.ProfileData.AnalyticParams f149470e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f149471f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SearchFormat f149472g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f149473h;

    /* compiled from: ExtendedProfileConvertedData.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "LQH/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile.data.b$b, reason: collision with other inner class name */
    public static final class C4385b extends N implements Y41.a<List<? extends QH.a>> {
        public C4385b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends QH.a> invoke() {
            List<g> list = b.this.f149466a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C42745f0.h(((g) it.next()).getItems(), arrayList);
            }
            return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k List<? extends g> list, @l a aVar, @l Sharing sharing, @l String str, @l ExtendedProfile.ProfileData.AnalyticParams analyticParams, @l String str2, @Y61.k SearchFormat searchFormat) {
        this.f149466a = list;
        this.f149467b = aVar;
        this.f149468c = sharing;
        this.f149469d = str;
        this.f149470e = analyticParams;
        this.f149471f = str2;
        this.f149472g = searchFormat;
        this.f149473h = C42727D.c(new C4385b());
    }

    public static b a(b bVar, List list, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            list = bVar.f149466a;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            aVar = bVar.f149467b;
        }
        Sharing sharing = bVar.f149468c;
        String str = bVar.f149469d;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams = bVar.f149470e;
        String str2 = bVar.f149471f;
        SearchFormat searchFormat = bVar.f149472g;
        bVar.getClass();
        return new b(list2, aVar, sharing, str, analyticParams, str2, searchFormat);
    }

    @Y61.k
    public final List<QH.a> b() {
        return (List) this.f149473h.getValue();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f149466a, bVar.f149466a) && L.f(this.f149467b, bVar.f149467b) && L.f(this.f149468c, bVar.f149468c) && L.f(this.f149469d, bVar.f149469d) && L.f(this.f149470e, bVar.f149470e) && L.f(this.f149471f, bVar.f149471f) && this.f149472g == bVar.f149472g;
    }

    public final int hashCode() {
        int iHashCode = this.f149466a.hashCode() * 31;
        a aVar = this.f149467b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Sharing sharing = this.f149468c;
        int iHashCode3 = (iHashCode2 + (sharing == null ? 0 : sharing.hashCode())) * 31;
        String str = this.f149469d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams = this.f149470e;
        int iHashCode5 = (iHashCode4 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        String str2 = this.f149471f;
        return this.f149472g.hashCode() + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileConvertedData(widgetGroups=" + this.f149466a + ", tabsState=" + this.f149467b + ", sharing=" + this.f149468c + ", disclaimer=" + this.f149469d + ", analyticParams=" + this.f149470e + ", beduinJson=" + this.f149471f + ", searchFormat=" + this.f149472g + ')';
    }

    /* compiled from: ExtendedProfileConvertedData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/b$a;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f149474a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<TabItem> f149475b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f149476c;

        public a(@l Integer num, @Y61.k List list, @Y61.k String str) {
            this.f149474a = str;
            this.f149475b = list;
            this.f149476c = num;
        }

        public static a a(a aVar, List list, Integer num, int i12) {
            String str = aVar.f149474a;
            if ((i12 & 2) != 0) {
                list = aVar.f149475b;
            }
            if ((i12 & 4) != 0) {
                num = aVar.f149476c;
            }
            aVar.getClass();
            return new a(num, list, str);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f149474a, aVar.f149474a) && L.f(this.f149475b, aVar.f149475b) && L.f(this.f149476c, aVar.f149476c);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f149474a.hashCode() * 31, 31, this.f149475b);
            Integer num = this.f149476c;
            return iE2 + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabsState(widgetName=");
            sb2.append(this.f149474a);
            sb2.append(", advertsTabs=");
            sb2.append(this.f149475b);
            sb2.append(", selectedAdvertTab=");
            return s.j(sb2, this.f149476c, ')');
        }

        public /* synthetic */ a(String str, List list, Integer num, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : num, list, str);
        }
    }

    public /* synthetic */ b(List list, a aVar, Sharing sharing, String str, ExtendedProfile.ProfileData.AnalyticParams analyticParams, String str2, SearchFormat searchFormat, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : sharing, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : analyticParams, (i12 & 32) == 0 ? str2 : null, (i12 & 64) != 0 ? SearchFormat.f149460b : searchFormat);
    }
}
