package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38689b {
    public static boolean a(@j.P Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static boolean b(@j.P String str, @j.P String str2) {
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    @j.P
    public static Integer c(@j.P String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @j.N
    public static com.yandex.metrica.billing_interface.e d(@j.N String str) {
        return "inapp".equals(str) ? com.yandex.metrica.billing_interface.e.f377619b : "subs".equals(str) ? com.yandex.metrica.billing_interface.e.f377620c : com.yandex.metrica.billing_interface.e.f377621d;
    }

    @j.N
    public static byte[] e(@j.P String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    public static String a(@j.N Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    public static byte[] b(@j.P String str) {
        if (str != null) {
            try {
                return str.getBytes(Constants.ENCODING);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    public static boolean a(@j.N File file, @j.N File file2) {
        try {
            kotlin.io.j.b(file, file2);
            file.delete();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(@j.P Collection<?> collection, @j.P Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void a(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i12 = 0; i12 < length; i12++) {
            int type = cursor.getType(i12);
            if (type == 0) {
                contentValues.put(columnNames[i12], cursor.getString(i12));
            } else if (type == 1) {
                contentValues.put(columnNames[i12], Long.valueOf(cursor.getLong(i12)));
            } else if (type == 2) {
                contentValues.put(columnNames[i12], Double.valueOf(cursor.getDouble(i12)));
            } else if (type == 3) {
                contentValues.put(columnNames[i12], cursor.getString(i12));
            } else if (type != 4) {
                contentValues.put(columnNames[i12], cursor.getString(i12));
            } else {
                contentValues.put(columnNames[i12], cursor.getBlob(i12));
            }
        }
    }

    public static long a() {
        return C38812fm.c().a();
    }

    public static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @j.N
    public static List<Integer> a(@j.N int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
        }
        return arrayList;
    }

    public static void a(SharedPreferences sharedPreferences, String str, int i12) {
        if (sharedPreferences == null || !sharedPreferences.contains(str)) {
            return;
        }
        try {
            sharedPreferences.edit().remove(str).putLong(str, sharedPreferences.getInt(str, i12)).apply();
        } catch (ClassCastException unused) {
        }
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
        } finally {
            A2.a(cursorRawQuery);
        }
    }

    @j.N
    public static int[] a(@j.N List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = it.next().intValue();
            i12++;
        }
        return iArr;
    }

    public static com.yandex.metrica.i a(String str) {
        com.yandex.metrica.i iVar = new com.yandex.metrica.i();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                iVar.f377709a = jSONObject.optString("UserInfo.UserId", null);
                iVar.f377710b = jSONObject.optString("UserInfo.Type", null);
                iVar.f377711c = Tl.b(jSONObject.optJSONObject("UserInfo.Options"));
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    public static String a(@j.N byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b12 : bArr) {
            sb2.append("0123456789abcdef".charAt((b12 & 240) >> 4));
            sb2.append("0123456789abcdef".charAt(b12 & 15));
        }
        return sb2.toString();
    }
}
