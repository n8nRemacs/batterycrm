package com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LeadCreateApiV1ResponseOkTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/LeadCreateApiV1ResponseOkTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "LeadCreateApiV1ResponseOkTypeAdapter", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LeadCreateApiV1ResponseOkTypeAdapterFactory implements r {

    /* compiled from: LeadCreateApiV1ResponseOkTypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/LeadCreateApiV1ResponseOkTypeAdapterFactory$LeadCreateApiV1ResponseOkTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$a;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeadCreateApiV1ResponseOkTypeAdapter extends TypeAdapter<a.C3692a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Boolean> f123513a;

        public LeadCreateApiV1ResponseOkTypeAdapter(@k TypeAdapter<Boolean> typeAdapter) {
            this.f123513a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.C3692a read(com.google.gson.stream.a aVar) {
            return new a.C3692a(this.f123513a.read(aVar).booleanValue());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.C3692a c3692a) {
            this.f123513a.write(cVar, Boolean.valueOf(c3692a.getOk()));
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.C3692a.class)) {
            return new LeadCreateApiV1ResponseOkTypeAdapter(gson.g(Boolean.TYPE));
        }
        return null;
    }
}
