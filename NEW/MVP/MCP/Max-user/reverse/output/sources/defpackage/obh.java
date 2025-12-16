package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class obh implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ obh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return pbh.a;
            case 1:
                return new qbh(gsc.valueOf(parcel.readString()));
            case 2:
                return new gjh(parcel);
            case 3:
                return new fjh(parcel);
            case 4:
                String string = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("LOADING")) {
                    i = 1;
                } else if (string3.equals("WEB_VIEW")) {
                    i = 2;
                } else {
                    if (!string3.equals("ERROR")) {
                        throw new IllegalArgumentException("No enum constant one.me.webapp.rootscreen.LoadingStateParc.".concat(string3));
                    }
                    i = 3;
                }
                return new bwh(i, string, string2, z, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 5:
                int iT = v8j.t(parcel);
                Bundle bundleA = null;
                int iO = 0;
                int iO2 = 0;
                while (parcel.dataPosition() < iT) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iO = v8j.o(parcel, i2);
                    } else if (c == 2) {
                        iO2 = v8j.o(parcel, i2);
                    } else if (c != 3) {
                        v8j.r(parcel, i2);
                    } else {
                        bundleA = v8j.a(parcel, i2);
                    }
                }
                v8j.h(parcel, iT);
                return new nw6(iO, iO2, bundleA);
            case 6:
                int iT2 = v8j.t(parcel);
                boolean zI = false;
                int iO3 = 0;
                while (parcel.dataPosition() < iT2) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        zI = v8j.i(parcel, i3);
                    } else if (c2 != 2) {
                        v8j.r(parcel, i3);
                    } else {
                        iO3 = v8j.o(parcel, i3);
                    }
                }
                v8j.h(parcel, iT2);
                return new z1a(zI, iO3);
            case 7:
                int iT3 = v8j.t(parcel);
                ArrayList arrayListG = null;
                int iO4 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iO4 = v8j.o(parcel, i4);
                    } else if (c3 != 2) {
                        v8j.r(parcel, i4);
                    } else {
                        arrayListG = v8j.g(parcel, i4, mz9.CREATOR);
                    }
                }
                v8j.h(parcel, iT3);
                return new j3g(iO4, arrayListG);
            case 8:
                int iT4 = v8j.t(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iT4) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        v8j.r(parcel, i5);
                    } else {
                        pendingIntent = (PendingIntent) v8j.c(parcel, i5, PendingIntent.CREATOR);
                    }
                }
                v8j.h(parcel, iT4);
                return new a2a(pendingIntent);
            case 9:
                int iT5 = v8j.t(parcel);
                Intent intent = null;
                int iO5 = 0;
                int iO6 = 0;
                while (parcel.dataPosition() < iT5) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iO5 = v8j.o(parcel, i6);
                    } else if (c4 == 2) {
                        iO6 = v8j.o(parcel, i6);
                    } else if (c4 != 3) {
                        v8j.r(parcel, i6);
                    } else {
                        intent = (Intent) v8j.c(parcel, i6, Intent.CREATOR);
                    }
                }
                v8j.h(parcel, iT5);
                return new qai(iO5, iO6, intent);
            case 10:
                int iT6 = v8j.t(parcel);
                String strD = null;
                String strD2 = null;
                String strD3 = null;
                String strD4 = null;
                Uri uri = null;
                String strD5 = null;
                String strD6 = null;
                ArrayList arrayListG2 = null;
                String strD7 = null;
                String strD8 = null;
                long jP = 0;
                int iO7 = 0;
                while (parcel.dataPosition() < iT6) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iO7 = v8j.o(parcel, i7);
                            break;
                        case 2:
                            strD = v8j.d(parcel, i7);
                            break;
                        case 3:
                            strD2 = v8j.d(parcel, i7);
                            break;
                        case 4:
                            strD3 = v8j.d(parcel, i7);
                            break;
                        case 5:
                            strD4 = v8j.d(parcel, i7);
                            break;
                        case 6:
                            uri = (Uri) v8j.c(parcel, i7, Uri.CREATOR);
                            break;
                        case 7:
                            strD5 = v8j.d(parcel, i7);
                            break;
                        case '\b':
                            jP = v8j.p(parcel, i7);
                            break;
                        case '\t':
                            strD6 = v8j.d(parcel, i7);
                            break;
                        case '\n':
                            arrayListG2 = v8j.g(parcel, i7, Scope.CREATOR);
                            break;
                        case 11:
                            strD7 = v8j.d(parcel, i7);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            strD8 = v8j.d(parcel, i7);
                            break;
                        default:
                            v8j.r(parcel, i7);
                            break;
                    }
                }
                v8j.h(parcel, iT6);
                return new GoogleSignInAccount(iO7, strD, strD2, strD3, strD4, uri, strD5, jP, strD6, arrayListG2, strD7, strD8);
            case 11:
                int iT7 = v8j.t(parcel);
                ArrayList arrayListG3 = null;
                String strD9 = null;
                boolean zI2 = false;
                String strD10 = null;
                while (parcel.dataPosition() < iT7) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        arrayListG3 = v8j.g(parcel, i8, qt5.CREATOR);
                    } else if (c5 == 2) {
                        zI2 = v8j.i(parcel, i8);
                    } else if (c5 == 3) {
                        strD10 = v8j.d(parcel, i8);
                    } else if (c5 != 4) {
                        v8j.r(parcel, i8);
                    } else {
                        strD9 = v8j.d(parcel, i8);
                    }
                }
                v8j.h(parcel, iT7);
                return new bm(arrayListG3, zI2, strD10, strD9);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iT8 = v8j.t(parcel);
                int iO8 = 0;
                boolean zI3 = false;
                while (parcel.dataPosition() < iT8) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iO8 = v8j.o(parcel, i9);
                    } else if (c6 != 2) {
                        v8j.r(parcel, i9);
                    } else {
                        zI3 = v8j.i(parcel, i9);
                    }
                }
                v8j.h(parcel, iT8);
                return new b2a(iO8, zI3);
            case 13:
                int iT9 = v8j.t(parcel);
                ArrayList arrayListG4 = null;
                ArrayList arrayListG5 = null;
                Account account = null;
                String strD11 = null;
                String strD12 = null;
                String strD13 = null;
                int iO9 = 0;
                boolean zI4 = false;
                boolean zI5 = false;
                boolean zI6 = false;
                while (parcel.dataPosition() < iT9) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iO9 = v8j.o(parcel, i10);
                            break;
                        case 2:
                            arrayListG5 = v8j.g(parcel, i10, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) v8j.c(parcel, i10, Account.CREATOR);
                            break;
                        case 4:
                            zI4 = v8j.i(parcel, i10);
                            break;
                        case 5:
                            zI5 = v8j.i(parcel, i10);
                            break;
                        case 6:
                            zI6 = v8j.i(parcel, i10);
                            break;
                        case 7:
                            strD11 = v8j.d(parcel, i10);
                            break;
                        case '\b':
                            strD12 = v8j.d(parcel, i10);
                            break;
                        case '\t':
                            arrayListG4 = v8j.g(parcel, i10, nw6.CREATOR);
                            break;
                        case '\n':
                            strD13 = v8j.d(parcel, i10);
                            break;
                        default:
                            v8j.r(parcel, i10);
                            break;
                    }
                }
                v8j.h(parcel, iT9);
                return new GoogleSignInOptions(iO9, arrayListG5, account, zI4, zI5, zI6, strD11, strD12, GoogleSignInOptions.c(arrayListG4), strD13);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iT10 = v8j.t(parcel);
                ArrayList<String> arrayList = null;
                String strD14 = null;
                while (parcel.dataPosition() < iT10) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        int iQ = v8j.q(parcel, i11);
                        int iDataPosition = parcel.dataPosition();
                        if (iQ == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iQ);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c7 != 2) {
                        v8j.r(parcel, i11);
                    } else {
                        strD14 = v8j.d(parcel, i11);
                    }
                }
                v8j.h(parcel, iT10);
                return new tbi(strD14, arrayList);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int iT11 = v8j.t(parcel);
                fci fciVar = null;
                int iO10 = 0;
                while (parcel.dataPosition() < iT11) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iO10 = v8j.o(parcel, i12);
                    } else if (c8 != 2) {
                        v8j.r(parcel, i12);
                    } else {
                        fciVar = (fci) v8j.c(parcel, i12, fci.CREATOR);
                    }
                }
                v8j.h(parcel, iT11);
                return new ybi(iO10, fciVar);
            case 16:
                int iT12 = v8j.t(parcel);
                es3 es3Var = null;
                int iO11 = 0;
                gci gciVar = null;
                while (parcel.dataPosition() < iT12) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iO11 = v8j.o(parcel, i13);
                    } else if (c9 == 2) {
                        es3Var = (es3) v8j.c(parcel, i13, es3.CREATOR);
                    } else if (c9 != 3) {
                        v8j.r(parcel, i13);
                    } else {
                        gciVar = (gci) v8j.c(parcel, i13, gci.CREATOR);
                    }
                }
                v8j.h(parcel, iT12);
                return new aci(iO11, es3Var, gciVar);
            case LangUtils.HASH_SEED /* 17 */:
                int iT13 = v8j.t(parcel);
                int iO12 = -1;
                int iO13 = 0;
                int iO14 = 0;
                int iO15 = 0;
                int iO16 = 0;
                String strD15 = null;
                String strD16 = null;
                long jP2 = 0;
                long jP3 = 0;
                while (parcel.dataPosition() < iT13) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iO13 = v8j.o(parcel, i14);
                            break;
                        case 2:
                            iO14 = v8j.o(parcel, i14);
                            break;
                        case 3:
                            iO15 = v8j.o(parcel, i14);
                            break;
                        case 4:
                            jP2 = v8j.p(parcel, i14);
                            break;
                        case 5:
                            jP3 = v8j.p(parcel, i14);
                            break;
                        case 6:
                            strD15 = v8j.d(parcel, i14);
                            break;
                        case 7:
                            strD16 = v8j.d(parcel, i14);
                            break;
                        case '\b':
                            iO16 = v8j.o(parcel, i14);
                            break;
                        case '\t':
                            iO12 = v8j.o(parcel, i14);
                            break;
                        default:
                            v8j.r(parcel, i14);
                            break;
                    }
                }
                v8j.h(parcel, iT13);
                return new mz9(iO13, iO14, iO15, jP2, jP3, strD15, strD16, iO16, iO12);
            case 18:
                int iT14 = v8j.t(parcel);
                Account account2 = null;
                int iO17 = 0;
                int iO18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iT14) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iO17 = v8j.o(parcel, i15);
                    } else if (c10 == 2) {
                        account2 = (Account) v8j.c(parcel, i15, Account.CREATOR);
                    } else if (c10 == 3) {
                        iO18 = v8j.o(parcel, i15);
                    } else if (c10 != 4) {
                        v8j.r(parcel, i15);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) v8j.c(parcel, i15, GoogleSignInAccount.CREATOR);
                    }
                }
                v8j.h(parcel, iT14);
                return new fci(iO17, account2, iO18, googleSignInAccount);
            case 19:
                int iT15 = v8j.t(parcel);
                int iO19 = 0;
                boolean zI7 = false;
                boolean zI8 = false;
                IBinder iBinderN = null;
                es3 es3Var2 = null;
                while (parcel.dataPosition() < iT15) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        iO19 = v8j.o(parcel, i16);
                    } else if (c11 == 2) {
                        iBinderN = v8j.n(parcel, i16);
                    } else if (c11 == 3) {
                        es3Var2 = (es3) v8j.c(parcel, i16, es3.CREATOR);
                    } else if (c11 == 4) {
                        zI7 = v8j.i(parcel, i16);
                    } else if (c11 != 5) {
                        v8j.r(parcel, i16);
                    } else {
                        zI8 = v8j.i(parcel, i16);
                    }
                }
                v8j.h(parcel, iT15);
                return new gci(iO19, iBinderN, es3Var2, zI7, zI8);
            case 20:
                int iT16 = v8j.t(parcel);
                float fL = 0.0f;
                float fL2 = 0.0f;
                LatLng latLng = null;
                float fL3 = 0.0f;
                while (parcel.dataPosition() < iT16) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        latLng = (LatLng) v8j.c(parcel, i17, LatLng.CREATOR);
                    } else if (c12 == 3) {
                        fL = v8j.l(parcel, i17);
                    } else if (c12 == 4) {
                        fL3 = v8j.l(parcel, i17);
                    } else if (c12 != 5) {
                        v8j.r(parcel, i17);
                    } else {
                        fL2 = v8j.l(parcel, i17);
                    }
                }
                v8j.h(parcel, iT16);
                return new CameraPosition(latLng, fL, fL3, fL2);
            case 21:
                int iT17 = v8j.t(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < iT17) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        v8j.r(parcel, i18);
                    } else {
                        intent2 = (Intent) v8j.c(parcel, i18, Intent.CREATOR);
                    }
                }
                v8j.h(parcel, iT17);
                return new yc3(intent2);
            case 22:
                int iT18 = v8j.t(parcel);
                String strD17 = null;
                int iO20 = 0;
                while (parcel.dataPosition() < iT18) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 1) {
                        iO20 = v8j.o(parcel, i19);
                    } else if (c13 != 2) {
                        v8j.r(parcel, i19);
                    } else {
                        strD17 = v8j.d(parcel, i19);
                    }
                }
                v8j.h(parcel, iT18);
                return new Scope(iO20, strD17);
            case 23:
                int iT19 = v8j.t(parcel);
                String strD18 = null;
                String strD19 = null;
                int iO21 = 0;
                String strD20 = null;
                while (parcel.dataPosition() < iT19) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 2) {
                        iO21 = v8j.o(parcel, i20);
                    } else if (c14 == 3) {
                        strD18 = v8j.d(parcel, i20);
                    } else if (c14 == 4) {
                        strD20 = v8j.d(parcel, i20);
                    } else if (c14 != 5) {
                        v8j.r(parcel, i20);
                    } else {
                        strD19 = v8j.d(parcel, i20);
                    }
                }
                v8j.h(parcel, iT19);
                e2j e2jVar = new e2j();
                e2jVar.a = iO21;
                e2jVar.b = strD18;
                e2jVar.c = strD20;
                e2jVar.d = strD19;
                return e2jVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int iT20 = v8j.t(parcel);
                cki ckiVar = null;
                int iO22 = 0;
                boolean zI9 = false;
                long jP4 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iT20) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 1) {
                        jP4 = v8j.p(parcel, i21);
                    } else if (c15 == 2) {
                        iO22 = v8j.o(parcel, i21);
                    } else if (c15 == 3) {
                        zI9 = v8j.i(parcel, i21);
                    } else if (c15 != 5) {
                        v8j.r(parcel, i21);
                    } else {
                        ckiVar = (cki) v8j.c(parcel, i21, cki.CREATOR);
                    }
                }
                v8j.h(parcel, iT20);
                return new z08(jP4, iO22, zI9, ckiVar);
            case 25:
                int iT21 = v8j.t(parcel);
                double dK = 0.0d;
                double dK2 = 0.0d;
                while (parcel.dataPosition() < iT21) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 2) {
                        dK = v8j.k(parcel, i22);
                    } else if (c16 != 3) {
                        v8j.r(parcel, i22);
                    } else {
                        dK2 = v8j.k(parcel, i22);
                    }
                }
                v8j.h(parcel, iT21);
                i3j i3jVar = new i3j();
                i3jVar.a = dK;
                i3jVar.b = dK2;
                return i3jVar;
            case 26:
                int iT22 = v8j.t(parcel);
                String strD21 = null;
                String strD22 = null;
                String strD23 = null;
                String strD24 = null;
                String strD25 = null;
                String strD26 = null;
                String strD27 = null;
                while (parcel.dataPosition() < iT22) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            strD21 = v8j.d(parcel, i23);
                            break;
                        case 3:
                            strD22 = v8j.d(parcel, i23);
                            break;
                        case 4:
                            strD23 = v8j.d(parcel, i23);
                            break;
                        case 5:
                            strD24 = v8j.d(parcel, i23);
                            break;
                        case 6:
                            strD25 = v8j.d(parcel, i23);
                            break;
                        case 7:
                            strD26 = v8j.d(parcel, i23);
                            break;
                        case '\b':
                            strD27 = v8j.d(parcel, i23);
                            break;
                        default:
                            v8j.r(parcel, i23);
                            break;
                    }
                }
                v8j.h(parcel, iT22);
                m4j m4jVar = new m4j();
                m4jVar.a = strD21;
                m4jVar.b = strD22;
                m4jVar.c = strD23;
                m4jVar.d = strD24;
                m4jVar.o = strD25;
                m4jVar.X = strD26;
                m4jVar.Y = strD27;
                return m4jVar;
            case 27:
                int iT23 = v8j.t(parcel);
                int iO23 = 0;
                int iO24 = 0;
                byte bJ = -1;
                byte bJ2 = -1;
                CameraPosition cameraPosition = null;
                byte bJ3 = -1;
                byte bJ4 = -1;
                byte bJ5 = -1;
                byte bJ6 = -1;
                byte bJ7 = -1;
                byte bJ8 = -1;
                byte bJ9 = -1;
                byte bJ10 = -1;
                byte bJ11 = -1;
                Float fM = null;
                Float fM2 = null;
                LatLngBounds latLngBounds = null;
                byte bJ12 = -1;
                Integer numValueOf = null;
                String strD28 = null;
                while (parcel.dataPosition() < iT23) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            bJ = v8j.j(parcel, i24);
                            break;
                        case 3:
                            bJ2 = v8j.j(parcel, i24);
                            break;
                        case 4:
                            iO23 = v8j.o(parcel, i24);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) v8j.c(parcel, i24, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bJ3 = v8j.j(parcel, i24);
                            break;
                        case 7:
                            bJ4 = v8j.j(parcel, i24);
                            break;
                        case '\b':
                            bJ5 = v8j.j(parcel, i24);
                            break;
                        case '\t':
                            bJ6 = v8j.j(parcel, i24);
                            break;
                        case '\n':
                            bJ7 = v8j.j(parcel, i24);
                            break;
                        case 11:
                            bJ8 = v8j.j(parcel, i24);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            bJ9 = v8j.j(parcel, i24);
                            break;
                        case '\r':
                        case 22:
                        default:
                            v8j.r(parcel, i24);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            bJ10 = v8j.j(parcel, i24);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            bJ11 = v8j.j(parcel, i24);
                            break;
                        case 16:
                            fM = v8j.m(parcel, i24);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            fM2 = v8j.m(parcel, i24);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) v8j.c(parcel, i24, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            bJ12 = v8j.j(parcel, i24);
                            break;
                        case 20:
                            int iQ2 = v8j.q(parcel, i24);
                            if (iQ2 != 0) {
                                v8j.u(parcel, iQ2, 4);
                                numValueOf = Integer.valueOf(parcel.readInt());
                                break;
                            } else {
                                numValueOf = null;
                                break;
                            }
                        case 21:
                            strD28 = v8j.d(parcel, i24);
                            break;
                        case 23:
                            iO24 = v8j.o(parcel, i24);
                            break;
                    }
                }
                v8j.h(parcel, iT23);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.c = -1;
                googleMapOptions.x0 = null;
                googleMapOptions.y0 = null;
                googleMapOptions.z0 = null;
                googleMapOptions.B0 = null;
                googleMapOptions.C0 = null;
                googleMapOptions.a = jui.d(bJ);
                googleMapOptions.b = jui.d(bJ2);
                googleMapOptions.c = iO23;
                googleMapOptions.d = cameraPosition;
                googleMapOptions.o = jui.d(bJ3);
                googleMapOptions.X = jui.d(bJ4);
                googleMapOptions.Y = jui.d(bJ5);
                googleMapOptions.Z = jui.d(bJ6);
                googleMapOptions.s0 = jui.d(bJ7);
                googleMapOptions.t0 = jui.d(bJ8);
                googleMapOptions.u0 = jui.d(bJ9);
                googleMapOptions.v0 = jui.d(bJ10);
                googleMapOptions.w0 = jui.d(bJ11);
                googleMapOptions.x0 = fM;
                googleMapOptions.y0 = fM2;
                googleMapOptions.z0 = latLngBounds;
                googleMapOptions.A0 = jui.d(bJ12);
                googleMapOptions.B0 = numValueOf;
                googleMapOptions.C0 = strD28;
                googleMapOptions.D0 = iO24;
                return googleMapOptions;
            case 28:
                int iT24 = v8j.t(parcel);
                String strD29 = null;
                int iO25 = 0;
                while (parcel.dataPosition() < iT24) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 2) {
                        iO25 = v8j.o(parcel, i25);
                    } else if (c17 != 3) {
                        v8j.r(parcel, i25);
                    } else {
                        strD29 = v8j.d(parcel, i25);
                    }
                }
                v8j.h(parcel, iT24);
                o5j o5jVar = new o5j();
                o5jVar.a = iO25;
                o5jVar.b = strD29;
                return o5jVar;
            default:
                int iT25 = v8j.t(parcel);
                v9f v9fVar = null;
                int iO26 = 0;
                int iO27 = 0;
                boolean zI10 = false;
                float fL4 = 0.0f;
                while (parcel.dataPosition() < iT25) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 2) {
                        fL4 = v8j.l(parcel, i26);
                    } else if (c18 == 3) {
                        iO26 = v8j.o(parcel, i26);
                    } else if (c18 == 4) {
                        iO27 = v8j.o(parcel, i26);
                    } else if (c18 == 5) {
                        zI10 = v8j.i(parcel, i26);
                    } else if (c18 != 6) {
                        v8j.r(parcel, i26);
                    } else {
                        v9fVar = (v9f) v8j.c(parcel, i26, v9f.CREATOR);
                    }
                }
                v8j.h(parcel, iT25);
                return new mnf(fL4, iO26, iO27, zI10, v9fVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new pbh[i];
            case 1:
                return new qbh[i];
            case 2:
                return new gjh[i];
            case 3:
                return new fjh[i];
            case 4:
                return new bwh[i];
            case 5:
                return new nw6[i];
            case 6:
                return new z1a[i];
            case 7:
                return new j3g[i];
            case 8:
                return new a2a[i];
            case 9:
                return new qai[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new bm[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new b2a[i];
            case 13:
                return new GoogleSignInOptions[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new tbi[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ybi[i];
            case 16:
                return new aci[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new mz9[i];
            case 18:
                return new fci[i];
            case 19:
                return new gci[i];
            case 20:
                return new CameraPosition[i];
            case 21:
                return new yc3[i];
            case 22:
                return new Scope[i];
            case 23:
                return new e2j[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new z08[i];
            case 25:
                return new i3j[i];
            case 26:
                return new m4j[i];
            case 27:
                return new GoogleMapOptions[i];
            case 28:
                return new o5j[i];
            default:
                return new mnf[i];
        }
    }
}
