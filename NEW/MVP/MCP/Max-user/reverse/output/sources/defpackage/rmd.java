package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class rmd implements rud {
    public final Integer a;

    public rmd(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rmd.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((rmd) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "ReportPerfStatResponse{estimatedPerformanceIndex=" + this.a + '}';
    }
}
