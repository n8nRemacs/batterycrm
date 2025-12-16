package androidx.room;

import Z1.c;
import Z1.e;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: RoomDatabase.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/room/RoomDatabase;", "", "<init>", "()V", "a", "b", "c", "JournalMode", "d", "e", "f", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class RoomDatabase {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f54296m = 0;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public volatile Z1.d f54297a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f54298b;

    /* renamed from: c, reason: collision with root package name */
    public S0 f54299c;

    /* renamed from: d, reason: collision with root package name */
    public Z1.e f54300d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54302f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.l
    @RestrictTo
    public ArrayList f54303g;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y f54301e = f();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f54304h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ReentrantReadWriteLock f54305i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ThreadLocal<Integer> f54306j = new ThreadLocal<>();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f54307k = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f54308l = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JournalMode {

        /* renamed from: b, reason: collision with root package name */
        public static final JournalMode f54309b;

        /* renamed from: c, reason: collision with root package name */
        public static final JournalMode f54310c;

        /* renamed from: d, reason: collision with root package name */
        public static final JournalMode f54311d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ JournalMode[] f54312e;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            f54309b = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            f54310c = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            f54311d = journalMode3;
            f54312e = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public JournalMode() {
            throw null;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) f54312e.clone();
        }
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$a;", "Landroidx/room/RoomDatabase;", "T", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a<T extends RoomDatabase> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f54313a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<T> f54314b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f54315c;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public Executor f54319g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public Executor f54320h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public Ae0.c f54321i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f54322j;

        /* renamed from: m, reason: collision with root package name */
        public boolean f54325m;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public HashSet f54329q;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f54316d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ArrayList f54317e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ArrayList f54318f = new ArrayList();

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final JournalMode f54323k = JournalMode.f54309b;

        /* renamed from: l, reason: collision with root package name */
        public boolean f54324l = true;

        /* renamed from: n, reason: collision with root package name */
        public final long f54326n = -1;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final d f54327o = new d();

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f54328p = new LinkedHashSet();

        public a(@Y61.k Context context, @Y61.l String str, @Y61.k Class cls) {
            this.f54313a = context;
            this.f54314b = cls;
            this.f54315c = str;
        }

        @Y61.k
        public final void a(@Y61.k androidx.room.migration.b... bVarArr) {
            if (this.f54329q == null) {
                this.f54329q = new HashSet();
            }
            for (androidx.room.migration.b bVar : bVarArr) {
                this.f54329q.add(Integer.valueOf(bVar.f54384a));
                this.f54329q.add(Integer.valueOf(bVar.f54385b));
            }
            this.f54327o.a((androidx.room.migration.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }

        @Y61.k
        public final T b() {
            JournalMode journalMode;
            int i12;
            boolean zContainsKey;
            Executor executor = this.f54319g;
            if (executor == null && this.f54320h == null) {
                androidx.arch.core.executor.a aVar = androidx.arch.core.executor.b.f22694c;
                this.f54320h = aVar;
                this.f54319g = aVar;
            } else if (executor != null && this.f54320h == null) {
                this.f54320h = executor;
            } else if (executor == null) {
                this.f54319g = this.f54320h;
            }
            HashSet hashSet = this.f54329q;
            LinkedHashSet linkedHashSet = this.f54328p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(AK.c.g(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                    }
                }
            }
            e.c dVar = this.f54321i;
            if (dVar == null) {
                dVar = new androidx.sqlite.db.framework.d();
            }
            e.c cVar = dVar;
            if (this.f54326n > 0) {
                if (this.f54315c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            ArrayList arrayList = this.f54316d;
            boolean z12 = this.f54322j;
            JournalMode journalMode2 = this.f54323k;
            journalMode2.getClass();
            JournalMode journalMode3 = JournalMode.f54309b;
            JournalMode journalMode4 = JournalMode.f54311d;
            Context context = this.f54313a;
            if (journalMode2 != journalMode3) {
                journalMode = journalMode2;
            } else {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager != null) {
                    int i13 = c.b.f19818a;
                    if (!activityManager.isLowRamDevice()) {
                        journalMode = journalMode4;
                    }
                }
                journalMode2 = JournalMode.f54310c;
                journalMode = journalMode2;
            }
            Executor executor2 = this.f54319g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f54320h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C c12 = new C(context, this.f54315c, cVar, this.f54327o, arrayList, z12, journalMode, executor2, executor3, this.f54324l, this.f54325m, linkedHashSet, this.f54317e, this.f54318f);
            int i14 = x0.f54421a;
            Class<T> cls = this.f54314b;
            String name = cls.getPackage().getName();
            String canonicalName = cls.getCanonicalName();
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strConcat = canonicalName.replace('.', '_').concat("_Impl");
            try {
                T t12 = (T) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                t12.f54300d = t12.g(c12);
                Set<Class<? extends androidx.room.migration.a>> setJ = t12.j();
                BitSet bitSet = new BitSet();
                Iterator<Class<? extends androidx.room.migration.a>> it2 = setJ.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    LinkedHashMap linkedHashMap = t12.f54304h;
                    ArrayList arrayList2 = c12.f54245n;
                    if (zHasNext) {
                        Class<? extends androidx.room.migration.a> next = it2.next();
                        int size = arrayList2.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i15 = size - 1;
                                if (next.isAssignableFrom(arrayList2.get(size).getClass())) {
                                    bitSet.set(size);
                                    break;
                                }
                                if (i15 < 0) {
                                    break;
                                }
                                size = i15;
                            }
                            size = -1;
                        } else {
                            size = -1;
                        }
                        if (size < 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(next, arrayList2.get(size));
                    } else {
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i16 = size2 - 1;
                                if (!bitSet.get(size2)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i16 < 0) {
                                    break;
                                }
                                size2 = i16;
                            }
                        }
                        for (androidx.room.migration.b bVar : t12.h()) {
                            int i17 = bVar.f54384a;
                            d dVar2 = c12.f54235d;
                            LinkedHashMap linkedHashMap2 = dVar2.f54330a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i17))) {
                                Map mapC = (Map) linkedHashMap2.get(Integer.valueOf(i17));
                                if (mapC == null) {
                                    mapC = kotlin.collections.P0.c();
                                }
                                zContainsKey = mapC.containsKey(Integer.valueOf(bVar.f54385b));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                dVar2.a(bVar);
                            }
                        }
                        if (((C23445f) RoomDatabase.t(C23445f.class, t12.i())) != null) {
                            throw null;
                        }
                        t12.i().setWriteAheadLoggingEnabled(c12.f54238g == journalMode4);
                        t12.f54303g = c12.f54236e;
                        t12.f54298b = c12.f54239h;
                        t12.f54299c = new S0(c12.f54240i);
                        t12.f54302f = c12.f54237f;
                        Map<Class<?>, List<Class<?>>> mapK = t12.k();
                        BitSet bitSet2 = new BitSet();
                        Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = mapK.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it3.hasNext();
                            ArrayList arrayList3 = c12.f54244m;
                            if (!zHasNext2) {
                                int size3 = arrayList3.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i18 = size3 - 1;
                                        if (!bitSet2.get(size3)) {
                                            throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                        if (i18 < 0) {
                                            break;
                                        }
                                        size3 = i18;
                                    }
                                }
                                return t12;
                            }
                            Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                            Class<?> key = next2.getKey();
                            for (Class<?> cls2 : next2.getValue()) {
                                int size4 = arrayList3.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i19 = size4 - 1;
                                        if (cls2.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                            bitSet2.set(size4);
                                            i12 = size4;
                                            break;
                                        }
                                        if (i19 < 0) {
                                            break;
                                        }
                                        size4 = i19;
                                    }
                                    i12 = -1;
                                } else {
                                    i12 = -1;
                                }
                                if (!(i12 >= 0)) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                t12.f54308l.put(cls2, arrayList3.get(i12));
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
            }
        }

        @Y61.k
        public final void c() {
            this.f54324l = false;
            this.f54325m = true;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomDatabase$c;", "", "<init>", "()V", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$d;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f54330a = new LinkedHashMap();

        public final void a(@Y61.k androidx.room.migration.b... bVarArr) {
            for (androidx.room.migration.b bVar : bVarArr) {
                int i12 = bVar.f54384a;
                LinkedHashMap linkedHashMap = this.f54330a;
                Integer numValueOf = Integer.valueOf(i12);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i13 = bVar.f54385b;
                if (treeMap2.containsKey(Integer.valueOf(i13))) {
                    Objects.toString(treeMap2.get(Integer.valueOf(i13)));
                    bVar.toString();
                }
                treeMap2.put(Integer.valueOf(i13), bVar);
            }
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$e;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class e {
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$f;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface f {
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "it", "", "invoke", "(LZ1/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Object> {
        @Override // Y41.l
        public final Object invoke(Z1.d dVar) {
            int i12 = RoomDatabase.f54296m;
            throw null;
        }
    }

    static {
        new c(null);
    }

    public static Object t(Class cls, Z1.e eVar) {
        if (cls.isInstance(eVar)) {
            return eVar;
        }
        if (eVar instanceof E) {
            return t(cls, ((E) eVar).a());
        }
        return null;
    }

    @RestrictTo
    public final void a() {
        if (!this.f54302f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo
    public final void b() {
        if (!i().getWritableDatabase().e6() && this.f54306j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @InterfaceC42830m
    public final void c() {
        a();
        a();
        Z1.d writableDatabase = i().getWritableDatabase();
        this.f54301e.f(writableDatabase);
        if (writableDatabase.g6()) {
            writableDatabase.L3();
        } else {
            writableDatabase.q0();
        }
    }

    @j.l0
    public abstract void d();

    @Y61.k
    public final Z1.i e(@Y61.k String str) {
        a();
        b();
        return i().getWritableDatabase().N2(str);
    }

    @Y61.k
    public abstract Y f();

    @Y61.k
    public abstract Z1.e g(@Y61.k C c12);

    @X41.o
    @Y61.k
    @RestrictTo
    public List h() {
        return C42784z0.f406748b;
    }

    @Y61.k
    public final Z1.e i() {
        Z1.e eVar = this.f54300d;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    @Y61.k
    @RestrictTo
    public Set<Class<? extends androidx.room.migration.a>> j() {
        return kotlin.collections.B0.f406639b;
    }

    @Y61.k
    @RestrictTo
    public Map<Class<?>, List<Class<?>>> k() {
        return kotlin.collections.P0.c();
    }

    public final void l() {
        i().getWritableDatabase().g5();
        if (i().getWritableDatabase().e6()) {
            return;
        }
        Y y12 = this.f54301e;
        if (y12.f54349f.compareAndSet(false, true)) {
            Executor executor = y12.f54344a.f54298b;
            if (executor == null) {
                executor = null;
            }
            executor.execute(y12.f54358o);
        }
    }

    public final void m(@Y61.k Z1.d dVar) {
        Y y12 = this.f54301e;
        synchronized (y12.f54357n) {
            if (y12.f54350g) {
                return;
            }
            dVar.P4("PRAGMA temp_store = MEMORY;");
            dVar.P4("PRAGMA recursive_triggers='ON';");
            dVar.P4("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            y12.f(dVar);
            y12.f54351h = dVar.N2("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            y12.f54350g = true;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final boolean n() {
        Z1.d dVar = this.f54297a;
        return kotlin.jvm.internal.L.f(dVar != null ? Boolean.valueOf(dVar.isOpen()) : null, Boolean.TRUE);
    }

    @RestrictTo
    public final boolean o() {
        Z1.d dVar = this.f54297a;
        return dVar != null && dVar.isOpen();
    }

    @X41.j
    @Y61.k
    public final Cursor p(@Y61.k Z1.g gVar) {
        a();
        b();
        return i().getWritableDatabase().p1(gVar);
    }

    public final <V> V q(@Y61.k Callable<V> callable) {
        c();
        try {
            V vCall = callable.call();
            s();
            return vCall;
        } finally {
            l();
        }
    }

    public final void r(@Y61.k Runnable runnable) {
        c();
        try {
            runnable.run();
            s();
        } finally {
            l();
        }
    }

    @InterfaceC42830m
    public final void s() {
        i().getWritableDatabase().b5();
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$b;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        }

        public void b(@Y61.k androidx.sqlite.db.framework.b bVar) {
        }
    }
}
