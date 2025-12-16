package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class jn1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f386926e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile jn1 f386927f;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ExecutorService f386928a = Executors.newCachedThreadPool();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hn1 f386929b = new hn1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Handler f386930c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final a4 f386931d = new a4();

    private jn1() {
    }

    public final void b(@j.N Context context, @j.N BidderTokenLoadListener bidderTokenLoadListener) {
        this.f386928a.execute(new H0(this, context, bidderTokenLoadListener, 4));
    }

    @j.N
    public static jn1 a() {
        if (f386927f == null) {
            synchronized (f386926e) {
                try {
                    if (f386927f == null) {
                        f386927f = new jn1();
                    }
                } finally {
                }
            }
        }
        return f386927f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        new p21(context, this.f386928a, this.f386931d).a(new in1(this, context, bidderTokenLoadListener));
    }
}
