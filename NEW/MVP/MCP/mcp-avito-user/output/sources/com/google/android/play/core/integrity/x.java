package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.integrity.internal.B;
import j.P;
import j.k0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.integrity.internal.n f358590a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358591b;

    /* renamed from: c, reason: collision with root package name */
    @k0
    @P
    public final com.google.android.play.integrity.internal.z f358592c;

    public x(Context context, com.google.android.play.integrity.internal.n nVar) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f358591b = context.getPackageName();
        this.f358590a = nVar;
        com.google.android.play.integrity.internal.n nVar2 = B.f358908a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
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
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        Intent intent = y.f358593a;
                        int i12 = u.f358581a;
                        this.f358592c = new com.google.android.play.integrity.internal.z(context, nVar, intent);
                        return;
                    }
                }
                Object[] objArr = new Object[0];
                com.google.android.play.integrity.internal.n nVar3 = B.f358908a;
                nVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    com.google.android.play.integrity.internal.n.b(nVar3.f358917a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            com.google.android.play.integrity.internal.n.b(nVar.f358917a, "Phonesky is not installed.", objArr2);
        }
        this.f358592c = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(x xVar, byte[] bArr, Long l12) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", xVar.f358591b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l12 != null) {
            bundle.putLong("cloud.prj", l12.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.android.play.integrity.internal.h.b(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.google.android.play.integrity.internal.h hVar = (com.google.android.play.integrity.internal.h) it.next();
            Bundle bundleE = AK.c.e(3, "event_type");
            bundleE.putLong("event_timestamp", hVar.a());
            arrayList2.add(bundleE);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
