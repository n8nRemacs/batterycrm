package Oa1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Z;

/* loaded from: classes9.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12336a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC42726C f12337b = C42727D.c(new a());

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<K> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final K invoke() {
            Object bVar;
            String str;
            M m12 = M.this;
            try {
                int i12 = kotlin.Z.f406624c;
                PackageManager packageManager = m12.f12336a.getPackageManager();
                String packageName = m12.f12336a.getPackageName();
                str = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0)).versionName;
            } catch (Throwable th2) {
                int i13 = kotlin.Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar = new K(str);
            if (bVar instanceof Z.b) {
                bVar = null;
            }
            K k12 = (K) bVar;
            String str2 = k12 != null ? k12.f12335a : null;
            if (str2 != null) {
                return new K(str2);
            }
            return null;
        }
    }

    public M(Context context) {
        this.f12336a = context;
    }
}
