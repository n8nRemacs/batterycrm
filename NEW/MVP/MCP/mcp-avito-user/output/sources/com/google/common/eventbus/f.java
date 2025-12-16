package com.google.common.eventbus;

import com.google.common.base.D;
import com.google.common.eventbus.d;
import com.google.common.util.concurrent.Q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: EventBus.java */
@e
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f360163a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f360164b;

    /* compiled from: EventBus.java */
    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final a f360165a = new a();
    }

    static {
        Logger.getLogger(f.class.getName());
    }

    public f() {
        Executor executorA = Q0.a();
        new d.C10678d();
        a aVar = a.f360165a;
        new ConcurrentHashMap();
        this.f360163a = "default";
        this.f360164b = executorA;
        aVar.getClass();
    }

    public final String toString() {
        D.b bVarB = D.b(this);
        bVarB.d(this.f360163a);
        return bVarB.toString();
    }
}
