package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.play.core.splitinstall.internal.C37214g;
import com.google.android.play.core.splitinstall.internal.s0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class L {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f358685c = new s0("SplitInstallService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f358686d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final String f358687a;

    /* renamed from: b, reason: collision with root package name */
    @j.k0
    @j.P
    public final C37214g f358688b;

    public L(Context context, String str) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f358687a = str;
        s0 s0Var = com.google.android.play.core.splitinstall.internal.U.f358739a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    com.google.android.play.core.splitinstall.internal.U.f358739a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    context = applicationContext != null ? applicationContext : context;
                    int i12 = C37241s.f358830a;
                    this.f358688b = new C37214g(context, f358685c, f358686d);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(com.google.android.play.core.splitinstall.internal.l0 l0Var) {
        Bundle bundleE = AK.c.e(11004, "playcore_version_code");
        ArrayList arrayList = new ArrayList();
        Iterator it = l0Var.f358782a.iterator();
        while (it.hasNext()) {
            com.google.android.play.core.splitinstall.internal.n0 n0Var = (com.google.android.play.core.splitinstall.internal.n0) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", n0Var.a());
            bundle.putLong("event_timestamp", n0Var.b());
            arrayList.add(bundle);
        }
        bundleE.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList));
        return bundleE;
    }
}
