package com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1;

import Y61.k;
import Y61.l;
import com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessItemsItemTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/OkRespDataSuccessItemsItemTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessItemsItemTypeAdapter", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OkRespDataSuccessItemsItemTypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessItemsItemTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/OkRespDataSuccessItemsItemTypeAdapterFactory$OkRespDataSuccessItemsItemTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessItemsItemTypeAdapter extends TypeAdapter<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<a> f222667a;

        public OkRespDataSuccessItemsItemTypeAdapter(@k TypeAdapter<a> typeAdapter) {
            this.f222667a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a read(com.google.gson.stream.a aVar) {
            a aVar2 = this.f222667a.read(aVar);
            return aVar2 == null ? a.t.f222672a : aVar2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a aVar) {
            this.f222667a.write(cVar, aVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.class)) {
            return new OkRespDataSuccessItemsItemTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(a.class)));
        }
        return null;
    }
}
