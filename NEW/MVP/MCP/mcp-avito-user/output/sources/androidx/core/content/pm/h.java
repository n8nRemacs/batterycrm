package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.core.content.pm.f;
import androidx.core.graphics.drawable.IconCompat;
import j.N;
import j.X;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShortcutManagerCompat.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static volatile f<?> f44640a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile ArrayList f44641b;

    /* compiled from: ShortcutManagerCompat.java */
    @X
    public static class a {
    }

    /* compiled from: ShortcutManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface b {
    }

    public static List<d> a(Context context) {
        Bundle bundle;
        String string;
        if (f44641b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((d) Class.forName(string, false, h.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f44641b == null) {
                f44641b = arrayList;
            }
        }
        return f44641b;
    }

    public static f<?> b(Context context) {
        if (f44640a == null) {
            try {
                f44640a = (f) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, h.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f44640a == null) {
                f44640a = new f.a();
            }
        }
        return f44640a;
    }

    public static void c(@N Context context, @N e eVar) {
        IconCompat iconCompat;
        int i12;
        InputStream inputStreamJ;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatC;
        context.getClass();
        eVar.getClass();
        int i13 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i13 <= 29 && (iconCompat = eVar.f44636e) != null && (((i12 = iconCompat.f44738a) == 6 || i12 == 4) && (inputStreamJ = iconCompat.j(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamJ)) != null)) {
            if (i12 == 6) {
                iconCompatC = new IconCompat(5);
                iconCompatC.f44739b = bitmapDecodeStream;
            } else {
                iconCompatC = IconCompat.c(bitmapDecodeStream);
            }
            eVar.f44636e = iconCompatC;
        }
        String str = null;
        char c12 = 65535;
        if (i13 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(eVar.a());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                String id2 = null;
                int rank = -1;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfo.getRank() > rank) {
                        id2 = shortcutInfo.getId();
                        rank = shortcutInfo.getRank();
                    }
                }
                shortcutManager.removeDynamicShortcuts(Arrays.asList(id2));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(eVar.a()));
        }
        try {
            b(context).getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= maxShortcutCountPerActivity) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar2 = (e) it.next();
                    eVar2.getClass();
                    if (c12 < 0) {
                        str = eVar2.f44633b;
                        c12 = 0;
                    }
                }
                Arrays.asList(str);
            }
            Arrays.asList(eVar);
            Iterator it2 = ((ArrayList) a(context)).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                Collections.singletonList(eVar);
                dVar.getClass();
            }
            d(context, eVar.f44633b);
        } catch (Exception unused) {
            Iterator it3 = ((ArrayList) a(context)).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                Collections.singletonList(eVar);
                dVar2.getClass();
            }
            d(context, eVar.f44633b);
        } catch (Throwable th2) {
            Iterator it4 = ((ArrayList) a(context)).iterator();
            while (it4.hasNext()) {
                d dVar3 = (d) it4.next();
                Collections.singletonList(eVar);
                dVar3.getClass();
            }
            d(context, eVar.f44633b);
            throw th2;
        }
    }

    public static void d(@N Context context, @N String str) {
        context.getClass();
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = ((ArrayList) a(context)).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Collections.singletonList(str);
            dVar.getClass();
        }
    }
}
