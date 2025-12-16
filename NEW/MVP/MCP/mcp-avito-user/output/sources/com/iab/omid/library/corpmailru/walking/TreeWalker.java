package com.iab.omid.library.corpmailru.walking;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.iab.omid.library.corpmailru.c.a;
import com.iab.omid.library.corpmailru.d.d;
import com.iab.omid.library.corpmailru.d.f;
import com.iab.omid.library.corpmailru.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC10764a {

    /* renamed from: a, reason: collision with root package name */
    private static TreeWalker f364022a = new TreeWalker();

    /* renamed from: b, reason: collision with root package name */
    private static Handler f364023b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static Handler f364024c = null;

    /* renamed from: j, reason: collision with root package name */
    private static final Runnable f364025j = new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f364026k = new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f364024c != null) {
                TreeWalker.f364024c.post(TreeWalker.f364025j);
                TreeWalker.f364024c.postDelayed(TreeWalker.f364026k, 200L);
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private int f364028e;

    /* renamed from: i, reason: collision with root package name */
    private long f364032i;

    /* renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f364027d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private a f364030g = new a();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.c.b f364029f = new com.iab.omid.library.corpmailru.c.b();

    /* renamed from: h, reason: collision with root package name */
    private b f364031h = new b(new com.iab.omid.library.corpmailru.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i12, long j12);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i12, long j12);
    }

    public static TreeWalker getInstance() {
        return f364022a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws JSONException {
        i();
        d();
        j();
    }

    private void i() {
        this.f364028e = 0;
        this.f364032i = d.a();
    }

    private void j() {
        a(d.a() - this.f364032i);
    }

    private void k() {
        if (f364024c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f364024c = handler;
            handler.post(f364025j);
            f364024c.postDelayed(f364026k, 200L);
        }
    }

    private void l() {
        Handler handler = f364024c;
        if (handler != null) {
            handler.removeCallbacks(f364026k);
            f364024c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f364027d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f364027d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f364027d.clear();
        f364023b.post(new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f364031h.a();
            }
        });
    }

    public void c() {
        l();
    }

    @VisibleForTesting
    public void d() throws JSONException {
        this.f364030g.c();
        long jA2 = d.a();
        com.iab.omid.library.corpmailru.c.a aVarA = this.f364029f.a();
        if (this.f364030g.b().size() > 0) {
            Iterator<String> it = this.f364030g.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f364030g.b(next), jSONObjectA);
                com.iab.omid.library.corpmailru.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f364031h.b(jSONObjectA, hashSet, jA2);
            }
        }
        if (this.f364030g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.corpmailru.d.b.a(jSONObjectA2);
            this.f364031h.a(jSONObjectA2, this.f364030g.a(), jA2);
        } else {
            this.f364031h.a();
        }
        this.f364030g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f364027d.contains(treeWalkerTimeLogger)) {
            this.f364027d.remove(treeWalkerTimeLogger);
        }
    }

    private void b(View view, JSONObject jSONObject) throws JSONException {
        a.C10765a c10765aB = this.f364030g.b(view);
        if (c10765aB != null) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, c10765aB);
        }
    }

    public void a() {
        k();
    }

    private void a(long j12) {
        if (this.f364027d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f364027d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f364028e, TimeUnit.NANOSECONDS.toMillis(j12));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f364028e, j12);
                }
            }
        }
    }

    @Override // com.iab.omid.library.corpmailru.c.a.InterfaceC10764a
    public void a(View view, com.iab.omid.library.corpmailru.c.a aVar, JSONObject jSONObject) throws JSONException {
        c cVarC;
        if (f.d(view) && (cVarC = this.f364030g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f364028e++;
        }
    }

    private void a(View view, com.iab.omid.library.corpmailru.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.corpmailru.c.a aVarB = this.f364029f.b();
        String strA = this.f364030g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.corpmailru.d.b.a(jSONObjectA, str);
            com.iab.omid.library.corpmailru.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        String strA = this.f364030g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.corpmailru.d.b.a(jSONObject, strA);
        this.f364030g.e();
        return true;
    }
}
