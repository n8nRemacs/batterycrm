package com.avito.android.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.o;
import com.google.gson.r;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NullSafeGson.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0002 \u0003*\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/google/gson/TypeAdapter;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class f extends N implements Y41.a<TypeAdapter<? extends Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Field f161331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NullSafeReflectiveTypeAdapterFactory f161332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Gson f161333n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.reflect.a<?> f161334o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Field field, NullSafeReflectiveTypeAdapterFactory nullSafeReflectiveTypeAdapterFactory, Gson gson, com.google.gson.reflect.a<?> aVar) {
        super(0);
        this.f161331l = field;
        this.f161332m = nullSafeReflectiveTypeAdapterFactory;
        this.f161333n = gson;
        this.f161334o = aVar;
    }

    @Override // Y41.a
    public final TypeAdapter<? extends Object> invoke() {
        TypeAdapter<? extends Object> treeTypeAdapter;
        com.google.gson.annotations.b bVar = (com.google.gson.annotations.b) this.f161331l.getAnnotation(com.google.gson.annotations.b.class);
        com.google.gson.reflect.a<?> aVar = this.f161334o;
        if (bVar != null) {
            Object obj = NullSafeReflectiveTypeAdapterFactory.f161313i;
            NullSafeReflectiveTypeAdapterFactory nullSafeReflectiveTypeAdapterFactory = this.f161332m;
            com.google.gson.reflect.a aVar2 = com.google.gson.reflect.a.get((Class) bVar.value());
            Object objA = nullSafeReflectiveTypeAdapterFactory.f161318f.a(aVar2).a();
            if (objA instanceof TypeAdapter) {
                treeTypeAdapter = (TypeAdapter) objA;
            } else {
                boolean z12 = objA instanceof r;
                Gson gson = this.f161333n;
                if (z12) {
                    treeTypeAdapter = ((r) objA).a(gson, aVar);
                } else {
                    boolean z13 = objA instanceof o;
                    if (!(z13 ? true : objA instanceof com.google.gson.h)) {
                        StringBuilder sb2 = new StringBuilder("Invalid attempt to bind an instance of ");
                        sb2.append(objA != null ? objA.getClass().getName() : null);
                        sb2.append(" as a @JsonAdapter for ");
                        sb2.append(aVar2);
                        sb2.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    treeTypeAdapter = new TreeTypeAdapter<>(z13 ? (o) objA : null, objA instanceof com.google.gson.h ? (com.google.gson.h) objA : null, gson, aVar, null);
                }
            }
            if (treeTypeAdapter != null) {
                return treeTypeAdapter;
            }
        }
        return this.f161333n.f(aVar);
    }
}
