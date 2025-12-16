package LI0;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelSoaItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLI0/a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements PanelCardItem {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f9896b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f9897c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9898d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PanelCardItem.b f9899e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.C9655a f9900f;

    /* compiled from: PanelSoaItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLI0/a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: LI0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0610a implements PanelCardItem.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f9901a;

        public C0610a(@k PrintableText printableText) {
            this.f9901a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0610a) && L.f(this.f9901a, ((C0610a) obj).f9901a);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem.b
        @k
        /* renamed from: getText, reason: from getter */
        public final PrintableText getF9901a() {
            return this.f9901a;
        }

        public final int hashCode() {
            return this.f9901a.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("Tooltip(text="), this.f9901a, ')');
        }
    }

    public a(@k PrintableText printableText, @k PrintableText printableText2, boolean z12, @l PanelCardItem.b bVar, @k a.C9655a c9655a) {
        PanelCardItem.Style style = PanelCardItem.Style.f313695b;
        this.f9896b = printableText;
        this.f9897c = printableText2;
        this.f9898d = z12;
        this.f9899e = bVar;
        this.f9900f = c9655a;
    }

    public static a a(a aVar, int i12) {
        PrintableText printableText = aVar.f9896b;
        PrintableText printableText2 = aVar.f9897c;
        boolean z12 = (i12 & 8) != 0 ? aVar.f9898d : false;
        PanelCardItem.b bVar = (i12 & 32) != 0 ? aVar.f9899e : null;
        a.C9655a c9655a = aVar.f9900f;
        PanelCardItem.Style style = PanelCardItem.Style.f313695b;
        return new a(printableText, printableText2, z12, bVar, c9655a);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    /* renamed from: L1, reason: from getter */
    public final boolean getF9898d() {
        return this.f9898d;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @k
    /* renamed from: N0 */
    public final PanelCardItem.Style getF313307g() {
        return PanelCardItem.Style.f313695b;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    /* renamed from: a1 */
    public final int getF313311k() {
        return 1;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @k
    /* renamed from: b2 */
    public final PanelCardItem.HyphenationFrequency getF313310j() {
        return PanelCardItem.HyphenationFrequency.f313691b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (!this.f9896b.equals(aVar.f9896b) || !this.f9897c.equals(aVar.f9897c) || this.f9898d != aVar.f9898d || !L.f(null, null) || !L.f(this.f9899e, aVar.f9899e) || !this.f9900f.equals(aVar.f9900f)) {
            return false;
        }
        PanelCardItem.Style style = PanelCardItem.Style.f313695b;
        return true;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF272735b() {
        return "panel-soa-item-id";
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @k
    /* renamed from: getSubtitle, reason: from getter */
    public final PrintableText getF9897c() {
        return this.f9897c;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final PrintableText getF9896b() {
        return this.f9896b;
    }

    public final int hashCode() {
        int i12 = r.i(com.avito.android.actions_sheet.a.f(this.f9897c, com.avito.android.actions_sheet.a.f(this.f9896b, 284651772, 31), 31), 961, this.f9898d);
        PanelCardItem.b bVar = this.f9899e;
        return PanelCardItem.Style.f313695b.hashCode() + ((this.f9900f.hashCode() + ((i12 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @k
    /* renamed from: l1 */
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a getF313312l() {
        return this.f9900f;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @l
    /* renamed from: p1, reason: from getter */
    public final PanelCardItem.b getF9899e() {
        return this.f9899e;
    }

    @k
    public final String toString() {
        return "PanelSoaItem(stringId=panel-soa-item-id, title=" + this.f9896b + ", subtitle=" + this.f9897c + ", isUpdating=" + this.f9898d + ", badgeTitle=null, tooltip=" + this.f9899e + ", cardIcon=" + this.f9900f + ", cardStyle=" + PanelCardItem.Style.f313695b + ')';
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem
    @l
    /* renamed from: x0 */
    public final String getF313309i() {
        return null;
    }
}
