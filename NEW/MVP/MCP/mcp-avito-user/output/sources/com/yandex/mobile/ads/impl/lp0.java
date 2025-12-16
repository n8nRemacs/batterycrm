package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.cg0;
import com.yandex.mobile.ads.impl.os;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes8.dex */
final class lp0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cg0 f387684a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Object f387685b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Handler f387686c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Executor f387687d = v90.a().b();

    public class a implements cg0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f387688a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f387689b;

        public a(ArrayList arrayList, CountDownLatch countDownLatch) {
            this.f387688a = arrayList;
            this.f387689b = countDownLatch;
        }
    }

    public interface b {
    }

    public lp0(@j.N re0 re0Var) {
        this.f387684a = new cg0(re0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @j.K
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@j.N Context context, @j.N List<zf0> list, @j.N b bVar) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        qf qfVar = new qf();
        Iterator<zf0> it = list.iterator();
        while (it.hasNext()) {
            this.f387684a.a(context, it.next(), qfVar, new a(arrayList, countDownLatch));
        }
        this.f387687d.execute(new S0(this, countDownLatch, arrayList, qfVar, bVar, 0));
    }

    @j.l0
    public final void b(@j.N Context context, @j.N List<zf0> list, @j.N b bVar) {
        this.f387686c.post(new T0(this, context, list, bVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CountDownLatch countDownLatch, List list, qf qfVar, b bVar) throws JSONException, InterruptedException {
        JSONArray jSONArray;
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            qfVar.b();
            synchronized (this.f387685b) {
                jSONArray = new JSONArray((Collection) list);
            }
            ((os.a) bVar).a(jSONArray);
        } catch (InterruptedException unused) {
        }
    }
}
