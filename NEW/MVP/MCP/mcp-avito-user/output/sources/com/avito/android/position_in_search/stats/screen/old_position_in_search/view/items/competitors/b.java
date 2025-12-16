package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompetitorsItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220950b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f220951c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f220952d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f220953e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Y41.l<DeepLink, G0> f220954f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f220955g;

    /* compiled from: CompetitorsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/b$a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.conveyor_item.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220956b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f220957c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220958d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f220959e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f220960f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final C6675a f220961g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final DeepLink f220962h;

        /* compiled from: CompetitorsItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/b$a$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6675a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Integer f220963a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f220964b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f220965c;

            public C6675a(@InterfaceC42150f @l Integer num, @k String str, @l String str2) {
                this.f220963a = num;
                this.f220964b = str;
                this.f220965c = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6675a)) {
                    return false;
                }
                C6675a c6675a = (C6675a) obj;
                return L.f(this.f220963a, c6675a.f220963a) && L.f(this.f220964b, c6675a.f220964b) && L.f(this.f220965c, c6675a.f220965c);
            }

            public final int hashCode() {
                Integer num = this.f220963a;
                int iD2 = H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f220964b);
                String str = this.f220965c;
                return iD2 + (str != null ? str.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Views(iconAttr=");
                sb2.append(this.f220963a);
                sb2.append(", currentCount=");
                sb2.append(this.f220964b);
                sb2.append(", deltaCount=");
                return C22026a.c(sb2, this.f220965c, ')');
            }
        }

        public a(@k String str, @l Image image, @k String str2, @k String str3, @k String str4, @l C6675a c6675a, @k DeepLink deepLink) {
            this.f220956b = str;
            this.f220957c = image;
            this.f220958d = str2;
            this.f220959e = str3;
            this.f220960f = str4;
            this.f220961g = c6675a;
            this.f220962h = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f220956b, aVar.f220956b) && L.f(this.f220957c, aVar.f220957c) && L.f(this.f220958d, aVar.f220958d) && L.f(this.f220959e, aVar.f220959e) && L.f(this.f220960f, aVar.f220960f) && L.f(this.f220961g, aVar.f220961g) && L.f(this.f220962h, aVar.f220962h);
        }

        @Override // TV0.a
        public final long getId() {
            return getF199793b().hashCode();
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF199793b() {
            return this.f220956b;
        }

        public final int hashCode() {
            int iHashCode = this.f220956b.hashCode() * 31;
            Image image = this.f220957c;
            int iD2 = H.d(H.d(H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f220958d), 31, this.f220959e), 31, this.f220960f);
            C6675a c6675a = this.f220961g;
            return this.f220962h.hashCode() + ((iD2 + (c6675a != null ? c6675a.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CompetitorItem(stringId=");
            sb2.append(this.f220956b);
            sb2.append(", image=");
            sb2.append(this.f220957c);
            sb2.append(", price=");
            sb2.append(this.f220958d);
            sb2.append(", title=");
            sb2.append(this.f220959e);
            sb2.append(", location=");
            sb2.append(this.f220960f);
            sb2.append(", views=");
            sb2.append(this.f220961g);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f220962h, ')');
        }
    }

    public b(@k String str, @l String str2, @k AttributedText attributedText, @k ArrayList arrayList, @k Y41.l lVar, boolean z12) {
        this.f220950b = str;
        this.f220951c = str2;
        this.f220952d = attributedText;
        this.f220953e = arrayList;
        this.f220954f = lVar;
        this.f220955g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return L.f(this.f220950b, bVar.f220950b) && L.f(this.f220951c, bVar.f220951c) && L.f(this.f220952d, bVar.f220952d) && this.f220953e.equals(bVar.f220953e) && this.f220954f.equals(bVar.f220954f) && this.f220955g == bVar.f220955g;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF199793b() {
        return "position_in_search_competitors";
    }

    public final int hashCode() {
        int iD2 = H.d(1054310188, 31, this.f220950b);
        String str = this.f220951c;
        return Boolean.hashCode(this.f220955g) + ((this.f220954f.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f220953e, com.avito.android.actions_sheet.a.b((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f220952d), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompetitorsItem(stringId=position_in_search_competitors, title=");
        sb2.append(this.f220950b);
        sb2.append(", titleBadge=");
        sb2.append(this.f220951c);
        sb2.append(", description=");
        sb2.append(this.f220952d);
        sb2.append(", items=");
        sb2.append(this.f220953e);
        sb2.append(", onCompetitorClick=");
        sb2.append(this.f220954f);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f220955g, ')');
    }
}
