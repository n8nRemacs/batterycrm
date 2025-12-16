package com.vk.silentauth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: ISilentAuthInfoProvider.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {

    /* compiled from: ISilentAuthInfoProvider.java */
    /* renamed from: com.vk.silentauth.a$a, reason: collision with other inner class name */
    public static class C10849a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.vk.silentauth.a
        public final List u0(int i12, String str, String str2, String str3, String str4, String str5) {
            return null;
        }
    }

    /* compiled from: ISilentAuthInfoProvider.java */
    public static class c {
    }

    void D();

    List u0(int i12, String str, String str2, String str3, String str4, String str5);

    /* compiled from: ISilentAuthInfoProvider.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: ISilentAuthInfoProvider.java */
        /* renamed from: com.vk.silentauth.a$b$a, reason: collision with other inner class name */
        public static class C10850a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f367210a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f367210a;
            }

            @Override // com.vk.silentauth.a
            public final List u0(int i12, String str, String str2, String str3, String str4, String str5) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.silentauth.ISilentAuthInfoProvider");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    parcelObtain.writeString(null);
                    this.f367210a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(SilentAuthInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "com.vk.silentauth.ISilentAuthInfoProvider");
        }

        public static a e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.vk.silentauth.ISilentAuthInfoProvider");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C10850a c10850a = new C10850a();
            c10850a.f367210a = iBinder;
            return c10850a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.silentauth.ISilentAuthInfoProvider");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.silentauth.ISilentAuthInfoProvider");
                return true;
            }
            if (i12 == 1) {
                int i14 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                parcel.readString();
                List listU0 = u0(i14, string, string2, string3, string4, string5);
                parcel2.writeNoException();
                if (listU0 == null) {
                    parcel2.writeInt(-1);
                } else {
                    int size = listU0.size();
                    parcel2.writeInt(size);
                    for (int i15 = 0; i15 < size; i15++) {
                        Parcelable parcelable = (Parcelable) listU0.get(i15);
                        if (parcelable != null) {
                            parcel2.writeInt(1);
                            parcelable.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                    }
                }
            } else {
                if (i12 != 2) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                D();
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
