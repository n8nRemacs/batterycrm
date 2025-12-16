package com.avito.android.user_advert.advert.items.installments_promoblock;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsPromoBlockItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/lib/util/groupable_item/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.lib.util.groupable_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309490b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309491c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f309492d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f309493e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PromoStyle f309494f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final C9491a f309495g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.analytics.provider.clickstream.a f309496h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f309497i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final GroupingOutput f309498j;

    /* compiled from: InstallmentsPromoBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/a$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.items.installments_promoblock.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9491a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f309499a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AttributedText f309500b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.user_advert.advert.items.safe_deal_services.a f309501c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f309502d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f309503e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f309504f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.analytics.provider.clickstream.a f309505g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final List<l> f309506h;

        public C9491a() {
            this(null, null, null, false, null, false, null, null, 255, null);
        }

        public static C9491a a(C9491a c9491a, boolean z12) {
            String str = c9491a.f309499a;
            AttributedText attributedText = c9491a.f309500b;
            com.avito.android.user_advert.advert.items.safe_deal_services.a aVar = c9491a.f309501c;
            boolean z13 = c9491a.f309502d;
            String str2 = c9491a.f309503e;
            com.avito.android.analytics.provider.clickstream.a aVar2 = c9491a.f309505g;
            List<l> list = c9491a.f309506h;
            c9491a.getClass();
            return new C9491a(str, attributedText, aVar, z13, str2, z12, aVar2, list);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9491a)) {
                return false;
            }
            C9491a c9491a = (C9491a) obj;
            return L.f(this.f309499a, c9491a.f309499a) && L.f(this.f309500b, c9491a.f309500b) && L.f(this.f309501c, c9491a.f309501c) && this.f309502d == c9491a.f309502d && L.f(this.f309503e, c9491a.f309503e) && this.f309504f == c9491a.f309504f && L.f(this.f309505g, c9491a.f309505g) && L.f(this.f309506h, c9491a.f309506h);
        }

        public final int hashCode() {
            String str = this.f309499a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.f309500b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            com.avito.android.user_advert.advert.items.safe_deal_services.a aVar = this.f309501c;
            int i12 = r.i((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f309502d);
            String str2 = this.f309503e;
            int i13 = r.i((i12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f309504f);
            com.avito.android.analytics.provider.clickstream.a aVar2 = this.f309505g;
            return this.f309506h.hashCode() + ((i13 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Switcher(title=");
            sb2.append(this.f309499a);
            sb2.append(", subtitle=");
            sb2.append(this.f309500b);
            sb2.append(", icon=");
            sb2.append(this.f309501c);
            sb2.append(", isSwitchOn=");
            sb2.append(this.f309502d);
            sb2.append(", refreshUrl=");
            sb2.append(this.f309503e);
            sb2.append(", isLoading=");
            sb2.append(this.f309504f);
            sb2.append(", subtitleClickEvent=");
            sb2.append(this.f309505g);
            sb2.append(", actions=");
            return H.p(sb2, this.f309506h, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C9491a(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar, boolean z12, @Y61.l String str2, boolean z13, @Y61.l com.avito.android.analytics.provider.clickstream.a aVar2, @Y61.k List<? extends l> list) {
            this.f309499a = str;
            this.f309500b = attributedText;
            this.f309501c = aVar;
            this.f309502d = z12;
            this.f309503e = str2;
            this.f309504f = z13;
            this.f309505g = aVar2;
            this.f309506h = list;
        }

        public C9491a(String str, AttributedText attributedText, com.avito.android.user_advert.advert.items.safe_deal_services.a aVar, boolean z12, String str2, boolean z13, com.avito.android.analytics.provider.clickstream.a aVar2, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : attributedText, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : str2, (i12 & 32) == 0 ? z13 : false, (i12 & 64) == 0 ? aVar2 : null, (i12 & 128) != 0 ? C42784z0.f406748b : list);
        }
    }

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k PromoStyle promoStyle, @Y61.l C9491a c9491a, @Y61.l com.avito.android.analytics.provider.clickstream.a aVar, boolean z12, @Y61.k GroupingOutput groupingOutput) {
        this.f309490b = str;
        this.f309491c = str2;
        this.f309492d = attributedText;
        this.f309493e = attributedText2;
        this.f309494f = promoStyle;
        this.f309495g = c9491a;
        this.f309496h = aVar;
        this.f309497i = z12;
        this.f309498j = groupingOutput;
    }

    public static a a(a aVar, C9491a c9491a) {
        String str = aVar.f309490b;
        String str2 = aVar.f309491c;
        AttributedText attributedText = aVar.f309492d;
        AttributedText attributedText2 = aVar.f309493e;
        PromoStyle promoStyle = aVar.f309494f;
        com.avito.android.analytics.provider.clickstream.a aVar2 = aVar.f309496h;
        boolean z12 = aVar.f309497i;
        GroupingOutput groupingOutput = aVar.f309498j;
        aVar.getClass();
        return new a(str, str2, attributedText, attributedText2, promoStyle, c9491a, aVar2, z12, groupingOutput);
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W, reason: from getter */
    public final boolean getF309497i() {
        return this.f309497i;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309490b, aVar.f309490b) && L.f(this.f309491c, aVar.f309491c) && L.f(this.f309492d, aVar.f309492d) && L.f(this.f309493e, aVar.f309493e) && this.f309494f == aVar.f309494f && L.f(this.f309495g, aVar.f309495g) && L.f(this.f309496h, aVar.f309496h) && this.f309497i == aVar.f309497i && L.f(this.f309498j, aVar.f309498j);
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF309498j() {
        return this.f309498j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF309447b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309447b() {
        return this.f309490b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f309490b.hashCode() * 31, 31, this.f309491c);
        AttributedText attributedText = this.f309492d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f309493e;
        int iHashCode2 = (this.f309494f.hashCode() + ((iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31)) * 31;
        C9491a c9491a = this.f309495g;
        int iHashCode3 = (iHashCode2 + (c9491a == null ? 0 : c9491a.hashCode())) * 31;
        com.avito.android.analytics.provider.clickstream.a aVar = this.f309496h;
        return this.f309498j.hashCode() + r.i((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f309497i);
    }

    @Y61.k
    public final String toString() {
        return "InstallmentsPromoBlockItem(stringId=" + this.f309490b + ", advertId=" + this.f309491c + ", title=" + this.f309492d + ", subtitle=" + this.f309493e + ", style=" + this.f309494f + ", switcher=" + this.f309495g + ", displayEvent=" + this.f309496h + ", closeable=" + this.f309497i + ", output=" + this.f309498j + ')';
    }

    public /* synthetic */ a(String str, String str2, AttributedText attributedText, AttributedText attributedText2, PromoStyle promoStyle, C9491a c9491a, com.avito.android.analytics.provider.clickstream.a aVar, boolean z12, GroupingOutput groupingOutput, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : attributedText2, (i12 & 16) != 0 ? PromoStyle.VIOLET : promoStyle, (i12 & 32) != 0 ? null : c9491a, (i12 & 64) != 0 ? null : aVar, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? new GroupingOutput() : groupingOutput);
    }
}
