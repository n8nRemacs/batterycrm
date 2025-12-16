package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.C20199a;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import j.l0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TopicsSubscriber.java */
/* loaded from: classes6.dex */
class L {

    /* renamed from: i, reason: collision with root package name */
    public static final long f361793i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f361794j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f361795a;

    /* renamed from: b, reason: collision with root package name */
    public final u f361796b;

    /* renamed from: c, reason: collision with root package name */
    public final r f361797c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f361798d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f361800f;

    /* renamed from: h, reason: collision with root package name */
    public final J f361802h;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public final C20199a f361799e = new C20199a();

    /* renamed from: g, reason: collision with root package name */
    @j.B
    public boolean f361801g = false;

    public L(FirebaseMessaging firebaseMessaging, u uVar, J j12, r rVar, Context context, @j.N ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f361798d = firebaseMessaging;
        this.f361796b = uVar;
        this.f361802h = j12;
        this.f361797c = rVar;
        this.f361795a = context;
        this.f361800f = scheduledThreadPoolExecutor;
    }

    @l0
    public static <T> void a(Task<T> task) throws IOException {
        try {
            C37030m.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e13);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e14) {
            e = e14;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    @l0
    public final void b(String str) throws IOException {
        String strA = this.f361798d.a();
        r rVar = this.f361797c;
        rVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(rVar.a(rVar.c(strA, "/topics/" + str, bundle)));
    }

    @l0
    public final void c(String str) throws IOException {
        String strA = this.f361798d.a();
        r rVar = this.f361797c;
        rVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(rVar.a(rVar.c(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z12) {
        this.f361801g = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.L.e():boolean");
    }

    public final void f(long j12) {
        this.f361800f.schedule(new M(this, this.f361795a, this.f361796b, Math.min(Math.max(30L, 2 * j12), f361793i)), j12, TimeUnit.SECONDS);
        d(true);
    }
}
