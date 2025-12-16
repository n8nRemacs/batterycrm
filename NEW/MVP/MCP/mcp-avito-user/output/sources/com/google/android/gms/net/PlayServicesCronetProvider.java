package com.google.android.gms.net;

import I41.h;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamite.DynamiteModule;
import iY0.C41363a;
import j.N;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
@Keep
/* loaded from: classes6.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@N Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            C41363a.a(this.mContext);
        } catch (GooglePlayServicesNotAvailableException unused) {
            Log.isLoggable(TAG, 4);
        } catch (GooglePlayServicesRepairableException unused2) {
            Log.isLoggable(TAG, 4);
        }
    }

    @Override // org.chromium.net.CronetProvider
    @N
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        DynamiteModule dynamiteModule;
        try {
            C41363a.a(this.mContext);
            Throwable th2 = null;
            try {
                synchronized (C41363a.f398554b) {
                    dynamiteModule = C41363a.f398555c;
                }
                C36729v.j(dynamiteModule);
                ClassLoader classLoader = dynamiteModule.f349675a.getClassLoader();
                C36729v.j(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e12) {
                builder = null;
                th2 = e12;
            }
            if (th2 != null) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th2);
            }
            C36729v.k(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (GooglePlayServicesNotAvailableException e13) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e13);
        } catch (GooglePlayServicesRepairableException e14) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e14);
        }
    }

    public boolean equals(@h Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @N
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    @N
    @Keep
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (C41363a.f398554b) {
            str = C41363a.f398556d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        DynamiteModule dynamiteModule;
        tryToInstallCronetProvider();
        synchronized (C41363a.f398554b) {
            dynamiteModule = C41363a.f398555c;
        }
        return dynamiteModule != null;
    }
}
