package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public abstract class yxi {
    public static xei a;

    public static lfa a(tm9 tm9Var) {
        int iM;
        String strP;
        String strP2;
        try {
            iM = efi.m(tm9Var);
        } catch (Throwable th) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = vfe.a.iterator();
            while (it.hasNext()) {
                ((qwa) it.next()).getClass();
                qwa.a(th);
            }
            int iV = az1.v(ctd.a);
            if (iV != 0) {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iM = 0;
        }
        if (iM != 0) {
            hd5 hd5Var = hd5.a;
            String str = null;
            List listE = hd5Var;
            for (int i = 0; i < iM; i++) {
                try {
                    strP = efi.p(tm9Var, null);
                } catch (Throwable th2) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                    Iterator it2 = vfe.a.iterator();
                    while (it2.hasNext()) {
                        ((qwa) it2.next()).getClass();
                        qwa.a(th2);
                    }
                    int iV2 = az1.v(ctd.a);
                    if (iV2 != 0) {
                        if (iV2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th2;
                    }
                    strP = null;
                }
                if (strP != null) {
                    if (strP.equals(SdkMetricStatEvent.NAME_KEY)) {
                        try {
                            strP2 = efi.p(tm9Var, null);
                        } catch (Throwable th3) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it3 = vfe.a.iterator();
                            while (it3.hasNext()) {
                                ((qwa) it3.next()).getClass();
                                qwa.a(th3);
                            }
                            int iV3 = az1.v(ctd.a);
                            if (iV3 != 0) {
                                if (iV3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th3;
                            }
                            strP2 = null;
                        }
                        if (strP2 != null) {
                            str = strP2;
                        }
                    } else if (strP.equals("avatars")) {
                        ArrayList arrayListS = efi.s(tm9Var, new p89(29));
                        listE = arrayListS != null ? ue3.E(arrayListS) : null;
                        if (listE == null) {
                            listE = hd5Var;
                        }
                    } else {
                        try {
                            tm9Var.v();
                        } catch (Throwable th4) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = vfe.a.iterator();
                            while (it4.hasNext()) {
                                ((qwa) it4.next()).getClass();
                                qwa.a(th4);
                            }
                            int iV4 = az1.v(ctd.a);
                            if (iV4 != 0) {
                                if (iV4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th4;
                            }
                        }
                    }
                }
            }
            if (str != null && str.length() != 0 && !listE.isEmpty()) {
                if (str != null) {
                    return new lfa(str, listE);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return null;
    }

    public static usd b(LatLng latLng) {
        try {
            xei xeiVar = a;
            s5j.h(xeiVar, "CameraUpdateFactory is not initialized");
            Parcel parcelT = xeiVar.T();
            mgi.c(parcelT, latLng);
            Parcel parcelS = xeiVar.S(parcelT, 8);
            kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
            parcelS.recycle();
            return new usd(kb7VarW);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static usd c(LatLng latLng, float f) {
        try {
            xei xeiVar = a;
            s5j.h(xeiVar, "CameraUpdateFactory is not initialized");
            Parcel parcelT = xeiVar.T();
            mgi.c(parcelT, latLng);
            parcelT.writeFloat(f);
            Parcel parcelS = xeiVar.S(parcelT, 9);
            kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
            parcelS.recycle();
            return new usd(kb7VarW);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
