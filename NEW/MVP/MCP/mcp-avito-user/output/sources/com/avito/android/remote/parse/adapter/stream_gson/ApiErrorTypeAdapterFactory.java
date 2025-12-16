package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.error.Status;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/ApiErrorTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApiErrorTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f254286b = C42727D.c(a.f254287l);

    /* compiled from: ApiErrorTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Ljava/lang/Class;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/Status;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<Class<? extends ApiError>, ? extends Status>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f254287l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Class<? extends ApiError>, ? extends Status> invoke() {
            return P0.g(new Q(ApiError.class, null), new Q(ApiError.InternalError.class, Status.f253402i), new Q(ApiError.Failure.class, Status.f253404k), new Q(ApiError.NotFound.class, Status.f253403j), new Q(ApiError.Unauthorized.class, Status.f253399f), new Q(ApiError.Forbidden.class, Status.f253400g), new Q(ApiError.BadRequest.class, Status.f253401h), new Q(ApiError.TooManyRequests.class, Status.f253407n), new Q(ApiError.IncorrectData.class, Status.f253405l), new Q(ApiError.ErrorDialog.class, Status.f253406m), new Q(ApiError.ErrorAction.class, Status.f253408o));
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        InterfaceC42726C interfaceC42726C = this.f254286b;
        if (((Map) interfaceC42726C.getValue()).containsKey(rawType)) {
            return new ApiErrorTypeAdapter(gson, (Status) ((Map) interfaceC42726C.getValue()).get(rawType));
        }
        return null;
    }
}
