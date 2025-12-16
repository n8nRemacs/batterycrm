package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* renamed from: androidx.work.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23638w {

    /* renamed from: a, reason: collision with root package name */
    public final int f56213a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56214b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f56215c;

    public C23638w(int i12, int i13, @j.N Notification notification) {
        this.f56213a = i12;
        this.f56215c = notification;
        this.f56214b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23638w.class != obj.getClass()) {
            return false;
        }
        C23638w c23638w = (C23638w) obj;
        if (this.f56213a == c23638w.f56213a && this.f56214b == c23638w.f56214b) {
            return this.f56215c.equals(c23638w.f56215c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56215c.hashCode() + (((this.f56213a * 31) + this.f56214b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f56213a + ", mForegroundServiceType=" + this.f56214b + ", mNotification=" + this.f56215c + '}';
    }
}
