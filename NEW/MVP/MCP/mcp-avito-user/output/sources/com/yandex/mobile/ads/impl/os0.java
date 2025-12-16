package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public final class os0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<ScanResult> f388634a = new a();

    public class a implements Comparator<ScanResult> {
        @Override // java.util.Comparator
        public final int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult.level - scanResult2.level;
        }
    }

    @j.P
    public static String a(@j.N Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo.getType() != 0 ? activeNetworkInfo.getTypeName() : activeNetworkInfo.getSubtypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Point b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @SuppressLint({"MissingPermission"})
    public static String c(Context context) {
        WifiManager wifiManager;
        try {
            wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        } catch (Exception unused) {
        }
        if (!wifiManager.isWifiEnabled()) {
            return null;
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        Object obj = (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]);
        int i12 = 0;
        if (obj == null) {
            obj = new Object[0];
        }
        ScanResult[] scanResultArr = (ScanResult[]) obj;
        Arrays.sort(scanResultArr, Collections.reverseOrder(f388634a));
        if (scanResultArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            int iMin = Math.min(3, scanResultArr.length);
            while (i12 < iMin) {
                sb2.append(scanResultArr[i12].BSSID);
                sb2.append(",");
                sb2.append(scanResultArr[i12].level);
                i12++;
                sb2.append(i12 < iMin ? ";" : "");
            }
            return sb2.toString();
        }
        return null;
    }
}
