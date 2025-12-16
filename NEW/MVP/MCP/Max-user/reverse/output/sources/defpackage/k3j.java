package defpackage;

import android.graphics.Point;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class k3j implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k3j(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        View view;
        switch (this.a) {
            case 0:
                int iT = v8j.t(parcel);
                String strD = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        v8j.r(parcel, i);
                    } else {
                        strD = v8j.d(parcel, i);
                    }
                }
                v8j.h(parcel, iT);
                return new eo8(strD);
            case 1:
                int iT2 = v8j.t(parcel);
                boolean zI = false;
                boolean zI2 = false;
                boolean zI3 = false;
                int iO = 0;
                int iO2 = 0;
                float fL = 1.0f;
                float fL2 = 0.5f;
                LatLng latLng = null;
                String strD2 = null;
                String strD3 = null;
                IBinder iBinderN = null;
                float fL3 = 0.0f;
                float fL4 = 0.0f;
                IBinder iBinderN2 = null;
                float fL5 = 0.0f;
                float fL6 = 0.0f;
                float fL7 = 0.0f;
                String strD4 = null;
                float fL8 = 0.0f;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            latLng = (LatLng) v8j.c(parcel, i2, LatLng.CREATOR);
                            break;
                        case 3:
                            strD2 = v8j.d(parcel, i2);
                            break;
                        case 4:
                            strD3 = v8j.d(parcel, i2);
                            break;
                        case 5:
                            iBinderN = v8j.n(parcel, i2);
                            break;
                        case 6:
                            fL3 = v8j.l(parcel, i2);
                            break;
                        case 7:
                            fL4 = v8j.l(parcel, i2);
                            break;
                        case '\b':
                            zI = v8j.i(parcel, i2);
                            break;
                        case '\t':
                            zI2 = v8j.i(parcel, i2);
                            break;
                        case '\n':
                            zI3 = v8j.i(parcel, i2);
                            break;
                        case 11:
                            fL5 = v8j.l(parcel, i2);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            fL2 = v8j.l(parcel, i2);
                            break;
                        case '\r':
                            fL6 = v8j.l(parcel, i2);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            fL = v8j.l(parcel, i2);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            fL7 = v8j.l(parcel, i2);
                            break;
                        case 16:
                        default:
                            v8j.r(parcel, i2);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            iO = v8j.o(parcel, i2);
                            break;
                        case 18:
                            iBinderN2 = v8j.n(parcel, i2);
                            break;
                        case 19:
                            iO2 = v8j.o(parcel, i2);
                            break;
                        case 20:
                            strD4 = v8j.d(parcel, i2);
                            break;
                        case 21:
                            fL8 = v8j.l(parcel, i2);
                            break;
                    }
                }
                v8j.h(parcel, iT2);
                mp8 mp8Var = new mp8();
                mp8Var.o = 0.5f;
                mp8Var.X = 1.0f;
                mp8Var.Z = true;
                mp8Var.s0 = false;
                mp8Var.t0 = 0.0f;
                mp8Var.u0 = 0.5f;
                mp8Var.v0 = 0.0f;
                mp8Var.w0 = 1.0f;
                mp8Var.y0 = 0;
                mp8Var.a = latLng;
                mp8Var.b = strD2;
                mp8Var.c = strD3;
                if (iBinderN == null) {
                    view = null;
                    mp8Var.d = null;
                } else {
                    view = null;
                    mp8Var.d = new xo0(tqa.W(iBinderN));
                }
                mp8Var.o = fL3;
                mp8Var.X = fL4;
                mp8Var.Y = zI;
                mp8Var.Z = zI2;
                mp8Var.s0 = zI3;
                mp8Var.t0 = fL5;
                mp8Var.u0 = fL2;
                mp8Var.v0 = fL6;
                mp8Var.w0 = fL;
                mp8Var.x0 = fL7;
                mp8Var.A0 = iO2;
                mp8Var.y0 = iO;
                kb7 kb7VarW = tqa.W(iBinderN2);
                mp8Var.z0 = kb7VarW == null ? view : (View) tqa.X(kb7VarW);
                mp8Var.B0 = strD4;
                mp8Var.C0 = fL8;
                return mp8Var;
            case 2:
                int iT3 = v8j.t(parcel);
                Float fM = null;
                int iO3 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 2) {
                        iO3 = v8j.o(parcel, i3);
                    } else if (c != 3) {
                        v8j.r(parcel, i3);
                    } else {
                        fM = v8j.m(parcel, i3);
                    }
                }
                v8j.h(parcel, iT3);
                return new apb(iO3, fM);
            case 3:
                int iT4 = v8j.t(parcel);
                ArrayList arrayListG = null;
                x42 x42Var = null;
                x42 x42Var2 = null;
                ArrayList arrayListG2 = null;
                ArrayList arrayListG3 = null;
                int iO4 = 0;
                boolean zI4 = false;
                boolean zI5 = false;
                boolean zI6 = false;
                int iO5 = 0;
                float fL9 = 0.0f;
                float fL10 = 0.0f;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            arrayListG = v8j.g(parcel, i4, LatLng.CREATOR);
                            break;
                        case 3:
                            fL9 = v8j.l(parcel, i4);
                            break;
                        case 4:
                            iO4 = v8j.o(parcel, i4);
                            break;
                        case 5:
                            fL10 = v8j.l(parcel, i4);
                            break;
                        case 6:
                            zI4 = v8j.i(parcel, i4);
                            break;
                        case 7:
                            zI5 = v8j.i(parcel, i4);
                            break;
                        case '\b':
                            zI6 = v8j.i(parcel, i4);
                            break;
                        case '\t':
                            x42Var = (x42) v8j.c(parcel, i4, x42.CREATOR);
                            break;
                        case '\n':
                            x42Var2 = (x42) v8j.c(parcel, i4, x42.CREATOR);
                            break;
                        case 11:
                            iO5 = v8j.o(parcel, i4);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            arrayListG2 = v8j.g(parcel, i4, apb.CREATOR);
                            break;
                        case '\r':
                            arrayListG3 = v8j.g(parcel, i4, pnf.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i4);
                            break;
                    }
                }
                v8j.h(parcel, iT4);
                return new q5c(arrayListG, fL9, iO4, fL10, zI4, zI5, zI6, x42Var, x42Var2, iO5, arrayListG2, arrayListG3);
            case 4:
                int iT5 = v8j.t(parcel);
                double dK = 0.0d;
                int iO6 = 0;
                boolean zI7 = false;
                String strD5 = null;
                String strD6 = null;
                Point[] pointArr = null;
                e2j e2jVar = null;
                o5j o5jVar = null;
                o6j o6jVar = null;
                w8j w8jVar = null;
                byte[] bArrB = null;
                i3j i3jVar = null;
                q7j q7jVar = null;
                ewi ewiVar = null;
                iyi iyiVar = null;
                l0j l0jVar = null;
                int iO7 = 0;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    w8j w8jVar2 = w8jVar;
                    switch ((char) i5) {
                        case 2:
                            iO6 = v8j.o(parcel, i5);
                            break;
                        case 3:
                            strD5 = v8j.d(parcel, i5);
                            break;
                        case 4:
                            strD6 = v8j.d(parcel, i5);
                            break;
                        case 5:
                            iO7 = v8j.o(parcel, i5);
                            break;
                        case 6:
                            pointArr = (Point[]) v8j.f(parcel, i5, Point.CREATOR);
                            break;
                        case 7:
                            e2jVar = (e2j) v8j.c(parcel, i5, e2j.CREATOR);
                            break;
                        case '\b':
                            o5jVar = (o5j) v8j.c(parcel, i5, o5j.CREATOR);
                            break;
                        case '\t':
                            o6jVar = (o6j) v8j.c(parcel, i5, o6j.CREATOR);
                            break;
                        case '\n':
                            w8jVar = (w8j) v8j.c(parcel, i5, w8j.CREATOR);
                            continue;
                        case 11:
                            q7jVar = (q7j) v8j.c(parcel, i5, q7j.CREATOR);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            i3jVar = (i3j) v8j.c(parcel, i5, i3j.CREATOR);
                            break;
                        case '\r':
                            ewiVar = (ewi) v8j.c(parcel, i5, ewi.CREATOR);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            iyiVar = (iyi) v8j.c(parcel, i5, iyi.CREATOR);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            l0jVar = (l0j) v8j.c(parcel, i5, l0j.CREATOR);
                            break;
                        case 16:
                            bArrB = v8j.b(parcel, i5);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            zI7 = v8j.i(parcel, i5);
                            break;
                        case 18:
                            dK = v8j.k(parcel, i5);
                            break;
                        default:
                            v8j.r(parcel, i5);
                            break;
                    }
                    w8jVar = w8jVar2;
                }
                v8j.h(parcel, iT5);
                z9j z9jVar = new z9j();
                z9jVar.a = iO6;
                z9jVar.b = strD5;
                z9jVar.y0 = bArrB;
                z9jVar.c = strD6;
                z9jVar.d = iO7;
                z9jVar.o = pointArr;
                z9jVar.z0 = zI7;
                z9jVar.A0 = dK;
                z9jVar.X = e2jVar;
                z9jVar.Y = o5jVar;
                z9jVar.Z = o6jVar;
                z9jVar.s0 = w8jVar;
                z9jVar.t0 = q7jVar;
                z9jVar.u0 = i3jVar;
                z9jVar.v0 = ewiVar;
                z9jVar.w0 = iyiVar;
                z9jVar.x0 = l0jVar;
                return z9jVar;
            case 5:
                int iT6 = v8j.t(parcel);
                String strD7 = null;
                int iO8 = 0;
                int iO9 = 0;
                int iO10 = 0;
                int iO11 = 0;
                int iO12 = 0;
                int iO13 = 0;
                boolean zI8 = false;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            iO8 = v8j.o(parcel, i6);
                            break;
                        case 3:
                            iO9 = v8j.o(parcel, i6);
                            break;
                        case 4:
                            iO10 = v8j.o(parcel, i6);
                            break;
                        case 5:
                            iO11 = v8j.o(parcel, i6);
                            break;
                        case 6:
                            iO12 = v8j.o(parcel, i6);
                            break;
                        case 7:
                            iO13 = v8j.o(parcel, i6);
                            break;
                        case '\b':
                            zI8 = v8j.i(parcel, i6);
                            break;
                        case '\t':
                            strD7 = v8j.d(parcel, i6);
                            break;
                        default:
                            v8j.r(parcel, i6);
                            break;
                    }
                }
                v8j.h(parcel, iT6);
                yti ytiVar = new yti();
                ytiVar.a = iO8;
                ytiVar.b = iO9;
                ytiVar.c = iO10;
                ytiVar.d = iO11;
                ytiVar.o = iO12;
                ytiVar.X = iO13;
                ytiVar.Y = zI8;
                ytiVar.Z = strD7;
                return ytiVar;
            case 6:
                int iT7 = v8j.t(parcel);
                IBinder iBinderN3 = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        v8j.r(parcel, i7);
                    } else {
                        iBinderN3 = v8j.n(parcel, i7);
                    }
                }
                v8j.h(parcel, iT7);
                return new v9f(iBinderN3);
            case 7:
                int iT8 = v8j.t(parcel);
                String strD8 = null;
                String strD9 = null;
                String strD10 = null;
                String strD11 = null;
                String strD12 = null;
                yti ytiVar2 = null;
                yti ytiVar3 = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strD8 = v8j.d(parcel, i8);
                            break;
                        case 3:
                            strD9 = v8j.d(parcel, i8);
                            break;
                        case 4:
                            strD10 = v8j.d(parcel, i8);
                            break;
                        case 5:
                            strD11 = v8j.d(parcel, i8);
                            break;
                        case 6:
                            strD12 = v8j.d(parcel, i8);
                            break;
                        case 7:
                            ytiVar2 = (yti) v8j.c(parcel, i8, yti.CREATOR);
                            break;
                        case '\b':
                            ytiVar3 = (yti) v8j.c(parcel, i8, yti.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i8);
                            break;
                    }
                }
                v8j.h(parcel, iT8);
                ewi ewiVar2 = new ewi();
                ewiVar2.a = strD8;
                ewiVar2.b = strD9;
                ewiVar2.c = strD10;
                ewiVar2.d = strD11;
                ewiVar2.o = strD12;
                ewiVar2.X = ytiVar2;
                ewiVar2.Y = ytiVar3;
                return ewiVar2;
            case 8:
                int iT9 = v8j.t(parcel);
                String strD13 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c2 = (char) i9;
                    if (c2 == 2) {
                        strD13 = v8j.d(parcel, i9);
                    } else if (c2 != 5) {
                        v8j.r(parcel, i9);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) v8j.c(parcel, i9, GoogleSignInOptions.CREATOR);
                    }
                }
                v8j.h(parcel, iT9);
                return new SignInConfiguration(strD13, googleSignInOptions);
            case 9:
                int iT10 = v8j.t(parcel);
                String[] strArrE = null;
                int iO14 = 0;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        iO14 = v8j.o(parcel, i10);
                    } else if (c3 != 2) {
                        v8j.r(parcel, i10);
                    } else {
                        strArrE = v8j.e(parcel, i10);
                    }
                }
                v8j.h(parcel, iT10);
                return new mcj(iO14, strArrE);
            case 10:
                int iT11 = v8j.t(parcel);
                m4j m4jVar = null;
                String strD14 = null;
                String strD15 = null;
                o5j[] o5jVarArr = null;
                e2j[] e2jVarArr = null;
                String[] strArrE2 = null;
                wri[] wriVarArr = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            m4jVar = (m4j) v8j.c(parcel, i11, m4j.CREATOR);
                            break;
                        case 3:
                            strD14 = v8j.d(parcel, i11);
                            break;
                        case 4:
                            strD15 = v8j.d(parcel, i11);
                            break;
                        case 5:
                            o5jVarArr = (o5j[]) v8j.f(parcel, i11, o5j.CREATOR);
                            break;
                        case 6:
                            e2jVarArr = (e2j[]) v8j.f(parcel, i11, e2j.CREATOR);
                            break;
                        case 7:
                            strArrE2 = v8j.e(parcel, i11);
                            break;
                        case '\b':
                            wriVarArr = (wri[]) v8j.f(parcel, i11, wri.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i11);
                            break;
                    }
                }
                v8j.h(parcel, iT11);
                iyi iyiVar2 = new iyi();
                iyiVar2.a = m4jVar;
                iyiVar2.b = strD14;
                iyiVar2.c = strD15;
                iyiVar2.d = o5jVarArr;
                iyiVar2.o = e2jVarArr;
                iyiVar2.X = strArrE2;
                iyiVar2.Y = wriVarArr;
                return iyiVar2;
            case 11:
                int iT12 = v8j.t(parcel);
                String strD16 = null;
                String strD17 = null;
                byte[] bArrB2 = null;
                Point[] pointArr2 = null;
                rcj rcjVar = null;
                ucj ucjVar = null;
                vcj vcjVar = null;
                ycj ycjVar = null;
                wcj wcjVar = null;
                scj scjVar = null;
                ocj ocjVar = null;
                pcj pcjVar = null;
                qcj qcjVar = null;
                int iO15 = 0;
                int iO16 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iO15 = v8j.o(parcel, i12);
                            break;
                        case 2:
                            strD16 = v8j.d(parcel, i12);
                            break;
                        case 3:
                            strD17 = v8j.d(parcel, i12);
                            break;
                        case 4:
                            bArrB2 = v8j.b(parcel, i12);
                            break;
                        case 5:
                            pointArr2 = (Point[]) v8j.f(parcel, i12, Point.CREATOR);
                            break;
                        case 6:
                            iO16 = v8j.o(parcel, i12);
                            break;
                        case 7:
                            rcjVar = (rcj) v8j.c(parcel, i12, rcj.CREATOR);
                            break;
                        case '\b':
                            ucjVar = (ucj) v8j.c(parcel, i12, ucj.CREATOR);
                            break;
                        case '\t':
                            vcjVar = (vcj) v8j.c(parcel, i12, vcj.CREATOR);
                            break;
                        case '\n':
                            ycjVar = (ycj) v8j.c(parcel, i12, ycj.CREATOR);
                            break;
                        case 11:
                            wcjVar = (wcj) v8j.c(parcel, i12, wcj.CREATOR);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            scjVar = (scj) v8j.c(parcel, i12, scj.CREATOR);
                            break;
                        case '\r':
                            ocjVar = (ocj) v8j.c(parcel, i12, ocj.CREATOR);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            pcjVar = (pcj) v8j.c(parcel, i12, pcj.CREATOR);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            qcjVar = (qcj) v8j.c(parcel, i12, qcj.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i12);
                            break;
                    }
                }
                v8j.h(parcel, iT12);
                return new zcj(iO15, strD16, strD17, bArrB2, pointArr2, iO16, rcjVar, ucjVar, vcjVar, ycjVar, wcjVar, scjVar, ocjVar, pcjVar, qcjVar);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iT13 = v8j.t(parcel);
                String strD18 = null;
                int iO17 = 0;
                int iO18 = 0;
                int iO19 = 0;
                int iO20 = 0;
                int iO21 = 0;
                int iO22 = 0;
                boolean zI9 = false;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iO17 = v8j.o(parcel, i13);
                            break;
                        case 2:
                            iO18 = v8j.o(parcel, i13);
                            break;
                        case 3:
                            iO19 = v8j.o(parcel, i13);
                            break;
                        case 4:
                            iO20 = v8j.o(parcel, i13);
                            break;
                        case 5:
                            iO21 = v8j.o(parcel, i13);
                            break;
                        case 6:
                            iO22 = v8j.o(parcel, i13);
                            break;
                        case 7:
                            zI9 = v8j.i(parcel, i13);
                            break;
                        case '\b':
                            strD18 = v8j.d(parcel, i13);
                            break;
                        default:
                            v8j.r(parcel, i13);
                            break;
                    }
                }
                v8j.h(parcel, iT13);
                return new ncj(iO17, iO18, iO19, iO20, iO21, iO22, zI9, strD18);
            case 13:
                int iT14 = v8j.t(parcel);
                String strD19 = null;
                String strD20 = null;
                String strD21 = null;
                String strD22 = null;
                String strD23 = null;
                ncj ncjVar = null;
                ncj ncjVar2 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strD19 = v8j.d(parcel, i14);
                            break;
                        case 2:
                            strD20 = v8j.d(parcel, i14);
                            break;
                        case 3:
                            strD21 = v8j.d(parcel, i14);
                            break;
                        case 4:
                            strD22 = v8j.d(parcel, i14);
                            break;
                        case 5:
                            strD23 = v8j.d(parcel, i14);
                            break;
                        case 6:
                            ncjVar = (ncj) v8j.c(parcel, i14, ncj.CREATOR);
                            break;
                        case 7:
                            ncjVar2 = (ncj) v8j.c(parcel, i14, ncj.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i14);
                            break;
                    }
                }
                v8j.h(parcel, iT14);
                return new ocj(strD19, strD20, strD21, strD22, strD23, ncjVar, ncjVar2);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iT15 = v8j.t(parcel);
                tcj tcjVar = null;
                String strD24 = null;
                String strD25 = null;
                ucj[] ucjVarArr = null;
                rcj[] rcjVarArr = null;
                String[] strArrE3 = null;
                mcj[] mcjVarArr = null;
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            tcjVar = (tcj) v8j.c(parcel, i15, tcj.CREATOR);
                            break;
                        case 2:
                            strD24 = v8j.d(parcel, i15);
                            break;
                        case 3:
                            strD25 = v8j.d(parcel, i15);
                            break;
                        case 4:
                            ucjVarArr = (ucj[]) v8j.f(parcel, i15, ucj.CREATOR);
                            break;
                        case 5:
                            rcjVarArr = (rcj[]) v8j.f(parcel, i15, rcj.CREATOR);
                            break;
                        case 6:
                            strArrE3 = v8j.e(parcel, i15);
                            break;
                        case 7:
                            mcjVarArr = (mcj[]) v8j.f(parcel, i15, mcj.CREATOR);
                            break;
                        default:
                            v8j.r(parcel, i15);
                            break;
                    }
                }
                v8j.h(parcel, iT15);
                return new pcj(tcjVar, strD24, strD25, ucjVarArr, rcjVarArr, strArrE3, mcjVarArr);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int iT16 = v8j.t(parcel);
                String strD26 = null;
                String strD27 = null;
                String strD28 = null;
                String strD29 = null;
                String strD30 = null;
                String strD31 = null;
                String strD32 = null;
                String strD33 = null;
                String strD34 = null;
                String strD35 = null;
                String strD36 = null;
                String strD37 = null;
                String strD38 = null;
                String strD39 = null;
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strD26 = v8j.d(parcel, i16);
                            break;
                        case 2:
                            strD27 = v8j.d(parcel, i16);
                            break;
                        case 3:
                            strD28 = v8j.d(parcel, i16);
                            break;
                        case 4:
                            strD29 = v8j.d(parcel, i16);
                            break;
                        case 5:
                            strD30 = v8j.d(parcel, i16);
                            break;
                        case 6:
                            strD31 = v8j.d(parcel, i16);
                            break;
                        case 7:
                            strD32 = v8j.d(parcel, i16);
                            break;
                        case '\b':
                            strD33 = v8j.d(parcel, i16);
                            break;
                        case '\t':
                            strD34 = v8j.d(parcel, i16);
                            break;
                        case '\n':
                            strD35 = v8j.d(parcel, i16);
                            break;
                        case 11:
                            strD36 = v8j.d(parcel, i16);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            strD37 = v8j.d(parcel, i16);
                            break;
                        case '\r':
                            strD38 = v8j.d(parcel, i16);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            strD39 = v8j.d(parcel, i16);
                            break;
                        default:
                            v8j.r(parcel, i16);
                            break;
                    }
                }
                v8j.h(parcel, iT16);
                return new qcj(strD26, strD27, strD28, strD29, strD30, strD31, strD32, strD33, strD34, strD35, strD36, strD37, strD38, strD39);
            case 16:
                int iT17 = v8j.t(parcel);
                String strD40 = null;
                String strD41 = null;
                int iO23 = 0;
                String strD42 = null;
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    char c4 = (char) i17;
                    if (c4 == 1) {
                        iO23 = v8j.o(parcel, i17);
                    } else if (c4 == 2) {
                        strD40 = v8j.d(parcel, i17);
                    } else if (c4 == 3) {
                        strD42 = v8j.d(parcel, i17);
                    } else if (c4 != 4) {
                        v8j.r(parcel, i17);
                    } else {
                        strD41 = v8j.d(parcel, i17);
                    }
                }
                v8j.h(parcel, iT17);
                return new rcj(strD40, iO23, strD42, strD41);
            case LangUtils.HASH_SEED /* 17 */:
                int iT18 = v8j.t(parcel);
                double dK2 = 0.0d;
                double dK3 = 0.0d;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    char c5 = (char) i18;
                    if (c5 == 1) {
                        dK2 = v8j.k(parcel, i18);
                    } else if (c5 != 2) {
                        v8j.r(parcel, i18);
                    } else {
                        dK3 = v8j.k(parcel, i18);
                    }
                }
                v8j.h(parcel, iT18);
                return new scj(dK2, dK3);
            case 18:
                int iT19 = v8j.t(parcel);
                String strD43 = null;
                String strD44 = null;
                String strD45 = null;
                String strD46 = null;
                String strD47 = null;
                String strD48 = null;
                String strD49 = null;
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strD43 = v8j.d(parcel, i19);
                            break;
                        case 2:
                            strD44 = v8j.d(parcel, i19);
                            break;
                        case 3:
                            strD45 = v8j.d(parcel, i19);
                            break;
                        case 4:
                            strD46 = v8j.d(parcel, i19);
                            break;
                        case 5:
                            strD47 = v8j.d(parcel, i19);
                            break;
                        case 6:
                            strD48 = v8j.d(parcel, i19);
                            break;
                        case 7:
                            strD49 = v8j.d(parcel, i19);
                            break;
                        default:
                            v8j.r(parcel, i19);
                            break;
                    }
                }
                v8j.h(parcel, iT19);
                return new tcj(strD43, strD44, strD45, strD46, strD47, strD48, strD49);
            case 19:
                int iT20 = v8j.t(parcel);
                String strD50 = null;
                int iO24 = 0;
                while (parcel.dataPosition() < iT20) {
                    int i20 = parcel.readInt();
                    char c6 = (char) i20;
                    if (c6 == 1) {
                        iO24 = v8j.o(parcel, i20);
                    } else if (c6 != 2) {
                        v8j.r(parcel, i20);
                    } else {
                        strD50 = v8j.d(parcel, i20);
                    }
                }
                v8j.h(parcel, iT20);
                return new ucj(iO24, strD50);
            case 20:
                int iT21 = v8j.t(parcel);
                String strD51 = null;
                String strD52 = null;
                while (parcel.dataPosition() < iT21) {
                    int i21 = parcel.readInt();
                    char c7 = (char) i21;
                    if (c7 == 1) {
                        strD51 = v8j.d(parcel, i21);
                    } else if (c7 != 2) {
                        v8j.r(parcel, i21);
                    } else {
                        strD52 = v8j.d(parcel, i21);
                    }
                }
                v8j.h(parcel, iT21);
                return new vcj(strD51, strD52);
            case 21:
                int iT22 = v8j.t(parcel);
                String strD53 = null;
                String strD54 = null;
                while (parcel.dataPosition() < iT22) {
                    int i22 = parcel.readInt();
                    char c8 = (char) i22;
                    if (c8 == 1) {
                        strD53 = v8j.d(parcel, i22);
                    } else if (c8 != 2) {
                        v8j.r(parcel, i22);
                    } else {
                        strD54 = v8j.d(parcel, i22);
                    }
                }
                v8j.h(parcel, iT22);
                return new wcj(strD53, strD54);
            case 22:
                int iT23 = v8j.t(parcel);
                int iO25 = 0;
                String strD55 = null;
                String strD56 = null;
                while (parcel.dataPosition() < iT23) {
                    int i23 = parcel.readInt();
                    char c9 = (char) i23;
                    if (c9 == 1) {
                        strD55 = v8j.d(parcel, i23);
                    } else if (c9 == 2) {
                        strD56 = v8j.d(parcel, i23);
                    } else if (c9 != 3) {
                        v8j.r(parcel, i23);
                    } else {
                        iO25 = v8j.o(parcel, i23);
                    }
                }
                v8j.h(parcel, iT23);
                return new ycj(strD55, strD56, iO25);
            default:
                int iT24 = v8j.t(parcel);
                String strD57 = null;
                String strD58 = null;
                String strD59 = null;
                String strD60 = null;
                String strD61 = null;
                String strD62 = null;
                String strD63 = null;
                String strD64 = null;
                String strD65 = null;
                String strD66 = null;
                String strD67 = null;
                String strD68 = null;
                String strD69 = null;
                String strD70 = null;
                while (parcel.dataPosition() < iT24) {
                    int i24 = parcel.readInt();
                    String str = strD69;
                    switch ((char) i24) {
                        case 2:
                            strD57 = v8j.d(parcel, i24);
                            break;
                        case 3:
                            strD58 = v8j.d(parcel, i24);
                            break;
                        case 4:
                            strD59 = v8j.d(parcel, i24);
                            break;
                        case 5:
                            strD60 = v8j.d(parcel, i24);
                            break;
                        case 6:
                            strD61 = v8j.d(parcel, i24);
                            break;
                        case 7:
                            strD62 = v8j.d(parcel, i24);
                            break;
                        case '\b':
                            strD63 = v8j.d(parcel, i24);
                            break;
                        case '\t':
                            strD64 = v8j.d(parcel, i24);
                            break;
                        case '\n':
                            strD65 = v8j.d(parcel, i24);
                            break;
                        case 11:
                            strD66 = v8j.d(parcel, i24);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            strD67 = v8j.d(parcel, i24);
                            break;
                        case '\r':
                            strD68 = v8j.d(parcel, i24);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            strD69 = v8j.d(parcel, i24);
                            continue;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            strD70 = v8j.d(parcel, i24);
                            break;
                        default:
                            v8j.r(parcel, i24);
                            break;
                    }
                    strD69 = str;
                }
                v8j.h(parcel, iT24);
                l0j l0jVar2 = new l0j();
                l0jVar2.a = strD57;
                l0jVar2.b = strD58;
                l0jVar2.c = strD59;
                l0jVar2.d = strD60;
                l0jVar2.o = strD61;
                l0jVar2.X = strD62;
                l0jVar2.Y = strD63;
                l0jVar2.Z = strD64;
                l0jVar2.s0 = strD65;
                l0jVar2.t0 = strD66;
                l0jVar2.u0 = strD67;
                l0jVar2.v0 = strD68;
                l0jVar2.w0 = strD69;
                l0jVar2.x0 = strD70;
                return l0jVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new eo8[i];
            case 1:
                return new mp8[i];
            case 2:
                return new apb[i];
            case 3:
                return new q5c[i];
            case 4:
                return new z9j[i];
            case 5:
                return new yti[i];
            case 6:
                return new v9f[i];
            case 7:
                return new ewi[i];
            case 8:
                return new SignInConfiguration[i];
            case 9:
                return new mcj[i];
            case 10:
                return new iyi[i];
            case 11:
                return new zcj[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ncj[i];
            case 13:
                return new ocj[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new pcj[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new qcj[i];
            case 16:
                return new rcj[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new scj[i];
            case 18:
                return new tcj[i];
            case 19:
                return new ucj[i];
            case 20:
                return new vcj[i];
            case 21:
                return new wcj[i];
            case 22:
                return new ycj[i];
            default:
                return new l0j[i];
        }
    }
}
