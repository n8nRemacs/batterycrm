package com.facebook.imagepipeline.backends.okhttp3;

import android.os.Looper;
import com.facebook.imagepipeline.producers.C36401e;
import okhttp3.Call;

/* compiled from: OkHttpNetworkFetcher.java */
/* loaded from: classes12.dex */
class c extends C36401e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f340178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f340179b;

    /* compiled from: OkHttpNetworkFetcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f340178a.cancel();
        }
    }

    public c(e eVar, Call call) {
        this.f340179b = eVar;
        this.f340178a = call;
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f340178a.cancel();
        } else {
            this.f340179b.f340186c.execute(new a());
        }
    }
}
