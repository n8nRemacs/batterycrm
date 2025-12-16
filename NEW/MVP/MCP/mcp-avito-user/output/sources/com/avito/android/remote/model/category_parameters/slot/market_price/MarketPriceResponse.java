package com.avito.android.remote.model.category_parameters.slot.market_price;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.PriceBadge;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarketPriceResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse;", "", "marketPrice", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$MarketPrice;", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "priceRanges", "", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceRange;", "priceDescription", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceDescription;", "(Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$MarketPrice;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceDescription;)V", "getMarketPrice", "()Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$MarketPrice;", "getPriceDescription", "()Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceDescription;", "getPriceRanges", "()Ljava/util/List;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "MarketPrice", "PriceDescription", "PriceRange", "PriceRangeV2", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarketPriceResponse {

    @c("marketPrice")
    @l
    private final MarketPrice marketPrice;

    @c("priceDescription")
    @l
    private final PriceDescription priceDescription;

    @c("priceRanges")
    @l
    private final List<PriceRange> priceRanges;

    @c("text")
    @l
    private final AttributedText text;

    /* compiled from: MarketPriceResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$MarketPrice;", "", "price", "", "formattedPrice", "Lcom/avito/android/remote/model/text/AttributedText;", "(JLcom/avito/android/remote/model/text/AttributedText;)V", "getFormattedPrice", "()Lcom/avito/android/remote/model/text/AttributedText;", "getPrice", "()J", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MarketPrice {

        @c("formattedPrice")
        @k
        private final AttributedText formattedPrice;

        @c("price")
        private final long price;

        public MarketPrice(long j12, @k AttributedText attributedText) {
            this.price = j12;
            this.formattedPrice = attributedText;
        }

        @k
        public final AttributedText getFormattedPrice() {
            return this.formattedPrice;
        }

        public final long getPrice() {
            return this.price;
        }
    }

    public MarketPriceResponse(@l MarketPrice marketPrice, @l AttributedText attributedText, @l List<PriceRange> list, @l PriceDescription priceDescription) {
        this.marketPrice = marketPrice;
        this.text = attributedText;
        this.priceRanges = list;
        this.priceDescription = priceDescription;
    }

    @l
    public final MarketPrice getMarketPrice() {
        return this.marketPrice;
    }

    @l
    public final PriceDescription getPriceDescription() {
        return this.priceDescription;
    }

    @l
    public final List<PriceRange> getPriceRanges() {
        return this.priceRanges;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    /* compiled from: MarketPriceResponse.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceDescription;", "", "priceRecommend", "", "details", "Lcom/avito/android/remote/model/text/AttributedText;", "emptyDescription", "emptyBadge", "ranges", "", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceRangeV2;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "getDetails", "()Lcom/avito/android/remote/model/text/AttributedText;", "getEmptyBadge", "getEmptyDescription", "()Ljava/lang/String;", "getPriceRecommend", "getRanges", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PriceDescription {

        @c("details")
        @l
        private final AttributedText details;

        @c("emptyBadgeText")
        @l
        private final AttributedText emptyBadge;

        @c("emptyDescription")
        @l
        private final String emptyDescription;

        @c("priceRecommend")
        @l
        private final String priceRecommend;

        @c("priceRanges")
        @k
        private final List<PriceRangeV2> ranges;

        public PriceDescription(@l String str, @l AttributedText attributedText, @l String str2, @l AttributedText attributedText2, @k List<PriceRangeV2> list) {
            this.priceRecommend = str;
            this.details = attributedText;
            this.emptyDescription = str2;
            this.emptyBadge = attributedText2;
            this.ranges = list;
        }

        public static /* synthetic */ PriceDescription copy$default(PriceDescription priceDescription, String str, AttributedText attributedText, String str2, AttributedText attributedText2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = priceDescription.priceRecommend;
            }
            if ((i12 & 2) != 0) {
                attributedText = priceDescription.details;
            }
            AttributedText attributedText3 = attributedText;
            if ((i12 & 4) != 0) {
                str2 = priceDescription.emptyDescription;
            }
            String str3 = str2;
            if ((i12 & 8) != 0) {
                attributedText2 = priceDescription.emptyBadge;
            }
            AttributedText attributedText4 = attributedText2;
            if ((i12 & 16) != 0) {
                list = priceDescription.ranges;
            }
            return priceDescription.copy(str, attributedText3, str3, attributedText4, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getPriceRecommend() {
            return this.priceRecommend;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedText getDetails() {
            return this.details;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getEmptyDescription() {
            return this.emptyDescription;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final AttributedText getEmptyBadge() {
            return this.emptyBadge;
        }

        @k
        public final List<PriceRangeV2> component5() {
            return this.ranges;
        }

        @k
        public final PriceDescription copy(@l String priceRecommend, @l AttributedText details, @l String emptyDescription, @l AttributedText emptyBadge, @k List<PriceRangeV2> ranges) {
            return new PriceDescription(priceRecommend, details, emptyDescription, emptyBadge, ranges);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDescription)) {
                return false;
            }
            PriceDescription priceDescription = (PriceDescription) other;
            return L.f(this.priceRecommend, priceDescription.priceRecommend) && L.f(this.details, priceDescription.details) && L.f(this.emptyDescription, priceDescription.emptyDescription) && L.f(this.emptyBadge, priceDescription.emptyBadge) && L.f(this.ranges, priceDescription.ranges);
        }

        @l
        public final AttributedText getDetails() {
            return this.details;
        }

        @l
        public final AttributedText getEmptyBadge() {
            return this.emptyBadge;
        }

        @l
        public final String getEmptyDescription() {
            return this.emptyDescription;
        }

        @l
        public final String getPriceRecommend() {
            return this.priceRecommend;
        }

        @k
        public final List<PriceRangeV2> getRanges() {
            return this.ranges;
        }

        public int hashCode() {
            String str = this.priceRecommend;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.details;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str2 = this.emptyDescription;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AttributedText attributedText2 = this.emptyBadge;
            return this.ranges.hashCode() + ((iHashCode3 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PriceDescription(priceRecommend=");
            sb2.append(this.priceRecommend);
            sb2.append(", details=");
            sb2.append(this.details);
            sb2.append(", emptyDescription=");
            sb2.append(this.emptyDescription);
            sb2.append(", emptyBadge=");
            sb2.append(this.emptyBadge);
            sb2.append(", ranges=");
            return H.p(sb2, this.ranges, ')');
        }

        public /* synthetic */ PriceDescription(String str, AttributedText attributedText, String str2, AttributedText attributedText2, List list, int i12, C42822w c42822w) {
            this(str, attributedText, str2, (i12 & 8) != 0 ? null : attributedText2, list);
        }
    }

    /* compiled from: MarketPriceResponse.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceRange;", "", "min", "", "max", "priceType", "", "priceBadge", "Lcom/avito/android/remote/model/PriceBadge;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", "(JJLjava/lang/String;Lcom/avito/android/remote/model/PriceBadge;Lcom/avito/android/remote/model/text/AttributedText;)V", "getDisclaimer", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMax", "()J", "getMin", "getPriceBadge", "()Lcom/avito/android/remote/model/PriceBadge;", "getPriceType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PriceRange {

        @c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @k
        private final AttributedText disclaimer;

        @c("max")
        private final long max;

        @c("min")
        private final long min;

        @c("priceBadge")
        @l
        private final PriceBadge priceBadge;

        @c("priceType")
        @l
        private final String priceType;

        public PriceRange(long j12, long j13, @l String str, @l PriceBadge priceBadge, @k AttributedText attributedText) {
            this.min = j12;
            this.max = j13;
            this.priceType = str;
            this.priceBadge = priceBadge;
            this.disclaimer = attributedText;
        }

        /* renamed from: component1, reason: from getter */
        public final long getMin() {
            return this.min;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMax() {
            return this.max;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getPriceType() {
            return this.priceType;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final PriceBadge getPriceBadge() {
            return this.priceBadge;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final AttributedText getDisclaimer() {
            return this.disclaimer;
        }

        @k
        public final PriceRange copy(long min, long max, @l String priceType, @l PriceBadge priceBadge, @k AttributedText disclaimer) {
            return new PriceRange(min, max, priceType, priceBadge, disclaimer);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceRange)) {
                return false;
            }
            PriceRange priceRange = (PriceRange) other;
            return this.min == priceRange.min && this.max == priceRange.max && L.f(this.priceType, priceRange.priceType) && L.f(this.priceBadge, priceRange.priceBadge) && L.f(this.disclaimer, priceRange.disclaimer);
        }

        @k
        public final AttributedText getDisclaimer() {
            return this.disclaimer;
        }

        public final long getMax() {
            return this.max;
        }

        public final long getMin() {
            return this.min;
        }

        @l
        public final PriceBadge getPriceBadge() {
            return this.priceBadge;
        }

        @l
        public final String getPriceType() {
            return this.priceType;
        }

        public int hashCode() {
            int iG2 = r.g(Long.hashCode(this.min) * 31, 31, this.max);
            String str = this.priceType;
            int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            PriceBadge priceBadge = this.priceBadge;
            return this.disclaimer.hashCode() + ((iHashCode + (priceBadge != null ? priceBadge.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PriceRange(min=");
            sb2.append(this.min);
            sb2.append(", max=");
            sb2.append(this.max);
            sb2.append(", priceType=");
            sb2.append(this.priceType);
            sb2.append(", priceBadge=");
            sb2.append(this.priceBadge);
            sb2.append(", disclaimer=");
            return a.w(sb2, this.disclaimer, ')');
        }

        public /* synthetic */ PriceRange(long j12, long j13, String str, PriceBadge priceBadge, AttributedText attributedText, int i12, C42822w c42822w) {
            this(j12, j13, (i12 & 4) != 0 ? null : str, priceBadge, attributedText);
        }
    }

    /* compiled from: MarketPriceResponse.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\bHÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse$PriceRangeV2;", "", "min", "", "max", "type", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceNoticeType;", "description", "", "highlightedText", "badgeText", "Lcom/avito/android/remote/model/text/AttributedText;", "notices", "", "noticeColor", "Lcom/avito/android/remote/model/UniversalColor;", "priceBadge", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceBadge;", "callout", "(JJLcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceNoticeType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceBadge;Ljava/lang/String;)V", "getBadgeText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getCallout", "()Ljava/lang/String;", "getDescription", "getHighlightedText", "getMax", "()J", "getMin", "getNoticeColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getNotices", "()Ljava/util/List;", "getPriceBadge", "()Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceBadge;", "getType", "()Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceNoticeType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PriceRangeV2 {

        @c("badgeText")
        @l
        private final AttributedText badgeText;

        @c("callout")
        @l
        private final String callout;

        @c("description")
        @k
        private final String description;

        @c("highlightedText")
        @l
        private final String highlightedText;

        @c("max")
        private final long max;

        @c("min")
        private final long min;

        @c("noticeColor")
        @l
        private final UniversalColor noticeColor;

        @c("notices")
        @l
        private final List<String> notices;

        @c("priceBadge")
        @l
        private final MarketPriceBadge priceBadge;

        @c("type")
        @l
        private final MarketPriceNoticeType type;

        public PriceRangeV2(long j12, long j13, @l MarketPriceNoticeType marketPriceNoticeType, @k String str, @l String str2, @l AttributedText attributedText, @l List<String> list, @l UniversalColor universalColor, @l MarketPriceBadge marketPriceBadge, @l String str3) {
            this.min = j12;
            this.max = j13;
            this.type = marketPriceNoticeType;
            this.description = str;
            this.highlightedText = str2;
            this.badgeText = attributedText;
            this.notices = list;
            this.noticeColor = universalColor;
            this.priceBadge = marketPriceBadge;
            this.callout = str3;
        }

        /* renamed from: component1, reason: from getter */
        public final long getMin() {
            return this.min;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getCallout() {
            return this.callout;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMax() {
            return this.max;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final MarketPriceNoticeType getType() {
            return this.type;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getHighlightedText() {
            return this.highlightedText;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final AttributedText getBadgeText() {
            return this.badgeText;
        }

        @l
        public final List<String> component7() {
            return this.notices;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final UniversalColor getNoticeColor() {
            return this.noticeColor;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final MarketPriceBadge getPriceBadge() {
            return this.priceBadge;
        }

        @k
        public final PriceRangeV2 copy(long min, long max, @l MarketPriceNoticeType type, @k String description, @l String highlightedText, @l AttributedText badgeText, @l List<String> notices, @l UniversalColor noticeColor, @l MarketPriceBadge priceBadge, @l String callout) {
            return new PriceRangeV2(min, max, type, description, highlightedText, badgeText, notices, noticeColor, priceBadge, callout);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceRangeV2)) {
                return false;
            }
            PriceRangeV2 priceRangeV2 = (PriceRangeV2) other;
            return this.min == priceRangeV2.min && this.max == priceRangeV2.max && this.type == priceRangeV2.type && L.f(this.description, priceRangeV2.description) && L.f(this.highlightedText, priceRangeV2.highlightedText) && L.f(this.badgeText, priceRangeV2.badgeText) && L.f(this.notices, priceRangeV2.notices) && L.f(this.noticeColor, priceRangeV2.noticeColor) && L.f(this.priceBadge, priceRangeV2.priceBadge) && L.f(this.callout, priceRangeV2.callout);
        }

        @l
        public final AttributedText getBadgeText() {
            return this.badgeText;
        }

        @l
        public final String getCallout() {
            return this.callout;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getHighlightedText() {
            return this.highlightedText;
        }

        public final long getMax() {
            return this.max;
        }

        public final long getMin() {
            return this.min;
        }

        @l
        public final UniversalColor getNoticeColor() {
            return this.noticeColor;
        }

        @l
        public final List<String> getNotices() {
            return this.notices;
        }

        @l
        public final MarketPriceBadge getPriceBadge() {
            return this.priceBadge;
        }

        @l
        public final MarketPriceNoticeType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG2 = r.g(Long.hashCode(this.min) * 31, 31, this.max);
            MarketPriceNoticeType marketPriceNoticeType = this.type;
            int iD2 = H.d((iG2 + (marketPriceNoticeType == null ? 0 : marketPriceNoticeType.hashCode())) * 31, 31, this.description);
            String str = this.highlightedText;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.badgeText;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            List<String> list = this.notices;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            UniversalColor universalColor = this.noticeColor;
            int iHashCode4 = (iHashCode3 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            MarketPriceBadge marketPriceBadge = this.priceBadge;
            int iHashCode5 = (iHashCode4 + (marketPriceBadge == null ? 0 : marketPriceBadge.hashCode())) * 31;
            String str2 = this.callout;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PriceRangeV2(min=");
            sb2.append(this.min);
            sb2.append(", max=");
            sb2.append(this.max);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", highlightedText=");
            sb2.append(this.highlightedText);
            sb2.append(", badgeText=");
            sb2.append(this.badgeText);
            sb2.append(", notices=");
            sb2.append(this.notices);
            sb2.append(", noticeColor=");
            sb2.append(this.noticeColor);
            sb2.append(", priceBadge=");
            sb2.append(this.priceBadge);
            sb2.append(", callout=");
            return C22026a.c(sb2, this.callout, ')');
        }

        public /* synthetic */ PriceRangeV2(long j12, long j13, MarketPriceNoticeType marketPriceNoticeType, String str, String str2, AttributedText attributedText, List list, UniversalColor universalColor, MarketPriceBadge marketPriceBadge, String str3, int i12, C42822w c42822w) {
            this(j12, j13, (i12 & 4) != 0 ? null : marketPriceNoticeType, str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : attributedText, (i12 & 64) != 0 ? null : list, (i12 & 128) != 0 ? null : universalColor, (i12 & 256) != 0 ? null : marketPriceBadge, (i12 & 512) != 0 ? null : str3);
        }
    }
}
