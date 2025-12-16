package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/g;", "", "data", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22411g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final int[] f40785a;

    public final boolean equals(Object obj) {
        if (obj instanceof C22411g) {
            return kotlin.jvm.internal.L.f(this.f40785a, ((C22411g) obj).f40785a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40785a);
    }

    public final String toString() {
        return "CenteredArray(data=" + Arrays.toString(this.f40785a) + ')';
    }
}
