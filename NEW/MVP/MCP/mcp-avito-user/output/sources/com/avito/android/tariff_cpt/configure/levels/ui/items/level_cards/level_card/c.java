package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.remote.model.text.AttributedText;
import iC0.C41267a;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLevelsCardItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/c;", "Lcom/avito/conveyor_item/a;", "a", "b", "c", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297965b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f297966c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C41267a f297967d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<a> f297968e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C9103c f297969f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final b f297970g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<DockingBadgeItem> f297971h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f297972i;

    /* compiled from: TariffCptConfigureLevelsCardItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/c$a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final iC0.f f297973a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f297974b;

        public a(@l iC0.f fVar, @k AttributedText attributedText) {
            this.f297973a = fVar;
            this.f297974b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f297973a, aVar.f297973a) && L.f(this.f297974b, aVar.f297974b);
        }

        public final int hashCode() {
            iC0.f fVar = this.f297973a;
            return this.f297974b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Advantage(icon=");
            sb2.append(this.f297973a);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f297974b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsCardItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/c$b;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f297975a;

        /* renamed from: b, reason: collision with root package name */
        public final int f297976b;

        public b(@k String str, @InterfaceC42150f int i12) {
            this.f297975a = str;
            this.f297976b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f297975a, bVar.f297975a) && this.f297976b == bVar.f297976b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f297976b) + (this.f297975a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BadgeData(title=");
            sb2.append(this.f297975a);
            sb2.append(", styleAttr=");
            return r.t(sb2, this.f297976b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsCardItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/c$c;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c$c, reason: collision with other inner class name */
    public static final /* data */ class C9103c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final iC0.f f297977a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f297978b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f297979c;

        public C9103c(@l iC0.f fVar, @k AttributedText attributedText, @k DeepLink deepLink) {
            this.f297977a = fVar;
            this.f297978b = attributedText;
            this.f297979c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9103c)) {
                return false;
            }
            C9103c c9103c = (C9103c) obj;
            return L.f(this.f297977a, c9103c.f297977a) && L.f(this.f297978b, c9103c.f297978b) && L.f(this.f297979c, c9103c.f297979c);
        }

        public final int hashCode() {
            iC0.f fVar = this.f297977a;
            return this.f297979c.hashCode() + com.avito.android.actions_sheet.a.b((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f297978b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OtherAdvantagesButton(icon=");
            sb2.append(this.f297977a);
            sb2.append(", title=");
            sb2.append(this.f297978b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f297979c, ')');
        }
    }

    public c(@k String str, @k AttributedText attributedText, @l C41267a c41267a, @k List<a> list, @l C9103c c9103c, @l b bVar, @l List<DockingBadgeItem> list2, boolean z12) {
        this.f297965b = str;
        this.f297966c = attributedText;
        this.f297967d = c41267a;
        this.f297968e = list;
        this.f297969f = c9103c;
        this.f297970g = bVar;
        this.f297971h = list2;
        this.f297972i = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f297965b, cVar.f297965b) && L.f(this.f297966c, cVar.f297966c) && L.f(this.f297967d, cVar.f297967d) && L.f(this.f297968e, cVar.f297968e) && L.f(this.f297969f, cVar.f297969f) && L.f(this.f297970g, cVar.f297970g) && L.f(this.f297971h, cVar.f297971h) && this.f297972i == cVar.f297972i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287650b() {
        return getF275368b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275368b() {
        return this.f297965b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f297965b.hashCode() * 31, 31, this.f297966c);
        C41267a c41267a = this.f297967d;
        int iE2 = H.e((iB2 + (c41267a == null ? 0 : c41267a.hashCode())) * 31, 31, this.f297968e);
        C9103c c9103c = this.f297969f;
        int iHashCode = (iE2 + (c9103c == null ? 0 : c9103c.hashCode())) * 31;
        b bVar = this.f297970g;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<DockingBadgeItem> list = this.f297971h;
        return Boolean.hashCode(this.f297972i) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptConfigureLevelsCardItem(stringId=");
        sb2.append(this.f297965b);
        sb2.append(", title=");
        sb2.append(this.f297966c);
        sb2.append(", button=");
        sb2.append(this.f297967d);
        sb2.append(", advantages=");
        sb2.append(this.f297968e);
        sb2.append(", otherAdvantages=");
        sb2.append(this.f297969f);
        sb2.append(", badge=");
        sb2.append(this.f297970g);
        sb2.append(", dockingBadges=");
        sb2.append(this.f297971h);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f297972i, ')');
    }

    public /* synthetic */ c(String str, AttributedText attributedText, C41267a c41267a, List list, C9103c c9103c, b bVar, List list2, boolean z12, int i12, C42822w c42822w) {
        this(str, attributedText, c41267a, list, c9103c, bVar, list2, (i12 & 128) != 0 ? false : z12);
    }
}
