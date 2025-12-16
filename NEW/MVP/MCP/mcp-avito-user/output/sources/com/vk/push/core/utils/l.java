package com.vk.push.core.utils;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PackageExtenstions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l {
    public static final String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            byte b12 = bArr[i12];
            int i13 = i12 * 2;
            cArr[i13] = "0123456789ABCDEF".charAt((b12 & 255) >>> 4);
            cArr[i13 + 1] = "0123456789ABCDEF".charAt(b12 & 15);
        }
        return new String(cArr);
    }

    @Y61.k
    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> b(@Y61.k PackageManager packageManager) {
        Intent intent = new Intent();
        intent.setAction("com.vk.push.HOST_SERVICE");
        List<ResolveInfo> listQueryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(128)) : packageManager.queryIntentServices(intent, 128);
        ArrayList arrayList = new ArrayList(C42745f0.q(listQueryIntentServices, 10));
        Iterator<T> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return C42745f0.v(arrayList);
    }

    public static final Signature[] c(PackageInfo packageInfo) {
        Signature[] apkContentsSigners;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            apkContentsSigners = signingInfo != null ? signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory() : null;
        } else {
            apkContentsSigners = packageInfo.signatures;
        }
        return apkContentsSigners == null ? new Signature[0] : apkContentsSigners;
    }
}
