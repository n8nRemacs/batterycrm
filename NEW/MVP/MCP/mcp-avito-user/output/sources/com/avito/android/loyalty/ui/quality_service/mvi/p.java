package com.avito.android.loyalty.ui.quality_service.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceScreenData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/p;", "", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f184023a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f184024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<String> f184025c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final IW.b f184026d;

    /* compiled from: QualityServiceScreenData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/p$a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f184027a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f184028b;

        public a(@Y61.k DeepLink deepLink, @Y61.k PrintableText printableText) {
            this.f184027a = printableText;
            this.f184028b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f184027a, aVar.f184027a) && L.f(this.f184028b, aVar.f184028b);
        }

        public final int hashCode() {
            return this.f184028b.hashCode() + (this.f184027a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f184027a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f184028b, ')');
        }
    }

    public p(@Y61.k a aVar, @Y61.k ArrayList arrayList, @Y61.l List list, @Y61.l IW.b bVar) {
        this.f184023a = aVar;
        this.f184024b = arrayList;
        this.f184025c = list;
        this.f184026d = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f184023a.equals(pVar.f184023a) && this.f184024b.equals(pVar.f184024b) && L.f(this.f184025c, pVar.f184025c) && L.f(this.f184026d, pVar.f184026d);
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f184024b, this.f184023a.hashCode() * 31, 31);
        List<String> list = this.f184025c;
        int iHashCode = (iG2 + (list == null ? 0 : list.hashCode())) * 31;
        IW.b bVar = this.f184026d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "QualityServiceScreenData(action=" + this.f184023a + ", items=" + this.f184024b + ", alerts=" + this.f184025c + ", analyticsInfo=" + this.f184026d + ')';
    }
}
