package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotV7Response;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotV7ResponseStateTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7ResponseStateTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "SlotV7ResponseStateTypeAdapter", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotV7ResponseStateTypeAdapterFactory implements r {

    /* compiled from: SlotV7ResponseStateTypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7ResponseStateTypeAdapterFactory$SlotV7ResponseStateTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response$State;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlotV7ResponseStateTypeAdapter extends TypeAdapter<SlotV7Response.State> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<SlotV7Response.State> f159496a;

        public SlotV7ResponseStateTypeAdapter(@k TypeAdapter<SlotV7Response.State> typeAdapter) {
            this.f159496a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final SlotV7Response.State read(a aVar) {
            SlotV7Response.State state = this.f159496a.read(aVar);
            return state == null ? SlotV7Response.State.OnShift : state;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, SlotV7Response.State state) {
            this.f159496a.write(cVar, state);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), SlotV7Response.State.class)) {
            return new SlotV7ResponseStateTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(SlotV7Response.State.class)));
        }
        return null;
    }
}
