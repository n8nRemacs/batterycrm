package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class qe6 {
    public final int a;
    public final int b;
    public final Notification c;

    public qe6(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qe6.class != obj.getClass()) {
            return false;
        }
        qe6 qe6Var = (qe6) obj;
        if (this.a == qe6Var.a && this.b == qe6Var.b) {
            return this.c.equals(qe6Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
