package com.avito.android.remote.model.filters_parameter.adapter;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.filters_parameter.slot.SlotType;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: SlotTypeAdapter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/adapter/SlotTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "<init>", "()V", "Lcom/google/gson/i;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/g;", "context", "deserialize", "(Lcom/google/gson/i;Ljava/lang/reflect/Type;Lcom/google/gson/g;)Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SlotTypeAdapter implements h<SlotType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.h
    @k
    public SlotType deserialize(@l i json, @l Type typeOfT, @l g context) {
        return SlotType.INSTANCE.valueOfStr(json != null ? json.s() : null);
    }
}
