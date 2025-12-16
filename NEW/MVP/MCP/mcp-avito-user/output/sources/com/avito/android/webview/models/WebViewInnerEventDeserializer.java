package com.avito.android.webview.models;

import HP0.b;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WebViewInnerEventDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/webview/models/WebViewInnerEventDeserializer;", "Lcom/google/gson/h;", "LHP0/b;", "<init>", "()V", "_avito_webview_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebViewInnerEventDeserializer implements h<b> {
    @Override // com.google.gson.h
    public final b deserialize(i iVar, Type type, g gVar) throws ParseException {
        Object objB;
        k kVarI = iVar.i();
        k kVarI2 = kVarI.D("params").i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, i> entry : kVarI2.f362194b.entrySet()) {
            String key = entry.getKey();
            i value = entry.getValue();
            try {
                objB = NumberFormat.getInstance().parse(value.j().s());
            } catch (Exception unused) {
                objB = null;
            }
            if (objB == null) {
                objB = gVar.b(value, Object.class);
            }
            linkedHashMap.put(key, objB);
        }
        return new b(kVarI.D("id").g(), kVarI.D("version").g(), linkedHashMap);
    }
}
