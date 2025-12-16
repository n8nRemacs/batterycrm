package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.C36690i;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.W;
import j.N;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public abstract class RemoteCreator<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f349637a;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    public static class RemoteCreatorException extends Exception {
    }

    @N
    @RX0.a
    public abstract W a(@N IBinder iBinder);

    @N
    @RX0.a
    public final T b(@N Context context) throws PackageManager.NameNotFoundException, RemoteCreatorException {
        Context contextCreatePackageContext;
        if (this.f349637a == null) {
            C36729v.j(context);
            AtomicBoolean atomicBoolean = C36690i.f349291a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f349637a = a((IBinder) contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e12) {
                throw new RemoteCreatorException("Could not load creator class.", e12);
            } catch (IllegalAccessException e13) {
                throw new RemoteCreatorException("Could not access creator.", e13);
            } catch (InstantiationException e14) {
                throw new RemoteCreatorException("Could not instantiate creator.", e14);
            }
        }
        return (T) this.f349637a;
    }
}
