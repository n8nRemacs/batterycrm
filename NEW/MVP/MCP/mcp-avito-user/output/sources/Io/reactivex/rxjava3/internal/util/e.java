package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.CountDownLatch;
import l41.InterfaceC43543a;

/* compiled from: BlockingIgnoringReceiver.java */
/* loaded from: classes8.dex */
public final class e extends CountDownLatch implements l41.g<Throwable>, InterfaceC43543a {
    public e() {
        super(1);
    }

    @Override // l41.g
    public final void accept(Throwable th2) {
        countDown();
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        countDown();
    }
}
