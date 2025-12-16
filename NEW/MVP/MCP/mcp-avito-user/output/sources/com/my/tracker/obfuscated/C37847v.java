package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37847v {

    /* renamed from: b, reason: collision with root package name */
    public static int f365831b = 5;

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f365832a = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }

    public void c(a1 a1Var, Context context) {
        if (this.f365832a) {
            a(a1Var, context);
            b(a1Var, context);
        }
    }

    public void a(Context context) {
    }

    public void b(Context context) {
    }

    public static void a(a1 a1Var, Context context) {
        List<CellInfo> allCellInfo;
        if (Build.VERSION.SDK_INT < 29) {
            if (!w0.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                e2.a("EnvironmentParamsDataProvider: can't access information");
                return;
            }
        } else if (!w0.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            e2.a("EnvironmentParamsDataProvider: can't access information");
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null && !allCellInfo.isEmpty()) {
                boolean z12 = true;
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoCdma) {
                            a(a1Var, (CellInfoCdma) cellInfo);
                        } else if (cellInfo instanceof CellInfoGsm) {
                            a(a1Var, (CellInfoGsm) cellInfo);
                        } else if (cellInfo instanceof CellInfoLte) {
                            a(a1Var, (CellInfoLte) cellInfo);
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            a(a1Var, (CellInfoWcdma) cellInfo);
                        } else {
                            int i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 29 && com.huawei.hms.framework.common.a.u(cellInfo)) {
                                a(a1Var, com.huawei.hms.framework.common.a.k(cellInfo));
                            } else if (i12 >= 29 && com.huawei.hms.framework.common.a.A(cellInfo)) {
                                a(a1Var, com.huawei.hms.framework.common.a.j(cellInfo));
                            }
                        }
                        z12 = false;
                    }
                }
                if (z12) {
                    a(a1Var, telephonyManager);
                }
            }
        } catch (Throwable th2) {
            e2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th2);
        }
    }

    public static void b(a1 a1Var, Context context) {
        List<ScanResult> scanResults;
        if (w0.a("android.permission.ACCESS_WIFI_STATE", context)) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        a1Var.a(connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                    }
                    if ((w0.a("android.permission.ACCESS_FINE_LOCATION", context) || w0.a("android.permission.ACCESS_COARSE_LOCATION", context)) && (scanResults = wifiManager.getScanResults()) != null && !scanResults.isEmpty()) {
                        Collections.sort(scanResults, new androidx.camera.core.impl.r0(7));
                        int iMin = Math.min(scanResults.size(), f365831b);
                        for (int i12 = 0; i12 < iMin; i12++) {
                            ScanResult scanResult = scanResults.get(i12);
                            a1Var.a(scanResult.SSID, scanResult.BSSID, scanResult.level);
                        }
                    }
                }
            } catch (Throwable th2) {
                e2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th2);
            }
        }
    }

    public static void a(a1 a1Var, CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        a1Var.a(cellIdentity.getNetworkId(), cellIdentity.getSystemId(), cellIdentity.getBasestationId(), cellIdentity.getLatitude(), cellIdentity.getLongitude(), cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    public static void a(a1 a1Var, CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i12 = Build.VERSION.SDK_INT;
        a1Var.a(i12 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i12 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());
    }

    public static void a(a1 a1Var, CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i12 = Build.VERSION.SDK_INT;
        a1Var.b(i12 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i12 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());
    }

    public static void a(a1 a1Var, CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNrH = com.huawei.hms.framework.common.a.h(cellInfoNr.getCellIdentity());
        CellSignalStrengthNr cellSignalStrengthNrM = com.huawei.hms.framework.common.a.m(cellInfoNr.getCellSignalStrength());
        a1Var.a(cellIdentityNrH.getMccString(), cellIdentityNrH.getMncString(), cellIdentityNrH.getNci(), cellIdentityNrH.getTac(), cellIdentityNrH.getNrarfcn(), cellIdentityNrH.getPci(), cellSignalStrengthNrM.getLevel(), cellSignalStrengthNrM.getDbm(), cellSignalStrengthNrM.getAsuLevel());
    }

    public static void a(a1 a1Var, CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        a1Var.a(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    public static void a(a1 a1Var, CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i12 = Build.VERSION.SDK_INT;
        a1Var.b(i12 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i12 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    public static void a(a1 a1Var, TelephonyManager telephonyManager) {
        String str;
        String str2;
        String strSubstring;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            String networkOperator = telephonyManager.getNetworkOperator();
            String strSubstring2 = null;
            if (TextUtils.isEmpty(networkOperator)) {
                str = null;
                str2 = null;
            } else {
                try {
                    strSubstring = networkOperator.substring(0, 3);
                } catch (Throwable unused) {
                    strSubstring = null;
                }
                try {
                    strSubstring2 = networkOperator.substring(3);
                } catch (Throwable unused2) {
                    e2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str = strSubstring;
                    str2 = strSubstring2;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    a1Var.a(str, str2, gsmCellLocation.getCid(), gsmCellLocation.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str = strSubstring;
                str2 = strSubstring2;
            }
            GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
            a1Var.a(str, str2, gsmCellLocation2.getCid(), gsmCellLocation2.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    public void a(boolean z12) {
        this.f365832a = z12;
    }

    public static boolean a(int i12) {
        return Integer.MAX_VALUE != i12;
    }

    public static boolean a(long j12) {
        return Long.MAX_VALUE != j12;
    }
}
