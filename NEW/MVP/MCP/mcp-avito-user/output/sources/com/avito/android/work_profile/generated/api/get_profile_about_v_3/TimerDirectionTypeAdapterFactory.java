package com.avito.android.work_profile.generated.api.get_profile_about_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.Timer;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimerDirectionTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/TimerDirectionTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "TimerDirectionTypeAdapter", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimerDirectionTypeAdapterFactory implements r {

    /* compiled from: TimerDirectionTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/TimerDirectionTypeAdapterFactory$TimerDirectionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Timer$Direction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimerDirectionTypeAdapter extends TypeAdapter<Timer.Direction> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Timer.Direction> f330684a;

        public TimerDirectionTypeAdapter(@k TypeAdapter<Timer.Direction> typeAdapter) {
            this.f330684a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Timer.Direction read(a aVar) {
            Timer.Direction direction = this.f330684a.read(aVar);
            return direction == null ? Timer.Direction.UntilStart : direction;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, Timer.Direction direction) {
            this.f330684a.write(cVar, direction);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), Timer.Direction.class)) {
            return new TimerDirectionTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(Timer.Direction.class)));
        }
        return null;
    }
}
