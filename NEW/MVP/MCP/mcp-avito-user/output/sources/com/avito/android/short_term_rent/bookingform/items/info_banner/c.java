package com.avito.android.short_term_rent.bookingform.items.info_banner;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoBannerPayload.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c;", "", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c$a;", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: InfoBannerPayload.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c$a;", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final UniversalImage f281533a;

        public a(@l UniversalImage universalImage) {
            this.f281533a = universalImage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f281533a, ((a) obj).f281533a);
        }

        public final int hashCode() {
            UniversalImage universalImage = this.f281533a;
            if (universalImage == null) {
                return 0;
            }
            return universalImage.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("ImageChanged(image="), this.f281533a, ')');
        }
    }

    /* compiled from: InfoBannerPayload.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c$b;", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f281534a;

        public b(@k AttributedText attributedText) {
            this.f281534a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f281534a, ((b) obj).f281534a);
        }

        public final int hashCode() {
            return this.f281534a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("TextChanged(text="), this.f281534a, ')');
        }
    }
}
