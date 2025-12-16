package com.avito.android.gson;

import Y61.k;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollectionSkipNullAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gson/CollectionSkipNullAdapter;", "E", "Lcom/google/gson/TypeAdapter;", "", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollectionSkipNullAdapter<E> extends TypeAdapter<Collection<? extends E>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TypeAdapter<Collection<E>> f161308a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TypeAdapter<E> f161309b;

    public CollectionSkipNullAdapter(@k TypeAdapter<Collection<E>> typeAdapter, @k TypeAdapter<E> typeAdapter2) {
        this.f161308a = typeAdapter;
        this.f161309b = typeAdapter2;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(com.google.gson.stream.a aVar) {
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362196b;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.a();
        while (aVar.k()) {
            E e12 = this.f161309b.read(aVar);
            if (e12 != null) {
                arrayList.add(e12);
            }
        }
        aVar.f();
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Object obj) {
        this.f161308a.write(cVar, (Collection) obj);
    }
}
