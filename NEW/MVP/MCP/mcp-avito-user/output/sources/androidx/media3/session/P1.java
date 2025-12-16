package androidx.media3.session;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* compiled from: SessionToken.java */
/* loaded from: classes.dex */
public final class P1 implements InterfaceC23096j {

    /* renamed from: c, reason: collision with root package name */
    public static final String f52236c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f52237d;

    /* renamed from: b, reason: collision with root package name */
    public final a f52238b;

    /* compiled from: SessionToken.java */
    public interface a extends InterfaceC23096j {
        int c();

        @j.P
        ComponentName d();

        String e();

        boolean f();

        Bundle getExtras();

        String getPackageName();

        int getType();

        @j.P
        Object h();

        int i();
    }

    /* compiled from: SessionToken.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52236c = Integer.toString(0, 36);
        f52237d = Integer.toString(1, 36);
    }

    public P1(Application application, ComponentName componentName) {
        int i12;
        int i13;
        C23110a.e(application, "context must not be null");
        PackageManager packageManager = application.getPackageManager();
        try {
            i12 = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i12 = -1;
        }
        int i14 = i12;
        if (a(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            i13 = 2;
        } else if (a(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
            i13 = 1;
        } else {
            if (!a(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                throw new IllegalArgumentException("Failed to resolve SessionToken for " + componentName + ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.");
            }
            i13 = 101;
        }
        if (i13 == 101) {
            this.f52238b = new R1(null, i14, UpdateStatusCode.DialogButton.CONFIRM, componentName, componentName.getPackageName(), Bundle.EMPTY);
        } else {
            this.f52238b = new Q1(i14, i13, 0, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY);
        }
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i12 = 0; i12 < listQueryIntentServices.size(); i12++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i12);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof P1) {
            return this.f52238b.equals(((P1) obj).f52238b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52238b.hashCode();
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        a aVar = this.f52238b;
        boolean z12 = aVar instanceof Q1;
        String str = f52236c;
        if (z12) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(f52237d, aVar.k());
        return bundle;
    }

    public final String toString() {
        return this.f52238b.toString();
    }

    public P1(int i12, int i13, int i14, String str, InterfaceC23246o interfaceC23246o, Bundle bundle) {
        str.getClass();
        IBinder iBinderAsBinder = interfaceC23246o.asBinder();
        bundle.getClass();
        this.f52238b = new Q1(i12, 0, i13, i14, str, "", null, iBinderAsBinder, bundle);
    }

    public P1(Bundle bundle) {
        String str = f52236c;
        C23110a.a("Impl type needs to be set.", bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f52237d);
        bundle2.getClass();
        if (i12 == 0) {
            this.f52238b = (a) Q1.f52253t.fromBundle(bundle2);
        } else {
            this.f52238b = (a) R1.f52272n.fromBundle(bundle2);
        }
    }
}
