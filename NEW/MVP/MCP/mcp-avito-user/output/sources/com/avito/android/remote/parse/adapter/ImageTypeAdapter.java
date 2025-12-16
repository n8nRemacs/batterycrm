package com.avito.android.remote.parse.adapter;

import android.net.Uri;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35837l2;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ImageTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/Image;", "<init>", "()V", "_common_network-design_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageTypeAdapter extends TypeAdapter<Image> {
    @Override // com.google.gson.TypeAdapter
    public final Image read(com.google.gson.stream.a aVar) throws NumberFormatException, IOException {
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
            while (aVar.k()) {
                Size sizeB = C35837l2.b(aVar.x());
                Uri uri = Uri.parse(aVar.B());
                if (sizeB != null) {
                    linkedHashMap.put(sizeB, uri);
                }
            }
            aVar.g();
            return new Image(linkedHashMap);
        } catch (JsonParseException unused) {
            aVar.L();
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Image image) throws IOException {
        Image image2 = image;
        if (image2 == null) {
            cVar.j();
            return;
        }
        cVar.c();
        for (Map.Entry<Size, Uri> entry : image2.getVariants().entrySet()) {
            Size key = entry.getKey();
            Uri value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key.getWidth());
            sb2.append('x');
            sb2.append(key.getHeight());
            cVar.h(sb2.toString());
            cVar.q(value.toString());
        }
        cVar.g();
    }
}
