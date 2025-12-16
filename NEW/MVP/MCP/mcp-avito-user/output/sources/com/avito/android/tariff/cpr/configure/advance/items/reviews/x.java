package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceReviewsItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x;", "", "a", "b", "Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x$a;", "Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x$b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface x {

    /* compiled from: CprConfigureAdvanceReviewsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x$a;", "Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f295319a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f295320b;

        public a(@Y61.k AttributedText attributedText, @Y61.k DeepLink deepLink) {
            this.f295319a = attributedText;
            this.f295320b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f295319a, aVar.f295319a) && L.f(this.f295320b, aVar.f295320b);
        }

        @Override // com.avito.android.tariff.cpr.configure.advance.items.reviews.x
        @Y61.k
        /* renamed from: getText, reason: from getter */
        public final AttributedText getF295321a() {
            return this.f295319a;
        }

        public final int hashCode() {
            return this.f295320b.hashCode() + (this.f295319a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewsItemClick(text=");
            sb2.append(this.f295319a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f295320b, ')');
        }
    }

    /* compiled from: CprConfigureAdvanceReviewsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x$b;", "Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/x;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f295321a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f295322b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f295323c;

        public b(@Y61.k AttributedText attributedText, @Y61.k String str, boolean z12) {
            this.f295321a = attributedText;
            this.f295322b = z12;
            this.f295323c = str;
        }

        public static b a(b bVar, boolean z12) {
            AttributedText attributedText = bVar.f295321a;
            String str = bVar.f295323c;
            bVar.getClass();
            return new b(attributedText, str, z12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f295321a, bVar.f295321a) && this.f295322b == bVar.f295322b && L.f(this.f295323c, bVar.f295323c);
        }

        @Override // com.avito.android.tariff.cpr.configure.advance.items.reviews.x
        @Y61.k
        /* renamed from: getText, reason: from getter */
        public final AttributedText getF295321a() {
            return this.f295321a;
        }

        public final int hashCode() {
            return this.f295323c.hashCode() + androidx.appcompat.app.r.i(this.f295321a.hashCode() * 31, 31, this.f295322b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewsItemSelect(text=");
            sb2.append(this.f295321a);
            sb2.append(", isSelected=");
            sb2.append(this.f295322b);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f295323c, ')');
        }
    }

    @Y61.k
    /* renamed from: getText */
    AttributedText getF295321a();
}
