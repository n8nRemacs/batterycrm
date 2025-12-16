package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzcb {

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f350028b;

    /* renamed from: g, reason: collision with root package name */
    public static Object f350033g;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f350027a = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f350029c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f350030d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f350031e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f350032f = new HashMap(16, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f350034h = new String[0];

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzcb.class) {
            try {
                String str3 = null;
                if (f350028b == null) {
                    f350027a.set(false);
                    f350028b = new HashMap(16, 1.0f);
                    f350033g = new Object();
                    contentResolver.registerContentObserver(zza, true, new zzca(null));
                } else if (f350027a.getAndSet(false)) {
                    f350028b.clear();
                    f350029c.clear();
                    f350030d.clear();
                    f350031e.clear();
                    f350032f.clear();
                    f350033g = new Object();
                }
                Object obj = f350033g;
                if (f350028b.containsKey(str)) {
                    String str4 = (String) f350028b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f350034h.length;
                Cursor cursorQuery = contentResolver.query(zza, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        synchronized (zzcb.class) {
                            try {
                                if (obj == f350033g) {
                                    f350028b.put(str, null);
                                }
                            } finally {
                            }
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    synchronized (zzcb.class) {
                        try {
                            if (obj == f350033g) {
                                f350028b.put(str, string);
                            }
                        } finally {
                        }
                    }
                    if (string != null) {
                        return string;
                    }
                    return null;
                } finally {
                    cursorQuery.close();
                }
            } finally {
            }
        }
    }
}
