package com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.LimitsFailureAction;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LimitsFailureActionFieldV2TypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureActionFieldV2TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "LimitsFailureActionFieldV2TypeAdapter", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LimitsFailureActionFieldV2TypeAdapterFactory implements r {

    /* compiled from: LimitsFailureActionFieldV2TypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureActionFieldV2TypeAdapterFactory$LimitsFailureActionFieldV2TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureAction$FieldV2;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LimitsFailureActionFieldV2TypeAdapter extends TypeAdapter<LimitsFailureAction.FieldV2> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<LimitsFailureAction.FieldV2> f204096a;

        public LimitsFailureActionFieldV2TypeAdapter(@k TypeAdapter<LimitsFailureAction.FieldV2> typeAdapter) {
            this.f204096a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final LimitsFailureAction.FieldV2 read(a aVar) {
            LimitsFailureAction.FieldV2 fieldV2 = this.f204096a.read(aVar);
            return fieldV2 == null ? LimitsFailureAction.FieldV2.Unknown : fieldV2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, LimitsFailureAction.FieldV2 fieldV2) {
            this.f204096a.write(cVar, fieldV2);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), LimitsFailureAction.FieldV2.class)) {
            return new LimitsFailureActionFieldV2TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(LimitsFailureAction.FieldV2.class)));
        }
        return null;
    }
}
