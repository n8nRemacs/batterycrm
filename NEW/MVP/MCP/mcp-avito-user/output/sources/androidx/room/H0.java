package androidx.room;

import androidx.room.Y;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J0 f54270c;

    public /* synthetic */ H0(J0 j02, int i12) {
        this.f54269b = i12;
        this.f54270c = j02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        boolean z12;
        Executor executor;
        switch (this.f54269b) {
            case 0:
                J0 j02 = this.f54270c;
                if (j02.f54280h.compareAndSet(false, true)) {
                    Y y12 = j02.f54273a.f54301e;
                    y12.getClass();
                    y12.a(new Y.e(y12, j02.f54277e));
                }
                do {
                    AtomicBoolean atomicBoolean2 = j02.f54279g;
                    boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = j02.f54278f;
                    if (zCompareAndSet) {
                        Object objCall = null;
                        z12 = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = j02.f54276d.call();
                                    z12 = true;
                                } catch (Exception e12) {
                                    throw new RuntimeException("Exception while computing database live data.", e12);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z12) {
                            j02.postValue(objCall);
                        }
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                J0 j03 = this.f54270c;
                boolean zHasActiveObservers = j03.hasActiveObservers();
                if (j03.f54278f.compareAndSet(false, true) && zHasActiveObservers) {
                    Executor executor2 = null;
                    boolean z13 = j03.f54275c;
                    RoomDatabase roomDatabase = j03.f54273a;
                    if (!z13 ? (executor = roomDatabase.f54298b) != null : (executor = roomDatabase.f54299c) != null) {
                        executor2 = executor;
                    }
                    executor2.execute(j03.f54281i);
                    return;
                }
                return;
        }
    }
}
