package com.android.volley;

import java.util.Comparator;

/* compiled from: AsyncRequestQueue.java */
/* loaded from: classes10.dex */
class e implements Comparator<Runnable> {
    @Override // java.util.Comparator
    public final int compare(Runnable runnable, Runnable runnable2) {
        Runnable runnable3 = runnable;
        Runnable runnable4 = runnable2;
        if (!(runnable3 instanceof v)) {
            return runnable4 instanceof v ? -1 : 0;
        }
        if (runnable4 instanceof v) {
            return ((v) runnable3).f67161b.compareTo(((v) runnable4).f67161b);
        }
        return 1;
    }
}
