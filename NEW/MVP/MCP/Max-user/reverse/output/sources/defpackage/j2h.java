package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class j2h implements Serializable {
    public final byte X;
    public final String Y;
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public final List o;

    public j2h(String str, long j, String str2, int i, List list, byte b, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i;
        this.o = list;
        this.X = b;
        this.Y = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c4 A[Catch: all -> 0x0071, LOOP:9: B:184:0x02be->B:186:0x02c4, LOOP_END, TryCatch #10 {all -> 0x0071, blocks: (B:183:0x02b5, B:184:0x02be, B:186:0x02c4, B:187:0x02d1, B:190:0x02db, B:191:0x02e0, B:192:0x02e1, B:22:0x0055, B:23:0x005e, B:25:0x0064, B:28:0x0074, B:31:0x007e, B:32:0x0083, B:33:0x0084, B:19:0x004f), top: B:232:0x02b5, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j2h a(defpackage.tm9 r22) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2h.a(tm9):j2h");
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("{conversationId='", this.b, this.a, "', startedAt=");
        sbQ.append(", joinLink=");
        sbQ.append(this.c);
        sbQ.append(", approxParticipantCount=");
        sbQ.append(this.d);
        sbQ.append(", previewParticipantIds=");
        sbQ.append(this.o);
        sbQ.append(", type=");
        sbQ.append((int) this.X);
        return ctd.j(sbQ, ", callType=", this.Y, "}");
    }
}
