package com.avito.android.serp.adapter.home_section_tab;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.remote.model.HomeTabItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: SectionTabsItem.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/a;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements l1, S2, h, InterfaceC47435a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f270159b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f270160c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Analytics f270161d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Settings f270162e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f270163f = SerpViewType.f268585e;

    /* renamed from: g, reason: collision with root package name */
    public final long f270164g = 280245766;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f270165h;

    /* compiled from: SectionTabsItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/a$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.home_section_tab.a$a, reason: collision with other inner class name */
    public static final class C8054a {
        public /* synthetic */ C8054a(C42822w c42822w) {
            this();
        }

        public C8054a() {
        }
    }

    static {
        new C8054a(null);
    }

    public a(@k List<HomeTabItem> list, @k String str, @l Analytics analytics, @l Settings settings) {
        this.f270159b = list;
        this.f270160c = str;
        this.f270161d = analytics;
        this.f270162e = settings;
        this.f270165h = new h.b("feeds_widget", null, null, null, null, analytics, 30, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public static a a(a aVar, String str) {
        ?? r02 = aVar.f270159b;
        Analytics analytics = aVar.f270161d;
        Settings settings = aVar.f270162e;
        aVar.getClass();
        return new a(r02, str, analytics, settings);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.remote.model.HomeTabItem>] */
    @k
    public final List<HomeTabItem> b() {
        return this.f270159b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f270159b, aVar.f270159b) && this.f270160c.equals(aVar.f270160c) && L.f(this.f270161d, aVar.f270161d) && L.f(this.f270162e, aVar.f270162e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f270162e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF84111f() {
        return 6;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF281526b() {
        return "tabs_item_id";
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f270164g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f270163f;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f270159b.hashCode() * 31, 31, this.f270160c);
        Analytics analytics = this.f270161d;
        int iHashCode = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f270162e;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f270165h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionTabsItem(tabs=");
        sb2.append(this.f270159b);
        sb2.append(", selectedId=");
        sb2.append(this.f270160c);
        sb2.append(", analytics=");
        sb2.append(this.f270161d);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270162e, ')');
    }
}
