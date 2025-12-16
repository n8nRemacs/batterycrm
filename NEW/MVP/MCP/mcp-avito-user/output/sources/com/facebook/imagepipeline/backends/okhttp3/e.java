package com.facebook.imagepipeline.backends.okhttp3;

import I41.h;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.AbstractC36397c;
import com.facebook.imagepipeline.producers.InterfaceC36410l;
import com.facebook.imagepipeline.producers.V;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: OkHttpNetworkFetcher.java */
@Nullsafe
/* loaded from: classes12.dex */
public class e extends AbstractC36397c<a> {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f340184a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final CacheControl f340185b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f340186c;

    /* compiled from: OkHttpNetworkFetcher.java */
    public static class a extends A {

        /* renamed from: f, reason: collision with root package name */
        public long f340187f;

        /* renamed from: g, reason: collision with root package name */
        public long f340188g;

        /* renamed from: h, reason: collision with root package name */
        public long f340189h;

        public a() {
            throw null;
        }
    }

    public e(OkHttpClient okHttpClient) {
        ExecutorService executorService = okHttpClient.dispatcher().executorService();
        this.f340184a = okHttpClient;
        this.f340186c = executorService;
        this.f340185b = new CacheControl.Builder().noStore().build();
    }

    public static void f(e eVar, Call call, Exception exc, V.a aVar) {
        eVar.getClass();
        if (call.isCanceled()) {
            aVar.b();
        } else {
            aVar.onFailure(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final A a(InterfaceC36410l interfaceC36410l, k0 k0Var) {
        return new a(interfaceC36410l, k0Var);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36397c, com.facebook.imagepipeline.producers.V
    public final void b(A a12) {
        ((a) a12).f340189h = SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36397c, com.facebook.imagepipeline.producers.V
    public final Map d(A a12, int i12) {
        a aVar = (a) a12;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(aVar.f340188g - aVar.f340187f));
        map.put("fetch_time", Long.toString(aVar.f340189h - aVar.f340188g));
        map.put("total_time", Long.toString(aVar.f340189h - aVar.f340187f));
        map.put("image_size", Integer.toString(i12));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final void e(A a12, V.a aVar) {
        a aVar2 = (a) a12;
        aVar2.f340187f = SystemClock.elapsedRealtime();
        k0 k0Var = aVar2.f340513b;
        try {
            Request.Builder builder = new Request.Builder().url(k0Var.j().f340782b.toString()).get();
            CacheControl cacheControl = this.f340185b;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            UW0.a aVar3 = k0Var.j().f340788h;
            if (aVar3 != null) {
                int i12 = aVar3.f16405a;
                String string = "";
                String string2 = i12 == Integer.MAX_VALUE ? "" : Integer.toString(i12);
                int i13 = aVar3.f16406b;
                if (i13 != Integer.MAX_VALUE) {
                    string = Integer.toString(i13);
                }
                builder.addHeader("Range", "bytes=" + string2 + "-" + string);
            }
            Call callNewCall = this.f340184a.newCall(builder.build());
            k0Var.b(new c(this, callNewCall));
            callNewCall.enqueue(new d(this, aVar2, aVar));
        } catch (Exception e12) {
            aVar.onFailure(e12);
        }
    }
}
