package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SearchParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchParamsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SearchParamsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/SearchParams;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchParamsDeserializer implements com.google.gson.h<SearchParams> {
    public static ArrayList a(com.google.gson.f fVar) {
        if (fVar == null) {
            return null;
        }
        ArrayList arrayList = fVar.f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.google.gson.i) it.next()).s());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    @Override // com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.SearchParams deserialize(com.google.gson.i r40, java.lang.reflect.Type r41, com.google.gson.g r42) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.SearchParamsDeserializer.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }
}
