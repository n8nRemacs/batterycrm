package w0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SegmentFinder.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw0/c;", "Lw0/f;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c implements f {
    @Override // w0.f
    public final int a(int i12) {
        int iF2 = f(i12);
        if (iF2 == -1 || f(iF2) == -1) {
            return -1;
        }
        return iF2;
    }

    @Override // w0.f
    public final int b(int i12) {
        int iE2 = e(i12);
        if (iE2 == -1 || e(iE2) == -1) {
            return -1;
        }
        return iE2;
    }

    @Override // w0.f
    public final int c(int i12) {
        return f(i12);
    }

    @Override // w0.f
    public final int d(int i12) {
        return e(i12);
    }

    public abstract int e(int i12);

    public abstract int f(int i12);
}
