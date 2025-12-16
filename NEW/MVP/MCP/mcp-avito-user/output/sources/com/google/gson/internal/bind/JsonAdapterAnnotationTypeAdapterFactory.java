package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.m;
import com.google.gson.o;
import com.google.gson.r;

/* loaded from: classes6.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    public final m f362037b;

    public JsonAdapterAnnotationTypeAdapterFactory(m mVar) {
        this.f362037b = mVar;
    }

    public static TypeAdapter b(m mVar, Gson gson, com.google.gson.reflect.a aVar, com.google.gson.annotations.b bVar) {
        TypeAdapter treeTypeAdapter;
        Object objA = mVar.a(com.google.gson.reflect.a.get((Class) bVar.value())).a();
        if (objA instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objA;
        } else if (objA instanceof r) {
            treeTypeAdapter = ((r) objA).a(gson, aVar);
        } else {
            boolean z12 = objA instanceof o;
            if (!z12 && !(objA instanceof h)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter(z12 ? (o) objA : null, objA instanceof h ? (h) objA : null, gson, aVar, null);
        }
        return (treeTypeAdapter == null || !bVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    @Override // com.google.gson.r
    public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        com.google.gson.annotations.b bVar = (com.google.gson.annotations.b) aVar.getRawType().getAnnotation(com.google.gson.annotations.b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f362037b, gson, aVar, bVar);
    }
}
