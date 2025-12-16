package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n4c {
    public final String a;
    public final x6i b;
    public final Object c;

    static {
        new n4c("");
    }

    public n4c(String str) {
        x6i x6iVar;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            x6iVar = new x6i(26, false);
            x6iVar.b = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            x6iVar = null;
        }
        this.b = x6iVar;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        x6i x6iVar;
        x6iVar = this.b;
        x6iVar.getClass();
        return (LogSessionId) x6iVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4c)) {
            return false;
        }
        n4c n4cVar = (n4c) obj;
        return Objects.equals(this.a, n4cVar.a) && Objects.equals(this.b, n4cVar.b) && Objects.equals(this.c, n4cVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
