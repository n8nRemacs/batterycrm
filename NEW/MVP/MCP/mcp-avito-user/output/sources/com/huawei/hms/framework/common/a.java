package com.huawei.hms.framework.common;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean A(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr h(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr j(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma k(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr m(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthNr) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthTdscdma o(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthTdscdma) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ boolean u(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }
}
