package e11;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
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
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class N extends AbstractC39860d0 {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f394418b = true;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f394419c = true;

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f394420a;

        /* renamed from: b, reason: collision with root package name */
        public final int f394421b;

        /* renamed from: c, reason: collision with root package name */
        public final int f394422c;

        /* renamed from: d, reason: collision with root package name */
        public final int f394423d;

        /* renamed from: e, reason: collision with root package name */
        public final int f394424e;

        /* renamed from: f, reason: collision with root package name */
        public final int f394425f;

        /* renamed from: g, reason: collision with root package name */
        public final int f394426g;

        /* renamed from: h, reason: collision with root package name */
        public final int f394427h;

        /* renamed from: i, reason: collision with root package name */
        public final int f394428i;

        /* renamed from: j, reason: collision with root package name */
        public final int f394429j;

        /* renamed from: k, reason: collision with root package name */
        public final int f394430k;

        /* renamed from: l, reason: collision with root package name */
        public final int f394431l;

        /* renamed from: m, reason: collision with root package name */
        public final int f394432m;

        /* renamed from: n, reason: collision with root package name */
        public final int f394433n;

        /* renamed from: o, reason: collision with root package name */
        public final int f394434o;

        public a(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25, int i26, int i27, int i28) {
            this.f394420a = i12;
            this.f394421b = i13;
            this.f394422c = i14;
            this.f394423d = i15;
            this.f394424e = i16;
            this.f394425f = i17;
            this.f394426g = i18;
            this.f394427h = i19;
            this.f394428i = i22;
            this.f394429j = i23;
            this.f394430k = i24;
            this.f394431l = i25;
            this.f394432m = i26;
            this.f394433n = i27;
            this.f394434o = i28;
        }

        @Override // e11.N.b
        public final String a() {
            return "cdma," + this.f394420a + "," + this.f394421b + "," + this.f394422c + "," + this.f394423d + "," + this.f394424e + "," + this.f394425f + "," + this.f394426g + "," + this.f394427h + "," + this.f394428i + "," + this.f394429j + "," + this.f394430k + "," + this.f394431l + "," + this.f394432m + "," + this.f394433n + "," + this.f394434o;
        }
    }

    public interface b {
        String a();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public ArrayList f394435a;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r20v4, types: [e11.N$a] */
        @SuppressLint({"MissingPermission"})
        @TargetApi(17)
        @j.P
        public static ArrayList a(@j.N TelephonyManager telephonyManager) {
            d dVar;
            d dVar2;
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                        long ci2 = cellIdentity.getCi();
                        int i12 = Build.VERSION.SDK_INT;
                        dVar2 = new d("lte", ci2, Integer.MAX_VALUE, i12 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i12 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance(), cellIdentity.getEarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity.getTac());
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        CellSignalStrengthGsm cellSignalStrength2 = cellInfoGsm.getCellSignalStrength();
                        long cid = cellIdentity2.getCid();
                        int lac = cellIdentity2.getLac();
                        int i13 = Build.VERSION.SDK_INT;
                        dVar2 = new d("gsm", cid, lac, i13 >= 28 ? cellIdentity2.getMccString() : String.valueOf(cellIdentity2.getMcc()), i13 >= 28 ? cellIdentity2.getMncString() : String.valueOf(cellIdentity2.getMnc()), cellSignalStrength2.getLevel(), cellSignalStrength2.getDbm(), cellSignalStrength2.getAsuLevel(), cellSignalStrength2.getTimingAdvance(), Integer.MAX_VALUE, cellIdentity2.getBsic(), cellIdentity2.getPsc(), Integer.MAX_VALUE);
                    } else {
                        int i14 = Build.VERSION.SDK_INT;
                        if (cellInfo instanceof CellInfoWcdma) {
                            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                            CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
                            dVar = new d("wcdma", cellIdentity3.getCid(), cellIdentity3.getLac(), i14 >= 28 ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), i14 >= 28 ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()), cellSignalStrength3.getLevel(), cellSignalStrength3.getDbm(), cellSignalStrength3.getAsuLevel(), Integer.MAX_VALUE, cellIdentity3.getUarfcn(), Integer.MAX_VALUE, cellIdentity3.getPsc(), Integer.MAX_VALUE);
                            arrayList.add(dVar);
                        } else if (cellInfo instanceof CellInfoCdma) {
                            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                            CellIdentityCdma cellIdentity4 = cellInfoCdma.getCellIdentity();
                            CellSignalStrengthCdma cellSignalStrength4 = cellInfoCdma.getCellSignalStrength();
                            dVar2 = new a(cellIdentity4.getNetworkId(), cellIdentity4.getSystemId(), cellIdentity4.getBasestationId(), cellIdentity4.getLatitude(), cellIdentity4.getLongitude(), cellSignalStrength4.getCdmaLevel(), cellSignalStrength4.getLevel(), cellSignalStrength4.getEvdoLevel(), cellSignalStrength4.getAsuLevel(), cellSignalStrength4.getCdmaDbm(), cellSignalStrength4.getDbm(), cellSignalStrength4.getEvdoDbm(), cellSignalStrength4.getEvdoEcio(), cellSignalStrength4.getCdmaEcio(), cellSignalStrength4.getEvdoSnr());
                        } else if (i14 >= 29 && com.huawei.hms.framework.common.a.A(cellInfo)) {
                            CellInfoNr cellInfoNrJ = com.huawei.hms.framework.common.a.j(cellInfo);
                            CellIdentityNr cellIdentityNrH = com.huawei.hms.framework.common.a.h(cellInfoNrJ.getCellIdentity());
                            CellSignalStrengthNr cellSignalStrengthNrM = com.huawei.hms.framework.common.a.m(cellInfoNrJ.getCellSignalStrength());
                            dVar2 = new d("nr", cellIdentityNrH.getNci(), Integer.MAX_VALUE, cellIdentityNrH.getMccString(), cellIdentityNrH.getMncString(), cellSignalStrengthNrM.getLevel(), cellSignalStrengthNrM.getDbm(), cellSignalStrengthNrM.getAsuLevel(), Integer.MAX_VALUE, cellIdentityNrH.getNrarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentityNrH.getTac());
                        } else if (i14 >= 30 && com.huawei.hms.framework.common.a.u(cellInfo)) {
                            CellIdentityTdscdma cellIdentity5 = com.huawei.hms.framework.common.a.k(cellInfo).getCellIdentity();
                            CellSignalStrengthTdscdma cellSignalStrengthTdscdmaO = com.huawei.hms.framework.common.a.o(cellInfo.getCellSignalStrength());
                            dVar2 = new d("tdscdma", cellIdentity5.getCid(), cellIdentity5.getLac(), cellIdentity5.getMccString(), cellIdentity5.getMncString(), cellSignalStrengthTdscdmaO.getLevel(), cellSignalStrengthTdscdmaO.getDbm(), cellSignalStrengthTdscdmaO.getAsuLevel(), Integer.MAX_VALUE, cellIdentity5.getUarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        }
                    }
                    dVar = dVar2;
                    arrayList.add(dVar);
                }
            }
            return arrayList;
        }
    }

    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f394436a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final String f394437b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final String f394438c;

        /* renamed from: d, reason: collision with root package name */
        public final long f394439d;

        /* renamed from: e, reason: collision with root package name */
        public final int f394440e;

        /* renamed from: f, reason: collision with root package name */
        public final int f394441f;

        /* renamed from: g, reason: collision with root package name */
        public final int f394442g;

        /* renamed from: h, reason: collision with root package name */
        public final int f394443h;

        /* renamed from: i, reason: collision with root package name */
        public final int f394444i;

        /* renamed from: j, reason: collision with root package name */
        public final int f394445j;

        /* renamed from: k, reason: collision with root package name */
        public final int f394446k;

        /* renamed from: l, reason: collision with root package name */
        public final int f394447l;

        /* renamed from: m, reason: collision with root package name */
        public final int f394448m;

        public d(@j.N String str, long j12, int i12, @j.P String str2, @j.P String str3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22) {
            this.f394436a = str;
            this.f394439d = j12;
            this.f394440e = i12;
            this.f394437b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.f394438c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f394441f = i13;
            this.f394442g = i14;
            this.f394443h = i15;
            this.f394444i = i16;
            this.f394445j = i17;
            this.f394446k = i18;
            this.f394447l = i19;
            this.f394448m = i22;
        }

        @Override // e11.N.b
        public final String a() {
            return this.f394436a + "," + this.f394439d + "," + this.f394440e + "," + this.f394437b + "," + this.f394438c + "," + this.f394441f + "," + this.f394442g + "," + this.f394443h + "," + this.f394444i + "," + this.f394445j + "," + this.f394446k + "," + this.f394447l + "," + this.f394448m;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public WifiInfo f394449a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public List<ScanResult> f394450b;
    }
}
