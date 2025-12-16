package TX0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public class a {
    public static void a(@N Parcel parcel, int i12, @N Bundle bundle, boolean z12) {
        if (bundle == null) {
            if (z12) {
                q(parcel, i12, 0);
            }
        } else {
            int iO2 = o(parcel, i12);
            parcel.writeBundle(bundle);
            p(parcel, iO2);
        }
    }

    public static void b(@N Parcel parcel, int i12, @N byte[] bArr, boolean z12) {
        if (bArr == null) {
            if (z12) {
                q(parcel, i12, 0);
            }
        } else {
            int iO2 = o(parcel, i12);
            parcel.writeByteArray(bArr);
            p(parcel, iO2);
        }
    }

    public static void c(@N Parcel parcel, int i12, @N Double d12) {
        if (d12 == null) {
            return;
        }
        q(parcel, i12, 8);
        parcel.writeDouble(d12.doubleValue());
    }

    public static void d(@N Parcel parcel, int i12, @N Float f12) {
        if (f12 == null) {
            return;
        }
        q(parcel, i12, 4);
        parcel.writeFloat(f12.floatValue());
    }

    public static void e(@N Parcel parcel, int i12, @N IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iO2 = o(parcel, i12);
        parcel.writeStrongBinder(iBinder);
        p(parcel, iO2);
    }

    public static void f(@N Parcel parcel, int i12, @N int[] iArr, boolean z12) {
        if (iArr == null) {
            if (z12) {
                q(parcel, i12, 0);
            }
        } else {
            int iO2 = o(parcel, i12);
            parcel.writeIntArray(iArr);
            p(parcel, iO2);
        }
    }

    public static void g(@N Parcel parcel, int i12, @N Integer num) {
        if (num == null) {
            return;
        }
        q(parcel, i12, 4);
        parcel.writeInt(num.intValue());
    }

    public static void h(@N Parcel parcel, int i12, @N Long l12) {
        if (l12 == null) {
            return;
        }
        q(parcel, i12, 8);
        parcel.writeLong(l12.longValue());
    }

    public static void i(@N Parcel parcel, int i12, @N Parcelable parcelable, int i13, boolean z12) {
        if (parcelable == null) {
            if (z12) {
                q(parcel, i12, 0);
            }
        } else {
            int iO2 = o(parcel, i12);
            parcelable.writeToParcel(parcel, i13);
            p(parcel, iO2);
        }
    }

    public static void j(@N Parcel parcel, int i12, @N String str, boolean z12) {
        if (str == null) {
            if (z12) {
                q(parcel, i12, 0);
            }
        } else {
            int iO2 = o(parcel, i12);
            parcel.writeString(str);
            p(parcel, iO2);
        }
    }

    public static void k(@N Parcel parcel, int i12, @N String[] strArr, boolean z12) {
        if (strArr == null) {
            if (z12) {
                q(parcel, i12, 0);
            }
        } else {
            int iO2 = o(parcel, i12);
            parcel.writeStringArray(strArr);
            p(parcel, iO2);
        }
    }

    public static void l(@N List list, @N Parcel parcel, int i12) {
        if (list == null) {
            return;
        }
        int iO2 = o(parcel, i12);
        parcel.writeStringList(list);
        p(parcel, iO2);
    }

    public static void m(@N Parcel parcel, int i12, @N Parcelable[] parcelableArr, int i13) {
        if (parcelableArr == null) {
            return;
        }
        int iO2 = o(parcel, i12);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i13);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        p(parcel, iO2);
    }

    public static <T extends Parcelable> void n(@N Parcel parcel, int i12, @N List<T> list, boolean z12) {
        if (list == null) {
            if (z12) {
                q(parcel, i12, 0);
                return;
            }
            return;
        }
        int iO2 = o(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            T t12 = list.get(i13);
            if (t12 == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                t12.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        p(parcel, iO2);
    }

    public static int o(Parcel parcel, int i12) {
        parcel.writeInt(i12 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void p(Parcel parcel, int i12) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i12 - 4);
        parcel.writeInt(iDataPosition - i12);
        parcel.setDataPosition(iDataPosition);
    }

    public static void q(Parcel parcel, int i12, int i13) {
        parcel.writeInt(i12 | (i13 << 16));
    }
}
