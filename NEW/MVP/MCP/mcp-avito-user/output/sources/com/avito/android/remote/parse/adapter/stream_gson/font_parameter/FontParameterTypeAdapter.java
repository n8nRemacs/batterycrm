package com.avito.android.remote.parse.adapter.stream_gson.font_parameter;

import Y61.k;
import com.avito.android.remote.model.text.FontParameter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FontParameterTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/font_parameter/FontParameterTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/text/FontParameter;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FontParameterTypeAdapter extends TypeAdapter<FontParameter> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254311a;

    /* compiled from: FontParameterTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254312a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f254312a = iArr;
        }
    }

    public FontParameterTypeAdapter(@k Gson gson) {
        this.f254311a = gson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x0015, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.text.FontParameter read(com.google.gson.stream.a r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.stream_gson.font_parameter.FontParameterTypeAdapter.read(com.google.gson.stream.a):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, FontParameter fontParameter) {
        throw new UnsupportedOperationException();
    }
}
