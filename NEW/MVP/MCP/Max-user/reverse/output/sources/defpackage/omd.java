package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class omd implements gud {
    public final long a;
    public final long b;

    public omd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.gud
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && omd.class == obj.getClass()) {
            omd omdVar = (omd) obj;
            if (this.a == omdVar.a && this.b == omdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStat{timestamp=");
        sb.append(this.a);
        sb.append(", sendBitrate=");
        return utb.l(sb, this.b, '}');
    }
}
