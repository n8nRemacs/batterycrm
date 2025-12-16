package com.avito.android.advert.item.short_term_rent.payment_toggles;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsTravelPaymentToggleAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b;", "", "a", "b", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b$a;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: AdvertDetailsTravelPaymentToggleAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b$a;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f80079a;

        public a(@Y61.k DeepLink deepLink) {
            this.f80079a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f80079a, ((a) obj).f80079a);
        }

        public final int hashCode() {
            return this.f80079a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f80079a, ')');
        }
    }

    /* compiled from: AdvertDetailsTravelPaymentToggleAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b$b;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.short_term_rent.payment_toggles.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2366b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f80080a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f80081b;

        public C2366b(@Y61.k String str, boolean z12) {
            this.f80080a = str;
            this.f80081b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2366b)) {
                return false;
            }
            C2366b c2366b = (C2366b) obj;
            return L.f(this.f80080a, c2366b.f80080a) && this.f80081b == c2366b.f80081b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f80081b) + (this.f80080a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleClick(id=");
            sb2.append(this.f80080a);
            sb2.append(", isChecked=");
            return r.x(sb2, this.f80081b, ')');
        }
    }
}
