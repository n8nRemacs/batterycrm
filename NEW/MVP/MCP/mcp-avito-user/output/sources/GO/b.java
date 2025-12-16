package Go;

import Y61.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import mx0.e;

/* compiled from: SubscribedEventsStorageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGo/b;", "LGo/a;", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC13901a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ReentrantReadWriteLock f6738a = new ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HashMap<e, Integer> f6739b = new HashMap<>();

    @Inject
    public b() {
    }

    @Override // Go.InterfaceC13901a
    public final void a(@k List<e> list) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f6738a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i12 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i13 = 0; i13 < readHoldCount; i13++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            for (e eVar : list) {
                HashMap<e, Integer> map = this.f6739b;
                map.put(eVar, Integer.valueOf(map.getOrDefault(eVar, 0).intValue() + 1));
            }
            G0 g02 = G0.f406611a;
            while (i12 < readHoldCount) {
                lock.lock();
                i12++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i12 < readHoldCount) {
                lock.lock();
                i12++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // Go.InterfaceC13901a
    public final void c(@k List<e> list) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f6738a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i12 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i13 = 0; i13 < readHoldCount; i13++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            for (e eVar : list) {
                HashMap<e, Integer> map = this.f6739b;
                map.put(eVar, Integer.valueOf(map.getOrDefault(eVar, 1).intValue() - 1));
            }
            G0 g02 = G0.f406611a;
            while (i12 < readHoldCount) {
                lock.lock();
                i12++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i12 < readHoldCount) {
                lock.lock();
                i12++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // Go.InterfaceC13901a
    @k
    public final ArrayList getAll() {
        ReentrantReadWriteLock.ReadLock lock = this.f6738a.readLock();
        lock.lock();
        try {
            Set<Map.Entry<e, Integer>> setEntrySet = this.f6739b.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Number) ((Map.Entry) obj).getValue()).intValue() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((e) ((Map.Entry) it.next()).getKey());
            }
            lock.unlock();
            return arrayList2;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // Go.InterfaceC13901a
    public final void removeAll() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f6738a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i12 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i13 = 0; i13 < readHoldCount; i13++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f6739b.clear();
            G0 g02 = G0.f406611a;
        } finally {
            while (i12 < readHoldCount) {
                lock.lock();
                i12++;
            }
            writeLock.unlock();
        }
    }
}
