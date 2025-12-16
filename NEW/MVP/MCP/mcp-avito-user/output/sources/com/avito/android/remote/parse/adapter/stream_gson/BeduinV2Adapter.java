package com.avito.android.remote.parse.adapter.stream_gson;

import com.avito.android.remote.model.BeduinV2;
import com.avito.android.util.V2;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.C;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.stream.c;
import kotlin.Metadata;

/* compiled from: BeduinV2AdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/BeduinV2Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/BeduinV2;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2Adapter extends TypeAdapter<BeduinV2> {
    @Override // com.google.gson.TypeAdapter
    public final BeduinV2 read(com.google.gson.stream.a aVar) {
        i iVarA = C.a(aVar);
        if (iVarA == null || (iVarA instanceof j)) {
            return null;
        }
        if (iVarA instanceof k) {
            return new BeduinV2(iVarA.toString());
        }
        V2.f318762a.e("Unexpected beduinV2 json: " + iVarA, null);
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, BeduinV2 beduinV2) {
        throw new UnsupportedOperationException();
    }
}
