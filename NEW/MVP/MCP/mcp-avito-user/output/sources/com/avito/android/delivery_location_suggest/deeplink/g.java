package com.avito.android.delivery_location_suggest.deeplink;

import Fv.C13838a;
import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAddressSelectDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_location_suggest/deeplink/g;", "LJu/c$b;", "a", "Lcom/avito/android/delivery_location_suggest/deeplink/g$a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface g extends InterfaceC14249c.b {

    /* compiled from: DeliveryAddressSelectDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/deeplink/g$a;", "Lcom/avito/android/delivery_location_suggest/deeplink/g;", "LJu/a$b;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements g, InterfaceC14247a.b {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C13838a f135069b;

        public a(@l C13838a c13838a) {
            this.f135069b = c13838a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f135069b, ((a) obj).f135069b);
        }

        public final int hashCode() {
            C13838a c13838a = this.f135069b;
            if (c13838a == null) {
                return 0;
            }
            return c13838a.hashCode();
        }

        @k
        public final String toString() {
            return "AddressSuccess(address=" + this.f135069b + ')';
        }
    }
}
