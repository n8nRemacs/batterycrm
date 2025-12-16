package dY0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C36689h;
import com.google.android.gms.common.C36690i;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @j.P
    public static Context f393906a;

    /* renamed from: b, reason: collision with root package name */
    public static r0 f393907b;

    public static r0 a(Context context) throws GooglePlayServicesNotAvailableException, PackageManager.NameNotFoundException {
        r0 s0Var;
        C36729v.j(context);
        r0 r0Var = f393907b;
        if (r0Var != null) {
            return r0Var;
        }
        int i12 = C36689h.f349290e;
        int iB2 = C36690i.b(13400000, context);
        if (iB2 != 0) {
            throw new GooglePlayServicesNotAvailableException(iB2);
        }
        ClassLoader classLoader = c(context).getClassLoader();
        try {
            C36729v.j(classLoader);
            IBinder iBinder = (IBinder) b(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                s0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                s0Var = iInterfaceQueryLocalInterface instanceof r0 ? (r0) iInterfaceQueryLocalInterface : new s0(iBinder, "com.google.android.gms.maps.internal.ICreator");
            }
            f393907b = s0Var;
            try {
                s0Var.R2(new com.google.android.gms.dynamic.f(c(context).getResources()));
                return f393907b;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    public static <T> T b(Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }

    @j.P
    public static Context c(Context context) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        Context context2 = f393906a;
        if (context2 != null) {
            return context2;
        }
        try {
            contextCreatePackageContext = DynamiteModule.c(context, DynamiteModule.f349661b, "com.google.android.gms.maps_dynamite").f349675a;
        } catch (Exception unused) {
            int i12 = C36689h.f349290e;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused2) {
                contextCreatePackageContext = null;
            }
        }
        f393906a = contextCreatePackageContext;
        return contextCreatePackageContext;
    }
}
