package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TextPreparedSelection.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/c;", "", "value", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.selection.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20918c {

    /* renamed from: a, reason: collision with root package name */
    public final long f31359a;

    /* compiled from: TextPreparedSelection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31360a;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                WedgeAffinity wedgeAffinity = WedgeAffinity.f31012b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WedgeAffinity wedgeAffinity2 = WedgeAffinity.f31012b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31360a = iArr;
        }
    }

    @Y61.l
    public static final WedgeAffinity a(long j12) {
        int i12 = (int) (j12 & 4294967295L);
        if (i12 < 0) {
            return null;
        }
        return i12 == 0 ? WedgeAffinity.f31012b : WedgeAffinity.f31013c;
    }

    public static long b(int i12, @Y61.l WedgeAffinity wedgeAffinity) {
        int i13 = a.f31360a[wedgeAffinity.ordinal()];
        int i14 = -1;
        if (i13 != -1) {
            i14 = 1;
            if (i13 == 1) {
                i14 = 0;
            } else if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (i12 << 32) | (i14 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20918c) {
            return this.f31359a == ((C20918c) obj).f31359a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31359a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("CursorAndWedgeAffinity(value="), this.f31359a, ')');
    }
}
