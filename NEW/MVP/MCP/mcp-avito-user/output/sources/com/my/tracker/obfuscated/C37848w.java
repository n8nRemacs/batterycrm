package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import androidx.camera.core.RunnableC20147y;
import com.my.tracker.MyTracker;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.h0;
import com.my.tracker.obfuscated.y0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37848w {

    /* renamed from: b, reason: collision with root package name */
    final f2 f365842b;

    /* renamed from: c, reason: collision with root package name */
    final Context f365843c;

    /* renamed from: d, reason: collision with root package name */
    final b f365844d;

    /* renamed from: e, reason: collision with root package name */
    s0 f365845e;

    /* renamed from: a, reason: collision with root package name */
    final Map<Integer, Long> f365841a = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    long f365846f = 0;

    /* renamed from: com.my.tracker.obfuscated.w$a */
    public interface a {
        void a(List<C37831e> list);
    }

    /* renamed from: com.my.tracker.obfuscated.w$b */
    public interface b {
        void a();

        void a(String str);
    }

    /* renamed from: com.my.tracker.obfuscated.w$c */
    public interface c {
        void a(List<d0> list);
    }

    private C37848w(f2 f2Var, b bVar, Context context) {
        this.f365842b = f2Var;
        this.f365844d = bVar;
        this.f365843c = context.getApplicationContext();
    }

    public static C37848w a(f2 f2Var, b bVar, Context context) {
        return new C37848w(f2Var, bVar, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.f365845e != null) {
            e2.b("EventTracker error: tracker has already been initialized");
            return;
        }
        s0 s0VarA = s0.a(this.f365842b, this.f365843c);
        this.f365845e = s0VarA;
        if (a(s0VarA)) {
            return;
        }
        this.f365846f = z0.a(this.f365843c).k();
        b();
    }

    public void b() {
        int iF2;
        s0 s0Var = this.f365845e;
        if (s0Var == null) {
            return;
        }
        if (s0Var.c() != 0 || ((iF2 = this.f365842b.f()) > 0 && c2.a() - this.f365846f <= iF2)) {
            b((MyTracker.FlushListener) null);
        }
    }

    public void c() {
        C37835i.a(new J(this, 5));
    }

    public void e() {
        C37835i.a(new androidx.media3.exoplayer.audio.f(3, c2.a(), this));
    }

    private static Map<String, String> a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public void b(float f12) {
        C37835i.a(new T(this, System.currentTimeMillis(), f12, 0));
    }

    public void c(float f12) {
        C37835i.a(new T(this, System.currentTimeMillis(), f12, 2));
    }

    public void d(List<d0> list) {
        C37835i.a(new W(this, list, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j12, float f12) {
        if (a(this.f365845e) || a(29, j12)) {
            return;
        }
        long j13 = (long) (f12 * 1000.0f);
        this.f365845e.c(j13, c2.b(j12));
    }

    public void a() {
        a((MyTracker.FlushListener) null);
    }

    public void b(float f12, float f13, float f14) {
        C37835i.a(new S(this, System.currentTimeMillis(), f12, f13, f14, 1));
    }

    public void d(Map<String, String> map) {
        C37835i.a(new U(0, c2.a(), this, a(map)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j12, float f12) {
        if (a(this.f365845e) || a(28, j12)) {
            return;
        }
        long j13 = (long) (f12 * 1000.0f);
        this.f365845e.b(j13, c2.b(j12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MyTracker.FlushListener flushListener) {
        if (a(this.f365845e)) {
            return;
        }
        b(flushListener);
    }

    public void a(float f12) {
        C37835i.a(new T(this, System.currentTimeMillis(), f12, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j12, float f12, float f13, float f14) {
        if (a(this.f365845e) || a(26, j12)) {
            return;
        }
        long jB2 = c2.b(j12);
        this.f365845e.b((long) (f12 * 1000.0f), (long) (f13 * 1000.0f), (long) (f14 * 1000.0f), jB2);
    }

    public void a(float f12, float f13, float f14) {
        C37835i.a(new S(this, System.currentTimeMillis(), f12, f13, f14, 0));
    }

    public void c(List<C37831e> list) {
        C37835i.a(new W(this, list, 0));
    }

    public void a(final int i12, Map<String, String> map) {
        final long jA2 = c2.a();
        final Map<String, String> mapA = a(map);
        C37835i.a(new Runnable() { // from class: com.my.tracker.obfuscated.A0
            @Override // java.lang.Runnable
            public final void run() {
                this.a(mapA, i12, jA2);
            }
        });
    }

    public void b(MyTracker.FlushListener flushListener) {
        if (this.f365845e == null) {
            return;
        }
        this.f365844d.a();
        h0.b<String> bVarA = this.f365845e.a(flushListener);
        if (bVarA == null) {
            return;
        }
        String strA = bVarA.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f365844d.a(strA);
    }

    public void c(Map<String, String> map) {
        C37835i.a(new U(1, c2.a(), this, a(map)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i12, byte[] bArr, boolean z12, boolean z13, long j12, Runnable runnable) {
        if (!a(this.f365845e) && this.f365845e.a(i12, bArr, z12, z13, j12)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        aVar.a(a(this.f365845e) ? Collections.EMPTY_LIST : this.f365845e.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar) {
        cVar.a(a(this.f365845e) ? Collections.EMPTY_LIST : this.f365845e.b());
    }

    public void a(final int i12, final byte[] bArr, final boolean z12, final boolean z13, final Runnable runnable) {
        final long jA2 = c2.a();
        C37835i.a(new Runnable() { // from class: com.my.tracker.obfuscated.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f365341b.a(i12, bArr, z12, z13, jA2, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j12) {
        if (a(this.f365845e)) {
            return;
        }
        boolean zD2 = this.f365845e.d(j12, z0.a(this.f365843c).m());
        if (this.f365845e.a(j12)) {
            zD2 = true;
        }
        if (zD2) {
            b((MyTracker.FlushListener) null);
        }
    }

    public void b(String str) {
        C37835i.a(new androidx.media3.exoplayer.video.j(3, this, c2.a(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j12, float f12) {
        if (a(this.f365845e) || a(25, j12)) {
            return;
        }
        long j13 = (long) (f12 * 1000.0f);
        this.f365845e.a(j13, c2.b(j12));
    }

    public void b(String str, String str2, long j12, long j13) {
        C37835i.a(new B0(this, str, str2, j12, j13, c2.a(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j12, float f12, float f13, float f14) {
        if (a(this.f365845e) || a(27, j12)) {
            return;
        }
        long jB2 = c2.b(j12);
        this.f365845e.a((long) (f12 * 1000.0f), (long) (f13 * 1000.0f), (long) (f14 * 1000.0f), jB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j12, long j13, long j14) {
        if (!a(this.f365845e) && this.f365845e.b(str, str2, j12, j13, j14)) {
            b();
        }
    }

    public void a(final long j12, final String str, final y0.a aVar) {
        final long jA2 = c2.a();
        C37835i.a(new Runnable() { // from class: com.my.tracker.obfuscated.Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f365348b.a(j12, str, aVar, jA2);
            }
        });
    }

    public void b(String str, String str2, Map<String, String> map) {
        C37835i.a(new Q(this, a(map), str, str2, c2.a(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j12, String str, y0.a aVar, long j13) {
        if (!a(this.f365845e) && this.f365845e.a(j12, str, aVar, j13)) {
            z0.a(this.f365843c).c(j13);
            this.f365846f = j13;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (a(this.f365845e)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            this.f365845e.a(d0Var, (Map<String, String>) null);
            this.f365845e.b(d0Var);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, long j12) {
        if (a(this.f365845e) || b((Map<String, String>) map) || !this.f365845e.b((Map<String, String>) map, j12)) {
            return;
        }
        b();
    }

    public void a(MyTracker.FlushListener flushListener) {
        C37835i.a(new H(11, this, flushListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j12) {
        if (a(this.f365845e) || b((Map<String, String>) map) || !this.f365845e.b(str, str2, (Map<String, String>) map, j12)) {
            return;
        }
        b();
    }

    public void a(AdEvent adEvent) {
        C37835i.a(new androidx.media3.exoplayer.video.j(4, this, c2.a(), adEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEvent adEvent, long j12) {
        if (!a(this.f365845e) && this.f365845e.a(adEvent, j12)) {
            b();
        }
    }

    public static boolean b(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (a(entry.getKey()) || a(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public void a(MiniAppEvent miniAppEvent) {
        C37835i.a(new androidx.media3.exoplayer.video.j(5, this, c2.a(), miniAppEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j12) {
        if (a(this.f365845e) || a(miniAppEvent.name) || b(miniAppEvent.eventParams) || !this.f365845e.a(miniAppEvent, j12)) {
            return;
        }
        b();
    }

    public void a(a aVar) {
        C37835i.a(new H(12, this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.f365845e)) {
            aVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f365845e.a((C37831e) it.next());
        }
        aVar.a(list);
    }

    public void a(c cVar) {
        C37835i.a(new H(10, this, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.f365845e)) {
            cVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f365845e.a((d0) it.next());
        }
        cVar.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j12) {
        if (!a(this.f365845e) && this.f365845e.a(str, j12)) {
            b();
        }
    }

    public void a(String str, String str2) {
        C37835i.a(new RunnableC20147y(this, str, str2, c2.a(), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j12) {
        if (!a(this.f365845e) && this.f365845e.a(str, str2, j12)) {
            b();
        }
    }

    public void a(String str, String str2, long j12, long j13) {
        C37835i.a(new B0(this, str, str2, j12, j13, c2.a(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j12, long j13, long j14) {
        if (!a(this.f365845e) && this.f365845e.a(str, str2, j12, j13, j14)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j12, Runnable runnable) {
        if (a(this.f365845e)) {
            return;
        }
        if (this.f365845e.b(str, str2, j12)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(String str, String str2, Runnable runnable) {
        C37835i.a(new Q(this, str, str2, c2.a(), runnable));
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        C37835i.a(new Z(this, str, str2, str3, str4, str5, c2.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j12) {
        if (!a(this.f365845e) && this.f365845e.a(str, str2, str3, str4, str5, j12)) {
            z0.a(this.f365843c).c(j12);
            this.f365846f = j12;
            b();
        }
    }

    public void a(String str, String str2, Map<String, String> map) {
        C37835i.a(new Q(this, a(map), str, str2, c2.a(), 1));
    }

    public void a(String str, Map<String, String> map) {
        C37835i.a(new RunnableC20147y(this, a(map), str, c2.a(), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (a(this.f365845e)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C37831e c37831e = (C37831e) it.next();
            this.f365845e.a(c37831e, (Map<String, String>) null);
            this.f365845e.b(c37831e);
        }
        b();
    }

    public void a(List<C37831e> list, a aVar) {
        C37835i.a(new D(this, aVar, list, 6));
    }

    public void a(List<d0> list, c cVar) {
        C37835i.a(new D(this, cVar, list, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i12, long j12) {
        if (a(this.f365845e) || b((Map<String, String>) map) || !this.f365845e.a(i12, (Map<String, String>) map, j12)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, long j12) {
        if (a(this.f365845e) || b((Map<String, String>) map) || !this.f365845e.a((Map<String, String>) map, j12)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, long j12) {
        if (a(this.f365845e) || b((Map<String, String>) map) || a(str) || !this.f365845e.a(str, (Map<String, String>) map, j12)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j12) {
        if (a(this.f365845e) || b((Map<String, String>) map) || !this.f365845e.a(str, str2, (Map<String, String>) map, j12)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, String str3, long j12, JSONObject jSONObject, Map map2) {
        C37831e c37831eA;
        if (a(this.f365845e) || b((Map<String, String>) map) || (c37831eA = C37831e.a(str, str2, str3, 0, j12)) == null) {
            return;
        }
        c37831eA.a(jSONObject);
        if (this.f365845e.a(c37831eA, (Map<String, String>) map2)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, long j12, JSONObject jSONObject2, Map map2) {
        if (a(this.f365845e) || b((Map<String, String>) map)) {
            return;
        }
        if (this.f365845e.a(d0.a(jSONObject, str, j12).a(jSONObject2), (Map<String, String>) map2)) {
            b();
        }
    }

    public void a(final JSONObject jSONObject, final String str, final String str2, final String str3, final Map<String, String> map) {
        final long jA2 = c2.a();
        final Map<String, String> mapA = a(map);
        C37835i.a(new Runnable() { // from class: com.my.tracker.obfuscated.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f365330b.a(mapA, str, str2, str3, jA2, jSONObject, map);
            }
        });
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C37835i.a(new Z(this, a(map), jSONObject2, str, c2.a(), jSONObject, map));
    }

    private boolean a(int i12, long j12) {
        Long l12 = this.f365841a.get(Integer.valueOf(i12));
        if (l12 == null || j12 - l12.longValue() >= 800) {
            this.f365841a.put(Integer.valueOf(i12), Long.valueOf(j12));
            return false;
        }
        Locale locale = Locale.ENGLISH;
        e2.a("EventTracker: event with type " + i12 + " was throttled");
        return true;
    }

    public static boolean a(s0 s0Var) {
        if (s0Var != null) {
            return false;
        }
        e2.b("EventTracker error: repository is null");
        return true;
    }

    public static boolean a(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        e2.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }
}
