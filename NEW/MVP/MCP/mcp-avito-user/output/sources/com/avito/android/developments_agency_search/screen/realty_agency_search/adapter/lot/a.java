package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import ex.C40176c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LotSearchResultItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f138406b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C40176c f138407c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PrintableText f138408d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final b f138409e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PrintableText f138410f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C4179a f138411g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f138412h;

    /* compiled from: LotSearchResultItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/a$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4179a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f138413a;

        public C4179a(boolean z12) {
            this.f138413a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4179a) && this.f138413a == ((C4179a) obj).f138413a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f138413a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("AddToSelectionButton(showLoader="), this.f138413a, ')');
        }
    }

    /* compiled from: LotSearchResultItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/a$b;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f138414a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f138415b;

        public b(@Y61.k String str, boolean z12) {
            this.f138414a = str;
            this.f138415b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f138414a, bVar.f138414a) && this.f138415b == bVar.f138415b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f138415b) + (this.f138414a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MainPrice(text=");
            sb2.append(this.f138414a);
            sb2.append(", isInfoIconVisible=");
            return r.x(sb2, this.f138415b, ')');
        }
    }

    public a(@Y61.k String str, @Y61.k C40176c c40176c, @Y61.k PrintableText printableText, @Y61.k b bVar, @Y61.k PrintableText printableText2, @Y61.k C4179a c4179a, @Y61.k ArrayList arrayList) {
        this.f138406b = str;
        this.f138407c = c40176c;
        this.f138408d = printableText;
        this.f138409e = bVar;
        this.f138410f = printableText2;
        this.f138411g = c4179a;
        this.f138412h = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f138406b, aVar.f138406b) && this.f138407c.equals(aVar.f138407c) && this.f138408d.equals(aVar.f138408d) && this.f138409e.equals(aVar.f138409e) && this.f138410f.equals(aVar.f138410f) && this.f138411g.equals(aVar.f138411g) && this.f138412h.equals(aVar.f138412h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return getF86898b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF86898b() {
        return this.f138406b;
    }

    public final int hashCode() {
        return this.f138412h.hashCode() + r.i(com.avito.android.actions_sheet.a.f(this.f138410f, (this.f138409e.hashCode() + com.avito.android.actions_sheet.a.f(this.f138408d, (this.f138407c.hashCode() + (this.f138406b.hashCode() * 31)) * 31, 31)) * 31, 31), 31, this.f138411g.f138413a);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LotSearchResultItem(stringId=");
        sb2.append(this.f138406b);
        sb2.append(", lotItem=");
        sb2.append(this.f138407c);
        sb2.append(", title=");
        sb2.append(this.f138408d);
        sb2.append(", mainPrice=");
        sb2.append(this.f138409e);
        sb2.append(", agentCommission=");
        sb2.append(this.f138410f);
        sb2.append(", addToSelectionButton=");
        sb2.append(this.f138411g);
        sb2.append(", metro=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f138412h, ')');
    }
}
