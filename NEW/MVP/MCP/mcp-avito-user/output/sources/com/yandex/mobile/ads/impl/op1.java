package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jp1;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class op1 implements jp1.a {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<jp1> f388608b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private jp1 f388609c = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f388607a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private void b() {
        jp1 jp1VarPoll = this.f388608b.poll();
        this.f388609c = jp1VarPoll;
        if (jp1VarPoll != null) {
            jp1VarPoll.executeOnExecutor(this.f388607a, new Object[0]);
        }
    }

    public final void a() {
        this.f388609c = null;
        b();
    }

    public final void a(jp1 jp1Var) {
        jp1Var.a(this);
        this.f388608b.add(jp1Var);
        if (this.f388609c == null) {
            b();
        }
    }
}
