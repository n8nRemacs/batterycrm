package androidx.room;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: InvalidationTracker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/Y;", "", "a", "b", "c", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class Y {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f54342p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final String[] f54343q = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RoomDatabase f54344a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashMap f54345b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap f54346c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String[] f54348e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f54350g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public volatile Z1.i f54351h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final b f54352i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final X f54353j;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public C23448g0 f54355l;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    @RestrictTo
    public final Z f54358o;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    @RestrictTo
    public final AtomicBoolean f54349f = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    @j.B
    @Y61.k
    public final androidx.arch.core.internal.b<c, d> f54354k = new androidx.arch.core.internal.b<>();

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f54356m = new Object();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Object f54357n = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f54347d = new LinkedHashMap();

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/room/Y$a;", "", "<init>", "()V", "", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/Y$b;", "", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final long[] f54359a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final boolean[] f54360b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final int[] f54361c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f54362d;

        /* compiled from: InvalidationTracker.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/room/Y$b$a;", "", "<init>", "()V", "", "ADD", "I", "NO_OP", "REMOVE", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public b(int i12) {
            this.f54359a = new long[i12];
            this.f54360b = new boolean[i12];
            this.f54361c = new int[i12];
        }

        @j.k0
        @Y61.l
        @X41.i
        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f54362d) {
                        return null;
                    }
                    long[] jArr = this.f54359a;
                    int length = jArr.length;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < length) {
                        int i14 = i13 + 1;
                        int i15 = 1;
                        boolean z12 = jArr[i12] > 0;
                        boolean[] zArr = this.f54360b;
                        if (z12 != zArr[i13]) {
                            int[] iArr = this.f54361c;
                            if (!z12) {
                                i15 = 2;
                            }
                            iArr[i13] = i15;
                        } else {
                            this.f54361c[i13] = 0;
                        }
                        zArr[i13] = z12;
                        i12++;
                        i13 = i14;
                    }
                    this.f54362d = false;
                    return (int[]) this.f54361c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/Y$c;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String[] f54363a;

        public c(@Y61.k String[] strArr) {
            this.f54363a = strArr;
        }

        public abstract void a(@Y61.k Set<String> set);
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/Y$d;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final c f54364a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final int[] f54365b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String[] f54366c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Set<String> f54367d;

        public d(@Y61.k c cVar, @Y61.k int[] iArr, @Y61.k String[] strArr) {
            this.f54364a = cVar;
            this.f54365b = iArr;
            this.f54366c = strArr;
            this.f54367d = strArr.length == 0 ? kotlin.collections.B0.f406639b : Collections.singleton(strArr[0]);
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final void a(@Y61.k Set<Integer> set) {
            Set<String> setA;
            int[] iArr = this.f54365b;
            int length = iArr.length;
            if (length != 0) {
                int i12 = 0;
                if (length != 1) {
                    kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
                    int length2 = iArr.length;
                    int i13 = 0;
                    while (i12 < length2) {
                        int i14 = i13 + 1;
                        if (set.contains(Integer.valueOf(iArr[i12]))) {
                            jVar.add(this.f54366c[i13]);
                        }
                        i12++;
                        i13 = i14;
                    }
                    setA = b1.a(jVar);
                } else {
                    setA = set.contains(Integer.valueOf(iArr[0])) ? this.f54367d : kotlin.collections.B0.f406639b;
                }
            } else {
                setA = kotlin.collections.B0.f406639b;
            }
            if (setA.isEmpty()) {
                return;
            }
            this.f54364a.a(setA);
        }

        public final void b(@Y61.k String[] strArr) {
            Set<String> setA;
            String[] strArr2 = this.f54366c;
            int length = strArr2.length;
            if (length == 0) {
                setA = kotlin.collections.B0.f406639b;
            } else if (length == 1) {
                int length2 = strArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        setA = kotlin.collections.B0.f406639b;
                        break;
                    } else {
                        if (C43066x.C(strArr[i12], strArr2[0], true)) {
                            setA = this.f54367d;
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (C43066x.C(str2, str, true)) {
                            jVar.add(str2);
                        }
                    }
                }
                setA = b1.a(jVar);
            }
            if (setA.isEmpty()) {
                return;
            }
            this.f54364a.a(setA);
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/Y$e;", "Landroidx/room/Y$c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y f54368b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final WeakReference<c> f54369c;

        public e(@Y61.k Y y12, @Y61.k I0 i02) {
            super(i02.f54363a);
            this.f54368b = y12;
            this.f54369c = new WeakReference<>(i02);
        }

        @Override // androidx.room.Y.c
        public final void a(@Y61.k Set<String> set) {
            c cVar = this.f54369c.get();
            if (cVar == null) {
                this.f54368b.c(this);
            } else {
                cVar.a(set);
            }
        }
    }

    @RestrictTo
    public Y(@Y61.k RoomDatabase roomDatabase, @Y61.k HashMap map, @Y61.k HashMap map2, @Y61.k String... strArr) {
        this.f54344a = roomDatabase;
        this.f54345b = map;
        this.f54346c = map2;
        this.f54352i = new b(strArr.length);
        this.f54353j = new X(roomDatabase);
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i12 = 0; i12 < length; i12++) {
            String str = strArr[i12];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f54347d.put(lowerCase, Integer.valueOf(i12));
            String str2 = (String) this.f54345b.get(strArr[i12]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i12] = lowerCase;
        }
        this.f54348e = strArr2;
        for (Map.Entry entry : this.f54345b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.f54347d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.f54347d;
                linkedHashMap.put(lowerCase4, kotlin.collections.P0.d(linkedHashMap, lowerCase3));
            }
        }
        this.f54358o = new Z(this);
    }

    @SuppressLint({"RestrictedApi"})
    @j.l0
    public final void a(@Y61.k c cVar) {
        d dVarB;
        boolean z12;
        String[] strArrD = d(cVar.f54363a);
        ArrayList arrayList = new ArrayList(strArrD.length);
        for (String str : strArrD) {
            Integer num = (Integer) this.f54347d.get(str.toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrL0 = C42745f0.L0(arrayList);
        d dVar = new d(cVar, iArrL0, strArrD);
        synchronized (this.f54354k) {
            dVarB = this.f54354k.b(cVar, dVar);
        }
        if (dVarB == null) {
            b bVar = this.f54352i;
            int[] iArrCopyOf = Arrays.copyOf(iArrL0, iArrL0.length);
            synchronized (bVar) {
                try {
                    z12 = false;
                    for (int i12 : iArrCopyOf) {
                        long[] jArr = bVar.f54359a;
                        long j12 = jArr[i12];
                        jArr[i12] = 1 + j12;
                        if (j12 == 0) {
                            bVar.f54362d = true;
                            z12 = true;
                        }
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                RoomDatabase roomDatabase = this.f54344a;
                if (roomDatabase.o()) {
                    f(roomDatabase.i().getWritableDatabase());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f54344a.o()) {
            return false;
        }
        if (!this.f54350g) {
            this.f54344a.i().getWritableDatabase();
        }
        return this.f54350g;
    }

    @SuppressLint({"RestrictedApi"})
    @j.l0
    public final void c(@Y61.k c cVar) {
        d dVarD;
        boolean z12;
        synchronized (this.f54354k) {
            dVarD = this.f54354k.d(cVar);
        }
        if (dVarD != null) {
            b bVar = this.f54352i;
            int[] iArr = dVarD.f54365b;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            synchronized (bVar) {
                try {
                    z12 = false;
                    for (int i12 : iArrCopyOf) {
                        long[] jArr = bVar.f54359a;
                        long j12 = jArr[i12];
                        jArr[i12] = j12 - 1;
                        if (j12 == 1) {
                            bVar.f54362d = true;
                            z12 = true;
                        }
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                RoomDatabase roomDatabase = this.f54344a;
                if (roomDatabase.o()) {
                    f(roomDatabase.i().getWritableDatabase());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            HashMap map = this.f54346c;
            if (map.containsKey(lowerCase)) {
                jVar.addAll((Collection) map.get(str.toLowerCase(locale)));
            } else {
                jVar.add(str);
            }
        }
        return (String[]) b1.a(jVar).toArray(new String[0]);
    }

    public final void e(Z1.d dVar, int i12) {
        dVar.P4("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i12 + ", 0)");
        String str = this.f54348e[i12];
        for (String str2 : f54343q) {
            StringBuilder sb2 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            f54342p.getClass();
            sb2.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb2.append(i12);
            sb2.append(" AND invalidated = 0; END");
            dVar.P4(sb2.toString());
        }
    }

    public final void f(@Y61.k Z1.d dVar) {
        int i12 = 1;
        if (dVar.e6()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f54344a.f54305i.readLock();
            lock.lock();
            try {
                synchronized (this.f54356m) {
                    int[] iArrA = this.f54352i.a();
                    if (iArrA == null) {
                        return;
                    }
                    f54342p.getClass();
                    if (dVar.g6()) {
                        dVar.L3();
                    } else {
                        dVar.q0();
                    }
                    try {
                        int length = iArrA.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = iArrA[i13];
                            int i16 = i14 + 1;
                            if (i15 == i12) {
                                e(dVar, i14);
                                i12 = 1;
                            } else if (i15 == 2) {
                                String str = this.f54348e[i14];
                                for (String str2 : f54343q) {
                                    StringBuilder sb2 = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                    f54342p.getClass();
                                    sb2.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                    dVar.P4(sb2.toString());
                                    i12 = 1;
                                }
                            }
                            i13 += i12;
                            i14 = i16;
                        }
                        dVar.b5();
                        dVar.g5();
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        dVar.g5();
                        throw th2;
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}
