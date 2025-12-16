package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.SelectionType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionTypeDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SelectionTypeDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectionTypeDeserializer implements com.google.gson.h<SelectionType> {
    @Override // com.google.gson.h
    public final SelectionType deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        ArrayList arrayList = iVar.h().f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(gVar.b((com.google.gson.i) it.next(), String.class));
        }
        return new SelectionType(arrayList2);
    }
}
