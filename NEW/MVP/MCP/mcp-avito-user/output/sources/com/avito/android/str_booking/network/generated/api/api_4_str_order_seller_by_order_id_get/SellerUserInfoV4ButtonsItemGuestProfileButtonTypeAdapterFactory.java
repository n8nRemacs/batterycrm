package com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get;

import Sx0.C15263l;
import Y61.k;
import Y61.l;
import com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapter", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory implements r {

    /* compiled from: SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapterFactory$SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$c;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapter extends TypeAdapter<a.c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<C15263l> f285859a;

        public SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapter(@k TypeAdapter<C15263l> typeAdapter) {
            this.f285859a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.c read(com.google.gson.stream.a aVar) {
            return new a.c(this.f285859a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.c cVar2) {
            C15263l guestProfileButton = cVar2.getGuestProfileButton();
            if (guestProfileButton == null) {
                return;
            }
            this.f285859a.write(cVar, guestProfileButton);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.c.class)) {
            return new SellerUserInfoV4ButtonsItemGuestProfileButtonTypeAdapter(gson.g(C15263l.class));
        }
        return null;
    }
}
