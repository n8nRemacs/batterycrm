package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AttributedTextTypeAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/AttributedTextTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttributedTextTypeAdapter extends TypeAdapter<AttributedText> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254288a;

    public AttributedTextTypeAdapter(@k Gson gson) {
        this.f254288a = gson;
    }

    public static UniversalColor b(com.google.gson.stream.a aVar, Gson gson) {
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        String strB = null;
        Object obj = null;
        Object obj2 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                if (iHashCode != -766192505) {
                    if (iHashCode != -765894756) {
                        if (iHashCode == 111972721 && strX.equals("value")) {
                            obj = gson.g(Color.class).read(aVar);
                        }
                    } else if (strX.equals("valueName")) {
                        strB = aVar.B();
                    }
                } else if (strX.equals("valueDark")) {
                    obj2 = gson.g(Color.class).read(aVar);
                }
            }
        }
        aVar.g();
        return UniversalColorKt.universalColorOf(strB, (Color) obj, (Color) obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x04e8, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.text.Attribute a(com.google.gson.stream.a r24, java.lang.String r25, java.lang.String r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.stream_gson.AttributedTextTypeAdapter.a(com.google.gson.stream.a, java.lang.String, java.lang.String):com.avito.android.remote.model.text.Attribute");
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0075, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        r18.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0107, code lost:
    
        if (r13 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0109, code lost:
    
        if (r14 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        r2 = new com.google.gson.internal.bind.a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
    
        if (r2.F() == r4) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011a, code lost:
    
        if (r2.F() != r7) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011c, code lost:
    
        r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0123, code lost:
    
        if (r2.k() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0125, code lost:
    
        r3.add(a(r2, r13, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012d, code lost:
    
        r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
    
        r3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", r7, " but was ");
        r3.append(r2.F());
        r3.append(" at ");
        r3.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
    
        throw new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        throw new com.google.gson.JsonParseException("");
     */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.text.AttributedText read(com.google.gson.stream.a r18) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.stream_gson.AttributedTextTypeAdapter.read(com.google.gson.stream.a):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, AttributedText attributedText) {
        throw new UnsupportedOperationException();
    }
}
