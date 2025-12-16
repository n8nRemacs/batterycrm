package com.google.common.collect;

import aZ0.InterfaceC19845a;
import androidx.compose.foundation.text.selection.C21030p;

/* compiled from: CollectPreconditions.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class F {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(androidx.camera.view.k.a(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    @InterfaceC19845a
    public static void b(int i12, String str) {
        if (i12 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i12);
    }

    @InterfaceC19845a
    public static void c(long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "distance cannot be negative but was: "));
        }
    }

    public static void d(int i12, String str) {
        if (i12 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i12);
    }

    public static void e(boolean z12) {
        com.google.common.base.M.n("no calls to next() since the last call to remove()", z12);
    }
}
