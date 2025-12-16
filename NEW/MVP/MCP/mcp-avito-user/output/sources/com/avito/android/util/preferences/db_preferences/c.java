package com.avito.android.util.preferences.db_preferences;

import Y61.k;
import Y61.l;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.util.C35851n0;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import uK0.C48914a;
import uu.C49113a;

/* compiled from: DbSharedPreferencesImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/preferences/db_preferences/c;", "Landroid/content/SharedPreferences;", "a", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.db.sqlbrite.a f318965a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f318966b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Handler f318967c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f318968d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f318969e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C49113a f318970f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> f318971g;

    /* compiled from: DbSharedPreferencesImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/preferences/db_preferences/c$a;", "Landroid/content/SharedPreferences$Editor;", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        @k
        public volatile LinkedHashMap f318972a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        @k
        public volatile LinkedHashSet f318973b = new LinkedHashSet();

        /* renamed from: c, reason: collision with root package name */
        public boolean f318974c;

        public a() {
        }

        public final void a(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
            c cVar = c.this;
            com.avito.android.util.preferences.db_preferences.b bVar = new com.avito.android.util.preferences.db_preferences.b(linkedHashSet, linkedHashMap, cVar, this);
            com.avito.android.db.sqlbrite.a aVar = cVar.f318965a;
            aVar.getClass();
            try {
                aVar.a().beginTransaction();
                bVar.invoke();
                aVar.a().setTransactionSuccessful();
            } finally {
                aVar.a().endTransaction();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            commit();
        }

        public final void b(LinkedHashSet linkedHashSet) {
            c cVar = c.this;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                synchronized (cVar) {
                    try {
                        Iterator it2 = new HashSet(cVar.f318971g.keySet()).iterator();
                        while (it2.hasNext()) {
                            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it2.next();
                            if (cVar.f318971g.containsKey(onSharedPreferenceChangeListener) && onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(cVar, str);
                            }
                        }
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final void c(Object obj, String str) {
            synchronized (this) {
                this.f318972a.put(str, obj);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor clear() {
            synchronized (c.this) {
                this.f318974c = true;
                G0 g02 = G0.f406611a;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            boolean z12;
            synchronized (c.this) {
                linkedHashMap = this.f318972a;
                linkedHashSet = this.f318973b;
                z12 = this.f318974c;
                this.f318972a = new LinkedHashMap();
                this.f318973b = new LinkedHashSet();
                this.f318974c = false;
                G0 g02 = G0.f406611a;
            }
            if (z12) {
                c cVar = c.this;
                com.avito.android.db.sqlbrite.a aVar = cVar.f318965a;
                C49113a c49113a = cVar.f318970f;
                c49113a.getClass();
                aVar.a().delete("shared_preferences", c49113a.f440321e, new String[]{cVar.f318968d});
            }
            try {
                a(linkedHashSet, linkedHashMap);
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.addAll(linkedHashSet);
                linkedHashSet2.addAll(linkedHashMap.keySet());
                if (L.f(Looper.myLooper(), Looper.getMainLooper())) {
                    b(linkedHashSet2);
                    return true;
                }
                c.this.f318967c.post(new Runnable() { // from class: com.avito.android.util.preferences.db_preferences.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f318959b.b(linkedHashSet2);
                    }
                });
                return true;
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "DbSharedPreferences commit error", e12);
                return true;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor putBoolean(@k String str, boolean z12) {
            c(Boolean.valueOf(z12), str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor putFloat(@k String str, float f12) {
            c(Float.valueOf(f12), str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor putInt(@k String str, int i12) {
            c(Integer.valueOf(i12), str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor putLong(@k String str, long j12) {
            c(Long.valueOf(j12), str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor putString(@k String str, @l String str2) {
            c(str2, str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor putStringSet(@k String str, @l Set<String> set) {
            c(set, str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @k
        public final SharedPreferences.Editor remove(@k String str) {
            synchronized (this) {
                this.f318973b.add(str);
            }
            return this;
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<Set<? extends String>> {
    }

    public c(@k com.avito.android.db.sqlbrite.a aVar, @k Gson gson, @k Handler handler, @k String str) {
        this.f318965a = aVar;
        this.f318966b = gson;
        this.f318967c = handler;
        this.f318968d = str;
        this.f318969e = new Object();
        this.f318970f = new C49113a();
        this.f318971g = new WeakHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.String> a(java.lang.String r3, java.util.Set<java.lang.String> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            goto L2b
        L3:
            com.avito.android.util.preferences.db_preferences.c$b r4 = new com.avito.android.util.preferences.db_preferences.c$b
            r4.<init>()
            java.lang.reflect.Type r4 = r4.getType()
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1e
            r0 = r4
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            boolean r1 = com.avito.android.util.R1.a(r0)
            if (r1 == 0) goto L1e
            java.lang.reflect.Type r4 = r0.getRawType()
            goto L22
        L1e:
            java.lang.reflect.Type r4 = com.avito.android.util.R1.b(r4)
        L22:
            com.google.gson.Gson r0 = r2.f318966b
            java.lang.Object r3 = r0.e(r3, r4)
            r4 = r3
            java.util.Set r4 = (java.util.Set) r4
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.preferences.db_preferences.c.a(java.lang.String, java.util.Set):java.util.Set");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object b(String str, String str2) {
        switch (str2.hashCode()) {
            case -1572742348:
                if (str2.equals("string_set")) {
                    return a(str, null);
                }
                break;
            case -891985903:
                if (str2.equals("string")) {
                    return str;
                }
                break;
            case 104431:
                if (str2.equals(IntParameter.TYPE) && str != null) {
                    return Integer.valueOf(Integer.parseInt(str));
                }
                break;
            case 3327612:
                if (str2.equals(Constants.LONG) && str != null) {
                    return Long.valueOf(Long.parseLong(str));
                }
                break;
            case 64711720:
                if (str2.equals(BooleanParameter.TYPE) && str != null) {
                    return Boolean.valueOf(Boolean.parseBoolean(str));
                }
                break;
            case 97526364:
                if (str2.equals("float") && str != null) {
                    return Float.valueOf(Float.parseFloat(str));
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r4) throws java.lang.Throwable {
        /*
            r3 = this;
            uu.a r0 = r3.f318970f
            java.lang.String r0 = r0.f440319c
            java.lang.String r1 = r3.f318968d
            java.lang.String[] r4 = new java.lang.String[]{r4, r1}
            com.avito.android.db.sqlbrite.a r1 = r3.f318965a
            android.database.sqlite.SQLiteDatabase r1 = r1.a()
            android.database.Cursor r4 = r1.rawQuery(r0, r4)
            int r0 = r4.getCount()
            if (r0 <= 0) goto L40
            uK0.a r4 = com.avito.android.util.C35851n0.a(r4)
            r0 = 0
            r4.moveToFirst()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r1 = "value"
            java.lang.String r0 = r4.f(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4.close()
            return r0
        L2c:
            r1 = move-exception
            goto L3a
        L2e:
            r0 = move-exception
            r1 = 1
            r4.close()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            goto L39
        L34:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L3a
        L39:
            throw r0     // Catch: java.lang.Throwable -> L34
        L3a:
            if (r0 != 0) goto L3f
            r4.close()
        L3f:
            throw r1
        L40:
            r4.close()
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.preferences.db_preferences.c.c(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(@Y61.k java.lang.String r5) throws java.lang.Throwable {
        /*
            r4 = this;
            uu.a r0 = r4.f318970f
            java.lang.String r0 = r0.f440319c
            java.lang.String r1 = r4.f318968d
            java.lang.String[] r5 = new java.lang.String[]{r5, r1}
            com.avito.android.db.sqlbrite.a r1 = r4.f318965a
            android.database.sqlite.SQLiteDatabase r1 = r1.a()
            android.database.Cursor r5 = r1.rawQuery(r0, r5)
            r0 = 1
            r1 = 0
            int r2 = r5.getCount()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            if (r2 <= 0) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r5.close()
            return r0
        L22:
            r0 = move-exception
            goto L2f
        L24:
            r1 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            goto L2e
        L29:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L2f
        L2e:
            throw r1     // Catch: java.lang.Throwable -> L29
        L2f:
            if (r1 != 0) goto L34
            r5.close()
        L34:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.preferences.db_preferences.c.contains(java.lang.String):boolean");
    }

    @Override // android.content.SharedPreferences
    @k
    public final SharedPreferences.Editor edit() {
        return new a();
    }

    @Override // android.content.SharedPreferences
    @k
    public final Map<String, Object> getAll() {
        Cursor cursorRawQuery = this.f318965a.a().rawQuery(this.f318970f.f440320d, new String[]{this.f318968d});
        if (cursorRawQuery.getCount() <= 0) {
            return P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C48914a c48914aA = C35851n0.a(cursorRawQuery);
        while (true) {
            boolean z12 = false;
            try {
                try {
                    if (!c48914aA.moveToNext()) {
                        c48914aA.close();
                        return linkedHashMap;
                    }
                    linkedHashMap.put(c48914aA.d("key"), b(c48914aA.f("value"), c48914aA.d("type")));
                } catch (Exception e12) {
                    z12 = true;
                    try {
                        c48914aA.close();
                    } catch (Exception unused) {
                    }
                    throw e12;
                }
            } catch (Throwable th2) {
                if (!z12) {
                    c48914aA.close();
                }
                throw th2;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(@k String str, boolean z12) throws Throwable {
        String strC = c(str);
        return strC != null ? Boolean.parseBoolean(strC) : z12;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(@k String str, float f12) throws Throwable {
        String strC = c(str);
        return strC != null ? Float.parseFloat(strC) : f12;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(@k String str, int i12) throws Throwable {
        String strC = c(str);
        return strC != null ? Integer.parseInt(strC) : i12;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(@k String str, long j12) throws Throwable {
        String strC = c(str);
        return strC != null ? Long.parseLong(strC) : j12;
    }

    @Override // android.content.SharedPreferences
    @l
    public final String getString(@k String str, @l String str2) {
        return contains(str) ? c(str) : str2;
    }

    @Override // android.content.SharedPreferences
    @l
    public final Set<String> getStringSet(@k String str, @l Set<String> set) {
        return a(c(str), set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(@k SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.f318971g.put(onSharedPreferenceChangeListener, this.f318969e);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(@k SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.f318971g.remove(onSharedPreferenceChangeListener);
        }
    }

    public /* synthetic */ c(com.avito.android.db.sqlbrite.a aVar, Gson gson, Handler handler, String str, int i12, C42822w c42822w) {
        this(aVar, gson, handler, (i12 & 8) != 0 ? "shared_preferences" : str);
    }
}
