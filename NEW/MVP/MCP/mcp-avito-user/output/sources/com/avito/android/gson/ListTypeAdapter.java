package com.avito.android.gson;

import Y61.k;
import Y61.l;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ListTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gson/ListTypeAdapter;", "Lcom/google/gson/h;", "", "", "<init>", "()V", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListTypeAdapter implements com.google.gson.h<List<? extends Object>> {
    @l
    public static List a(@k com.google.gson.i iVar, @l Type type, @k com.google.gson.g gVar) {
        Type type2;
        if (iVar instanceof com.google.gson.f) {
            if (type instanceof ParameterizedType) {
                type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            } else {
                if (type instanceof WildcardType) {
                    return a(iVar, ((WildcardType) type).getUpperBounds()[0], gVar);
                }
                type2 = null;
            }
            if (type2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = iVar.h().f362000b.iterator();
                while (it.hasNext()) {
                    Object objB = gVar.b((com.google.gson.i) it.next(), type2);
                    if (objB != null) {
                        arrayList.add(objB);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    @Override // com.google.gson.h
    public final /* bridge */ /* synthetic */ List<? extends Object> deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return a(iVar, type, gVar);
    }
}
