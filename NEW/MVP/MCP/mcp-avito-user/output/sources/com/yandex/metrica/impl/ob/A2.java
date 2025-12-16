package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private static final C38987mn f377753a = new C38987mn();

    public class a implements NetworkTask.ShouldTryNextHostCondition {
        @Override // com.yandex.metrica.networktasks.api.NetworkTask.ShouldTryNextHostCondition
        public boolean shouldTryNextHost(int i12) {
            return !A2.b(i12);
        }
    }

    public static boolean a(Object obj) {
        return obj != null;
    }

    public static boolean b(int i12) {
        return i12 == 400;
    }

    @j.P
    public static <K, V> Map<K, V> c(@j.P Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @j.N
    public static <K, V> Map<K, V> d(@j.N Map<K, V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    @j.N
    public static <K, V> Map<K, V> e(@j.N Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo == null ? "0.0" : packageInfo.versionName;
    }

    public static int b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    @j.N
    public static <T> List<T> c(@j.N Collection<T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static boolean a(int i12) {
        return Build.VERSION.SDK_INT >= i12;
    }

    public static boolean b(Map map) {
        return map == null || map.size() == 0;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(@j.P byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    @j.N
    public static String a(@j.P String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb2.toString();
    }

    @j.N
    public static Set<Integer> a(@j.N int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i12 : iArr) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    @j.P
    public static String a(@j.P String str, int i12) {
        if (str == null) {
            return null;
        }
        return str.length() > i12 ? str.substring(0, i12) : str;
    }

    @j.N
    public static List<String> a(@j.N String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return c(treeSet);
    }

    @j.P
    public static Object a(@j.N InterfaceC39036om interfaceC39036om, @j.P Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return interfaceC39036om.a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static <T, S> S a(@j.N InterfaceC39036om<T, S> interfaceC39036om, @j.N Context context, @j.N String str, @j.N String str2, @j.N String str3) {
        try {
            return (S) a((InterfaceC39036om) interfaceC39036om, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public static <K, V> List<Map.Entry<K, V>> a(@j.P Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    @j.N
    public static <K, V> Map<K, V> a(@j.P List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry<K, V> entry : list) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @j.P
    public static <T> List<T> a(@j.P Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    @j.N
    public static BigDecimal a(long j12) {
        return new BigDecimal(j12).divide(new BigDecimal(1000000), 6, 6);
    }

    public static double a(double d12, double d13) {
        return (Double.isNaN(d12) || Double.isInfinite(d12)) ? d13 : d12;
    }

    public static NetworkTask.ShouldTryNextHostCondition a() {
        return new a();
    }
}
