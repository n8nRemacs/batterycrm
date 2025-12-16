package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.Metadata;

/* compiled from: IntervalList.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20719g {
    public static final int a(int i12, androidx.compose.runtime.collection.e eVar) {
        int i13 = eVar.f38262d - 1;
        int i14 = 0;
        while (i14 < i13) {
            int iF2 = androidx.appcompat.app.r.f(i13, i14, 2, i14);
            Object[] objArr = eVar.f38260b;
            int i15 = ((InterfaceC20717f.a) objArr[iF2]).f29411a;
            if (i15 != i12) {
                if (i15 < i12) {
                    i14 = iF2 + 1;
                    if (i12 < ((InterfaceC20717f.a) objArr[i14]).f29411a) {
                    }
                } else {
                    i13 = iF2 - 1;
                }
            }
            return iF2;
        }
        return i14;
    }
}
