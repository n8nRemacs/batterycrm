package androidx.view;

import android.os.Looper;
import androidx.arch.core.internal.b;
import androidx.view.Lifecycle;
import j.K;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LiveData.java */
/* renamed from: androidx.lifecycle.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22991Y<T> {
    static final Object NOT_SET = new Object();
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private androidx.arch.core.internal.b<InterfaceC23040h0<? super T>, AbstractC22991Y<T>.d> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.Y$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (AbstractC22991Y.this.mDataLock) {
                obj = AbstractC22991Y.this.mPendingData;
                AbstractC22991Y.this.mPendingData = AbstractC22991Y.NOT_SET;
            }
            AbstractC22991Y.this.setValue(obj);
        }
    }

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.Y$b */
    public class b extends AbstractC22991Y<T>.d {
        public b() {
            throw null;
        }

        @Override // androidx.view.AbstractC22991Y.d
        public final boolean d() {
            return true;
        }
    }

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.Y$c */
    public class c extends AbstractC22991Y<T>.d implements InterfaceC22979L {

        /* renamed from: f, reason: collision with root package name */
        @N
        public final InterfaceC22983P f46723f;

        public c(@N InterfaceC22983P interfaceC22983P, InterfaceC23040h0<? super T> interfaceC23040h0) {
            super(interfaceC23040h0);
            this.f46723f = interfaceC22983P;
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
            InterfaceC22983P interfaceC22983P2 = this.f46723f;
            Lifecycle.State stateB = interfaceC22983P2.getLifecycle().getF46705d();
            if (stateB == Lifecycle.State.f46679b) {
                AbstractC22991Y.this.removeObserver(this.f46725b);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                a(d());
                state = stateB;
                stateB = interfaceC22983P2.getLifecycle().getF46705d();
            }
        }

        @Override // androidx.view.AbstractC22991Y.d
        public final void b() {
            this.f46723f.getLifecycle().c(this);
        }

        @Override // androidx.view.AbstractC22991Y.d
        public final boolean c(InterfaceC22983P interfaceC22983P) {
            return this.f46723f == interfaceC22983P;
        }

        @Override // androidx.view.AbstractC22991Y.d
        public final boolean d() {
            return this.f46723f.getLifecycle().getF46705d().a(Lifecycle.State.f46682e);
        }
    }

    public AbstractC22991Y(T t12) {
        this.mDataLock = new Object();
        this.mObservers = new androidx.arch.core.internal.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t12;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        androidx.arch.core.executor.b.a().f22695a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AK.c.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(AbstractC22991Y<T>.d dVar) {
        if (dVar.f46726c) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i12 = dVar.f46727d;
            int i13 = this.mVersion;
            if (i12 >= i13) {
                return;
            }
            dVar.f46727d = i13;
            dVar.f46725b.onChanged((Object) this.mData);
        }
    }

    @K
    public void changeActiveCounter(int i12) {
        int i13 = this.mActiveCount;
        this.mActiveCount = i12 + i13;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i14 = this.mActiveCount;
                if (i13 == i14) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z12 = i13 == 0 && i14 > 0;
                boolean z13 = i13 > 0 && i14 == 0;
                if (z12) {
                    onActive();
                } else if (z13) {
                    onInactive();
                }
                i13 = i14;
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    public void dispatchingValue(@P AbstractC22991Y<T>.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                considerNotify(dVar);
                dVar = null;
            } else {
                androidx.arch.core.internal.b<InterfaceC23040h0<? super T>, AbstractC22991Y<T>.d> bVar = this.mObservers;
                bVar.getClass();
                b.d dVar2 = new b.d();
                bVar.f22703d.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    considerNotify((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    @P
    public T getValue() {
        T t12 = (T) this.mData;
        if (t12 != NOT_SET) {
            return t12;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f22704e > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    @K
    public void observe(@N InterfaceC22983P interfaceC22983P, @N InterfaceC23040h0<? super T> interfaceC23040h0) {
        assertMainThread("observe");
        if (interfaceC22983P.getLifecycle().getF46705d() == Lifecycle.State.f46679b) {
            return;
        }
        c cVar = new c(interfaceC22983P, interfaceC23040h0);
        AbstractC22991Y<T>.d dVarB = this.mObservers.b(interfaceC23040h0, cVar);
        if (dVarB != null && !dVarB.c(interfaceC22983P)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarB != null) {
            return;
        }
        interfaceC22983P.getLifecycle().a(cVar);
    }

    @K
    public void observeForever(@N InterfaceC23040h0<? super T> interfaceC23040h0) {
        assertMainThread("observeForever");
        b bVar = new b(interfaceC23040h0);
        AbstractC22991Y<T>.d dVarB = this.mObservers.b(interfaceC23040h0, bVar);
        if (dVarB instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarB != null) {
            return;
        }
        bVar.a(true);
    }

    public void postValue(T t12) {
        boolean z12;
        synchronized (this.mDataLock) {
            z12 = this.mPendingData == NOT_SET;
            this.mPendingData = t12;
        }
        if (z12) {
            androidx.arch.core.executor.b.a().b(this.mPostValueRunnable);
        }
    }

    @K
    public void removeObserver(@N InterfaceC23040h0<? super T> interfaceC23040h0) {
        assertMainThread("removeObserver");
        AbstractC22991Y<T>.d dVarD = this.mObservers.d(interfaceC23040h0);
        if (dVarD == null) {
            return;
        }
        dVarD.b();
        dVarD.a(false);
    }

    @K
    public void removeObservers(@N InterfaceC22983P interfaceC22983P) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<InterfaceC23040h0<? super T>, AbstractC22991Y<T>.d>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC23040h0<? super T>, AbstractC22991Y<T>.d> next = it.next();
            if (next.getValue().c(interfaceC22983P)) {
                removeObserver(next.getKey());
            }
        }
    }

    @K
    public void setValue(T t12) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t12;
        dispatchingValue(null);
    }

    public AbstractC22991Y() {
        this.mDataLock = new Object();
        this.mObservers = new androidx.arch.core.internal.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.Y$d */
    public abstract class d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC23040h0<? super T> f46725b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46726c;

        /* renamed from: d, reason: collision with root package name */
        public int f46727d = -1;

        public d(InterfaceC23040h0<? super T> interfaceC23040h0) {
            this.f46725b = interfaceC23040h0;
        }

        public final void a(boolean z12) {
            if (z12 == this.f46726c) {
                return;
            }
            this.f46726c = z12;
            int i12 = z12 ? 1 : -1;
            AbstractC22991Y abstractC22991Y = AbstractC22991Y.this;
            abstractC22991Y.changeActiveCounter(i12);
            if (this.f46726c) {
                abstractC22991Y.dispatchingValue(this);
            }
        }

        public boolean c(InterfaceC22983P interfaceC22983P) {
            return false;
        }

        public abstract boolean d();

        public void b() {
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}
