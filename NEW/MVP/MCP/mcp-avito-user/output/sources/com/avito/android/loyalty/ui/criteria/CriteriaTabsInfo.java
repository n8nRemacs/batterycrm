package com.avito.android.loyalty.ui.criteria;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaTabsInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaTabsInfo;", "", "Tab", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CriteriaTabsInfo {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f183424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f183425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final a f183426c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Tab f183427d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f183428e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final IW.b f183429f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CriteriaTabsInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaTabsInfo$Tab;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tab {

        /* renamed from: b, reason: collision with root package name */
        public static final Tab f183430b;

        /* renamed from: c, reason: collision with root package name */
        public static final Tab f183431c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Tab[] f183432d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f183433e;

        static {
            Tab tab = new Tab("ALL_TAB", 0);
            f183430b = tab;
            Tab tab2 = new Tab("ADVICES_TAB", 1);
            f183431c = tab2;
            Tab[] tabArr = {tab, tab2};
            f183432d = tabArr;
            f183433e = kotlin.enums.c.a(tabArr);
        }

        public Tab() {
            throw null;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) f183432d.clone();
        }
    }

    /* compiled from: CriteriaTabsInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaTabsInfo$a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f183434a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f183435b;

        public a(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f183434a = str;
            this.f183435b = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f183434a, aVar.f183434a) && this.f183435b.equals(aVar.f183435b);
        }

        public final int hashCode() {
            return this.f183435b.hashCode() + (this.f183434a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabInfo(title=");
            sb2.append(this.f183434a);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f183435b, ')');
        }
    }

    public CriteriaTabsInfo(@Y61.k String str, @Y61.k a aVar, @Y61.l a aVar2, @Y61.k Tab tab, @Y61.l String str2, @Y61.l IW.b bVar) {
        this.f183424a = str;
        this.f183425b = aVar;
        this.f183426c = aVar2;
        this.f183427d = tab;
        this.f183428e = str2;
        this.f183429f = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteriaTabsInfo)) {
            return false;
        }
        CriteriaTabsInfo criteriaTabsInfo = (CriteriaTabsInfo) obj;
        return L.f(this.f183424a, criteriaTabsInfo.f183424a) && L.f(this.f183425b, criteriaTabsInfo.f183425b) && L.f(this.f183426c, criteriaTabsInfo.f183426c) && this.f183427d == criteriaTabsInfo.f183427d && L.f(this.f183428e, criteriaTabsInfo.f183428e) && L.f(this.f183429f, criteriaTabsInfo.f183429f);
    }

    public final int hashCode() {
        int iHashCode = (this.f183425b.hashCode() + (this.f183424a.hashCode() * 31)) * 31;
        a aVar = this.f183426c;
        int iHashCode2 = (this.f183427d.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        String str = this.f183428e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        IW.b bVar = this.f183429f;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CriteriaTabsInfo(overallTitle=" + this.f183424a + ", allTabInfo=" + this.f183425b + ", advicesTabInfo=" + this.f183426c + ", selectedTab=" + this.f183427d + ", itemToScroll=" + this.f183428e + ", analyticsInfo=" + this.f183429f + ')';
    }

    public /* synthetic */ CriteriaTabsInfo(String str, a aVar, a aVar2, Tab tab, String str2, IW.b bVar, int i12, C42822w c42822w) {
        this(str, aVar, (i12 & 4) != 0 ? null : aVar2, (i12 & 8) != 0 ? Tab.f183430b : tab, str2, (i12 & 32) != 0 ? null : bVar);
    }
}
