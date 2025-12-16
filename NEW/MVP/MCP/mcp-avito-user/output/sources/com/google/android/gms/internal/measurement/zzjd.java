package com.google.android.gms.internal.measurement;

import androidx.appcompat.app.r;
import com.google.android.gms.internal.measurement.zzis;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzjd<T extends zzis> {
    public static zzis a() {
        String strQ;
        ClassLoader classLoader = zzjd.class.getClassLoader();
        if (zzis.class.equals(zzis.class)) {
            strQ = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!zzis.class.getPackage().equals(zzjd.class.getPackage())) {
                throw new IllegalArgumentException(zzis.class.getName());
            }
            strQ = r.q(zzis.class.getPackage().getName(), ".BlazeGeneratedzzisLoader");
        }
        try {
            try {
                try {
                    return (zzis) zzis.class.cast(((zzjd) Class.forName(strQ, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).b());
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(e13);
                }
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzjd.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzis) zzis.class.cast(((zzjd) it.next()).b()));
                } catch (ServiceConfigurationError e16) {
                    Logger.getLogger(zzio.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzis"), (Throwable) e16);
                }
            }
            if (arrayList.size() == 1) {
                return (zzis) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzis) zzis.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e17) {
                throw new IllegalStateException(e17);
            } catch (NoSuchMethodException e18) {
                throw new IllegalStateException(e18);
            } catch (InvocationTargetException e19) {
                throw new IllegalStateException(e19);
            }
        }
    }

    public abstract T b();
}
