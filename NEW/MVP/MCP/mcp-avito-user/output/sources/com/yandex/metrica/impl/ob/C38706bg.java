package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* renamed from: com.yandex.metrica.impl.ob.bg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38706bg implements InterfaceC38731cg {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f380202a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final T1 f380203b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38699b9 f380204c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39014o0 f380205d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final K1 f380206e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Handler f380207f;

    public C38706bg(T1 t12, C38699b9 c38699b9, @j.N Handler handler) {
        this(t12, c38699b9, handler, c38699b9.w());
    }

    public void a() {
        if (this.f380202a) {
            return;
        }
        this.f380203b.a(new ResultReceiverC38781eg(this.f380207f, this));
    }

    private C38706bg(@j.N T1 t12, @j.N C38699b9 c38699b9, @j.N Handler handler, boolean z12) {
        this(t12, c38699b9, handler, z12, new C39014o0(z12), new K1());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38731cg
    public void a(@j.P C38756dg c38756dg) {
        String str = c38756dg == null ? null : c38756dg.f380375a;
        if (this.f380202a) {
            return;
        }
        synchronized (this) {
            this.f380205d.a(this.f380206e.a(str));
        }
    }

    @j.k0
    public C38706bg(@j.N T1 t12, C38699b9 c38699b9, @j.N Handler handler, boolean z12, @j.N C39014o0 c39014o0, @j.N K1 k12) {
        this.f380203b = t12;
        this.f380204c = c38699b9;
        this.f380202a = z12;
        this.f380205d = c39014o0;
        this.f380206e = k12;
        this.f380207f = handler;
    }

    public synchronized void a(@j.N DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f380205d.a(deferredDeeplinkParametersListener);
        } finally {
            this.f380204c.y();
        }
    }

    public synchronized void a(@j.N DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f380205d.a(deferredDeeplinkListener);
        } finally {
            this.f380204c.y();
        }
    }
}
