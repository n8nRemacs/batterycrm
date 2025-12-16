package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.G;
import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class NotificationLite {

    /* renamed from: b, reason: collision with root package name */
    public static final NotificationLite f404825b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ NotificationLite[] f404826c;

    public static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.d f404827b;

        public a(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404827b = dVar;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f404827b + "]";
        }
    }

    public static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f404828b;

        public b(Throwable th2) {
            this.f404828b = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f404828b, ((b) obj).f404828b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f404828b.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f404828b + "]";
        }
    }

    public static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.e f404829b;

        public c(org.reactivestreams.e eVar) {
            this.f404829b = eVar;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f404829b + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        f404825b = notificationLite;
        f404826c = new NotificationLite[]{notificationLite};
    }

    public NotificationLite() {
        throw null;
    }

    public static boolean a(G g12, Object obj) {
        if (obj == f404825b) {
            g12.e();
            return true;
        }
        if (obj instanceof b) {
            g12.onError(((b) obj).f404828b);
            return true;
        }
        g12.onNext(obj);
        return false;
    }

    public static <T> boolean b(Object obj, org.reactivestreams.d<? super T> dVar) {
        if (obj == f404825b) {
            dVar.e();
            return true;
        }
        if (obj instanceof b) {
            dVar.onError(((b) obj).f404828b);
            return true;
        }
        dVar.onNext(obj);
        return false;
    }

    public static boolean c(G g12, Object obj) {
        if (obj == f404825b) {
            g12.e();
            return true;
        }
        if (obj instanceof b) {
            g12.onError(((b) obj).f404828b);
            return true;
        }
        if (obj instanceof a) {
            g12.b(((a) obj).f404827b);
            return false;
        }
        g12.onNext(obj);
        return false;
    }

    public static Object d(io.reactivex.rxjava3.disposables.d dVar) {
        return new a(dVar);
    }

    public static Object e(Throwable th2) {
        return new b(th2);
    }

    public static Throwable f(Object obj) {
        return ((b) obj).f404828b;
    }

    public static boolean h(Object obj) {
        return obj == f404825b;
    }

    public static boolean i(Object obj) {
        return obj instanceof b;
    }

    public static Object k(org.reactivestreams.e eVar) {
        return new c(eVar);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) f404826c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
