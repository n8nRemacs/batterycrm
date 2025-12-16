package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import dx.C39815c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentSearchResultItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f138301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C39815c f138302c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C4173a f138303d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f138304e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f138305f;

    /* compiled from: DevelopmentSearchResultItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/a$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4173a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f138306a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f138307b;

        public C4173a(@Y61.k PrintableText printableText, boolean z12) {
            this.f138306a = printableText;
            this.f138307b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4173a)) {
                return false;
            }
            C4173a c4173a = (C4173a) obj;
            return L.f(this.f138306a, c4173a.f138306a) && this.f138307b == c4173a.f138307b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f138307b) + (this.f138306a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentCommission(text=");
            sb2.append(this.f138306a);
            sb2.append(", isInfoIconVisible=");
            return r.x(sb2, this.f138307b, ')');
        }
    }

    public a(@Y61.k String str, @Y61.k C39815c c39815c, @Y61.k C4173a c4173a, @Y61.k String str2, @Y61.k ArrayList arrayList) {
        this.f138301b = str;
        this.f138302c = c39815c;
        this.f138303d = c4173a;
        this.f138304e = str2;
        this.f138305f = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f138301b, aVar.f138301b) && this.f138302c.equals(aVar.f138302c) && this.f138303d.equals(aVar.f138303d) && this.f138304e.equals(aVar.f138304e) && this.f138305f.equals(aVar.f138305f);
    }

    @Override // TV0.a
    public final long getId() {
        return getF106194b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106194b() {
        return this.f138301b;
    }

    public final int hashCode() {
        return this.f138305f.hashCode() + H.d((this.f138303d.hashCode() + ((this.f138302c.hashCode() + (this.f138301b.hashCode() * 31)) * 31)) * 31, 31, this.f138304e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentSearchResultItem(stringId=");
        sb2.append(this.f138301b);
        sb2.append(", developmentItem=");
        sb2.append(this.f138302c);
        sb2.append(", agentCommission=");
        sb2.append(this.f138303d);
        sb2.append(", clientFixationGalleryActionText=");
        sb2.append(this.f138304e);
        sb2.append(", metro=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f138305f, ')');
    }
}
