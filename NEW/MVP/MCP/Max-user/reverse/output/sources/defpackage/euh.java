package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class euh implements avh {
    public final Intent a;

    public euh(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euh) && fni.a(this.a, ((euh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}
