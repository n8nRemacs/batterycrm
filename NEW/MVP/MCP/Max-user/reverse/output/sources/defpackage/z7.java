package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.b;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class z7 {
    public static final Object a = null;
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static boolean a(umb umbVar, x16 x16Var, int i, n7 n7Var) {
        long jZ = umbVar.z();
        long j = jZ >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jZ >> 12) & 15);
        int i3 = (int) ((jZ >> 8) & 15);
        int i4 = (int) ((jZ >> 4) & 15);
        int i5 = (int) ((jZ >> 1) & 7);
        boolean z2 = (jZ & 1) == 1;
        if (i4 <= 7) {
            if (i4 != x16Var.h - 1) {
                return false;
            }
        } else if (i4 > 10 || x16Var.h != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == x16Var.j) || z2) {
            return false;
        }
        try {
            long jE = umbVar.E();
            if (!z) {
                jE *= x16Var.c;
            }
            n7Var.a = jE;
            int iG = g(i2, umbVar);
            if (iG == -1 || iG > x16Var.c) {
                return false;
            }
            int i6 = x16Var.f;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != x16Var.g) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iD = umbVar.D();
                    if (i3 == 14) {
                        iD *= 10;
                    }
                    if (iD != i6) {
                        return false;
                    }
                } else if (umbVar.x() * 1000 != i6) {
                    return false;
                }
            }
            int iX = umbVar.x();
            int i7 = umbVar.b;
            byte[] bArr = umbVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = umbVar.b; i10 < i8; i10++) {
                i9 = zxg.m[i9 ^ (bArr[i10] & 255)];
            }
            String str = zxg.a;
            return iX == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : vma.a(new bna(context).b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList c(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            jod r1 = new jod
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.lod.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.lod.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            iod r5 = (defpackage.iod) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.lod.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.qf3.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.lod.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.lod.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            iod r0 = new iod     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = defpackage.hod.b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.c(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Executor d(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? v34.a(context) : new bo0(new Handler(context.getMainLooper()), 1);
    }

    public static String e(Context context, int i) {
        we8 we8VarA;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object systemService = context.getSystemService("locale");
            we8VarA = systemService != null ? new we8(new xe8(ye8.a(systemService))) : we8.b;
        } else {
            we8VarA = we8.a(mw0.d(context));
        }
        if (i2 <= 32 && !we8VarA.a.a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            to3.b(configuration, we8VarA);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static d f(u62 u62Var, boolean z) throws ParserException {
        int i;
        int i2;
        int i3 = u62Var.i(5);
        if (i3 == 31) {
            i3 = u62Var.i(6) + 32;
        }
        int i4 = u62Var.i(4);
        int[] iArr = b;
        if (i4 == 15) {
            i = u62Var.i(24);
        } else {
            if (i4 >= 13) {
                throw ParserException.a(null, null);
            }
            i = iArr[i4];
        }
        int i5 = u62Var.i(4);
        StringBuilder sb = new StringBuilder(19);
        sb.append("mp4a.40.");
        sb.append(i3);
        String string = sb.toString();
        if (i3 == 5 || i3 == 29) {
            int i6 = u62Var.i(4);
            if (i6 == 15) {
                i2 = u62Var.i(24);
            } else {
                if (i6 >= 13) {
                    throw ParserException.a(null, null);
                }
                i2 = iArr[i6];
            }
            i = i2;
            int i7 = u62Var.i(5);
            if (i7 == 31) {
                i7 = u62Var.i(6) + 32;
            }
            i3 = i7;
            if (i3 == 22) {
                i5 = u62Var.i(4);
            }
        }
        if (z) {
            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4 && i3 != 6 && i3 != 7 && i3 != 17) {
                switch (i3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(i3);
                        throw ParserException.c(sb2.toString());
                }
            }
            if (u62Var.h()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (u62Var.h()) {
                u62Var.t(14);
            }
            boolean zH = u62Var.h();
            if (i5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i3 == 6 || i3 == 20) {
                u62Var.t(3);
            }
            if (zH) {
                if (i3 == 22) {
                    u62Var.t(16);
                }
                if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                    u62Var.t(3);
                }
                u62Var.t(1);
            }
            switch (i3) {
                case LangUtils.HASH_SEED /* 17 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i8 = u62Var.i(2);
                    if (i8 == 2 || i8 == 3) {
                        StringBuilder sb3 = new StringBuilder(33);
                        sb3.append("Unsupported epConfig: ");
                        sb3.append(i8);
                        throw ParserException.c(sb3.toString());
                    }
            }
        }
        int i9 = c[i5];
        if (i9 != -1) {
            return new d(i, i9, string);
        }
        throw ParserException.a(null, null);
    }

    public static int g(int i, umb umbVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return umbVar.x() + 1;
            case 7:
                return umbVar.D() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? w34.a(context, broadcastReceiver, intentFilter, str, null, i) : u34.a(context, broadcastReceiver, intentFilter, str, null, i);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static void i(b bVar, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException(ho7.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        w7.b(bVar, strArr, i);
    }

    public static ArrayList j(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(jSONArray.getLong(i)));
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
