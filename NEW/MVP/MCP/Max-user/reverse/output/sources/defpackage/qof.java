package defpackage;

import android.location.Location;
import android.os.Parcel;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class qof implements rof, ikd {
    public static final /* synthetic */ qof a = new qof();

    @Override // defpackage.rof
    public int J(hf6 hf6Var) {
        return 1;
    }

    @Override // defpackage.ikd
    public void accept(Object obj, Object obj2) {
        qt5 qt5Var;
        n2g n2gVar = (n2g) obj2;
        yji yjiVar = (yji) obj;
        qt5 qt5Var2 = null;
        z08 z08Var = new z08(BuildConfig.MAX_TIME_TO_UPLOAD, 0, false, null);
        qt5[] qt5VarArrH = yjiVar.h();
        if (qt5VarArrH != null) {
            int i = 0;
            while (true) {
                if (i >= qt5VarArrH.length) {
                    qt5Var = null;
                    break;
                }
                qt5Var = qt5VarArrH[i];
                if ("location_updates_with_callback".equals(qt5Var.a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (qt5Var != null && qt5Var.b() >= 1) {
                y9j y9jVar = (y9j) yjiVar.o();
                wii wiiVar = new wii(n2gVar, 1);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i2 = xgi.a;
                parcelObtain.writeInt(1);
                z08Var.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                int iK = a9j.k(parcelObtain, 20293);
                a9j.m(parcelObtain, 1, 4);
                parcelObtain.writeInt(4);
                a9j.e(parcelObtain, 3, wiiVar);
                a9j.l(parcelObtain, iK);
                y9jVar.i(parcelObtain, 90);
                return;
            }
        }
        qt5[] qt5VarArrH2 = yjiVar.h();
        if (qt5VarArrH2 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= qt5VarArrH2.length) {
                    break;
                }
                qt5 qt5Var3 = qt5VarArrH2[i3];
                if ("get_last_location_with_request".equals(qt5Var3.a)) {
                    qt5Var2 = qt5Var3;
                    break;
                }
                i3++;
            }
            if (qt5Var2 != null && qt5Var2.b() >= 1) {
                y9j y9jVar2 = (y9j) yjiVar.o();
                wii wiiVar2 = new wii(n2gVar, 1);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i4 = xgi.a;
                parcelObtain2.writeInt(1);
                z08Var.writeToParcel(parcelObtain2, 0);
                parcelObtain2.writeStrongBinder(wiiVar2);
                y9jVar2.i(parcelObtain2, 82);
                return;
            }
        }
        y9j y9jVar3 = (y9j) yjiVar.o();
        Parcel parcelObtain3 = Parcel.obtain();
        parcelObtain3.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Parcel parcelObtain4 = Parcel.obtain();
        try {
            try {
                y9jVar3.c.transact(7, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                parcelObtain3.recycle();
                Location location = (Location) xgi.a(parcelObtain4, Location.CREATOR);
                parcelObtain4.recycle();
                n2gVar.b(location);
            } catch (RuntimeException e) {
                parcelObtain4.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain3.recycle();
            throw th;
        }
    }

    @Override // defpackage.rof
    public boolean f(hf6 hf6Var) {
        return false;
    }

    @Override // defpackage.rof
    public tof x(hf6 hf6Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }
}
