package com.avito.android.beduin.network.parse;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.utils.z;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.C;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SkipToFieldTypeAndGenModelIdAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/SkipToFieldTypeAndGenModelIdAdapter;", "T", "Lcom/google/gson/r;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SkipToFieldTypeAndGenModelIdAdapter<T> implements r {
    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (!BeduinModel.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        final TypeAdapter<T> typeAdapterH = gson.h(this, aVar);
        return new TypeAdapter<T>(this) { // from class: com.avito.android.beduin.network.parse.SkipToFieldTypeAndGenModelIdAdapter$create$1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SkipToFieldTypeAndGenModelIdAdapter<T> f104055a;

            {
                this.f104055a = this;
            }

            @Override // com.google.gson.TypeAdapter
            @l
            public final T read(@k com.google.gson.stream.a aVar2) throws IOException {
                if (aVar2.F() == JsonToken.f362204j) {
                    throw new JsonParseException("");
                }
                JsonToken jsonTokenF = aVar2.F();
                JsonToken jsonToken = JsonToken.f362198d;
                if (jsonTokenF != jsonToken) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar2, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar2));
                }
                aVar2.b();
                if (!aVar2.k()) {
                    aVar2.g();
                    return null;
                }
                while (true) {
                    String strX = aVar2.x();
                    this.f104055a.getClass();
                    if (L.f(strX, "content")) {
                        i iVarA = C.a(aVar2);
                        z.a(iVarA.i());
                        return typeAdapterH.fromJsonTree(iVarA);
                    }
                    aVar2.L();
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(@k com.google.gson.stream.c cVar, T t12) {
                throw new IllegalStateException("write is not supported");
            }
        };
    }
}
