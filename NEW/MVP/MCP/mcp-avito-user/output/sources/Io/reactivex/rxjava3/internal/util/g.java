package io.reactivex.rxjava3.internal.util;

import androidx.camera.core.Q;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: EndConsumerHelper.java */
/* loaded from: classes8.dex */
public final class g {
    public g() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Class<?> cls) {
        String name = cls.getName();
        C47998a.b(new ProtocolViolationException(Q.a("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    public static boolean b(AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference, io.reactivex.rxjava3.disposables.d dVar, Class<?> cls) {
        Objects.requireNonNull(dVar, "next is null");
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.dispose();
                if (atomicReference.get() == DisposableHelper.f401986b) {
                    return false;
                }
                a(cls);
                return false;
            }
        }
        return true;
    }

    public static boolean c(AtomicReference<org.reactivestreams.e> atomicReference, org.reactivestreams.e eVar, Class<?> cls) {
        Objects.requireNonNull(eVar, "next is null");
        while (!atomicReference.compareAndSet(null, eVar)) {
            if (atomicReference.get() != null) {
                eVar.cancel();
                if (atomicReference.get() == SubscriptionHelper.f404813b) {
                    return false;
                }
                a(cls);
                return false;
            }
        }
        return true;
    }
}
