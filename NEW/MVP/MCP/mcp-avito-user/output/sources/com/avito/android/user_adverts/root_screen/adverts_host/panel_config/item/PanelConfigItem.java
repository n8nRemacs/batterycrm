package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PanelConfigItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/a;", "a", "b", "d", "e", "Type", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$e;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PanelConfigItem extends com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PanelConfigItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$Type;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f313292b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f313293c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f313294d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f313295e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f313296f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f313297g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f313298h;

        /* renamed from: i, reason: collision with root package name */
        public static final Type f313299i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Type[] f313300j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f313301k;

        static {
            Type type = new Type("SMB_STATS", 0);
            f313292b = type;
            Type type2 = new Type("JOB_ONBOARDING", 1);
            f313293c = type2;
            Type type3 = new Type("PROMO", 2);
            f313294d = type3;
            Type type4 = new Type("VAS_PLAN_BALANCE_LACK", 3);
            f313295e = type4;
            Type type5 = new Type("SB_ONBOARDING", 4);
            f313296f = type5;
            Type type6 = new Type("PUBLISH_BALANCE", 5);
            f313297g = type6;
            Type type7 = new Type("VAS_BALANCE", 6);
            f313298h = type7;
            Type type8 = new Type("CPX_BALANCE", 7);
            f313299i = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
            f313300j = typeArr;
            f313301k = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f313300j.clone();
        }
    }

    /* compiled from: PanelConfigItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem$b;", "a", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$b$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends PanelCardItem.b {

        /* compiled from: PanelConfigItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$b$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f313313a;

            public a(@k PrintableText printableText) {
                this.f313313a = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f313313a, ((a) obj).f313313a);
            }

            @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem.b
            @k
            /* renamed from: getText, reason: from getter */
            public final PrintableText getF313313a() {
                return this.f313313a;
            }

            public final int hashCode() {
                return this.f313313a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("StatsTooltip(text="), this.f313313a, ')');
            }
        }
    }

    /* compiled from: PanelConfigItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: PanelConfigItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements PanelConfigItem, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f313314b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Type f313315c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f313316d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f313317e;

        public d(@k String str, @k Type type, @k PrintableText printableText, @k PrintableText printableText2) {
            this.f313314b = str;
            this.f313315c = type;
            this.f313316d = printableText;
            this.f313317e = printableText2;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem
        @k
        /* renamed from: Y1, reason: from getter */
        public final Type getF313315c() {
            return this.f313315c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f313314b.equals(dVar.f313314b) && this.f313315c == dVar.f313315c && L.f(null, null) && this.f313316d.equals(dVar.f313316d) && this.f313317e.equals(dVar.f313317e);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem
        @l
        /* renamed from: getDeepLink */
        public final DeepLink getF313323g() {
            return null;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.a
        @k
        /* renamed from: getHeader, reason: from getter */
        public final PrintableText getF313316d() {
            return this.f313316d;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF248508b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF275352b() {
            return this.f313314b;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.a
        @k
        /* renamed from: getValue, reason: from getter */
        public final PrintableText getF313317e() {
            return this.f313317e;
        }

        public final int hashCode() {
            return this.f313317e.hashCode() + com.avito.android.actions_sheet.a.f(this.f313316d, (this.f313315c.hashCode() + (this.f313314b.hashCode() * 31)) * 961, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlatCard(stringId=");
            sb2.append(this.f313314b);
            sb2.append(", configItemType=");
            sb2.append(this.f313315c);
            sb2.append(", deepLink=null, header=");
            sb2.append(this.f313316d);
            sb2.append(", value=");
            return AK.c.m(sb2, this.f313317e, ')');
        }
    }

    /* compiled from: PanelConfigItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$e;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements PanelConfigItem, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f313318b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f313319c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f313320d;

        /* renamed from: e, reason: collision with root package name */
        public final int f313321e;

        /* renamed from: f, reason: collision with root package name */
        public final int f313322f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f313323g;

        public e(@k String str, @k PrintableText printableText, @k PrintableText printableText2, int i12, int i13, @l DeepLink deepLink) {
            Type type = Type.f313292b;
            this.f313318b = str;
            this.f313319c = printableText;
            this.f313320d = printableText2;
            this.f313321e = i12;
            this.f313322f = i13;
            this.f313323g = deepLink;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a
        /* renamed from: X1, reason: from getter */
        public final int getF313321e() {
            return this.f313321e;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem
        @k
        /* renamed from: Y1 */
        public final Type getF313315c() {
            return Type.f313296f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!L.f(this.f313318b, eVar.f313318b)) {
                return false;
            }
            Type type = Type.f313292b;
            return this.f313319c.equals(eVar.f313319c) && this.f313320d.equals(eVar.f313320d) && this.f313321e == eVar.f313321e && this.f313322f == eVar.f313322f && L.f(this.f313323g, eVar.f313323g);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem
        @l
        /* renamed from: getDeepLink, reason: from getter */
        public final DeepLink getF313323g() {
            return this.f313323g;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a
        @k
        /* renamed from: getDescription, reason: from getter */
        public final PrintableText getF313320d() {
            return this.f313320d;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF248508b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF275352b() {
            return this.f313318b;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a
        @k
        /* renamed from: getTitle, reason: from getter */
        public final PrintableText getF313319c() {
            return this.f313319c;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f313322f, r.e(this.f313321e, com.avito.android.actions_sheet.a.f(this.f313320d, com.avito.android.actions_sheet.a.f(this.f313319c, (Type.f313296f.hashCode() + (this.f313318b.hashCode() * 31)) * 31, 31), 31), 31), 31);
            DeepLink deepLink = this.f313323g;
            return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a
        /* renamed from: s, reason: from getter */
        public final int getF313322f() {
            return this.f313322f;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProgressCard(stringId=");
            sb2.append(this.f313318b);
            sb2.append(", configItemType=");
            sb2.append(Type.f313296f);
            sb2.append(", title=");
            sb2.append(this.f313319c);
            sb2.append(", description=");
            sb2.append(this.f313320d);
            sb2.append(", currentProgress=");
            sb2.append(this.f313321e);
            sb2.append(", totalProgress=");
            sb2.append(this.f313322f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f313323g, ')');
        }
    }

    @k
    /* renamed from: Y1 */
    Type getF313315c();

    @l
    /* renamed from: getDeepLink */
    DeepLink getF313323g();

    /* compiled from: PanelConfigItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/item/PanelConfigItem;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements PanelConfigItem, PanelCardItem {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f313302b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Type f313303c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f313304d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f313305e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f313306f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final PanelCardItem.Style f313307g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final b f313308h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f313309i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final PanelCardItem.HyphenationFrequency f313310j;

        /* renamed from: k, reason: collision with root package name */
        public final int f313311k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a f313312l;

        public a(@k String str, @k Type type, @k PrintableText printableText, @k PrintableText printableText2, @l DeepLink deepLink, @k PanelCardItem.Style style, @l b bVar, @l String str2, @k PanelCardItem.HyphenationFrequency hyphenationFrequency, int i12, @k com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a aVar) {
            this.f313302b = str;
            this.f313303c = type;
            this.f313304d = printableText;
            this.f313305e = printableText2;
            this.f313306f = deepLink;
            this.f313307g = style;
            this.f313308h = bVar;
            this.f313309i = str2;
            this.f313310j = hyphenationFrequency;
            this.f313311k = i12;
            this.f313312l = aVar;
        }

        public static a a(a aVar) {
            String str = aVar.f313302b;
            Type type = aVar.f313303c;
            PrintableText printableText = aVar.f313304d;
            PrintableText printableText2 = aVar.f313305e;
            DeepLink deepLink = aVar.f313306f;
            PanelCardItem.Style style = aVar.f313307g;
            String str2 = aVar.f313309i;
            PanelCardItem.HyphenationFrequency hyphenationFrequency = aVar.f313310j;
            int i12 = aVar.f313311k;
            com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a aVar2 = aVar.f313312l;
            aVar.getClass();
            return new a(str, type, printableText, printableText2, deepLink, style, null, str2, hyphenationFrequency, i12, aVar2);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        public final boolean L1() {
            return false;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        @k
        /* renamed from: N0, reason: from getter */
        public final PanelCardItem.Style getF313307g() {
            return this.f313307g;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem
        @k
        /* renamed from: Y1, reason: from getter */
        public final Type getF313315c() {
            return this.f313303c;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        /* renamed from: a1, reason: from getter */
        public final int getF313311k() {
            return this.f313311k;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        @k
        /* renamed from: b2, reason: from getter */
        public final PanelCardItem.HyphenationFrequency getF313310j() {
            return this.f313310j;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f313302b, aVar.f313302b) && this.f313303c == aVar.f313303c && L.f(this.f313304d, aVar.f313304d) && L.f(this.f313305e, aVar.f313305e) && L.f(this.f313306f, aVar.f313306f) && this.f313307g == aVar.f313307g && L.f(this.f313308h, aVar.f313308h) && L.f(this.f313309i, aVar.f313309i) && this.f313310j == aVar.f313310j && this.f313311k == aVar.f313311k && L.f(this.f313312l, aVar.f313312l);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem
        @l
        /* renamed from: getDeepLink, reason: from getter */
        public final DeepLink getF313323g() {
            return this.f313306f;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF248508b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF275352b() {
            return this.f313302b;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        @k
        /* renamed from: getSubtitle, reason: from getter */
        public final PrintableText getF313305e() {
            return this.f313305e;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        @k
        /* renamed from: getTitle, reason: from getter */
        public final PrintableText getF313304d() {
            return this.f313304d;
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f313305e, com.avito.android.actions_sheet.a.f(this.f313304d, (this.f313303c.hashCode() + (this.f313302b.hashCode() * 31)) * 31, 31), 31);
            DeepLink deepLink = this.f313306f;
            int iHashCode = (this.f313307g.hashCode() + ((iF2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
            b bVar = this.f313308h;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f313309i;
            return this.f313312l.hashCode() + r.e(this.f313311k, (this.f313310j.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        @k
        /* renamed from: l1, reason: from getter */
        public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a getF313312l() {
            return this.f313312l;
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        public final PanelCardItem.b p1() {
            return this.f313308h;
        }

        @k
        public final String toString() {
            return "Card(stringId=" + this.f313302b + ", configItemType=" + this.f313303c + ", title=" + this.f313304d + ", subtitle=" + this.f313305e + ", deepLink=" + this.f313306f + ", cardStyle=" + this.f313307g + ", tooltip=" + this.f313308h + ", badgeTitle=" + this.f313309i + ", subtitleHyphenationFrequency=" + this.f313310j + ", titleMaxLines=" + this.f313311k + ", cardIcon=" + this.f313312l + ')';
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
        @l
        /* renamed from: x0, reason: from getter */
        public final String getF313309i() {
            return this.f313309i;
        }

        public /* synthetic */ a(String str, Type type, PrintableText printableText, PrintableText printableText2, DeepLink deepLink, PanelCardItem.Style style, b bVar, String str2, PanelCardItem.HyphenationFrequency hyphenationFrequency, int i12, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a aVar, int i13, C42822w c42822w) {
            this(str, type, printableText, printableText2, deepLink, style, (i13 & 64) != 0 ? null : bVar, (i13 & 128) != 0 ? null : str2, (i13 & 256) != 0 ? PanelCardItem.HyphenationFrequency.f313691b : hyphenationFrequency, (i13 & 512) != 0 ? 1 : i12, aVar);
        }
    }
}
