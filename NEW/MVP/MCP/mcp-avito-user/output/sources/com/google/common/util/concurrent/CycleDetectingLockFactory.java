package com.google.common.util.concurrent;

import com.google.common.collect.C37423v2;
import com.google.common.collect.C37433x2;
import com.google.common.collect.H1;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
public class CycleDetectingLockFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<ArrayList<h>> f360487b;

    /* renamed from: a, reason: collision with root package name */
    public final i f360488a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Policies implements i {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Policies[] f360489b = {new a("THROW", 0, null), new b("WARN", 1, null), new c("DISABLED", 2, null)};

        /* JADX INFO: Fake field, exist only in values array */
        Policies EF8;

        public enum a extends Policies {
        }

        public enum b extends Policies {
        }

        public enum c extends Policies {
        }

        public Policies() {
            throw null;
        }

        public Policies(String str, int i12, a aVar) {
        }

        public static Policies valueOf(String str) {
            return (Policies) Enum.valueOf(Policies.class, str);
        }

        public static Policies[] values() {
            return (Policies[]) f360489b.clone();
        }
    }

    public static final class PotentialDeadlockException extends g {

        /* renamed from: d, reason: collision with root package name */
        public final g f360490d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PotentialDeadlockException(h hVar, h hVar2, g gVar, a aVar) {
            super("null -> null");
            hVar.getClass();
            hVar2.getClass();
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (j.class.getName().equals(stackTrace[i12].getClassName())) {
                    setStackTrace(g.f360500b);
                    break;
                }
                if (!g.f360501c.contains(stackTrace[i12].getClassName())) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i12, length));
                    break;
                }
                i12++;
            }
            this.f360490d = gVar;
            initCause(gVar);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f360490d; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    public class a extends ThreadLocal<ArrayList<h>> {
        @Override // java.lang.ThreadLocal
        public final ArrayList<h> initialValue() {
            return C37423v2.c(3);
        }
    }

    public interface b {
        h a();

        boolean b();
    }

    public final class e extends ReentrantReadWriteLock implements b {

        /* renamed from: b, reason: collision with root package name */
        public final d f360495b;

        /* renamed from: c, reason: collision with root package name */
        public final f f360496c;

        /* renamed from: d, reason: collision with root package name */
        public final h f360497d;

        public e(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z12, a aVar) {
            super(z12);
            this.f360495b = cycleDetectingLockFactory.new d(this);
            this.f360496c = cycleDetectingLockFactory.new f(this);
            hVar.getClass();
            this.f360497d = hVar;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public final h a() {
            return this.f360497d;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public final boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final Lock readLock() {
            return this.f360495b;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final Lock writeLock() {
            return this.f360496c;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final ReentrantReadWriteLock.ReadLock readLock() {
            return this.f360495b;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f360496c;
        }
    }

    public static class g extends IllegalStateException {

        /* renamed from: b, reason: collision with root package name */
        public static final StackTraceElement[] f360500b = new StackTraceElement[0];

        /* renamed from: c, reason: collision with root package name */
        public static final H1<String> f360501c = H1.K(CycleDetectingLockFactory.class.getName(), g.class.getName(), h.class.getName());
    }

    public static class h {
    }

    public interface i {
    }

    public static final class j<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    static {
        C37433x2 c37433x2 = new C37433x2();
        c37433x2.e();
        c37433x2.c();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        f360487b = new a();
    }

    public CycleDetectingLockFactory(i iVar, a aVar) {
        iVar.getClass();
        this.f360488a = iVar;
    }

    public static void a(CycleDetectingLockFactory cycleDetectingLockFactory, b bVar) {
        cycleDetectingLockFactory.getClass();
        if (bVar.b()) {
            return;
        }
        ArrayList<h> arrayList = f360487b.get();
        h hVarA = bVar.a();
        hVarA.getClass();
        Iterator<h> it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.add(hVarA);
            return;
        }
        h next = it.next();
        boolean z12 = hVarA != next;
        next.getClass();
        com.google.common.base.M.p("Attempted to acquire multiple locks with the same rank %s", z12, null);
        throw null;
    }

    public static void b(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<h> arrayList = f360487b.get();
        h hVarA = bVar.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == hVarA) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public final class c extends ReentrantLock implements b {

        /* renamed from: b, reason: collision with root package name */
        public final h f360491b;

        public c(h hVar, boolean z12, a aVar) {
            super(z12);
            hVar.getClass();
            this.f360491b = hVar;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public final h a() {
            return this.f360491b;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public final boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final void lock() {
            CycleDetectingLockFactory.a(CycleDetectingLockFactory.this, this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.b(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final void lockInterruptibly() {
            CycleDetectingLockFactory.a(CycleDetectingLockFactory.this, this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.b(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            CycleDetectingLockFactory.a(CycleDetectingLockFactory.this, this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.b(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.b(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final boolean tryLock(long j12, TimeUnit timeUnit) {
            CycleDetectingLockFactory.a(CycleDetectingLockFactory.this, this);
            try {
                return super.tryLock(j12, timeUnit);
            } finally {
                CycleDetectingLockFactory.b(this);
            }
        }
    }

    public class d extends ReentrantReadWriteLock.ReadLock {

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final e f360493b;

        public d(e eVar) {
            super(eVar);
            this.f360493b = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final void lock() {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360493b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final void lockInterruptibly() {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360493b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360493b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final void unlock() {
            e eVar = this.f360493b;
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final boolean tryLock(long j12, TimeUnit timeUnit) {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360493b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                return super.tryLock(j12, timeUnit);
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }
    }

    public class f extends ReentrantReadWriteLock.WriteLock {

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final e f360498b;

        public f(e eVar) {
            super(eVar);
            this.f360498b = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final void lock() {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360498b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final void lockInterruptibly() {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360498b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360498b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final void unlock() {
            e eVar = this.f360498b;
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final boolean tryLock(long j12, TimeUnit timeUnit) {
            CycleDetectingLockFactory cycleDetectingLockFactory = CycleDetectingLockFactory.this;
            e eVar = this.f360498b;
            CycleDetectingLockFactory.a(cycleDetectingLockFactory, eVar);
            try {
                return super.tryLock(j12, timeUnit);
            } finally {
                CycleDetectingLockFactory.b(eVar);
            }
        }
    }
}
