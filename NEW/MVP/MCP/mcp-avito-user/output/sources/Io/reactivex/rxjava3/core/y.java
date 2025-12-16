package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* compiled from: Notification.java */
/* loaded from: classes8.dex */
public final class y<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final y<Object> f401974b = new y<>(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f401975a;

    public y(@j41.f Object obj) {
        this.f401975a = obj;
    }

    @j41.e
    public static <T> y<T> a(@j41.e Throwable th2) {
        Objects.requireNonNull(th2, "error is null");
        return new y<>(NotificationLite.e(th2));
    }

    @j41.f
    public final Throwable b() {
        Object obj = this.f401975a;
        if (NotificationLite.i(obj)) {
            return NotificationLite.f(obj);
        }
        return null;
    }

    @j41.f
    public final T c() {
        T t12 = (T) this.f401975a;
        if (t12 == null || NotificationLite.i(t12)) {
            return null;
        }
        return t12;
    }

    public final boolean d() {
        return this.f401975a == null;
    }

    public final boolean e() {
        Object obj = this.f401975a;
        return (obj == null || NotificationLite.i(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return Objects.equals(this.f401975a, ((y) obj).f401975a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f401975a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f401975a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.i(obj)) {
            return "OnErrorNotification[" + NotificationLite.f(obj) + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
