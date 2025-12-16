package com.avito.android.passport_lib.generated.api.profile_switch_api_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.passport_lib.generated.api.profile_switch_api_v_3.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ProfileSwitchApiV3ResponseIsNoOpTypeAdapter", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory implements r {

    /* compiled from: ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory$ProfileSwitchApiV3ResponseIsNoOpTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$b;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfileSwitchApiV3ResponseIsNoOpTypeAdapter extends TypeAdapter<a.b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Boolean> f213919a;

        public ProfileSwitchApiV3ResponseIsNoOpTypeAdapter(@k TypeAdapter<Boolean> typeAdapter) {
            this.f213919a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.b read(com.google.gson.stream.a aVar) {
            return new a.b(this.f213919a.read(aVar).booleanValue());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.b bVar) {
            this.f213919a.write(cVar, Boolean.valueOf(bVar.getIsNoOp()));
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.b.class)) {
            return new ProfileSwitchApiV3ResponseIsNoOpTypeAdapter(gson.g(Boolean.TYPE));
        }
        return null;
    }
}
