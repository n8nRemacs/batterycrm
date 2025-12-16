package com.yandex.mobile.ads.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.impl.q2;
import j.P;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class AdResultReceiver extends ResultReceiver implements q2 {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<q2> f382619a;

    public AdResultReceiver(Handler handler) {
        super(handler);
        this.f382619a = new WeakReference<>(null);
    }

    public final void a(q2 q2Var) {
        this.f382619a = new WeakReference<>(q2Var);
    }

    @Override // android.os.ResultReceiver, com.yandex.mobile.ads.impl.q2
    public final void onReceiveResult(int i12, @P Bundle bundle) {
        q2 q2Var;
        WeakReference<q2> weakReference = this.f382619a;
        if (weakReference == null || (q2Var = weakReference.get()) == null) {
            return;
        }
        q2Var.onReceiveResult(i12, bundle);
    }
}
