package r0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PointerIdArray.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr0/c;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f429560a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public long[] f429561b = new long[2];

    public final void a(long j12) {
        if (b(j12)) {
            return;
        }
        int i12 = this.f429560a;
        long[] jArrCopyOf = this.f429561b;
        if (i12 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i12 + 1, jArrCopyOf.length * 2));
            this.f429561b = jArrCopyOf;
        }
        jArrCopyOf[i12] = j12;
        if (i12 >= this.f429560a) {
            this.f429560a = i12 + 1;
        }
    }

    public final boolean b(long j12) {
        int i12 = this.f429560a;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f429561b[i13] == j12) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j12) {
        int i12 = this.f429560a;
        int i13 = 0;
        while (i13 < i12) {
            if (j12 == this.f429561b[i13]) {
                int i14 = this.f429560a - 1;
                while (i13 < i14) {
                    long[] jArr = this.f429561b;
                    int i15 = i13 + 1;
                    jArr[i13] = jArr[i15];
                    i13 = i15;
                }
                this.f429560a--;
                return;
            }
            i13++;
        }
    }
}
