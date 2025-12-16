package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.g.j;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import q01.C47180a;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorService f363503i = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicInteger f363504j = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public GrsBaseInfo f363505a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f363506b;

    /* renamed from: c, reason: collision with root package name */
    public j f363507c;

    /* renamed from: d, reason: collision with root package name */
    public C47180a f363508d;

    /* renamed from: e, reason: collision with root package name */
    public q01.c f363509e;

    /* renamed from: f, reason: collision with root package name */
    public q01.c f363510f;

    /* renamed from: g, reason: collision with root package name */
    public b f363511g;

    /* renamed from: h, reason: collision with root package name */
    public FutureTask<Boolean> f363512h;

    public class a implements Callable<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f363513b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GrsBaseInfo f363514c;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f363513b = context;
            this.f363514c = grsBaseInfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x01b1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x016e A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean call() throws org.json.JSONException, java.lang.NumberFormatException, java.io.IOException {
            /*
                Method dump skipped, instructions count: 597
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.d.a.call():java.lang.Object");
        }
    }

    public d(Context context, GrsBaseInfo grsBaseInfo) {
        this.f363512h = null;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f363506b = context;
        try {
            this.f363505a = grsBaseInfo.m111clone();
        } catch (CloneNotSupportedException e12) {
            Logger.w("c", "GrsClient catch CloneNotSupportedException", e12);
            this.f363505a = grsBaseInfo.copy();
        }
        GrsBaseInfo grsBaseInfo2 = this.f363505a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(context, grsBaseInfo2));
        this.f363512h = futureTask;
        f363503i.execute(futureTask);
        Logger.i("c", "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s", "5.0.8.301", grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry());
    }

    public final boolean a() {
        String str;
        FutureTask<Boolean> futureTask = this.f363512h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e12) {
            e = e12;
            str = "init compute task interrupted.";
            Logger.w("c", str, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i("c", "init compute task canceled.");
            return false;
        } catch (ExecutionException e13) {
            e = e13;
            str = "init compute task failed.";
            Logger.w("c", str, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w("c", "init compute task timed out");
            return false;
        } catch (Exception e14) {
            e = e14;
            str = "init compute task occur unknown Exception";
            Logger.w("c", str, e);
            return false;
        }
    }
}
