package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes6.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f361623a;

    public j(Context context, String str) {
        this.f361623a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j12 = this.f361623a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f361623a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f361623a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f361623a.edit().putStringSet(key, hashSet).putLong("fire-count", j12 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f361623a.edit();
            int i12 = 0;
            for (Map.Entry<String, ?> entry : this.f361623a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i12++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i12 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i12);
            }
            editorEdit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f361623a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f361623a.edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String d(long j12) {
        return new Date(j12).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f361623a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f361623a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f361623a.edit().remove(strE).commit();
            } else {
                this.f361623a.edit().putStringSet(strE, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean g(long j12) {
        if (!this.f361623a.contains("fire-global")) {
            this.f361623a.edit().putLong("fire-global", j12).commit();
            return true;
        }
        long j13 = this.f361623a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j13).equals(d(j12))) {
                return false;
            }
            this.f361623a.edit().putLong("fire-global", j12).commit();
            return true;
        }
    }

    public final synchronized void h(long j12, String str) {
        String strD = d(j12);
        if (this.f361623a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            i(str, strD);
            return;
        }
        long j13 = this.f361623a.getLong("fire-count", 0L);
        if (j13 + 1 == 30) {
            a();
            j13 = this.f361623a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f361623a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f361623a.edit().putStringSet(str, hashSet).putLong("fire-count", j13 + 1).putString("last-used-date", strD).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f361623a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f361623a.edit().putStringSet(str, hashSet).commit();
    }
}
