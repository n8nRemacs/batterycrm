package com.avito.android.remote.parse.adapter;

import android.net.Uri;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: UriTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/UriTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Landroid/net/Uri;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UriTypeAdapter extends TypeAdapter<Uri> {
    @Override // com.google.gson.TypeAdapter
    public final Uri read(com.google.gson.stream.a aVar) {
        return Uri.parse(aVar.B());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Uri uri) throws IOException {
        cVar.q(String.valueOf(uri));
    }
}
