package com.avito.android.gig.motivation_screen.generated.api.get_gig_worker_motivation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.motivation_screen.generated.api.get_gig_worker_motivation.ProgressDuty;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProgressDutyTypeTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDutyTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ProgressDutyTypeTypeAdapter", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProgressDutyTypeTypeAdapterFactory implements r {

    /* compiled from: ProgressDutyTypeTypeAdapterFactory.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDutyTypeTypeAdapterFactory$ProgressDutyTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty$Type;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProgressDutyTypeTypeAdapter extends TypeAdapter<ProgressDuty.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<ProgressDuty.Type> f159435a;

        public ProgressDutyTypeTypeAdapter(@k TypeAdapter<ProgressDuty.Type> typeAdapter) {
            this.f159435a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final ProgressDuty.Type read(a aVar) {
            ProgressDuty.Type type = this.f159435a.read(aVar);
            return type == null ? ProgressDuty.Type.Locked : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, ProgressDuty.Type type) {
            this.f159435a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), ProgressDuty.Type.class)) {
            return new ProgressDutyTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(ProgressDuty.Type.class)));
        }
        return null;
    }
}
