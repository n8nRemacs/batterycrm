package com.avito.android.remote.parse.adapter;

import android.net.Uri;
import com.avito.android.gson.JsonNullParsingException;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.util.C35837l2;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TnsGalleryImageTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/TnsGalleryImageTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/TnsGalleryImage;", "_avito-discouraged_avito-api_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TnsGalleryImageTypeAdapter extends TypeAdapter<TnsGalleryImage> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f254253a;

    public TnsGalleryImageTypeAdapter(@Y61.k Gson gson) {
        this.f254253a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TnsGalleryImage read(com.google.gson.stream.a aVar) throws NumberFormatException, IOException {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (aVar.F() == JsonToken.f362204j) {
                throw new JsonParseException("");
            }
            JsonToken jsonTokenF = aVar.F();
            JsonToken jsonToken = JsonToken.f362198d;
            if (jsonTokenF != jsonToken) {
                throw new IllegalStateException("Expected " + jsonToken + " but was " + aVar.F() + " at " + aVar);
            }
            aVar.b();
            Object obj = null;
            while (aVar.k()) {
                String strX = aVar.x();
                if (kotlin.jvm.internal.L.f(strX, "originalSize")) {
                    obj = this.f254253a.g(Size.class).read(aVar);
                } else {
                    Size sizeB = C35837l2.b(strX);
                    Uri uri = Uri.parse(aVar.B());
                    if (sizeB != null) {
                    }
                }
            }
            aVar.g();
            return new TnsGalleryImage(new Image(linkedHashMap), (Size) obj);
        } catch (JsonNullParsingException unused) {
            aVar.L();
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, TnsGalleryImage tnsGalleryImage) {
        throw new UnsupportedOperationException();
    }
}
