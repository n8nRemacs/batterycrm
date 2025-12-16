package com.avito.android.util.concurrent;

import Oa1.B;
import Y61.k;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.util.C35743a3;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Threads.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Handler f318855a = new Handler(Looper.getMainLooper());

    public static final void a(@k Y41.a<G0> aVar) {
        if (C35743a3.a()) {
            aVar.invoke();
        } else {
            f318855a.post(new B(3, aVar));
        }
    }
}
