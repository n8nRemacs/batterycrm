package com.avito.android.work_profile.generated.api.get_profile_about_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PersonalItemV3;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalItemV3StatusTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3StatusTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "PersonalItemV3StatusTypeAdapter", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersonalItemV3StatusTypeAdapterFactory implements r {

    /* compiled from: PersonalItemV3StatusTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3StatusTypeAdapterFactory$PersonalItemV3StatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3$Status;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PersonalItemV3StatusTypeAdapter extends TypeAdapter<PersonalItemV3.Status> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<PersonalItemV3.Status> f330678a;

        public PersonalItemV3StatusTypeAdapter(@k TypeAdapter<PersonalItemV3.Status> typeAdapter) {
            this.f330678a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final PersonalItemV3.Status read(a aVar) {
            PersonalItemV3.Status status = this.f330678a.read(aVar);
            return status == null ? PersonalItemV3.Status.InProgress : status;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, PersonalItemV3.Status status) {
            this.f330678a.write(cVar, status);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), PersonalItemV3.Status.class)) {
            return new PersonalItemV3StatusTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(PersonalItemV3.Status.class)));
        }
        return null;
    }
}
