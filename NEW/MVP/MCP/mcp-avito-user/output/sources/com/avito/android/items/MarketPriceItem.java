package com.avito.android.items;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MarketPriceItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/items/MarketPriceItem;", "Lcom/avito/conveyor_item/a;", "a", "DealTypeImageName", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MarketPriceItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173901b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CharSequence f173902c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f173903d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CharSequence f173904e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<String> f173905f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketPriceItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/items/MarketPriceItem$DealTypeImageName;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DealTypeImageName {

        /* renamed from: b, reason: collision with root package name */
        public static final DealTypeImageName f173906b;

        /* renamed from: c, reason: collision with root package name */
        public static final DealTypeImageName f173907c;

        /* renamed from: d, reason: collision with root package name */
        public static final DealTypeImageName f173908d;

        /* renamed from: e, reason: collision with root package name */
        public static final DealTypeImageName f173909e;

        /* renamed from: f, reason: collision with root package name */
        public static final DealTypeImageName f173910f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ DealTypeImageName[] f173911g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f173912h;

        static {
            DealTypeImageName dealTypeImageName = new DealTypeImageName("PERFECT", 0);
            f173906b = dealTypeImageName;
            DealTypeImageName dealTypeImageName2 = new DealTypeImageName("VERY_GOOD", 1);
            f173907c = dealTypeImageName2;
            DealTypeImageName dealTypeImageName3 = new DealTypeImageName("GOOD", 2);
            f173908d = dealTypeImageName3;
            DealTypeImageName dealTypeImageName4 = new DealTypeImageName("BAD", 3);
            f173909e = dealTypeImageName4;
            DealTypeImageName dealTypeImageName5 = new DealTypeImageName("VERY_BAD", 4);
            f173910f = dealTypeImageName5;
            DealTypeImageName[] dealTypeImageNameArr = {dealTypeImageName, dealTypeImageName2, dealTypeImageName3, dealTypeImageName4, dealTypeImageName5};
            f173911g = dealTypeImageNameArr;
            f173912h = kotlin.enums.c.a(dealTypeImageNameArr);
        }

        public DealTypeImageName() {
            throw null;
        }

        public static DealTypeImageName valueOf(String str) {
            return (DealTypeImageName) Enum.valueOf(DealTypeImageName.class, str);
        }

        public static DealTypeImageName[] values() {
            return (DealTypeImageName[]) f173911g.clone();
        }
    }

    /* compiled from: MarketPriceItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/items/MarketPriceItem$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f173913a;

        /* renamed from: b, reason: collision with root package name */
        public final int f173914b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f173915c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DealTypeImageName f173916d;

        public a(@k String str, int i12, @l String str2, @l DealTypeImageName dealTypeImageName) {
            this.f173913a = str;
            this.f173914b = i12;
            this.f173915c = str2;
            this.f173916d = dealTypeImageName;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f173913a, aVar.f173913a) && this.f173914b == aVar.f173914b && L.f(this.f173915c, aVar.f173915c) && this.f173916d == aVar.f173916d;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f173914b, this.f173913a.hashCode() * 31, 31);
            String str = this.f173915c;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            DealTypeImageName dealTypeImageName = this.f173916d;
            return iHashCode + (dealTypeImageName != null ? dealTypeImageName.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "DealTypeBlock(title=" + this.f173913a + ", color=" + this.f173914b + ", subtitle=" + this.f173915c + ", image=" + this.f173916d + ')';
        }
    }

    public MarketPriceItem(@k String str, @k CharSequence charSequence, @l a aVar, @l CharSequence charSequence2, @l List<String> list) {
        this.f173901b = str;
        this.f173902c = charSequence;
        this.f173903d = aVar;
        this.f173904e = charSequence2;
        this.f173905f = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPriceItem)) {
            return false;
        }
        MarketPriceItem marketPriceItem = (MarketPriceItem) obj;
        return L.f(this.f173901b, marketPriceItem.f173901b) && L.f(this.f173902c, marketPriceItem.f173902c) && L.f(this.f173903d, marketPriceItem.f173903d) && L.f(this.f173904e, marketPriceItem.f173904e) && L.f(this.f173905f, marketPriceItem.f173905f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF244442b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244442b() {
        return this.f173901b;
    }

    public final int hashCode() {
        int iC2 = com.avito.android.advert.item.delivery_suggests.l.c(this.f173901b.hashCode() * 31, 31, this.f173902c);
        a aVar = this.f173903d;
        int iHashCode = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        CharSequence charSequence = this.f173904e;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List<String> list = this.f173905f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketPriceItem(stringId=");
        sb2.append(this.f173901b);
        sb2.append(", marketPrice=");
        sb2.append((Object) this.f173902c);
        sb2.append(", dealTypeBlock=");
        sb2.append(this.f173903d);
        sb2.append(", message=");
        sb2.append((Object) this.f173904e);
        sb2.append(", emptyDealType=");
        return H.p(sb2, this.f173905f, ')');
    }
}
