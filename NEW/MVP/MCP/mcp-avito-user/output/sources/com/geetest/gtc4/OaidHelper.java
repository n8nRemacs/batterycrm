package com.geetest.gtc4;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.security.MessageDigest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class OaidHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final e f342818a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f342819b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f342820c = false;

    /* renamed from: d, reason: collision with root package name */
    public static PackageManager f342821d;

    public static class a extends j {
        public a() {
            super("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService", "com.asus.msa.action.ACCESS_DID", "com.asus.msa.SupplementaryDID.IDidAidlInterface");
        }

        @Override // com.geetest.gtc4.OaidHelper.j
        public final int a() {
            return 2;
        }
    }

    public static class b extends j {
        public b() {
            super("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService", null, "com.coolpad.deviceidsupport.IDeviceIdManager");
        }

        @Override // com.geetest.gtc4.OaidHelper.j
        public final int a() {
            return 2;
        }
    }

    public static class c extends j {
        public c() {
            super("com.huawei.hwid", null, "com.uodis.opendevice.OPENIDS_SERVICE", "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }
    }

    public static class d implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public final IBinder f342822a;

        /* renamed from: b, reason: collision with root package name */
        public final String f342823b;

        public d(IBinder iBinder, String str) {
            this.f342822a = iBinder;
            this.f342823b = str;
        }

        public final String a(String str, String str2, String str3, int i12) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken(this.f342823b);
                    if (!TextUtils.isEmpty(str)) {
                        parcelObtain.writeString(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        parcelObtain.writeString(str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        parcelObtain.writeString(str3);
                    }
                    this.f342822a.transact(i12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception unused) {
                    return "";
                }
            } catch (Throwable unused2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return "";
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f342822a;
        }
    }

    public interface e {
        boolean a(Context context);

        String b(Context context);

        boolean c(Context context);
    }

    public static class f extends j {
        public f() {
            super("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService", null, "com.zui.deviceidservice.IDeviceidInterface");
        }
    }

    public static class g extends h {
        public g() {
            super("com.meizu.flyme.openidsdk", "");
        }

        @Override // com.geetest.gtc4.OaidHelper.h, com.geetest.gtc4.OaidHelper.e
        public final boolean a(Context context) {
            if (super.a(context)) {
                h.f342825f = true;
            } else {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{AttachMenuItem.Support.KEY}, null);
                    if (cursorQuery == null) {
                        return false;
                    }
                    cursorQuery.moveToFirst();
                    int columnIndex = cursorQuery.getColumnIndex("value");
                    if (columnIndex >= 0) {
                        String string = cursorQuery.getString(columnIndex);
                        if (TextUtils.isEmpty(string)) {
                            return false;
                        }
                        h.f342825f = "0".equals(string);
                    } else {
                        h.f342825f = false;
                    }
                } catch (Throwable unused) {
                    h.f342825f = false;
                    return false;
                }
            }
            this.f342829d = true;
            return h.f342825f;
        }

        @Override // com.geetest.gtc4.OaidHelper.h, com.geetest.gtc4.OaidHelper.e
        public final String b(Context context) {
            this.f342828c = new String[]{"oaid"};
            return super.b(context);
        }
    }

    public static class h implements e {

        /* renamed from: e, reason: collision with root package name */
        public static String f342824e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f342825f = false;

        /* renamed from: a, reason: collision with root package name */
        public final String f342826a;

        /* renamed from: b, reason: collision with root package name */
        public final String f342827b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f342828c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f342829d = false;

        public h(String str, String str2) {
            this.f342826a = str;
            this.f342827b = str2;
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public boolean a(Context context) {
            if (this.f342829d) {
                return f342825f;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager packageManager = OaidHelper.getPackageManager(context);
                f342825f = (packageManager == null || packageManager.resolveContentProvider(this.f342826a, 0) == null) ? false : true;
            } catch (Throwable unused) {
                f342825f = false;
            }
            this.f342829d = true;
            return f342825f;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[DONT_GENERATE, PHI: r8
  0x004d: PHI (r8v4 android.database.Cursor) = (r8v3 android.database.Cursor), (r8v5 android.database.Cursor) binds: [B:12:0x004b, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.geetest.gtc4.OaidHelper.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b(android.content.Context r8) {
            /*
                r7 = this;
                java.lang.String r0 = com.geetest.gtc4.OaidHelper.h.f342824e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L58
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "content://"
                r0.<init>(r1)
                java.lang.String r1 = r7.f342826a
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r1 = r7.f342827b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.net.Uri r2 = android.net.Uri.parse(r0)
                r0 = 0
                android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L48
                java.lang.String[] r5 = r7.f342828c     // Catch: java.lang.Throwable -> L48
                r6 = 0
                r3 = 0
                r4 = 0
                android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L48
                if (r8 == 0) goto L45
                r8.moveToFirst()     // Catch: java.lang.Throwable -> L49
                java.lang.String r1 = "value"
                int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L49
                java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L49
                com.geetest.gtc4.OaidHelper.h.f342824e = r1     // Catch: java.lang.Throwable -> L49
            L45:
                if (r8 == 0) goto L58
                goto L4d
            L48:
                r8 = r0
            L49:
                com.geetest.gtc4.OaidHelper.h.f342824e = r0     // Catch: java.lang.Throwable -> L51
                if (r8 == 0) goto L58
            L4d:
                r8.close()
                goto L58
            L51:
                r0 = move-exception
                if (r8 == 0) goto L57
                r8.close()
            L57:
                throw r0
            L58:
                java.lang.String r8 = com.geetest.gtc4.OaidHelper.h.f342824e
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.geetest.gtc4.OaidHelper.h.b(android.content.Context):java.lang.String");
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public final boolean c(Context context) {
            return true;
        }
    }

    public static class i implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public d f342830a;

        /* renamed from: b, reason: collision with root package name */
        public final String f342831b;

        /* renamed from: c, reason: collision with root package name */
        public final CountDownLatch f342832c;

        /* renamed from: d, reason: collision with root package name */
        public IBinder f342833d;

        public i(String str, CountDownLatch countDownLatch) {
            this.f342831b = str;
            this.f342832c = countDownLatch;
        }

        public final boolean a(Context context, Intent intent) {
            d dVar;
            if (this.f342830a != null) {
                return true;
            }
            try {
                boolean zBindService = context.bindService(intent, this, 1);
                this.f342832c.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = this.f342833d;
                String str = this.f342831b;
                if (iBinder == null) {
                    dVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(str);
                    dVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, str);
                }
                this.f342830a = dVar;
                return zBindService;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f342833d = iBinder;
                this.f342832c.countDown();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f342830a = null;
            this.f342833d = null;
        }
    }

    public static class j implements e {

        /* renamed from: f, reason: collision with root package name */
        public static String f342834f = null;

        /* renamed from: g, reason: collision with root package name */
        public static boolean f342835g = false;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f342836h = false;

        /* renamed from: i, reason: collision with root package name */
        public static final CountDownLatch f342837i = new CountDownLatch(1);

        /* renamed from: a, reason: collision with root package name */
        public final String f342838a;

        /* renamed from: b, reason: collision with root package name */
        public final String f342839b;

        /* renamed from: c, reason: collision with root package name */
        public final String f342840c;

        /* renamed from: d, reason: collision with root package name */
        public final String f342841d;

        /* renamed from: e, reason: collision with root package name */
        public i f342842e;

        public j(String str, String str2, String str3, String str4) {
            this.f342838a = str;
            this.f342839b = str2;
            this.f342840c = str3;
            this.f342841d = str4;
        }

        public int a() {
            return 1;
        }

        public String b() {
            return null;
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public boolean c(Context context) {
            if (context == null || TextUtils.isEmpty(this.f342838a)) {
                return false;
            }
            if (this.f342842e == null) {
                this.f342842e = new i(this.f342841d, f342837i);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(this.f342839b)) {
                intent.setPackage(this.f342838a);
            } else {
                intent.setComponent(new ComponentName(this.f342838a, this.f342839b));
            }
            if (!TextUtils.isEmpty(this.f342840c)) {
                intent.setAction(this.f342840c);
            }
            return this.f342842e.a(context, intent);
        }

        public String d(Context context) {
            return null;
        }

        public String e(Context context) {
            return null;
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public boolean a(Context context) {
            if (f342836h) {
                return f342835g;
            }
            boolean z12 = false;
            if (context == null || TextUtils.isEmpty(this.f342838a)) {
                f342835g = false;
            } else {
                try {
                    PackageInfo packageInfo = OaidHelper.getPackageManager(context).getPackageInfo(this.f342838a, 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (packageInfo != null) {
                            if (packageInfo.getLongVersionCode() >= 1) {
                                return true;
                            }
                        }
                        return false;
                    }
                    if (packageInfo != null && packageInfo.versionCode > 0) {
                        z12 = true;
                    }
                    f342835g = z12;
                } catch (Throwable unused) {
                    return false;
                }
            }
            f342836h = true;
            return f342835g;
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public String b(Context context) {
            i iVar;
            d dVar;
            i iVar2;
            if (!TextUtils.isEmpty(f342834f) || (iVar = this.f342842e) == null || (dVar = iVar.f342830a) == null) {
                return f342834f;
            }
            try {
                String strA = dVar.a(d(context), e(context), b(), a());
                f342834f = strA;
                if (!TextUtils.isEmpty(strA) && (iVar2 = this.f342842e) != null) {
                    context.unbindService(iVar2);
                }
            } catch (Throwable unused) {
            }
            return f342834f;
        }
    }

    public static class k extends j {

        /* renamed from: j, reason: collision with root package name */
        public String f342843j;

        /* renamed from: k, reason: collision with root package name */
        public String f342844k;

        public k() {
            super("com.heytap.openid", "com.heytap.openid.IdentifyService", "action.com.heytap.openid.OPEN_ID_SERVICE", "com.heytap.openid.IOpenID");
        }

        @Override // com.geetest.gtc4.OaidHelper.j
        public final String b() {
            return "OUID";
        }

        @Override // com.geetest.gtc4.OaidHelper.j
        public final String d(Context context) {
            if (TextUtils.isEmpty(this.f342844k)) {
                this.f342844k = context.getPackageName();
            }
            return this.f342844k;
        }

        @Override // com.geetest.gtc4.OaidHelper.j
        @SuppressLint({"PackageManagerGetSignatures"})
        public final String e(Context context) {
            if (TextUtils.isEmpty(this.f342843j)) {
                try {
                    if (TextUtils.isEmpty(this.f342844k)) {
                        this.f342844k = context.getPackageName();
                    }
                    this.f342844k = this.f342844k;
                    Signature[] signatureArr = OaidHelper.getPackageManager(context).getPackageInfo(this.f342844k, 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b12 : bArrDigest) {
                            sb2.append(Integer.toHexString((b12 & 255) | 256).substring(1, 3));
                        }
                        this.f342843j = sb2.toString();
                    }
                } catch (Throwable unused) {
                }
            }
            return this.f342843j;
        }
    }

    public static class l extends j {
        public l() {
            super("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService", null, "com.samsung.android.deviceidservice.IDeviceIdService");
        }
    }

    public static class m extends h {
        public m() {
            super("com.vivo.vms.IdProvider", "IdentifierId/OAID");
        }
    }

    public static class n implements e {

        /* renamed from: b, reason: collision with root package name */
        public static String f342845b;

        /* renamed from: a, reason: collision with root package name */
        public Class f342846a = null;

        @Override // com.geetest.gtc4.OaidHelper.e
        @SuppressLint({"PrivateApi"})
        public final boolean a(Context context) {
            try {
                this.f342846a = Class.forName("com.android.id.impl.IdProviderImpl");
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public final String b(Context context) {
            if (TextUtils.isEmpty(f342845b)) {
                try {
                    f342845b = String.valueOf(this.f342846a.getMethod("getOAID", Context.class).invoke(this.f342846a.newInstance(), context));
                } catch (Throwable unused) {
                    f342845b = null;
                }
            }
            return f342845b;
        }

        @Override // com.geetest.gtc4.OaidHelper.e
        public final boolean c(Context context) {
            return true;
        }
    }

    static {
        e fVar;
        String upperCase = Build.MANUFACTURER.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "LENOVO":
            case "ZUI":
                fVar = new f();
                break;
            case "SAMSUNG":
                fVar = new l();
                break;
            case "XIAOMI":
            case "BLACKSHARK":
            case "REDMI":
                fVar = new n();
                break;
            case "ONEPLUS":
            case "OPPO":
                fVar = new k();
                break;
            case "ASUS":
                fVar = new a();
                break;
            case "IQOO":
            case "VIVO":
                fVar = new m();
                break;
            case "HONOR":
            case "HUA_WEI":
            case "HUAWEI":
                fVar = new c();
                break;
            case "MEIZU":
                fVar = new g();
                break;
            case "COOLPAD":
                fVar = new b();
                break;
            default:
                fVar = null;
                break;
        }
        f342818a = fVar;
    }

    private OaidHelper() {
    }

    public static String getOaid(Context context) {
        isSupport(context);
        if (f342820c) {
            return getOaid();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PackageManager getPackageManager(Context context) {
        if (f342821d == null) {
            f342821d = context.getPackageManager();
        }
        return f342821d;
    }

    private static void isSupport(Context context) {
        e eVar = f342818a;
        if (eVar == null || context == null) {
            return;
        }
        f342819b = context.getApplicationContext();
        if (isSupportService()) {
            f342820c = eVar.c(f342819b);
        }
    }

    private static boolean isSupportService() {
        e eVar;
        try {
            Context context = f342819b;
            if (context == null || (eVar = f342818a) == null) {
                return false;
            }
            return eVar.a(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String getOaid() {
        e eVar;
        try {
            Context context = f342819b;
            if (context == null || (eVar = f342818a) == null || !f342820c) {
                return null;
            }
            return eVar.b(context);
        } catch (Throwable unused) {
            return null;
        }
    }
}
