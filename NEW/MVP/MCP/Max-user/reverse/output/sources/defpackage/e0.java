package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return f0.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new en(parcel, null);
            case 2:
                return new v73(parcel, null);
            case 3:
                return new f74(parcel, null);
            case 4:
                return new ci6(parcel, null);
            case 5:
                return new hq8(parcel, null);
            case 6:
                return new fid(parcel, null);
            case 7:
                return new v7e(parcel, null);
            case 8:
                return new l4g(parcel, null);
            case 9:
                return new rgh(parcel, null);
            default:
                ahh ahhVar = new ahh(parcel, null);
                ahhVar.a = parcel.readInt();
                ahhVar.b = parcel.readInt();
                ahhVar.c = parcel.readParcelable(null);
                return ahhVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f0[i];
            case 1:
                return new en[i];
            case 2:
                return new v73[i];
            case 3:
                return new f74[i];
            case 4:
                return new ci6[i];
            case 5:
                return new hq8[i];
            case 6:
                return new fid[i];
            case 7:
                return new v7e[i];
            case 8:
                return new l4g[i];
            case 9:
                return new rgh[i];
            default:
                return new ahh[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return f0.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new en(parcel, classLoader);
            case 2:
                return new v73(parcel, classLoader);
            case 3:
                return new f74(parcel, classLoader);
            case 4:
                return new ci6(parcel, classLoader);
            case 5:
                return new hq8(parcel, classLoader);
            case 6:
                return new fid(parcel, classLoader);
            case 7:
                return new v7e(parcel, classLoader);
            case 8:
                return new l4g(parcel, classLoader);
            case 9:
                return new rgh(parcel, classLoader);
            default:
                ahh ahhVar = new ahh(parcel, classLoader);
                ahhVar.a = parcel.readInt();
                ahhVar.b = parcel.readInt();
                ahhVar.c = parcel.readParcelable(classLoader);
                return ahhVar;
        }
    }
}
