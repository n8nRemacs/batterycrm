package kotlin.collections;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* compiled from: ArraysJVM.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42758m {
    @InterfaceC42733c0
    public static final void a(int i12, int i13) {
        if (i12 > i13) {
            throw new IndexOutOfBoundsException(androidx.appcompat.app.r.l(i12, i13, "toIndex (", ") is greater than size (", ")."));
        }
    }
}
