package com.avito.android.remote.parse.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: CharSequenceTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CharSequenceTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CharSequenceTypeAdapter extends TypeAdapter<CharSequence> {

    /* compiled from: CharSequenceTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254161a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f254161a = iArr;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final CharSequence read(com.google.gson.stream.a aVar) {
        JsonToken jsonTokenF = aVar.F();
        int i12 = jsonTokenF == null ? -1 : a.f254161a[jsonTokenF.ordinal()];
        if (i12 == 1) {
            return aVar.B();
        }
        if (i12 == 2) {
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + aVar.F());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, CharSequence charSequence) throws IOException {
        CharSequence charSequence2 = charSequence;
        cVar.q(charSequence2 != null ? charSequence2.toString() : null);
    }
}
