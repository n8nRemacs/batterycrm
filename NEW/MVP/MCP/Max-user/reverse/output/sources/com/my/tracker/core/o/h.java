package com.my.tracker.core.o;

import com.my.tracker.core.AsyncCore;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.Consumer;
import defpackage.n1h;

/* loaded from: classes.dex */
public final class h implements AsyncCore {
    private boolean a = true;
    private EngineCore b;

    private h() {
    }

    public void b() {
        this.a = false;
    }

    @Override // com.my.tracker.core.AsyncCore
    public void onEngineWorker(Runnable runnable) {
        if (this.a) {
            g.b(runnable);
        }
    }

    @Override // com.my.tracker.core.AsyncCore
    public void onEngineWorkerWithEngineCore(Consumer consumer) {
        onEngineWorker(new n1h(this, 22, consumer));
    }

    @Override // com.my.tracker.core.AsyncCore
    public void onUi(Runnable runnable) {
        g.c(runnable);
    }

    public static h a() {
        return new h();
    }

    public void a(EngineCore engineCore) {
        this.b = engineCore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Consumer consumer) {
        EngineCore engineCore = this.b;
        if (engineCore == null) {
            Tracer.e("Internal error: engineCore is null, unable to execute command " + consumer);
            return;
        }
        consumer.accept(engineCore);
    }
}
