package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.core.review.internal.t;
import com.google.android.play.core.review.internal.v;
import j.P;
import j.k0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:review@@2.0.1 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.review.internal.i f358615c = new com.google.android.play.core.review.internal.i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    @k0
    @P
    public final t f358616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358617b;

    public i(Context context) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f358617b = context.getPackageName();
        com.google.android.play.core.review.internal.i iVar = v.f358647a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    com.google.android.play.core.review.internal.i iVar2 = v.f358647a;
                    iVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        com.google.android.play.core.review.internal.i.b(iVar2.f358621a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                        return;
                    }
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
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Intent intent = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending");
                    int i12 = e.f358609a;
                    this.f358616a = new t(context, f358615c, intent);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
