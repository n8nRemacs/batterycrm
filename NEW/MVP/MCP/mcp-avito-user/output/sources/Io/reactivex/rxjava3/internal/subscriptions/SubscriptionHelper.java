package io.reactivex.rxjava3.internal.subscriptions;

import androidx.compose.foundation.text.selection.C21030p;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;
import s41.C47998a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class SubscriptionHelper implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final SubscriptionHelper f404813b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SubscriptionHelper[] f404814c;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        f404813b = subscriptionHelper;
        f404814c = new SubscriptionHelper[]{subscriptionHelper};
    }

    public SubscriptionHelper() {
        throw null;
    }

    public static boolean a(AtomicReference<e> atomicReference) {
        e andSet;
        e eVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = f404813b;
        if (eVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void b(AtomicReference<e> atomicReference, AtomicLong atomicLong, long j12) {
        e eVar = atomicReference.get();
        if (eVar != null) {
            eVar.request(j12);
            return;
        }
        if (h(j12)) {
            c.a(atomicLong, j12);
            e eVar2 = atomicReference.get();
            if (eVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    eVar2.request(andSet);
                }
            }
        }
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, e eVar) {
        if (f(atomicReference, eVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                eVar.request(andSet);
            }
        }
    }

    public static boolean d(AtomicReference<e> atomicReference, e eVar) {
        while (true) {
            e eVar2 = atomicReference.get();
            if (eVar2 == f404813b) {
                if (eVar == null) {
                    return false;
                }
                eVar.cancel();
                return false;
            }
            while (!atomicReference.compareAndSet(eVar2, eVar)) {
                if (atomicReference.get() != eVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void e(AtomicReference atomicReference, e eVar, long j12) {
        if (f(atomicReference, eVar)) {
            eVar.request(j12);
        }
    }

    public static boolean f(AtomicReference<e> atomicReference, e eVar) {
        Objects.requireNonNull(eVar, "s is null");
        while (!atomicReference.compareAndSet(null, eVar)) {
            if (atomicReference.get() != null) {
                eVar.cancel();
                if (atomicReference.get() == f404813b) {
                    return false;
                }
                C47998a.b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean h(long j12) {
        if (j12 > 0) {
            return true;
        }
        C47998a.b(new IllegalArgumentException(C21030p.a(j12, "n > 0 required but it was ")));
        return false;
    }

    public static boolean i(e eVar, e eVar2) {
        if (eVar2 == null) {
            C47998a.b(new NullPointerException("next is null"));
            return false;
        }
        if (eVar == null) {
            return true;
        }
        eVar2.cancel();
        C47998a.b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) f404814c.clone();
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
    }
}
