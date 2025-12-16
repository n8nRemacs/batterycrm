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
import yq.C50280a;

/* compiled from: LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "LeadCreateApiV1ResponseWrongLiquidityTypeAdapter", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory implements r {

    /* compiled from: LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory$LeadCreateApiV1ResponseWrongLiquidityTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$c;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeadCreateApiV1ResponseWrongLiquidityTypeAdapter extends TypeAdapter<a.c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<C50280a> f123515a;

        public LeadCreateApiV1ResponseWrongLiquidityTypeAdapter(@k TypeAdapter<C50280a> typeAdapter) {
            this.f123515a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.c read(com.google.gson.stream.a aVar) {
            return new a.c(this.f123515a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.c cVar2) {
            C50280a wrongLiquidity = cVar2.getWrongLiquidity();
            if (wrongLiquidity == null) {
                return;
            }
            this.f123515a.write(cVar, wrongLiquidity);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.c.class)) {
            return new LeadCreateApiV1ResponseWrongLiquidityTypeAdapter(gson.g(C50280a.class));
        }
        return null;
    }
}
