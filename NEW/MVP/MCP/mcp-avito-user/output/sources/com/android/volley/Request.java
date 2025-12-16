package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.j;
import com.android.volley.u;
import com.android.volley.w;
import com.android.volley.z;
import j.B;
import j.P;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class Request<T> implements Comparable<Request<T>> {

    /* renamed from: b, reason: collision with root package name */
    public final z.a f67025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67026c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67027d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67028e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f67029f;

    /* renamed from: g, reason: collision with root package name */
    @B
    @P
    public final w.a f67030g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f67031h;

    /* renamed from: i, reason: collision with root package name */
    public u f67032i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f67033j;

    /* renamed from: k, reason: collision with root package name */
    @B
    public final boolean f67034k;

    /* renamed from: l, reason: collision with root package name */
    @B
    public boolean f67035l;

    /* renamed from: m, reason: collision with root package name */
    public m f67036m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public j.a f67037n;

    /* renamed from: o, reason: collision with root package name */
    @B
    public A f67038o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Priority {

        /* renamed from: b, reason: collision with root package name */
        public static final Priority f67039b;

        /* renamed from: c, reason: collision with root package name */
        public static final Priority f67040c;

        /* renamed from: d, reason: collision with root package name */
        public static final Priority f67041d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Priority[] f67042e;

        static {
            Priority priority = new Priority("LOW", 0);
            f67039b = priority;
            Priority priority2 = new Priority("NORMAL", 1);
            f67040c = priority2;
            Priority priority3 = new Priority("HIGH", 2);
            Priority priority4 = new Priority("IMMEDIATE", 3);
            f67041d = priority4;
            f67042e = new Priority[]{priority, priority2, priority3, priority4};
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f67042e.clone();
        }
    }

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67043b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f67044c;

        public a(String str, long j12) {
            this.f67043b = str;
            this.f67044c = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Request request = Request.this;
            request.f67025b.a(this.f67044c, this.f67043b);
            request.f67025b.b(request.toString());
        }
    }

    public interface b {
    }

    public interface c {
    }

    public Request(int i12, String str, @P w.a aVar) {
        Uri uri;
        String host;
        this.f67025b = z.a.f67168c ? new z.a() : null;
        this.f67029f = new Object();
        this.f67033j = true;
        int iHashCode = 0;
        this.f67034k = false;
        this.f67035l = false;
        this.f67037n = null;
        this.f67026c = i12;
        this.f67027d = str;
        this.f67030g = aVar;
        this.f67036m = new m();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f67028e = iHashCode;
    }

    public final void a(String str) {
        if (z.a.f67168c) {
            this.f67025b.a(Thread.currentThread().getId(), str);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Request<T> request) {
        Priority priorityJ = j();
        Priority priorityJ2 = request.j();
        return priorityJ == priorityJ2 ? this.f67031h.intValue() - request.f67031h.intValue() : priorityJ2.ordinal() - priorityJ.ordinal();
    }

    public abstract void c(T t12);

    public final void d(String str) {
        u uVar = this.f67032i;
        if (uVar != null) {
            synchronized (uVar.f67151b) {
                uVar.f67151b.remove(this);
            }
            synchronized (uVar.f67159j) {
                try {
                    Iterator it = uVar.f67159j.iterator();
                    while (it.hasNext()) {
                        ((u.d) it.next()).a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            uVar.c(this, 5);
        }
        if (z.a.f67168c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
            } else {
                this.f67025b.a(id2, str);
                this.f67025b.b(toString());
            }
        }
    }

    public byte[] e() {
        return null;
    }

    public String f() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final String h() {
        String str = this.f67027d;
        int i12 = this.f67026c;
        if (i12 == 0 || i12 == -1) {
            return str;
        }
        return Integer.toString(i12) + '-' + str;
    }

    public Map<String, String> i() {
        return Collections.emptyMap();
    }

    public Priority j() {
        return Priority.f67040c;
    }

    public boolean k() {
        boolean z12;
        synchronized (this.f67029f) {
            z12 = this.f67034k;
        }
        return z12;
    }

    public final void l() {
        A a12;
        synchronized (this.f67029f) {
            a12 = this.f67038o;
        }
        if (a12 != null) {
            a12.b(this);
        }
    }

    public abstract w<T> m(r rVar);

    public final void n(int i12) {
        u uVar = this.f67032i;
        if (uVar != null) {
            uVar.c(this, i12);
        }
    }

    public final String toString() {
        String strM = androidx.appcompat.app.r.m(this.f67028e, new StringBuilder("0x"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k() ? "[X] " : "[ ] ");
        androidx.media3.exoplayer.analytics.m.p(sb2, this.f67027d, " ", strM, " ");
        sb2.append(j());
        sb2.append(" ");
        sb2.append(this.f67031h);
        return sb2.toString();
    }
}
