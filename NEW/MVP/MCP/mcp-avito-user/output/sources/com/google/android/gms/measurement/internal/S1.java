package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzoe;
import org.checkerframework.dataflow.qual.Pure;
import v61.InterfaceC49173d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class S1 extends AbstractC36884g3 {

    /* renamed from: c, reason: collision with root package name */
    public char f354886c;

    /* renamed from: d, reason: collision with root package name */
    public long f354887d;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public String f354888e;

    /* renamed from: f, reason: collision with root package name */
    public final U1 f354889f;

    /* renamed from: g, reason: collision with root package name */
    public final U1 f354890g;

    /* renamed from: h, reason: collision with root package name */
    public final U1 f354891h;

    /* renamed from: i, reason: collision with root package name */
    public final U1 f354892i;

    /* renamed from: j, reason: collision with root package name */
    public final U1 f354893j;

    /* renamed from: k, reason: collision with root package name */
    public final U1 f354894k;

    /* renamed from: l, reason: collision with root package name */
    public final U1 f354895l;

    /* renamed from: m, reason: collision with root package name */
    public final U1 f354896m;

    /* renamed from: n, reason: collision with root package name */
    public final U1 f354897n;

    public S1(I2 i22) {
        super(i22);
        this.f354886c = (char) 0;
        this.f354887d = -1L;
        this.f354889f = new U1(this, 6, false, false);
        this.f354890g = new U1(this, 6, true, false);
        this.f354891h = new U1(this, 6, false, true);
        this.f354892i = new U1(this, 5, false, false);
        this.f354893j = new U1(this, 5, true, false);
        this.f354894k = new U1(this, 5, false, true);
        this.f354895l = new U1(this, 4, false, false);
        this.f354896m = new U1(this, 3, false, false);
        this.f354897n = new U1(this, 2, false, false);
    }

    public static Object i(String str) {
        if (str == null) {
            return null;
        }
        return new X1(str);
    }

    @j.k0
    public static String j(Object obj, boolean z12) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i12 = 0;
        if (obj instanceof Long) {
            if (!z12) {
                return String.valueOf(obj);
            }
            Long l12 = (Long) obj;
            if (Math.abs(l12.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l12.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof X1 ? ((X1) obj).f354980a : z12 ? "-" : String.valueOf(obj);
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z12 ? th2.getClass().getName() : th2.toString());
        String strN = n(I2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i12];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && n(className).equals(strN)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i12++;
        }
        return sb2.toString();
    }

    public static String k(boolean z12, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strJ = j(obj, z12);
        String strJ2 = j(obj2, z12);
        String strJ3 = j(obj3, z12);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strJ)) {
            sb2.append(str2);
            sb2.append(strJ);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strJ2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strJ2);
        }
        if (!TextUtils.isEmpty(strJ3)) {
            sb2.append(str3);
            sb2.append(strJ3);
        }
        return sb2.toString();
    }

    @j.k0
    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? (zzoe.zza() && E.f354656y0.a(null).booleanValue()) ? "" : str : str.substring(0, iLastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36884g3
    public final boolean h() {
        return false;
    }

    public final void l(int i12, boolean z12, boolean z13, String str, Object obj, Object obj2, Object obj3) {
        if (!z12 && m(i12)) {
            Log.println(i12, t(), k(false, str, obj, obj2, obj3));
        }
        if (z13 || i12 < 5) {
            return;
        }
        C36729v.j(str);
        A2 a22 = this.f355183a.f354718j;
        if (a22 == null) {
            Log.println(6, t(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!a22.f355168b) {
            Log.println(6, t(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (i12 >= 9) {
            i12 = 8;
        }
        a22.n(new V1(this, i12, str, obj, obj2, obj3));
    }

    @j.k0
    public final boolean m(int i12) {
        return Log.isLoggable(t(), i12);
    }

    public final U1 o() {
        return this.f354896m;
    }

    public final U1 p() {
        return this.f354889f;
    }

    public final U1 q() {
        return this.f354897n;
    }

    public final U1 r() {
        return this.f354892i;
    }

    public final String s() {
        long jAbs;
        Pair<String, Long> pair;
        if (super.b().f355128f == null) {
            return null;
        }
        C36904j2 c36904j2 = super.b().f355128f;
        C36876f2 c36876f2 = c36904j2.f355214e;
        c36876f2.e();
        c36876f2.e();
        long j12 = c36904j2.f355214e.m().getLong(c36904j2.f355210a, 0L);
        if (j12 == 0) {
            c36904j2.a();
            jAbs = 0;
        } else {
            c36876f2.f355183a.f354722n.getClass();
            jAbs = Math.abs(j12 - System.currentTimeMillis());
        }
        long j13 = c36904j2.f355213d;
        if (jAbs < j13) {
            pair = null;
        } else if (jAbs > (j13 << 1)) {
            c36904j2.a();
            pair = null;
        } else {
            String string = c36876f2.m().getString(c36904j2.f355212c, null);
            long j14 = c36876f2.m().getLong(c36904j2.f355211b, 0L);
            c36904j2.a();
            pair = (string == null || j14 <= 0) ? C36876f2.f355124A : new Pair<>(string, Long.valueOf(j14));
        }
        if (pair == null || pair == C36876f2.f355124A) {
            return null;
        }
        return androidx.appcompat.app.r.r(String.valueOf(pair.second), ":", (String) pair.first);
    }

    @InterfaceC49173d
    @j.k0
    public final String t() {
        String str;
        synchronized (this) {
            try {
                if (this.f354888e == null) {
                    String str2 = this.f355183a.f354712d;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f354888e = str2;
                }
                C36729v.j(this.f354888e);
                str = this.f354888e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
