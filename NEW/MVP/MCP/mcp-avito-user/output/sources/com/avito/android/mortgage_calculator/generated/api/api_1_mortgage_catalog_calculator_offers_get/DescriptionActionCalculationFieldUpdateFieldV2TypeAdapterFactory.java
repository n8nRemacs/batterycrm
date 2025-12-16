package com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.DescriptionActionCalculationFieldUpdate;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "DescriptionActionCalculationFieldUpdateFieldV2TypeAdapter", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory implements r {

    /* compiled from: DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory$DescriptionActionCalculationFieldUpdateFieldV2TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/DescriptionActionCalculationFieldUpdate$FieldV2;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DescriptionActionCalculationFieldUpdateFieldV2TypeAdapter extends TypeAdapter<DescriptionActionCalculationFieldUpdate.FieldV2> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<DescriptionActionCalculationFieldUpdate.FieldV2> f204091a;

        public DescriptionActionCalculationFieldUpdateFieldV2TypeAdapter(@k TypeAdapter<DescriptionActionCalculationFieldUpdate.FieldV2> typeAdapter) {
            this.f204091a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final DescriptionActionCalculationFieldUpdate.FieldV2 read(a aVar) {
            DescriptionActionCalculationFieldUpdate.FieldV2 fieldV2 = this.f204091a.read(aVar);
            return fieldV2 == null ? DescriptionActionCalculationFieldUpdate.FieldV2.Unknown : fieldV2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, DescriptionActionCalculationFieldUpdate.FieldV2 fieldV2) {
            this.f204091a.write(cVar, fieldV2);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), DescriptionActionCalculationFieldUpdate.FieldV2.class)) {
            return new DescriptionActionCalculationFieldUpdateFieldV2TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(DescriptionActionCalculationFieldUpdate.FieldV2.class)));
        }
        return null;
    }
}
