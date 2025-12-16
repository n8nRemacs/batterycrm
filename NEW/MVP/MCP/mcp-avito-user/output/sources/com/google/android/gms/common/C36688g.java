package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.InterfaceC36733z;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@InterfaceC36733z
/* renamed from: com.google.android.gms.common.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36688g {

    /* renamed from: a, reason: collision with root package name */
    @RX0.a
    public static final int f349288a;

    /* renamed from: b, reason: collision with root package name */
    public static final C36688g f349289b;

    static {
        AtomicBoolean atomicBoolean = C36690i.f349291a;
        f349288a = 12451000;
        f349289b = new C36688g();
    }

    @RX0.a
    public C36688g() {
    }

    @RX0.a
    @InterfaceC36733z
    public static int a(@j.N Context context) {
        AtomicBoolean atomicBoolean = C36690i.f349291a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @RX0.a
    public static void d(@j.N Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        AtomicBoolean atomicBoolean = C36690i.f349291a;
        C36688g c36688g = f349289b;
        int iC2 = c36688g.c(11925000, context);
        if (iC2 != 0) {
            if (c36688g.b(context, iC2, "e") != null) {
                throw new GooglePlayServicesRepairableException(iC2, "Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException(iC2);
        }
    }

    @RX0.a
    @InterfaceC36733z
    @j.P
    public Intent b(@j.P Context context, int i12, @j.P String str) {
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.l.b(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f349288a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(aY0.c.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    @RX0.a
    public int c(int i12, @j.N Context context) {
        int iB2 = C36690i.b(i12, context);
        if (iB2 != 18 ? iB2 == 1 ? C36690i.c(context) : false : true) {
            return 18;
        }
        return iB2;
    }
}
