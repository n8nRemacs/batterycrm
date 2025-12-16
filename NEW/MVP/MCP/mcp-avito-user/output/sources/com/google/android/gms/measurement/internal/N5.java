package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzcv;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.dataflow.qual.Pure;
import v61.InterfaceC49173d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class N5 extends AbstractC36884g3 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f354817i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f354818j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f354819c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f354820d;

    /* renamed from: e, reason: collision with root package name */
    public int f354821e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.privacysandbox.ads.adservices.java.measurement.a f354822f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f354823g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f354824h;

    public N5(I2 i22) {
        super(i22);
        this.f354824h = null;
        this.f354820d = new AtomicLong(0L);
    }

    @j.l0
    public static void G(C36941o4 c36941o4, Bundle bundle, boolean z12) {
        if (bundle == null || c36941o4 == null || (bundle.containsKey("_sc") && !z12)) {
            if (bundle != null && c36941o4 == null && z12) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c36941o4.f355292a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c36941o4.f355293b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c36941o4.f355294c);
    }

    public static void H(M5 m52, String str, int i12, String str2, String str3, int i13) {
        Bundle bundle = new Bundle();
        c0(i12, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i12 == 6 || i12 == 7 || i12 == 2) {
            bundle.putLong("_el", i13);
        }
        m52.a(str, "_err", bundle);
    }

    public static boolean N(Context context) {
        ActivityInfo receiverInfo;
        C36729v.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean O(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean P(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean T(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            C36729v.j(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean U(String str, String[] strArr) {
        C36729v.j(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] W(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList<Bundle> b0(List<zzae> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzae zzaeVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, zzaeVar.f355521b);
            bundle.putString("origin", zzaeVar.f355522c);
            bundle.putLong("creation_timestamp", zzaeVar.f355524e);
            bundle.putString("name", zzaeVar.f355523d.f355555c);
            Object objH = zzaeVar.f355523d.h();
            C36729v.j(objH);
            C36898i3.b(bundle, objH);
            bundle.putBoolean("active", zzaeVar.f355525f);
            String str = zzaeVar.f355526g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbe zzbeVar = zzaeVar.f355527h;
            if (zzbeVar != null) {
                bundle.putString("timed_out_event_name", zzbeVar.f355534b);
                zzaz zzazVar = zzbeVar.f355535c;
                if (zzazVar != null) {
                    bundle.putBundle("timed_out_event_params", zzazVar.i());
                }
            }
            bundle.putLong("trigger_timeout", zzaeVar.f355528i);
            zzbe zzbeVar2 = zzaeVar.f355529j;
            if (zzbeVar2 != null) {
                bundle.putString("triggered_event_name", zzbeVar2.f355534b);
                zzaz zzazVar2 = zzbeVar2.f355535c;
                if (zzazVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzazVar2.i());
                }
            }
            bundle.putLong("triggered_timestamp", zzaeVar.f355523d.f355556d);
            bundle.putLong("time_to_live", zzaeVar.f355530k);
            zzbe zzbeVar3 = zzaeVar.f355531l;
            if (zzbeVar3 != null) {
                bundle.putString("expired_event_name", zzbeVar3.f355534b);
                zzaz zzazVar3 = zzbeVar3.f355535c;
                if (zzazVar3 != null) {
                    bundle.putBundle("expired_event_params", zzazVar3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean c0(int i12, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i12);
        return true;
    }

    public static boolean h0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean j0(String str) {
        String strA = E.f354608a0.a(null);
        return strA.equals("*") || Arrays.asList(strA.split(",")).contains(str);
    }

    public static long m(zzaz zzazVar) {
        long length = 0;
        if (zzazVar == null) {
            return 0L;
        }
        B b12 = new B(zzazVar);
        while (b12.f354532b.hasNext()) {
            if (zzazVar.f355533b.get((String) b12.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    public static boolean m0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    @j.k0
    public static long n(byte[] bArr) {
        C36729v.j(bArr);
        int i12 = 0;
        C36729v.m(bArr.length > 0);
        long j12 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j12 += (bArr[length] & 255) << i12;
            i12 += 8;
        }
        return j12;
    }

    public static boolean o0(String str) {
        C36729v.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static int q0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    public static Bundle r(List<zznb> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zznb zznbVar : list) {
            String str = zznbVar.f355558f;
            String str2 = zznbVar.f355555c;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l12 = zznbVar.f355557e;
                if (l12 != null) {
                    bundle.putLong(str2, l12.longValue());
                } else {
                    Double d12 = zznbVar.f355560h;
                    if (d12 != null) {
                        bundle.putDouble(str2, d12.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest t0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i12 = 0; i12 < 2; i12++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static String u(int i12, String str, boolean z12) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i12) {
            return str;
        }
        if (z12) {
            return androidx.appcompat.app.r.q(str.substring(0, str.offsetByCodePoints(0, i12)), "...");
        }
        return null;
    }

    public static void w(Bundle bundle, int i12, String str, Object obj) {
        if (c0(i12, bundle)) {
            bundle.putString("_ev", u(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public final void A(zzcv zzcvVar, long j12) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j12);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning long value to wrapper", e12);
        }
    }

    public final void B(zzcv zzcvVar, Bundle bundle) {
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning bundle value to wrapper", e12);
        }
    }

    public final void C(zzcv zzcvVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning bundle list to wrapper", e12);
        }
    }

    public final void D(zzcv zzcvVar, boolean z12) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z12);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning boolean value to wrapper", e12);
        }
    }

    public final void E(zzcv zzcvVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning byte array to wrapper", e12);
        }
    }

    public final void F(W1 w12, int i12) {
        Iterator it = new TreeSet(w12.f354965d.keySet()).iterator();
        int i13 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (o0(str) && (i13 = i13 + 1) > i12) {
                String strE = androidx.camera.camera2.internal.G.e(i12, "Event can't contain more than ", " params");
                S1 s1Zzj = super.zzj();
                I2 i22 = this.f355183a;
                String strC = i22.f354721m.c(w12.f354962a);
                Bundle bundle = w12.f354965d;
                s1Zzj.f354891h.a(strC, strE, i22.f354721m.a(bundle));
                c0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void I(String str, Bundle bundle, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            super.zzj().f354894k.a(this.f355183a.f354721m.f(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public final void J(String str, zzcv zzcvVar) {
        try {
            zzcvVar.zza(com.avito.android.actions_sheet.a.m("r", str));
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning string value to wrapper", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.K(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void L(Parcelable[] parcelableArr, int i12, boolean z12) {
        C36729v.j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i13 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (o0(str) && !U(str, C36926m3.f355267d) && (i13 = i13 + 1) > i12) {
                    I2 i22 = this.f355183a;
                    if (z12) {
                        super.zzj().f354891h.a(i22.f354721m.f(str), androidx.camera.camera2.internal.G.e(i12, "Param can't contain more than ", " item-scoped custom parameters"), i22.f354721m.a(bundle));
                        c0(28, bundle);
                    } else {
                        super.zzj().f354891h.a(i22.f354721m.f(str), "Param cannot contain item-scoped custom parameters", i22.f354721m.a(bundle));
                        c0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean M(int i12, String str, String str2) {
        if (str2 == null) {
            super.zzj().f354891h.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i12) {
            return true;
        }
        S1 s1Zzj = super.zzj();
        s1Zzj.f354891h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i12), str2);
        return false;
    }

    @SuppressLint({"ApplySharedPref"})
    public final boolean Q(String str, double d12) {
        try {
            SharedPreferences.Editor editorEdit = this.f355183a.f354709a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString(Constants.DEEPLINK, str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d12));
            return editorEdit.commit();
        } catch (RuntimeException e12) {
            super.zzj().f354889f.c("Failed to persist Deferred Deep Link. exception", e12);
            return false;
        }
    }

    public final boolean R(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        I2 i22 = this.f355183a;
        if (!zIsEmpty) {
            C36729v.j(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(i22.f354710b)) {
                S1 s1Zzj = super.zzj();
                s1Zzj.f354891h.c("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", S1.i(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(i22.f354710b)) {
                super.zzj().f354891h.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        C36729v.j(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        S1 s1Zzj2 = super.zzj();
        s1Zzj2.f354891h.c("Invalid admob_app_id. Analytics disabled.", S1.i(str2));
        return false;
    }

    public final boolean S(String str, String str2, int i12, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i12) {
                S1 s1Zzj = super.zzj();
                s1Zzj.f354894k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean V(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            super.zzj().f354891h.c("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f354817i;
        for (int i12 = 0; i12 < 3; i12++) {
            if (str2.startsWith(strArr3[i12])) {
                super.zzj().f354891h.a(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !U(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && U(str2, strArr2)) {
            return true;
        }
        super.zzj().f354891h.a(str, "Name is reserved. Type, name", str2);
        return false;
    }

    public final boolean X(int i12) {
        Boolean bool = this.f355183a.n().f355425e;
        if (l0() < i12 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    @j.l0
    public final void Y() {
        super.e();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                super.zzj().f354892i.b("Utils falling back to Random for random id");
            }
        }
        this.f354820d.set(jNextLong);
    }

    public final int Z(String str) {
        if (!e0("user property", str)) {
            return 6;
        }
        if (V("user property", C36919l3.f355256a, null, str)) {
            return !M(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object a0(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        I2 i22 = this.f355183a;
        if (zEquals) {
            return t(Math.max(i22.f354715g.g(null, false), 256), obj, true, true);
        }
        return t(m0(str) ? Math.max(i22.f354715g.g(null, false), 256) : i22.f354715g.g(null, false), obj, false, true);
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @j.k0
    public final boolean d0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = aY0.c.a(context).b(str, 64);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e12) {
            super.zzj().f354889f.c("Package name not found", e12);
            return true;
        } catch (CertificateException e13) {
            super.zzj().f354889f.c("Error obtaining certificate", e13);
            return true;
        }
    }

    public final boolean e0(String str, String str2) {
        if (str2 == null) {
            super.zzj().f354891h.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            super.zzj().f354891h.c("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            super.zzj().f354891h.a(str, "Name must start with a letter or _ (underscore). Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                super.zzj().f354891h.a(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @j.l0
    public final long f0(String str) {
        I2 i22 = this.f355183a;
        if (i22.f354709a.getPackageManager() == null) {
            return 0L;
        }
        int i12 = 0;
        try {
            ApplicationInfo applicationInfoA = aY0.c.a(i22.f354709a).a(0, str);
            if (applicationInfoA != null) {
                i12 = applicationInfoA.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            super.zzj().f354895l.c("PackageManager failed to find running app: app_id", str);
        }
        return i12;
    }

    public final Object g0(Object obj, String str) {
        return "_ldl".equals(str) ? t(q0(str), obj, true, false) : t(q0(str), obj, false, false);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36884g3
    public final boolean h() {
        return true;
    }

    public final int i(Object obj, String str) {
        return "_ldl".equals(str) ? S("user property referrer", str, q0(str), obj) : S("user property", str, q0(str), obj) ? 0 : 7;
    }

    public final boolean i0(String str, String str2) {
        if (str2 == null) {
            super.zzj().f354891h.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            super.zzj().f354891h.c("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            super.zzj().f354891h.a(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                super.zzj().f354891h.a(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final int j(String str) {
        if (!e0("event", str)) {
            return 2;
        }
        if (V("event", C36912k3.f355240a, C36912k3.f355241b, str)) {
            return !M(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.k(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @j.l0
    public final boolean k0(String str) {
        super.e();
        if (aY0.c.a(this.f355183a.f354709a).f20921a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        super.zzj().f354896m.c("Permission not granted", str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:19:0x006d). Please report as a decompilation issue!!! */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            super.e()
            com.google.android.gms.common.internal.C36729v.j(r7)
            com.google.android.gms.common.internal.C36729v.f(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = t0()
            r2 = -1
            if (r1 != 0) goto L21
            com.google.android.gms.measurement.internal.S1 r7 = super.zzj()
            java.lang.String r8 = "Could not get MD5 instance"
            com.google.android.gms.measurement.internal.U1 r7 = r7.f354889f
            r7.b(r8)
            goto L6e
        L21:
            r4 = 0
            if (r0 == 0) goto L6d
            boolean r8 = r6.d0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r8 != 0) goto L6d
            aY0.b r7 = aY0.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            com.google.android.gms.measurement.internal.I2 r8 = r6.f355183a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.content.Context r8 = r8.f354709a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.b(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r7 == 0) goto L56
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r8 <= 0) goto L56
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            long r2 = n(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            goto L6e
        L54:
            r7 = move-exception
            goto L62
        L56:
            com.google.android.gms.measurement.internal.S1 r7 = super.zzj()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            com.google.android.gms.measurement.internal.U1 r7 = r7.f354892i     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            java.lang.String r8 = "Could not get signatures"
            r7.b(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54
            goto L6e
        L62:
            com.google.android.gms.measurement.internal.S1 r8 = super.zzj()
            java.lang.String r0 = "Package name not found"
            com.google.android.gms.measurement.internal.U1 r8 = r8.f354889f
            r8.c(r0, r7)
        L6d:
            r2 = r4
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.l(android.content.Context, java.lang.String):long");
    }

    @InterfaceC49173d
    public final int l0() {
        if (this.f354824h == null) {
            C36688g c36688g = C36688g.f349289b;
            Context context = this.f355183a.f354709a;
            c36688g.getClass();
            this.f354824h = Integer.valueOf(C36688g.a(context) / 1000);
        }
        return this.f354824h.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[RETURN] */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n0() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.n0():long");
    }

    public final Bundle o(Uri uri, boolean z12, boolean z13) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z13 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = z12 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z13 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && (!z12 || TextUtils.isEmpty(queryParameter9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(SearchParamsConverterKt.SOURCE, queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z13 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("term", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("content", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("aclid", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("cp1", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("anid", queryParameter14);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter15 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("source_platform", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("creative_format", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("marketing_tactic", queryParameter17);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (z12 && !TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e12) {
            super.zzj().f354892i.c("Install referrer url isn't a hierarchical URI", e12);
            return null;
        }
    }

    public final Bundle p(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objA0 = a0(bundle.get(str), str);
                if (objA0 == null) {
                    S1 s1Zzj = super.zzj();
                    s1Zzj.f354894k.c("Param value can't be null", this.f355183a.f354721m.f(str));
                } else {
                    I(str, bundle2, objA0);
                }
            }
        }
        return bundle2;
    }

    public final boolean p0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = this.f355183a.f354709a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle q(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.q(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final long r0() {
        long andIncrement;
        long j12;
        if (this.f354820d.get() != 0) {
            synchronized (this.f354820d) {
                this.f354820d.compareAndSet(-1L, 1L);
                andIncrement = this.f354820d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f354820d) {
            long jNanoTime = System.nanoTime();
            this.f355183a.f354722n.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i12 = this.f354821e + 1;
            this.f354821e = i12;
            j12 = jNextLong + i12;
        }
        return j12;
    }

    public final zzbe s(String str, Bundle bundle, String str2, long j12, boolean z12) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (j(str) != 0) {
            super.zzj().f354889f.c("Invalid conditional property event name", this.f355183a.f354721m.g(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleQ = q(str, bundle2, Collections.singletonList("_o"), true);
        if (z12) {
            bundleQ = p(bundleQ);
        }
        C36729v.j(bundleQ);
        return new zzbe(str, new zzaz(bundleQ), str2, j12);
    }

    public final String s0() {
        byte[] bArr = new byte[16];
        u0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object t(int i12, Object obj, boolean z12, boolean z13) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return u(i12, String.valueOf(obj), z12);
        }
        if (!z13 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleP = p((Bundle) parcelable);
                if (!bundleP.isEmpty()) {
                    arrayList.add(bundleP);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    @InterfaceC49173d
    @j.l0
    public final SecureRandom u0() {
        super.e();
        if (this.f354819c == null) {
            this.f354819c = new SecureRandom();
        }
        return this.f354819c;
    }

    public final URL v(long j12, String str, String str2, String str3) {
        try {
            C36729v.f(str2);
            C36729v.f(str);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v84002." + l0()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j12;
            if (str.equals(this.f355183a.f354715g.h("debug.deferred.deeplink"))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat(ContainerUtils.FIELD_DELIMITER);
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e12) {
            e = e12;
            super.zzj().f354889f.c("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e13) {
            e = e13;
            super.zzj().f354889f.c("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @j.l0
    public final boolean v0() {
        super.e();
        return n0() == 1;
    }

    @j.l0
    public final void x(Bundle bundle, long j12) {
        long j13 = bundle.getLong("_et");
        if (j13 != 0) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354892i.c("Params already contained engagement", Long.valueOf(j13));
        }
        bundle.putLong("_et", j12 + j13);
    }

    public final void y(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                super.c().I(str, bundle, bundle2.get(str));
            }
        }
    }

    public final void z(zzcv zzcvVar, int i12) {
        try {
            zzcvVar.zza(AK.c.e(i12, "r"));
        } catch (RemoteException e12) {
            S1 s12 = this.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning int value to wrapper", e12);
        }
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
