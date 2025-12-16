package com.avito.android.work_profile.generated.api.get_profile_about_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PaymentItem;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentItemStatusTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PaymentItemStatusTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "PaymentItemStatusTypeAdapter", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentItemStatusTypeAdapterFactory implements r {

    /* compiled from: PaymentItemStatusTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PaymentItemStatusTypeAdapterFactory$PaymentItemStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PaymentItem$Status;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PaymentItemStatusTypeAdapter extends TypeAdapter<PaymentItem.Status> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<PaymentItem.Status> f330675a;

        public PaymentItemStatusTypeAdapter(@k TypeAdapter<PaymentItem.Status> typeAdapter) {
            this.f330675a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final PaymentItem.Status read(a aVar) {
            PaymentItem.Status status = this.f330675a.read(aVar);
            return status == null ? PaymentItem.Status.Normal : status;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, PaymentItem.Status status) {
            this.f330675a.write(cVar, status);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), PaymentItem.Status.class)) {
            return new PaymentItemStatusTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(PaymentItem.Status.class)));
        }
        return null;
    }
}
