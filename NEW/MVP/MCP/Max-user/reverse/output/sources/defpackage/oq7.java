package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.http.client.methods.HttpDelete;

/* loaded from: classes.dex */
public final class oq7 {
    public static final String[] o = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};
    public final lrd a;
    public final HashMap b;
    public final HashMap c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g;
    public volatile vk6 h;
    public final dl6 i;
    public final s7c j;
    public final rwd k;
    public final Object l;
    public final Object m;
    public final ue n;

    public oq7(lrd lrdVar, HashMap map, HashMap map2, String... strArr) {
        this.a = lrdVar;
        this.b = map;
        this.c = map2;
        int length = strArr.length;
        dl6 dl6Var = new dl6();
        dl6Var.b = new long[length];
        dl6Var.c = new boolean[length];
        dl6Var.d = new int[length];
        this.i = dl6Var;
        s7c s7cVar = new s7c();
        s7cVar.a = lrdVar;
        s7cVar.b = Collections.newSetFromMap(new IdentityHashMap());
        this.j = s7cVar;
        this.k = new rwd();
        this.l = new Object();
        this.m = new Object();
        this.d = new LinkedHashMap();
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i = 0; i < length2; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.d.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase4, to8.c(linkedHashMap, lowerCase3));
            }
        }
        this.n = new ue(26, this);
    }

    public final void a(lq7 lq7Var) {
        mq7 mq7Var;
        boolean z;
        String[] strArrD = d(lq7Var.a);
        ArrayList arrayList = new ArrayList(strArrD.length);
        for (String str : strArrD) {
            Integer num = (Integer) this.d.get(str.toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrC0 = ue3.c0(arrayList);
        mq7 mq7Var2 = new mq7(lq7Var, iArrC0, strArrD);
        synchronized (this.k) {
            mq7Var = (mq7) this.k.b(lq7Var, mq7Var2);
        }
        if (mq7Var == null) {
            dl6 dl6Var = this.i;
            int[] iArrCopyOf = Arrays.copyOf(iArrC0, iArrC0.length);
            synchronized (dl6Var) {
                z = false;
                for (int i : iArrCopyOf) {
                    long[] jArr = (long[]) dl6Var.b;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        dl6Var.a = true;
                    }
                }
            }
            if (z) {
                lrd lrdVar = this.a;
                if (lrdVar.m()) {
                    prf prfVar = lrdVar.d;
                    if (prfVar == null) {
                        prfVar = null;
                    }
                    f(prfVar.getWritableDatabase());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.a.m()) {
            return false;
        }
        if (!this.g) {
            prf prfVar = this.a.d;
            if (prfVar == null) {
                prfVar = null;
            }
            prfVar.getWritableDatabase();
        }
        if (this.g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(lq7 lq7Var) {
        mq7 mq7Var;
        boolean z;
        synchronized (this.k) {
            mq7Var = (mq7) this.k.c(lq7Var);
        }
        if (mq7Var != null) {
            dl6 dl6Var = this.i;
            int[] iArr = mq7Var.b;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            synchronized (dl6Var) {
                z = false;
                for (int i : iArrCopyOf) {
                    long[] jArr = (long[]) dl6Var.b;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        dl6Var.a = true;
                    }
                }
            }
            if (z) {
                lrd lrdVar = this.a;
                if (lrdVar.m()) {
                    prf prfVar = lrdVar.d;
                    if (prfVar == null) {
                        prfVar = null;
                    }
                    f(prfVar.getWritableDatabase());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        bke bkeVar = new bke();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            HashMap map = this.c;
            if (map.containsKey(lowerCase)) {
                bkeVar.addAll((Collection) map.get(str.toLowerCase(locale)));
            } else {
                bkeVar.add(str);
            }
        }
        return (String[]) gke.a(bkeVar).toArray(new String[0]);
    }

    public final void e(pk6 pk6Var, int i) throws SQLException {
        pk6Var.Q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = o[i2];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            ho7.r(sb, "`room_table_modification_trigger_" + str + '_' + str2 + '`', " AFTER ", str2, " ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i);
            sb.append(" AND invalidated = 0; END");
            pk6Var.Q(sb.toString());
        }
    }

    public final void f(pk6 pk6Var) {
        if (pk6Var.h0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.i.readLock();
            lock.lock();
            try {
                synchronized (this.l) {
                    int[] iArrH = this.i.h();
                    if (iArrH != null) {
                        if (pk6Var.i0()) {
                            pk6Var.w();
                        } else {
                            pk6Var.l();
                        }
                        try {
                            int length = iArrH.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = iArrH[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    e(pk6Var, i2);
                                } else if (i3 == 2) {
                                    String str = this.e[i2];
                                    String[] strArr = o;
                                    for (int i5 = 0; i5 < 3; i5++) {
                                        String str2 = strArr[i5];
                                        StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                        sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                        pk6Var.Q(sb.toString());
                                    }
                                }
                                i++;
                                i2 = i4;
                            }
                            pk6Var.l0();
                            pk6Var.P();
                        } catch (Throwable th) {
                            pk6Var.P();
                            throw th;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
