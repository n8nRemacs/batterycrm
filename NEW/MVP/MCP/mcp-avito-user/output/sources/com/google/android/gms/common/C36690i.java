package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.android.gms.common.internal.InterfaceC36733z;
import j.k0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@InterfaceC36733z
/* renamed from: com.google.android.gms.common.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36690i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f349292b = false;

    /* renamed from: c, reason: collision with root package name */
    @k0
    public static boolean f349293c = false;

    /* renamed from: a, reason: collision with root package name */
    @RX0.a
    @Deprecated
    public static final AtomicBoolean f349291a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f349294d = new AtomicBoolean();

    @RX0.a
    public C36690i() {
    }

    @RX0.a
    @InterfaceC36733z
    public static boolean a(@j.N Context context) {
        if (!f349293c) {
            try {
                PackageInfo packageInfoB = aY0.c.a(context).b("com.google.android.gms", 64);
                C36734j.a(context);
                if (packageInfoB == null || C36734j.d(packageInfoB, false) || !C36734j.d(packageInfoB, true)) {
                    f349292b = false;
                } else {
                    f349292b = true;
                }
                f349293c = true;
            } catch (PackageManager.NameNotFoundException unused) {
                f349293c = true;
            } catch (Throwable th2) {
                f349293c = true;
                throw th2;
            }
        }
        return f349292b || !ChannelContext.UserToUser.TYPE.equals(Build.TYPE);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    @RX0.a
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(int r9, @j.N android.content.Context r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C36690i.b(int, android.content.Context):int");
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
