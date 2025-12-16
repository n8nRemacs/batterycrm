package com.avito.android.gig.tutorials.generated.api.customer_rules_v_1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.tutorials.generated.api.customer_rules_v_1.Material;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MaterialIconTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/MaterialIconTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "MaterialIconTypeAdapter", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MaterialIconTypeAdapterFactory implements r {

    /* compiled from: MaterialIconTypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/MaterialIconTypeAdapterFactory$MaterialIconTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material$Icon;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MaterialIconTypeAdapter extends TypeAdapter<Material.Icon> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Material.Icon> f159513a;

        public MaterialIconTypeAdapter(@k TypeAdapter<Material.Icon> typeAdapter) {
            this.f159513a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Material.Icon read(a aVar) {
            Material.Icon icon = this.f159513a.read(aVar);
            return icon == null ? Material.Icon.ExternalFile : icon;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, Material.Icon icon) {
            this.f159513a.write(cVar, icon);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), Material.Icon.class)) {
            return new MaterialIconTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(Material.Icon.class)));
        }
        return null;
    }
}
