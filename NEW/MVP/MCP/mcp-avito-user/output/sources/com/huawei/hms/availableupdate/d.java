package com.huawei.hms.availableupdate;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ThreadWrapper.java */
/* loaded from: classes7.dex */
public class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f363351b = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final f f363352a;

    /* compiled from: ThreadWrapper.java */
    public static class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f363353a;

        /* compiled from: ThreadWrapper.java */
        /* renamed from: com.huawei.hms.availableupdate.d$a$a, reason: collision with other inner class name */
        public class RunnableC10750a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f363354a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f363355b;

            public RunnableC10750a(int i12, h hVar) {
                this.f363354a = i12;
                this.f363355b = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f363353a.a(this.f363354a, this.f363355b);
            }
        }

        /* compiled from: ThreadWrapper.java */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f363357a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f363358b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f363359c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ File f363360d;

            public b(int i12, int i13, int i14, File file) {
                this.f363357a = i12;
                this.f363358b = i13;
                this.f363359c = i14;
                this.f363360d = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f363353a.a(this.f363357a, this.f363358b, this.f363359c, this.f363360d);
            }
        }

        public a(g gVar) {
            this.f363353a = gVar;
        }

        @Override // com.huawei.hms.availableupdate.g
        public void a(int i12, h hVar) {
            new Handler(Looper.getMainLooper()).post(new RunnableC10750a(i12, hVar));
        }

        @Override // com.huawei.hms.availableupdate.g
        public void a(int i12, int i13, int i14, File file) {
            new Handler(Looper.getMainLooper()).post(new b(i12, i13, i14, file));
        }
    }

    /* compiled from: ThreadWrapper.java */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f363362a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f363363b;

        public b(g gVar, h hVar) {
            this.f363362a = gVar;
            this.f363363b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f363352a.a(d.b(this.f363362a), this.f363363b);
        }
    }

    public d(f fVar) {
        Checker.checkNonNull(fVar, "update must not be null.");
        this.f363352a = fVar;
    }

    public static g b(g gVar) {
        return new a(gVar);
    }

    @Override // com.huawei.hms.availableupdate.f
    public void a() {
        this.f363352a.a();
    }

    @Override // com.huawei.hms.availableupdate.f
    public void a(g gVar, h hVar) {
        f363351b.execute(new b(gVar, hVar));
    }
}
