package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.room.Y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: InvalidationTracker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/Z;", "Ljava/lang/Runnable;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f54370b;

    public Z(Y y12) {
        this.f54370b = y12;
    }

    public final kotlin.collections.builders.j a() {
        Y y12 = this.f54370b;
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        RoomDatabase roomDatabase = y12.f54344a;
        Z1.b bVar = new Z1.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", null);
        int i12 = RoomDatabase.f54296m;
        Cursor cursorP = roomDatabase.p(bVar);
        try {
            Cursor cursor = cursorP;
            while (cursor.moveToNext()) {
                jVar.add(Integer.valueOf(cursor.getInt(0)));
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            kotlin.io.c.a(cursorP, null);
            kotlin.collections.builders.j jVarA = b1.a(jVar);
            if (!jVarA.f406711b.isEmpty()) {
                if (this.f54370b.f54351h == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Z1.i iVar = this.f54370b.f54351h;
                if (iVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iVar.B3();
            }
            return jVarA;
        } finally {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<Integer> setA;
        ReentrantReadWriteLock.ReadLock lock = this.f54370b.f54344a.f54305i.readLock();
        lock.lock();
        try {
            try {
                try {
                } catch (SQLiteException unused) {
                    setA = kotlin.collections.B0.f406639b;
                }
            } catch (IllegalStateException unused2) {
                setA = kotlin.collections.B0.f406639b;
            }
            if (this.f54370b.b()) {
                if (this.f54370b.f54349f.compareAndSet(true, false)) {
                    if (this.f54370b.f54344a.i().getWritableDatabase().e6()) {
                        return;
                    }
                    Z1.d writableDatabase = this.f54370b.f54344a.i().getWritableDatabase();
                    writableDatabase.L3();
                    try {
                        setA = a();
                        writableDatabase.b5();
                        if (setA.isEmpty()) {
                            return;
                        }
                        Y y12 = this.f54370b;
                        synchronized (y12.f54354k) {
                            try {
                                Iterator<Map.Entry<Y.c, Y.d>> it = y12.f54354k.iterator();
                                while (it.hasNext()) {
                                    it.next().getValue().a(setA);
                                }
                                kotlin.G0 g02 = kotlin.G0.f406611a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } finally {
                        writableDatabase.g5();
                    }
                }
            }
        } finally {
            lock.unlock();
            this.f54370b.getClass();
        }
    }
}
