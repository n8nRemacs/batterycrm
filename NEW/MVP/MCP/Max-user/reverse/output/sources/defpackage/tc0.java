package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class tc0 implements vc0 {
    public final Intent a;

    public tc0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc0) && fni.a(this.a, ((tc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}
