package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.huawei.android.os.BuildEx;
import com.huawei.android.telephony.ServiceStateEx;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class NetworkUtil {
    public static final int UNAVAILABLE = Integer.MAX_VALUE;

    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    public static int a(Context context) {
        TelephonyManager telephonyManager;
        ServiceState serviceState;
        if (!ReflectionUtils.checkCompatible(EmuiUtil.BUILDEX_VERSION) || context == null || (telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, "phone")) == null) {
            return 0;
        }
        try {
            if (BuildEx.VERSION.EMUI_SDK_INT < 21 || (serviceState = telephonyManager.getServiceState()) == null) {
                return 0;
            }
            return ServiceStateEx.getConfigRadioTechnology(serviceState);
        } catch (NoClassDefFoundError unused) {
            Logger.w("NetworkUtil", "NoClassDefFoundError occur in method getHwNetworkType.");
            return 0;
        } catch (NoSuchMethodError unused2) {
            Logger.w("NetworkUtil", "NoSuchMethodError occur in method getHwNetworkType.");
            return 0;
        } catch (SecurityException unused3) {
            Logger.w("NetworkUtil", "requires permission maybe missing.");
            return 0;
        }
    }

    public static int b(Context context) {
        SignalStrength signalStrengthC;
        int dbm = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getMobileSingalStrength: throwable:" + th2.getClass());
        }
        if (networkType == 3) {
            List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthCdma.class);
            if (cellSignalStrengths.size() > 0) {
                dbm = ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
            } else {
                List cellSignalStrengths2 = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.v());
                if (cellSignalStrengths2.size() > 0) {
                    dbm = com.avito.android.publish.scanner_v2.vinscanner.a.j(cellSignalStrengths2.get(0)).getDbm();
                } else {
                    List cellSignalStrengths3 = signalStrengthC.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                    if (cellSignalStrengths3.size() > 0) {
                        dbm = ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                    }
                }
            }
        } else {
            if (networkType != 4) {
                if (networkType == 5) {
                    List cellSignalStrengths4 = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
                    if (cellSignalStrengths4.size() > 0) {
                        dbm = com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths4.get(0)).getDbm();
                    }
                }
                return dbm;
            }
            List cellSignalStrengths5 = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths5.size() > 0) {
                dbm = ((CellSignalStrengthLte) cellSignalStrengths5.get(0)).getDbm();
            }
        }
        return dbm;
    }

    public static SignalStrength c(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            return ((TelephonyManager) systemService).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId()).getSignalStrength();
        }
        return null;
    }

    public static int d(int i12) {
        if (i12 == -1) {
            return -1;
        }
        if (i12 != 1) {
            return (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) ? 6 : 0;
        }
        return 1;
    }

    public static String getDnsServerIps(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        if (context != null && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                            while (it.hasNext()) {
                                linkedList.add(it.next().getHostAddress());
                            }
                        }
                    }
                }
            } catch (SecurityException e12) {
                Logger.i("NetworkUtil", "getActiveNetworkInfo failed, exception:".concat(e12.getClass().getSimpleName()));
            } catch (RuntimeException e13) {
                Logger.i("NetworkUtil", "getActiveNetworkInfo failed, exception:".concat(e13.getClass().getSimpleName()));
            }
        }
        return Arrays.toString(linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]));
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException e12) {
            Logger.w("NetworkUtil", e12.getClass().getSimpleName());
            return "";
        }
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return Integer.MAX_VALUE;
            }
            final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, new Class[0]);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                @Override // java.security.PrivilegedAction
                public Object run() throws SecurityException {
                    declaredMethod.setAccessible(true);
                    return null;
                }
            });
            return ((Integer) declaredMethod.invoke(signalStrength, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            Logger.i("NetworkUtil", str + " : cannot access");
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            Logger.i("NetworkUtil", str + " : function not found");
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            Logger.i("NetworkUtil", str + " : InvocationTargetException");
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            StringBuilder sbZ = r.z(str, " : throwable:");
            sbZ.append(th2.getClass());
            Logger.i("NetworkUtil", sbZ.toString());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteCqi: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrengthC, "getLteCqi");
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrp(Context context) {
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteRsrp: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrengthC, "getLteRsrp");
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrq(Context context) {
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteRsrq: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrengthC, "getLteRsrq");
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssi(Context context) {
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                }
            }
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteRssi: throwable:" + th2.getClass());
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteRssnr: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrengthC, "getLteRssnr");
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        HashMap map = new HashMap();
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return map;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    map.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    map.put(SignalType.LTE_RSRP, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp()));
                    map.put(SignalType.LTE_RSRQ, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq()));
                    map.put(SignalType.LTE_RSSNR, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr()));
                    map.put(SignalType.LTE_CQI, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi()));
                    map.put(SignalType.LTE_RSSI, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi()));
                }
            } else {
                map.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(signalStrengthC, "getDbm")));
                map.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(signalStrengthC, "getLteRsrp")));
                map.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(signalStrengthC, "getLteRsrq")));
                map.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(signalStrengthC, "getLteRssnr")));
                map.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(signalStrengthC, "getLteCqi")));
            }
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteRssi: throwable:" + th2.getClass());
        }
        return map;
    }

    public static String getMNC(Context context) {
        if (context == null || !isSimReady(context)) {
            return "unknown";
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            Logger.e("NetworkUtil", "getSubscriptionOperatorType: other error!");
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : PluralsKeys.OTHER;
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Build.VERSION.SDK_INT > 28 ? b(context) : getInfoWithReflect(signalStrengthC, "getDbm");
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getDbm: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            Logger.v("NetworkUtil", "phoneId " + default4GSlotId);
            boolean zIsNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.v("NetworkUtil", "isNsa " + zIsNsaState);
            return zIsNsaState ? "5G_NSA" : "5G_SA";
        } catch (Throwable unused) {
            Logger.v("NetworkUtil", "isNsaState error");
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException e12) {
            Logger.i("NetworkUtil", "getActiveNetworkInfo failed, exception:" + e12.getClass().getSimpleName() + e12.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        return detailedState;
                    }
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        detailedState = activeNetworkInfo.getDetailedState();
                    } else {
                        Logger.i("NetworkUtil", "getNetworkStatus networkIsConnected netInfo is null!");
                    }
                } catch (RuntimeException e12) {
                    Logger.i("NetworkUtil", "getNetworkStatus exception" + e12.getClass().getSimpleName() + e12.getMessage());
                }
            } else {
                Logger.i("NetworkUtil", "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength signalStrengthC;
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getNrCsiRsrp: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
        if (cellSignalStrengths.size() > 0) {
            return com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getCsiRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength signalStrengthC;
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getNrCsiRsrq: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
        if (cellSignalStrengths.size() > 0) {
            return com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getCsiRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength signalStrengthC;
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getNrCsiSinr: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
        if (cellSignalStrengths.size() > 0) {
            return com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getCsiSinr();
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        HashMap map = new HashMap();
        SignalStrength signalStrengthC = c(context);
        if (signalStrengthC == null) {
            return map;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
                if (cellSignalStrengths.size() > 0) {
                    map.put(SignalType.NR_DBM, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getDbm()));
                    map.put(SignalType.NR_CSIRSRP, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getCsiRsrp()));
                    map.put(SignalType.NR_CSIRSRQ, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getCsiRsrq()));
                    map.put(SignalType.NR_CSISINR, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getCsiSinr()));
                    map.put(SignalType.NR_SSRSRP, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getSsRsrp()));
                    map.put(SignalType.NR_SSRSRQ, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getSsRsrq()));
                    map.put(SignalType.NR_SSSINR, Integer.valueOf(com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getSsSinr()));
                }
            }
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getLteRssi: throwable:" + th2.getClass());
        }
        return map;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength signalStrengthC;
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getNrSsRsrp: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
        if (cellSignalStrengths.size() > 0) {
            return com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getSsRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength signalStrengthC;
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getNrSsRsrq: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
        if (cellSignalStrengths.size() > 0) {
            return com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getSsRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength signalStrengthC;
        try {
        } catch (Throwable th2) {
            Logger.i("NetworkUtil", "getNrSsSinr: throwable:" + th2.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthC = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrengthC.getCellSignalStrengths(com.avito.android.publish.scanner_v2.vinscanner.a.k());
        if (cellSignalStrengths.size() > 0) {
            return com.avito.android.publish.scanner_v2.vinscanner.a.i(cellSignalStrengths.get(0)).getSsSinr();
        }
        return Integer.MAX_VALUE;
    }

    public static int getPrimaryNetworkType(Context context) {
        return d(getNetworkType(getNetworkInfo(context), context));
    }

    public static String getWifiGatewayIp(Context context) {
        if (context == null) {
            return " ";
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return " ";
        }
        try {
            int i12 = ((WifiManager) systemService).getDhcpInfo().gateway;
            return InetAddress.getByAddress(new byte[]{(byte) (i12 & 255), (byte) ((i12 >> 8) & 255), (byte) ((i12 >> 16) & 255), (byte) ((i12 >> 24) & 255)}).getHostAddress();
        } catch (RuntimeException | UnknownHostException e12) {
            Logger.i("NetworkUtil", "getWifiGatewayIp error!" + e12.getClass().getSimpleName() + e12.getMessage());
            return " ";
        }
    }

    public static int getWifiRssi(Context context) {
        if (context == null) {
            return -127;
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return -127;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return -127;
            }
            return connectionInfo.getRssi();
        } catch (RuntimeException e12) {
            Logger.i("NetworkUtil", "getWifiRssiLevel did not has permission!" + e12.getClass().getSimpleName() + e12.getMessage());
            return -127;
        }
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo != null && networkInfo.isConnected()) || !networkInfo2.isConnected()) {
            return false;
        }
        Logger.v("NetworkUtil", "Find network state changed to connected");
        return true;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo2.isConnected() || getPrimaryNetworkType(networkInfo) == getPrimaryNetworkType(networkInfo2)) {
            return false;
        }
        Logger.v("NetworkUtil", "Find activity network changed");
        return true;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean isSimReady(Context context) {
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager = (UserManager) ContextCompat.getSystemService(context, ChannelContext.UserToUser.TYPE);
        if (userManager == null) {
            return true;
        }
        try {
            return userManager.isUserUnlocked();
        } catch (RuntimeException e12) {
            Logger.e("NetworkUtil", "dealType rethrowFromSystemServer:", e12);
            return true;
        }
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        Logger.v("NetworkUtil", "newWorkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals("5G_NSA", getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        }
        if (networkType == 5 && TextUtils.equals("5G_SA", getNetWorkNSAorSA())) {
            return 8;
        }
        return networkType;
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        int restrictBackgroundStatus = 0;
        if (context != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                    } else {
                        Logger.v("NetworkUtil", "ConnectType is not Mobile Network!");
                    }
                } catch (RuntimeException e12) {
                    Logger.e("NetworkUtil", "SystemServer error:", e12);
                }
            }
        }
        return restrictBackgroundStatus;
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i12;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        int iA2 = a(context);
        Logger.v("NetworkUtil", "getHwNetworkType return is: " + iA2);
        if (iA2 == 0) {
            iA2 = networkInfo.getSubtype();
        }
        if (iA2 != 20) {
            switch (iA2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    i12 = 2;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 4;
                    break;
                default:
                    i12 = 0;
                    break;
            }
        } else {
            i12 = 5;
        }
        if (i12 != 0) {
            return i12;
        }
        if (iA2 != 16) {
            return iA2 != 17 ? 0 : 3;
        }
        return 2;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return d(getNetworkType(networkInfo));
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }
}
