package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.internal.C36729v;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36658n<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f349178a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public volatile Object f349179b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public volatile a f349180c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    public static final class a<L> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f349181a;

        /* renamed from: b, reason: collision with root package name */
        public final String f349182b;

        @RX0.a
        public a(L l12, String str) {
            this.f349181a = l12;
            this.f349182b = str;
        }

        @RX0.a
        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f349181a == aVar.f349181a && this.f349182b.equals(aVar.f349182b);
        }

        @RX0.a
        public final int hashCode() {
            return this.f349182b.hashCode() + (System.identityHashCode(this.f349181a) * 31);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.internal.n$b */
    public interface b<L> {
        @RX0.a
        void notifyListener(@j.N L l12);

        @RX0.a
        void onNotifyListenerFailed();
    }

    @RX0.a
    public C36658n(@j.N Looper looper, @j.N L l12, @j.N String str) {
        this.f349178a = new com.google.android.gms.common.util.concurrent.a(looper);
        C36729v.k(l12, "Listener must not be null");
        this.f349179b = l12;
        C36729v.f(str);
        this.f349180c = new a(l12, str);
    }

    @RX0.a
    public final void a() {
        this.f349179b = null;
        this.f349180c = null;
    }

    @RX0.a
    public final void b(@j.N final b<? super L> bVar) {
        this.f349178a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.I0
            @Override // java.lang.Runnable
            public final void run() {
                C36658n c36658n = this.f349013b;
                C36658n.b bVar2 = bVar;
                Object obj = c36658n.f349179b;
                if (obj == null) {
                    bVar2.onNotifyListenerFailed();
                    return;
                }
                try {
                    bVar2.notifyListener(obj);
                } catch (RuntimeException e12) {
                    bVar2.onNotifyListenerFailed();
                    throw e12;
                }
            }
        });
    }

    @RX0.a
    public C36658n(@j.N Object obj, @j.N String str, @j.N Executor executor) {
        C36729v.k(executor, "Executor must not be null");
        this.f349178a = executor;
        C36729v.k(obj, "Listener must not be null");
        this.f349179b = obj;
        C36729v.f(str);
        this.f349180c = new a(obj, str);
    }
}
