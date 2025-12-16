package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class bxe {
    public static volatile axe b;
    public static volatile ArrayList c;
    public static final ov5 d = new ov5(1);
    public final /* synthetic */ int a = 2;

    public static bj d(Context context, qt6 qt6Var) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) qt6Var.c;
        String str2 = (String) qt6Var.b;
        int i = 0;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(wy1.h("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
            throw new PackageManager.NameNotFoundException(wy1.i("Found content provider ", str, ", but package was not ", str2));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        ov5 ov5Var = d;
        Collections.sort(arrayList, ov5Var);
        List listD = (List) qt6Var.o;
        if (listD == null) {
            listD = io5.d(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursorQuery = null;
            if (i2 >= listD.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listD.get(i2));
            Collections.sort(arrayList2, ov5Var);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        int i4 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new bj(i4, cursorQuery, 8);
        }
        String str3 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) qt6Var.d};
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e) {
                    Log.w("FontsProvider", "Unable to query the content provider", e);
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new me6(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : HttpStatus.SC_BAD_REQUEST, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            return new bj(i, (me6[]) arrayList3.toArray(new me6[0]), 8);
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }

    public static List f(Context context) {
        Bundle bundle;
        String string;
        if (c == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, bxe.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (c == null) {
                c = arrayList;
            }
        }
        return c;
    }

    public static axe g(Context context) {
        if (b == null) {
            try {
                b = (axe) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, bxe.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (b == null) {
                b = new axe();
            }
        }
        return b;
    }

    public static final void i(yi5 yi5Var, Exception exc) {
        ((y3b) yi5Var).a(new te2("ONEME-11709", exc.getMessage(), exc));
    }

    public static void j(Context context, List list) {
        context.getClass();
        list.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zwe) it.next()).getClass();
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (zwe zweVar : list) {
            zweVar.getClass();
            ShortcutInfo.Builder intents = new ShortcutInfo.Builder(zweVar.a, zweVar.b).setShortLabel(zweVar.d).setIntents(zweVar.c);
            IconCompat iconCompat = zweVar.f;
            if (iconCompat != null) {
                intents.setIcon(ob7.g(iconCompat, zweVar.a));
            }
            if (!TextUtils.isEmpty(zweVar.e)) {
                intents.setLongLabel(zweVar.e);
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setDisabledMessage(null);
            }
            xs xsVar = zweVar.g;
            if (xsVar != null) {
                intents.setCategories(xsVar);
            }
            intents.setRank(0);
            PersistableBundle persistableBundle = zweVar.j;
            if (persistableBundle != null) {
                intents.setExtras(persistableBundle);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                yf8 yf8Var = zweVar.h;
                if (yf8Var != null) {
                    intents.setLocusId(yf8Var.b);
                }
                intents.setLongLived(zweVar.i);
            } else {
                if (zweVar.j == null) {
                    zweVar.j = new PersistableBundle();
                }
                yf8 yf8Var2 = zweVar.h;
                if (yf8Var2 != null) {
                    zweVar.j.putString("extraLocusId", yf8Var2.a);
                }
                zweVar.j.putBoolean("extraLongLived", zweVar.i);
                intents.setExtras(zweVar.j);
            }
            if (i >= 33) {
                w75.d(intents);
            }
            arrayList2.add(intents.build());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
            g(context).getClass();
            g(context).getClass();
            Iterator it2 = ((ArrayList) f(context)).iterator();
            if (it2.hasNext()) {
                throw ctd.h(it2);
            }
        }
    }

    public abstract int a(View view, int i, int i2);

    public cy6 b() {
        return new cy6();
    }

    public abstract String c();

    public abstract int e(View view, int i);

    public int h(int i, int i2) {
        return i;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Alignment:" + c();
            default:
                return super.toString();
        }
    }
}
