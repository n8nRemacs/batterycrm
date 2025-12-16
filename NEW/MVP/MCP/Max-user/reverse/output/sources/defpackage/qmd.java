package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class qmd implements gud {
    public final long a;
    public final long b;

    public qmd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.gud
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qmd.class == obj.getClass()) {
            qmd qmdVar = (qmd) obj;
            if (this.a == qmdVar.a && this.b == qmdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPerfStatCommand{framesReceived=");
        sb.append(this.a);
        sb.append(", framesDecoded=");
        return utb.l(sb, this.b, '}');
    }
}
