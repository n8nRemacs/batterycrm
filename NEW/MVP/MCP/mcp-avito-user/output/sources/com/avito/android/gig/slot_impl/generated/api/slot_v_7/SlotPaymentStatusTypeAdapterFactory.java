package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotPayment;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotPaymentStatusTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotPaymentStatusTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "SlotPaymentStatusTypeAdapter", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotPaymentStatusTypeAdapterFactory implements r {

    /* compiled from: SlotPaymentStatusTypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotPaymentStatusTypeAdapterFactory$SlotPaymentStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotPayment$Status;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlotPaymentStatusTypeAdapter extends TypeAdapter<SlotPayment.Status> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<SlotPayment.Status> f159491a;

        public SlotPaymentStatusTypeAdapter(@k TypeAdapter<SlotPayment.Status> typeAdapter) {
            this.f159491a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final SlotPayment.Status read(a aVar) {
            SlotPayment.Status status = this.f159491a.read(aVar);
            return status == null ? SlotPayment.Status.Normal : status;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, SlotPayment.Status status) {
            this.f159491a.write(cVar, status);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), SlotPayment.Status.class)) {
            return new SlotPaymentStatusTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(SlotPayment.Status.class)));
        }
        return null;
    }
}
