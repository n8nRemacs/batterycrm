package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class DisposableHelper implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final DisposableHelper f401986b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DisposableHelper[] f401987c;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        f401986b = disposableHelper;
        f401987c = new DisposableHelper[]{disposableHelper};
    }

    public DisposableHelper() {
        throw null;
    }

    public static boolean a(AtomicReference<d> atomicReference) {
        d andSet;
        d dVar = atomicReference.get();
        DisposableHelper disposableHelper = f401986b;
        if (dVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean b(d dVar) {
        return dVar == f401986b;
    }

    public static boolean c(AtomicReference<d> atomicReference, d dVar) {
        while (true) {
            d dVar2 = atomicReference.get();
            if (dVar2 == f401986b) {
                if (dVar == null) {
                    return false;
                }
                dVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(dVar2, dVar)) {
                if (atomicReference.get() != dVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean d(AtomicReference<d> atomicReference, d dVar) {
        while (true) {
            d dVar2 = atomicReference.get();
            if (dVar2 == f401986b) {
                if (dVar == null) {
                    return false;
                }
                dVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(dVar2, dVar)) {
                if (atomicReference.get() != dVar2) {
                    break;
                }
            }
            if (dVar2 == null) {
                return true;
            }
            dVar2.dispose();
            return true;
        }
    }

    public static boolean e(AtomicReference<d> atomicReference, d dVar) {
        Objects.requireNonNull(dVar, "d is null");
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.dispose();
                if (atomicReference.get() == f401986b) {
                    return false;
                }
                C47998a.b(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(d dVar, d dVar2) {
        if (dVar2 == null) {
            C47998a.b(new NullPointerException("next is null"));
            return false;
        }
        if (dVar == null) {
            return true;
        }
        dVar2.dispose();
        C47998a.b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) f401987c.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
    }
}
