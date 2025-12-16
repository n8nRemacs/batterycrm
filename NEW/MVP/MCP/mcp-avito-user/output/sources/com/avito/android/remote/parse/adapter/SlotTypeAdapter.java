package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: SlotTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SlotTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotType;", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SlotTypeAdapter implements com.google.gson.h<SlotType> {
    @Override // com.google.gson.h
    public final SlotType deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return SlotType.INSTANCE.valueOfStr(iVar.s());
    }
}
