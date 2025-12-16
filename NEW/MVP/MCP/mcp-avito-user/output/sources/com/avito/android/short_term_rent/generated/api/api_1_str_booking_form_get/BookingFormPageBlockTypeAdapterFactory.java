package com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get;

import Y61.k;
import Y61.l;
import com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get.BookingFormPageBlock;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormPageBlockTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlockTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "BookingFormPageBlockTypeAdapter", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingFormPageBlockTypeAdapterFactory implements r {

    /* compiled from: BookingFormPageBlockTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlockTypeAdapterFactory$BookingFormPageBlockTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingFormPageBlockTypeAdapter extends TypeAdapter<BookingFormPageBlock> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<BookingFormPageBlock> f282386a;

        public BookingFormPageBlockTypeAdapter(@k TypeAdapter<BookingFormPageBlock> typeAdapter) {
            this.f282386a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final BookingFormPageBlock read(a aVar) {
            BookingFormPageBlock bookingFormPageBlock = this.f282386a.read(aVar);
            return bookingFormPageBlock == null ? BookingFormPageBlock.p.f282385a : bookingFormPageBlock;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, BookingFormPageBlock bookingFormPageBlock) {
            this.f282386a.write(cVar, bookingFormPageBlock);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), BookingFormPageBlock.class)) {
            return new BookingFormPageBlockTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(BookingFormPageBlock.class)));
        }
        return null;
    }
}
