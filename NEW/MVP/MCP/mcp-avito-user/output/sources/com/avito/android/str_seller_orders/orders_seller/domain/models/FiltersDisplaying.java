package com.avito.android.str_seller_orders.orders_seller.domain.models;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/models/FiltersDisplaying;", "", "Style", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FiltersDisplaying {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f289340a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Style f289341b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f289342c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrSellerOrdersResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/models/FiltersDisplaying$Style;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f289343b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f289344c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Style[] f289345d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f289346e;

        static {
            Style style = new Style("CHECKBOX", 0);
            f289343b = style;
            Style style2 = new Style("CHECKMARK", 1);
            f289344c = style2;
            Style[] styleArr = {style, style2};
            f289345d = styleArr;
            f289346e = c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f289345d.clone();
        }
    }

    public FiltersDisplaying(@l String str, @l Style style, @l String str2) {
        this.f289340a = str;
        this.f289341b = style;
        this.f289342c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersDisplaying)) {
            return false;
        }
        FiltersDisplaying filtersDisplaying = (FiltersDisplaying) obj;
        return L.f(this.f289340a, filtersDisplaying.f289340a) && this.f289341b == filtersDisplaying.f289341b && L.f(this.f289342c, filtersDisplaying.f289342c);
    }

    public final int hashCode() {
        String str = this.f289340a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Style style = this.f289341b;
        int iHashCode2 = (iHashCode + (style == null ? 0 : style.hashCode())) * 31;
        String str2 = this.f289342c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersDisplaying(buttonTitle=");
        sb2.append(this.f289340a);
        sb2.append(", style=");
        sb2.append(this.f289341b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f289342c, ')');
    }
}
