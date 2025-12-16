package iY0;

import android.content.Context;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.dynamite.DynamiteModule;
import j.N;
import j.P;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* renamed from: iY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41363a {

    /* renamed from: a, reason: collision with root package name */
    public static final C36688g f398553a = C36688g.f349289b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f398554b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    @P
    public static DynamiteModule f398555c = null;

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    public static String f398556d = "0";

    @InterfaceC36733z
    @Deprecated
    public static void a(@N Context context) {
        DynamiteModule dynamiteModule;
        Object obj = f398554b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dynamiteModule = f398555c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dynamiteModule != null) {
            return;
        }
        C36729v.k(context, "Context must not be null");
        ClassLoader classLoader = C41363a.class.getClassLoader();
        C36729v.j(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            C36688g c36688g = f398553a;
            c36688g.getClass();
            C36688g.d(context);
            try {
                DynamiteModule dynamiteModuleC = DynamiteModule.c(context, DynamiteModule.f349661b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> clsLoadClass = dynamiteModuleC.f349675a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (clsLoadClass.getClassLoader() == C41363a.class.getClassLoader()) {
                        throw new GooglePlayServicesNotAvailableException(8);
                    }
                    Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                    Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                    Integer num = (Integer) method.invoke(null, new Object[0]);
                    C36729v.j(num);
                    int iIntValue = num.intValue();
                    String str = (String) method2.invoke(null, new Object[0]);
                    C36729v.j(str);
                    f398556d = str;
                    if (apiLevel <= iIntValue) {
                        f398555c = dynamiteModuleC;
                        return;
                    }
                    if (c36688g.b(context, 2, "cr") == null) {
                        throw new GooglePlayServicesNotAvailableException(2);
                    }
                    String str2 = f398556d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb2.append("Google Play Services update is required. The API Level of the client is ");
                    sb2.append(apiLevel);
                    sb2.append(". The API Level of the implementation is ");
                    sb2.append(iIntValue);
                    sb2.append(". The Cronet implementation version is ");
                    sb2.append(str2);
                    throw new GooglePlayServicesRepairableException(2, sb2.toString());
                } catch (Exception e12) {
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e12));
                }
            } catch (DynamiteModule.LoadingException e13) {
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e13));
            }
        } catch (ClassNotFoundException e14) {
            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e14));
        }
    }
}
