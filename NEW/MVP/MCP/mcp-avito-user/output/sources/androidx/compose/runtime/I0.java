package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Stack.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/I0;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public int[] f37979a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public int f37980b;

    public final int a(int i12) {
        int i13 = this.f37980b - 1;
        return i13 >= 0 ? this.f37979a[i13] : i12;
    }

    public final int b() {
        int[] iArr = this.f37979a;
        int i12 = this.f37980b - 1;
        this.f37980b = i12;
        return iArr[i12];
    }

    public final void c(int i12) {
        int[] iArrCopyOf = this.f37979a;
        if (this.f37980b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f37979a = iArrCopyOf;
        }
        int i13 = this.f37980b;
        this.f37980b = i13 + 1;
        iArrCopyOf[i13] = i12;
    }
}
