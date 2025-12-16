package com.avito.beduin.v2.render.android_view.diff;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Diff.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/c;", "", "array", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final int[] f337965a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return L.f(this.f337965a, ((c) obj).f337965a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f337965a);
    }

    public final String toString() {
        return "CenteredArray(array=" + Arrays.toString(this.f337965a) + ')';
    }
}
