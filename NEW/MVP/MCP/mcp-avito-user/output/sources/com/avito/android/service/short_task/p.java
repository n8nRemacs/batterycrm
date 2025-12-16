package com.avito.android.service.short_task;

import Ag.CallableC13028a;
import android.os.Bundle;
import com.avito.android.P;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: TimeRequestTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/p;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class p implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final OkHttpClient f274109a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P f274110b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Interceptor> f274111c;

    /* compiled from: TimeRequestTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/service/short_task/ShortTask$Status;", "it", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f274112b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274030b;
        }
    }

    /* compiled from: TimeRequestTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/service/short_task/ShortTask$Status;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f274113b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274031c;
        }
    }

    @Inject
    public p(@Y61.k OkHttpClient okHttpClient, @Y61.k P p12, @Y61.k com.avito.android.service.short_task.b bVar, @Y61.k o oVar) {
        this.f274109a = okHttpClient;
        this.f274110b = p12;
        this.f274111c = C42745f0.U(bVar, oVar);
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        OkHttpClient.Builder builderNewBuilder = this.f274109a.newBuilder();
        for (Interceptor interceptor : this.f274111c) {
            if (interceptor instanceof f) {
                ((f) interceptor).a(builderNewBuilder);
            }
            builderNewBuilder.addInterceptor(interceptor);
        }
        return z.W(new CallableC13028a(28, builderNewBuilder.build(), new Request.Builder().url(this.f274110b.a() + "/2/time").build())).d0(a.f274112b).m0(b.f274113b).S();
    }
}
