package KZ;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LKZ/l;", "LKZ/p;", "", "LKZ/j;", "tabsNullable", "LKZ/b;", "banksNullable", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "getTabsNullable", "()Ljava/util/List;", "getBanksNullable", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14282l implements InterfaceC14286p {

    @com.google.gson.annotations.c("banks")
    @Y61.l
    private final List<C14272b> banksNullable;

    @com.google.gson.annotations.c("tabs")
    @Y61.l
    private final List<C14280j> tabsNullable;

    public C14282l(@Y61.l List<C14280j> list, @Y61.l List<C14272b> list2) {
        this.tabsNullable = list;
        this.banksNullable = list2;
    }

    @Y61.k
    public final List<C14272b> a() {
        List<C14272b> list = this.banksNullable;
        return list == null ? C42784z0.f406748b : list;
    }

    @Y61.l
    public final LinkedHashMap b() {
        List<C14272b> listA = a();
        LinkedHashMap linkedHashMap = null;
        if (c().isEmpty()) {
            listA = null;
        }
        if (listA != null) {
            linkedHashMap = new LinkedHashMap();
            for (Object obj : listA) {
                String state = ((C14272b) obj).getState();
                Object objR = linkedHashMap.get(state);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, state);
                }
                ((List) objR).add(obj);
            }
        }
        return linkedHashMap;
    }

    @Y61.k
    public final List<C14280j> c() {
        List<C14280j> list = this.tabsNullable;
        return list == null ? C42784z0.f406748b : list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14282l)) {
            return false;
        }
        C14282l c14282l = (C14282l) obj;
        return kotlin.jvm.internal.L.f(this.tabsNullable, c14282l.tabsNullable) && kotlin.jvm.internal.L.f(this.banksNullable, c14282l.banksNullable);
    }

    public final int hashCode() {
        List<C14280j> list = this.tabsNullable;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C14272b> list2 = this.banksNullable;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealsItemValue(tabsNullable=");
        sb2.append(this.tabsNullable);
        sb2.append(", banksNullable=");
        return androidx.compose.foundation.H.p(sb2, this.banksNullable, ')');
    }
}
