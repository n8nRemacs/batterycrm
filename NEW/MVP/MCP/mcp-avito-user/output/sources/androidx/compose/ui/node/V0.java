package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/V0;", "", "data", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class V0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final int[] f40700a;

    public final boolean equals(Object obj) {
        if (obj instanceof V0) {
            return kotlin.jvm.internal.L.f(this.f40700a, ((V0) obj).f40700a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40700a);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Snake(");
        int[] iArr = this.f40700a;
        sb2.append(iArr[0]);
        sb2.append(',');
        sb2.append(iArr[1]);
        sb2.append(',');
        sb2.append(iArr[2]);
        sb2.append(',');
        sb2.append(iArr[3]);
        sb2.append(',');
        return androidx.appcompat.app.r.x(sb2, iArr[4] != 0, ')');
    }
}
