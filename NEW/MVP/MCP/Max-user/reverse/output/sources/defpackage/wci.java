package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class wci implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ wci(int i) {
        this.a = i;
    }

    public static void a(bu6 bu6Var, Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = bu6Var.a;
        a9j.m(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = bu6Var.b;
        a9j.m(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = bu6Var.c;
        a9j.m(parcel, 3, 4);
        parcel.writeInt(i4);
        a9j.g(parcel, 4, bu6Var.d);
        a9j.e(parcel, 5, bu6Var.o);
        a9j.i(parcel, 6, bu6Var.X, i);
        a9j.b(parcel, 7, bu6Var.Y);
        a9j.f(parcel, 8, bu6Var.Z, i);
        a9j.i(parcel, 10, bu6Var.s0, i);
        a9j.i(parcel, 11, bu6Var.t0, i);
        boolean z = bu6Var.u0;
        a9j.m(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = bu6Var.v0;
        a9j.m(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = bu6Var.w0;
        a9j.m(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a9j.g(parcel, 15, bu6Var.x0);
        a9j.l(parcel, iK);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        vei seiVar;
        double dK = 0.0d;
        switch (this.a) {
            case 0:
                int iT = v8j.t(parcel);
                String strD = null;
                String strD2 = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strD2 = v8j.d(parcel, i);
                    } else if (c != 3) {
                        v8j.r(parcel, i);
                    } else {
                        strD = v8j.d(parcel, i);
                    }
                }
                v8j.h(parcel, iT);
                o6j o6jVar = new o6j();
                o6jVar.a = strD2;
                o6jVar.b = strD;
                return o6jVar;
            case 1:
                int iT2 = v8j.t(parcel);
                mnf mnfVar = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        mnfVar = (mnf) v8j.c(parcel, i2, mnf.CREATOR);
                    } else if (c2 != 3) {
                        v8j.r(parcel, i2);
                    } else {
                        dK = v8j.k(parcel, i2);
                    }
                }
                v8j.h(parcel, iT2);
                return new pnf(mnfVar, dK);
            case 2:
                int iT3 = v8j.t(parcel);
                String strD3 = null;
                String strD4 = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        strD4 = v8j.d(parcel, i3);
                    } else if (c3 != 3) {
                        v8j.r(parcel, i3);
                    } else {
                        strD3 = v8j.d(parcel, i3);
                    }
                }
                v8j.h(parcel, iT3);
                q7j q7jVar = new q7j();
                q7jVar.a = strD4;
                q7jVar.b = strD3;
                return q7jVar;
            case 3:
                int iT4 = v8j.t(parcel);
                boolean zI = false;
                int iO = 0;
                int iO2 = 0;
                boolean zI2 = false;
                float fL = 0.0f;
                WorkSource workSource = new WorkSource();
                int iO3 = Integer.MAX_VALUE;
                long jP = Long.MAX_VALUE;
                long jP2 = Long.MAX_VALUE;
                long jP3 = 600000;
                long jP4 = 3600000;
                int iO4 = 102;
                long jP5 = 0;
                long jP6 = -1;
                cki ckiVar = null;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iO4 = v8j.o(parcel, i4);
                            break;
                        case 2:
                            jP4 = v8j.p(parcel, i4);
                            break;
                        case 3:
                            jP3 = v8j.p(parcel, i4);
                            break;
                        case 4:
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                        default:
                            v8j.r(parcel, i4);
                            break;
                        case 5:
                            jP = v8j.p(parcel, i4);
                            break;
                        case 6:
                            iO3 = v8j.o(parcel, i4);
                            break;
                        case 7:
                            fL = v8j.l(parcel, i4);
                            break;
                        case '\b':
                            jP5 = v8j.p(parcel, i4);
                            break;
                        case '\t':
                            zI = v8j.i(parcel, i4);
                            break;
                        case '\n':
                            jP2 = v8j.p(parcel, i4);
                            break;
                        case 11:
                            jP6 = v8j.p(parcel, i4);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            iO = v8j.o(parcel, i4);
                            break;
                        case '\r':
                            iO2 = v8j.o(parcel, i4);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            zI2 = v8j.i(parcel, i4);
                            break;
                        case 16:
                            workSource = (WorkSource) v8j.c(parcel, i4, WorkSource.CREATOR);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            ckiVar = (cki) v8j.c(parcel, i4, cki.CREATOR);
                            break;
                    }
                }
                v8j.h(parcel, iT4);
                return new LocationRequest(iO4, jP4, jP3, jP5, jP, jP2, iO3, fL, zI, jP6, iO, iO2, zI2, workSource, ckiVar);
            case 4:
                int iO5 = 0;
                int iT5 = v8j.t(parcel);
                String strD5 = null;
                String strD6 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        strD5 = v8j.d(parcel, i5);
                    } else if (c4 == 3) {
                        strD6 = v8j.d(parcel, i5);
                    } else if (c4 != 4) {
                        v8j.r(parcel, i5);
                    } else {
                        iO5 = v8j.o(parcel, i5);
                    }
                }
                v8j.h(parcel, iT5);
                w8j w8jVar = new w8j();
                w8jVar.a = strD5;
                w8jVar.b = strD6;
                w8jVar.c = iO5;
                return w8jVar;
            case 5:
                int iO6 = 0;
                int iT6 = v8j.t(parcel);
                int iO7 = 0;
                byte[] bArrB = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        iO6 = v8j.o(parcel, i6);
                    } else if (c5 == 3) {
                        iO7 = v8j.o(parcel, i6);
                    } else if (c5 != 4) {
                        v8j.r(parcel, i6);
                    } else {
                        bArrB = v8j.b(parcel, i6);
                    }
                }
                v8j.h(parcel, iT6);
                return new m8g(iO6, bArrB, iO7);
            case 6:
                boolean zI3 = false;
                int iT7 = v8j.t(parcel);
                boolean zI4 = false;
                ArrayList arrayListG = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        arrayListG = v8j.g(parcel, i7, LocationRequest.CREATOR);
                    } else if (c6 == 2) {
                        zI3 = v8j.i(parcel, i7);
                    } else if (c6 != 3) {
                        v8j.r(parcel, i7);
                    } else {
                        zI4 = v8j.i(parcel, i7);
                    }
                }
                v8j.h(parcel, iT7);
                return new rf8(arrayListG, zI3, zI4);
            case 7:
                int iO8 = 0;
                int iT8 = v8j.t(parcel);
                boolean zI5 = false;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        iO8 = v8j.o(parcel, i8);
                    } else if (c7 != 3) {
                        v8j.r(parcel, i8);
                    } else {
                        zI5 = v8j.i(parcel, i8);
                    }
                }
                v8j.h(parcel, iT8);
                edi ediVar = new edi();
                ediVar.a = iO8;
                ediVar.b = zI5;
                return ediVar;
            case 8:
                int iT9 = v8j.t(parcel);
                tf8 tf8Var = null;
                Status status = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        status = (Status) v8j.c(parcel, i9, Status.CREATOR);
                    } else if (c8 != 2) {
                        v8j.r(parcel, i9);
                    } else {
                        tf8Var = (tf8) v8j.c(parcel, i9, tf8.CREATOR);
                    }
                }
                v8j.h(parcel, iT9);
                return new sf8(status, tf8Var);
            case 9:
                int iT10 = v8j.t(parcel);
                boolean zI6 = false;
                boolean zI7 = false;
                boolean zI8 = false;
                boolean zI9 = false;
                boolean zI10 = false;
                boolean zI11 = false;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            zI6 = v8j.i(parcel, i10);
                            break;
                        case 2:
                            zI7 = v8j.i(parcel, i10);
                            break;
                        case 3:
                            zI8 = v8j.i(parcel, i10);
                            break;
                        case 4:
                            zI9 = v8j.i(parcel, i10);
                            break;
                        case 5:
                            zI10 = v8j.i(parcel, i10);
                            break;
                        case 6:
                            zI11 = v8j.i(parcel, i10);
                            break;
                        default:
                            v8j.r(parcel, i10);
                            break;
                    }
                }
                v8j.h(parcel, iT10);
                return new tf8(zI6, zI7, zI8, zI9, zI10, zI11);
            case 10:
                int iT11 = v8j.t(parcel);
                boolean zI12 = false;
                boolean zI13 = true;
                float fL2 = 0.0f;
                float fL3 = 0.0f;
                IBinder iBinderN = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        iBinderN = v8j.n(parcel, i11);
                    } else if (c9 == 3) {
                        zI12 = v8j.i(parcel, i11);
                    } else if (c9 == 4) {
                        fL2 = v8j.l(parcel, i11);
                    } else if (c9 == 5) {
                        zI13 = v8j.i(parcel, i11);
                    } else if (c9 != 6) {
                        v8j.r(parcel, i11);
                    } else {
                        fL3 = v8j.l(parcel, i11);
                    }
                }
                v8j.h(parcel, iT11);
                o8g o8gVar = new o8g();
                o8gVar.b = true;
                o8gVar.d = true;
                o8gVar.o = 0.0f;
                int i12 = jdi.e;
                if (iBinderN == null) {
                    seiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderN.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    seiVar = iInterfaceQueryLocalInterface instanceof vei ? (vei) iInterfaceQueryLocalInterface : new sei(iBinderN, "com.google.android.gms.maps.model.internal.ITileProviderDelegate", 3);
                }
                o8gVar.a = seiVar;
                o8gVar.b = zI12;
                o8gVar.c = fL2;
                o8gVar.d = zI13;
                o8gVar.o = fL3;
                return o8gVar;
            case 11:
                int iT12 = v8j.t(parcel);
                int iO9 = 0;
                int iO10 = 0;
                int iO11 = 0;
                boolean zI14 = false;
                boolean zI15 = false;
                while (parcel.dataPosition() < iT12) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iO9 = v8j.o(parcel, i13);
                    } else if (c10 == 2) {
                        zI14 = v8j.i(parcel, i13);
                    } else if (c10 == 3) {
                        zI15 = v8j.i(parcel, i13);
                    } else if (c10 == 4) {
                        iO10 = v8j.o(parcel, i13);
                    } else if (c10 != 5) {
                        v8j.r(parcel, i13);
                    } else {
                        iO11 = v8j.o(parcel, i13);
                    }
                }
                v8j.h(parcel, iT12);
                return new vsd(iO9, iO10, iO11, zI14, zI15);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iT13 = v8j.t(parcel);
                LatLng latLng = null;
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                LatLngBounds latLngBounds = null;
                while (parcel.dataPosition() < iT13) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 2) {
                        latLng = (LatLng) v8j.c(parcel, i14, LatLng.CREATOR);
                    } else if (c11 == 3) {
                        latLng2 = (LatLng) v8j.c(parcel, i14, LatLng.CREATOR);
                    } else if (c11 == 4) {
                        latLng3 = (LatLng) v8j.c(parcel, i14, LatLng.CREATOR);
                    } else if (c11 == 5) {
                        latLng4 = (LatLng) v8j.c(parcel, i14, LatLng.CREATOR);
                    } else if (c11 != 6) {
                        v8j.r(parcel, i14);
                    } else {
                        latLngBounds = (LatLngBounds) v8j.c(parcel, i14, LatLngBounds.CREATOR);
                    }
                }
                v8j.h(parcel, iT13);
                return new xih(latLng, latLng2, latLng3, latLng4, latLngBounds);
            case 13:
                int iT14 = v8j.t(parcel);
                int iO12 = 0;
                int iO13 = 0;
                int iO14 = 0;
                int iO15 = 0;
                long jP7 = 0;
                while (parcel.dataPosition() < iT14) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 2) {
                        iO12 = v8j.o(parcel, i15);
                    } else if (c12 == 3) {
                        iO13 = v8j.o(parcel, i15);
                    } else if (c12 == 4) {
                        iO14 = v8j.o(parcel, i15);
                    } else if (c12 == 5) {
                        jP7 = v8j.p(parcel, i15);
                    } else if (c12 != 6) {
                        v8j.r(parcel, i15);
                    } else {
                        iO15 = v8j.o(parcel, i15);
                    }
                }
                v8j.h(parcel, iT14);
                return new vdi(iO12, iO13, iO14, jP7, iO15);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iO16 = 0;
                int iT15 = v8j.t(parcel);
                IBinder iBinderN2 = null;
                Float fM = null;
                while (parcel.dataPosition() < iT15) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 2) {
                        iO16 = v8j.o(parcel, i16);
                    } else if (c13 == 3) {
                        iBinderN2 = v8j.n(parcel, i16);
                    } else if (c13 != 4) {
                        v8j.r(parcel, i16);
                    } else {
                        fM = v8j.m(parcel, i16);
                    }
                }
                v8j.h(parcel, iT15);
                return new x42(iO16, iBinderN2 == null ? null : new xo0(tqa.W(iBinderN2)), fM);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new kci((PendingIntent) parcel.readParcelable(gqd.class.getClassLoader()), parcel.readInt() != 0);
            case 16:
                int iO17 = 0;
                int iT16 = v8j.t(parcel);
                int iO18 = 0;
                PendingIntent pendingIntent = null;
                String strD7 = null;
                while (parcel.dataPosition() < iT16) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        iO17 = v8j.o(parcel, i17);
                    } else if (c14 == 2) {
                        iO18 = v8j.o(parcel, i17);
                    } else if (c14 == 3) {
                        pendingIntent = (PendingIntent) v8j.c(parcel, i17, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        v8j.r(parcel, i17);
                    } else {
                        strD7 = v8j.d(parcel, i17);
                    }
                }
                v8j.h(parcel, iT16);
                return new es3(iO17, iO18, pendingIntent, strD7);
            case LangUtils.HASH_SEED /* 17 */:
                int iO19 = 0;
                int iT17 = v8j.t(parcel);
                String strD8 = null;
                PendingIntent pendingIntent2 = null;
                es3 es3Var = null;
                while (parcel.dataPosition() < iT17) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iO19 = v8j.o(parcel, i18);
                    } else if (c15 == 2) {
                        strD8 = v8j.d(parcel, i18);
                    } else if (c15 == 3) {
                        pendingIntent2 = (PendingIntent) v8j.c(parcel, i18, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        v8j.r(parcel, i18);
                    } else {
                        es3Var = (es3) v8j.c(parcel, i18, es3.CREATOR);
                    }
                }
                v8j.h(parcel, iT17);
                return new Status(iO19, strD8, pendingIntent2, es3Var);
            case 18:
                return new mii(parcel.readStrongBinder());
            case 19:
                int iO20 = 0;
                int iT18 = v8j.t(parcel);
                int iO21 = 0;
                boolean zI16 = false;
                boolean zI17 = false;
                LatLng latLng5 = null;
                ArrayList arrayListG2 = null;
                float fL4 = 0.0f;
                float fL5 = 0.0f;
                while (parcel.dataPosition() < iT18) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            latLng5 = (LatLng) v8j.c(parcel, i19, LatLng.CREATOR);
                            break;
                        case 3:
                            dK = v8j.k(parcel, i19);
                            break;
                        case 4:
                            fL5 = v8j.l(parcel, i19);
                            break;
                        case 5:
                            iO21 = v8j.o(parcel, i19);
                            break;
                        case 6:
                            iO20 = v8j.o(parcel, i19);
                            break;
                        case 7:
                            fL4 = v8j.l(parcel, i19);
                            break;
                        case '\b':
                            zI16 = v8j.i(parcel, i19);
                            break;
                        case '\t':
                            zI17 = v8j.i(parcel, i19);
                            break;
                        case '\n':
                            arrayListG2 = v8j.g(parcel, i19, apb.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i19);
                            break;
                    }
                }
                v8j.h(parcel, iT18);
                s93 s93Var = new s93();
                s93Var.a = latLng5;
                s93Var.b = dK;
                s93Var.c = fL5;
                s93Var.d = iO21;
                s93Var.o = iO20;
                s93Var.X = fL4;
                s93Var.Y = zI16;
                s93Var.Z = zI17;
                s93Var.s0 = arrayListG2;
                return s93Var;
            case 20:
                int iO22 = 0;
                int iT19 = v8j.t(parcel);
                long jP8 = -1;
                String strD9 = null;
                while (parcel.dataPosition() < iT19) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        strD9 = v8j.d(parcel, i20);
                    } else if (c16 == 2) {
                        iO22 = v8j.o(parcel, i20);
                    } else if (c16 != 3) {
                        v8j.r(parcel, i20);
                    } else {
                        jP8 = v8j.p(parcel, i20);
                    }
                }
                v8j.h(parcel, iT19);
                return new qt5(jP8, strD9, iO22);
            case 21:
                int iT20 = v8j.t(parcel);
                String strD10 = "";
                String strD11 = "";
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iT20) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 4) {
                        strD10 = v8j.d(parcel, i21);
                    } else if (c17 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) v8j.c(parcel, i21, GoogleSignInAccount.CREATOR);
                    } else if (c17 != '\b') {
                        v8j.r(parcel, i21);
                    } else {
                        strD11 = v8j.d(parcel, i21);
                    }
                }
                v8j.h(parcel, iT20);
                SignInAccount signInAccount = new SignInAccount();
                signInAccount.b = googleSignInAccount;
                s5j.d(strD10, "8.3 and 8.4 SDKs require non-null email");
                signInAccount.a = strD10;
                s5j.d(strD11, "8.3 and 8.4 SDKs require non-null userId");
                signInAccount.c = strD11;
                return signInAccount;
            case 22:
                int iT21 = v8j.t(parcel);
                int iO23 = 0;
                String strD12 = null;
                String strD13 = null;
                String strD14 = null;
                ArrayList arrayListG3 = null;
                cki ckiVar2 = null;
                while (parcel.dataPosition() < iT21) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        iO23 = v8j.o(parcel, i22);
                    } else if (c18 == 3) {
                        strD12 = v8j.d(parcel, i22);
                    } else if (c18 == 4) {
                        strD13 = v8j.d(parcel, i22);
                    } else if (c18 == 6) {
                        strD14 = v8j.d(parcel, i22);
                    } else if (c18 == 7) {
                        ckiVar2 = (cki) v8j.c(parcel, i22, cki.CREATOR);
                    } else if (c18 != '\b') {
                        v8j.r(parcel, i22);
                    } else {
                        arrayListG3 = v8j.g(parcel, i22, qt5.CREATOR);
                    }
                }
                v8j.h(parcel, iT21);
                return new cki(iO23, strD12, strD13, strD14, arrayListG3, ckiVar2);
            case 23:
                int iO24 = 0;
                int iT22 = v8j.t(parcel);
                String[] strArrE = null;
                while (parcel.dataPosition() < iT22) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 2) {
                        iO24 = v8j.o(parcel, i23);
                    } else if (c19 != 3) {
                        v8j.r(parcel, i23);
                    } else {
                        strArrE = v8j.e(parcel, i23);
                    }
                }
                v8j.h(parcel, iT22);
                wri wriVar = new wri();
                wriVar.a = iO24;
                wriVar.b = strArrE;
                return wriVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int iT23 = v8j.t(parcel);
                LatLng latLng6 = null;
                LatLngBounds latLngBounds2 = null;
                IBinder iBinderN3 = null;
                float fL6 = 0.0f;
                float fL7 = 0.0f;
                float fL8 = 0.0f;
                float fL9 = 0.0f;
                boolean zI18 = false;
                float fL10 = 0.0f;
                float fL11 = 0.0f;
                float fL12 = 0.0f;
                boolean zI19 = false;
                while (parcel.dataPosition() < iT23) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            iBinderN3 = v8j.n(parcel, i24);
                            break;
                        case 3:
                            latLng6 = (LatLng) v8j.c(parcel, i24, LatLng.CREATOR);
                            break;
                        case 4:
                            fL6 = v8j.l(parcel, i24);
                            break;
                        case 5:
                            fL7 = v8j.l(parcel, i24);
                            break;
                        case 6:
                            latLngBounds2 = (LatLngBounds) v8j.c(parcel, i24, LatLngBounds.CREATOR);
                            break;
                        case 7:
                            fL8 = v8j.l(parcel, i24);
                            break;
                        case '\b':
                            fL9 = v8j.l(parcel, i24);
                            break;
                        case '\t':
                            zI18 = v8j.i(parcel, i24);
                            break;
                        case '\n':
                            fL10 = v8j.l(parcel, i24);
                            break;
                        case 11:
                            fL11 = v8j.l(parcel, i24);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            fL12 = v8j.l(parcel, i24);
                            break;
                        case '\r':
                            zI19 = v8j.i(parcel, i24);
                            break;
                        default:
                            v8j.r(parcel, i24);
                            break;
                    }
                }
                v8j.h(parcel, iT23);
                ty6 ty6Var = new ty6();
                ty6Var.Z = true;
                ty6Var.s0 = 0.0f;
                ty6Var.t0 = 0.5f;
                ty6Var.u0 = 0.5f;
                ty6Var.v0 = false;
                ty6Var.a = new xo0(tqa.W(iBinderN3));
                ty6Var.b = latLng6;
                ty6Var.c = fL6;
                ty6Var.d = fL7;
                ty6Var.o = latLngBounds2;
                ty6Var.X = fL8;
                ty6Var.Y = fL9;
                ty6Var.Z = zI18;
                ty6Var.s0 = fL10;
                ty6Var.t0 = fL11;
                ty6Var.u0 = fL12;
                ty6Var.v0 = zI19;
                return ty6Var;
            case 25:
                int iT24 = v8j.t(parcel);
                int iO25 = 0;
                Bundle bundleA = null;
                qt5[] qt5VarArr = null;
                ls3 ls3Var = null;
                while (parcel.dataPosition() < iT24) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        bundleA = v8j.a(parcel, i25);
                    } else if (c20 == 2) {
                        qt5VarArr = (qt5[]) v8j.f(parcel, i25, qt5.CREATOR);
                    } else if (c20 == 3) {
                        iO25 = v8j.o(parcel, i25);
                    } else if (c20 != 4) {
                        v8j.r(parcel, i25);
                    } else {
                        ls3Var = (ls3) v8j.c(parcel, i25, ls3.CREATOR);
                    }
                }
                v8j.h(parcel, iT24);
                cwi cwiVar = new cwi();
                cwiVar.a = bundleA;
                cwiVar.b = qt5VarArr;
                cwiVar.c = iO25;
                cwiVar.d = ls3Var;
                return cwiVar;
            case 26:
                int iT25 = v8j.t(parcel);
                vsd vsdVar = null;
                boolean zI20 = false;
                boolean zI21 = false;
                int[] iArr = null;
                int iO26 = 0;
                while (true) {
                    int[] iArr2 = null;
                    while (parcel.dataPosition() < iT25) {
                        int i26 = parcel.readInt();
                        switch ((char) i26) {
                            case 1:
                                vsdVar = (vsd) v8j.c(parcel, i26, vsd.CREATOR);
                                break;
                            case 2:
                                zI20 = v8j.i(parcel, i26);
                                break;
                            case 3:
                                zI21 = v8j.i(parcel, i26);
                                break;
                            case 4:
                                int iQ = v8j.q(parcel, i26);
                                int iDataPosition = parcel.dataPosition();
                                if (iQ != 0) {
                                    int[] iArrCreateIntArray = parcel.createIntArray();
                                    parcel.setDataPosition(iDataPosition + iQ);
                                    iArr = iArrCreateIntArray;
                                    break;
                                } else {
                                    iArr = null;
                                    break;
                                }
                            case 5:
                                iO26 = v8j.o(parcel, i26);
                                break;
                            case 6:
                                int iQ2 = v8j.q(parcel, i26);
                                int iDataPosition2 = parcel.dataPosition();
                                if (iQ2 != 0) {
                                    int[] iArrCreateIntArray2 = parcel.createIntArray();
                                    parcel.setDataPosition(iDataPosition2 + iQ2);
                                    iArr2 = iArrCreateIntArray2;
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                v8j.r(parcel, i26);
                                break;
                        }
                    }
                    v8j.h(parcel, iT25);
                    return new ls3(vsdVar, zI20, zI21, iArr, iO26, iArr2);
                    break;
                }
            case 27:
                int iT26 = v8j.t(parcel);
                LatLng latLng7 = null;
                LatLng latLng8 = null;
                while (parcel.dataPosition() < iT26) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 2) {
                        latLng8 = (LatLng) v8j.c(parcel, i27, LatLng.CREATOR);
                    } else if (c21 != 3) {
                        v8j.r(parcel, i27);
                    } else {
                        latLng7 = (LatLng) v8j.c(parcel, i27, LatLng.CREATOR);
                    }
                }
                v8j.h(parcel, iT26);
                return new LatLngBounds(latLng8, latLng7);
            case 28:
                int iT27 = v8j.t(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = bu6.y0;
                qt5[] qt5VarArr2 = bu6.z0;
                qt5[] qt5VarArr3 = qt5VarArr2;
                int iO27 = 0;
                int iO28 = 0;
                int iO29 = 0;
                String strD15 = null;
                IBinder iBinderN4 = null;
                Account account = null;
                boolean zI22 = false;
                int iO30 = 0;
                boolean zI23 = false;
                String strD16 = null;
                while (parcel.dataPosition() < iT27) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iO27 = v8j.o(parcel, i28);
                            break;
                        case 2:
                            iO28 = v8j.o(parcel, i28);
                            break;
                        case 3:
                            iO29 = v8j.o(parcel, i28);
                            break;
                        case 4:
                            strD15 = v8j.d(parcel, i28);
                            break;
                        case 5:
                            iBinderN4 = v8j.n(parcel, i28);
                            break;
                        case 6:
                            scopeArr = (Scope[]) v8j.f(parcel, i28, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = v8j.a(parcel, i28);
                            break;
                        case '\b':
                            account = (Account) v8j.c(parcel, i28, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            v8j.r(parcel, i28);
                            break;
                        case '\n':
                            qt5VarArr2 = (qt5[]) v8j.f(parcel, i28, qt5.CREATOR);
                            break;
                        case 11:
                            qt5VarArr3 = (qt5[]) v8j.f(parcel, i28, qt5.CREATOR);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            zI22 = v8j.i(parcel, i28);
                            break;
                        case '\r':
                            iO30 = v8j.o(parcel, i28);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            zI23 = v8j.i(parcel, i28);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            strD16 = v8j.d(parcel, i28);
                            break;
                    }
                }
                v8j.h(parcel, iT27);
                return new bu6(iO27, iO28, iO29, strD15, iBinderN4, scopeArr, bundle, account, qt5VarArr2, qt5VarArr3, zI22, iO30, zI23, strD16);
            default:
                int iT28 = v8j.t(parcel);
                double dK2 = 0.0d;
                while (parcel.dataPosition() < iT28) {
                    int i29 = parcel.readInt();
                    char c22 = (char) i29;
                    if (c22 == 2) {
                        dK = v8j.k(parcel, i29);
                    } else if (c22 != 3) {
                        v8j.r(parcel, i29);
                    } else {
                        dK2 = v8j.k(parcel, i29);
                    }
                }
                v8j.h(parcel, iT28);
                return new LatLng(dK, dK2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new o6j[i];
            case 1:
                return new pnf[i];
            case 2:
                return new q7j[i];
            case 3:
                return new LocationRequest[i];
            case 4:
                return new w8j[i];
            case 5:
                return new m8g[i];
            case 6:
                return new rf8[i];
            case 7:
                return new edi[i];
            case 8:
                return new sf8[i];
            case 9:
                return new tf8[i];
            case 10:
                return new o8g[i];
            case 11:
                return new vsd[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new xih[i];
            case 13:
                return new vdi[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new x42[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new gqd[i];
            case 16:
                return new es3[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new Status[i];
            case 18:
                return new mii[i];
            case 19:
                return new s93[i];
            case 20:
                return new qt5[i];
            case 21:
                return new SignInAccount[i];
            case 22:
                return new cki[i];
            case 23:
                return new wri[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new ty6[i];
            case 25:
                return new cwi[i];
            case 26:
                return new ls3[i];
            case 27:
                return new LatLngBounds[i];
            case 28:
                return new bu6[i];
            default:
                return new LatLng[i];
        }
    }
}
