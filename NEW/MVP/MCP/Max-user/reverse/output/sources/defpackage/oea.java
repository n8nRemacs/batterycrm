package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class oea extends PhoneStateListener {
    public final /* synthetic */ pea a;

    public oea(pea peaVar) {
        this.a = peaVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        pea.a(this.a, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String string = serviceState == null ? "" : serviceState.toString();
        pea.a(this.a, string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
    }
}
