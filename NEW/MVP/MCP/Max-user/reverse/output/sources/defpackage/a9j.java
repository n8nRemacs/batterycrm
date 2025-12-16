package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a9j {
    public static final void a(esg esgVar) {
        esgVar.b(1, new qu4(9));
        esgVar.b(2, new qu4(10));
        esgVar.b(2, new qu4(11));
        esgVar.b(2, new qu4(12));
        esgVar.b(2, new qu4(13));
        esgVar.b(2, new qu4(14));
        esgVar.b(2, new qu4(15));
        esgVar.b(2, new qu4(16));
        esgVar.b(2, new qu4(17));
        esgVar.b(2, new c31(29));
        esgVar.b(2, new qu4(0));
        esgVar.b(2, new qu4(1));
        esgVar.b(2, new qu4(2));
        esgVar.b(2, new qu4(3));
        esgVar.b(2, new qu4(4));
        esgVar.b(2, new qu4(5));
        esgVar.b(2, new qu4(6));
        esgVar.b(2, new qu4(7));
        esgVar.b(2, new qu4(8));
    }

    public static void b(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iK = k(parcel, i);
        parcel.writeBundle(bundle);
        l(parcel, iK);
    }

    public static void c(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iK = k(parcel, i);
        parcel.writeByteArray(bArr);
        l(parcel, iK);
    }

    public static void d(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        m(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void e(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iK = k(parcel, i);
        parcel.writeStrongBinder(iBinder);
        l(parcel, iK);
    }

    public static void f(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iK = k(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        l(parcel, iK);
    }

    public static void g(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iK = k(parcel, i);
        parcel.writeString(str);
        l(parcel, iK);
    }

    public static void h(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iK = k(parcel, i);
        parcel.writeStringArray(strArr);
        l(parcel, iK);
    }

    public static void i(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iK = k(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        l(parcel, iK);
    }

    public static void j(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int iK = k(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        l(parcel, iK);
    }

    public static int k(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void l(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void m(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
