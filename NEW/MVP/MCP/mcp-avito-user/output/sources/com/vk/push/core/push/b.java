package com.vk.push.core.push;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.push.core.base.a;

/* compiled from: PushProvider.java */
/* loaded from: classes7.dex */
public interface b extends IInterface {
    void j(String str, String str2, com.vk.push.core.base.a aVar);

    /* compiled from: PushProvider.java */
    /* renamed from: com.vk.push.core.push.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC10843b extends Binder implements b {

        /* compiled from: PushProvider.java */
        /* renamed from: com.vk.push.core.push.b$b$a */
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f367142a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f367142a;
            }

            @Override // com.vk.push.core.push.b
            public final void j(String str, String str2, com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.push.PushProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367142a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC10843b() {
            attachInterface(this, "com.vk.push.core.push.PushProvider");
        }

        public static b e4(IBinder iBinder) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.push.PushProvider");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof b)) {
                return (b) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f367142a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.push.PushProvider");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.push.core.push.PushProvider");
                return true;
            }
            if (i12 != 2) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            j(parcel.readString(), parcel.readString(), a.b.e4(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: PushProvider.java */
    public static class a implements b {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.push.b
        public final void j(String str, String str2, com.vk.push.core.base.a aVar) {
        }
    }
}
