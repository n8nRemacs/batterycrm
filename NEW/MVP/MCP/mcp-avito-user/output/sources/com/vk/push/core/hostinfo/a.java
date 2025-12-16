package com.vk.push.core.hostinfo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.push.core.base.a;

/* compiled from: MasterElections.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {
    void F();

    void l2();

    void o0(com.vk.push.core.base.a aVar);

    void s();

    /* compiled from: MasterElections.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: MasterElections.java */
        /* renamed from: com.vk.push.core.hostinfo.a$b$a, reason: collision with other inner class name */
        public static class C10838a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f367028a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f367028a;
            }

            @Override // com.vk.push.core.hostinfo.a
            public final void o0(com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.hostinfo.MasterElections");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367028a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "com.vk.push.core.hostinfo.MasterElections");
        }

        public static a e4(IBinder iBinder) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.hostinfo.MasterElections");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C10838a c10838a = new C10838a();
            c10838a.f367028a = iBinder;
            return c10838a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.hostinfo.MasterElections");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.push.core.hostinfo.MasterElections");
                return true;
            }
            if (i12 == 2) {
                a.b.e4(parcel.readStrongBinder());
                s();
            } else if (i12 == 3) {
                a.b.e4(parcel.readStrongBinder());
                F();
            } else if (i12 == 4) {
                o0(a.b.e4(parcel.readStrongBinder()));
            } else {
                if (i12 != 5) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                parcel.readString();
                a.b.e4(parcel.readStrongBinder());
                l2();
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: MasterElections.java */
    /* renamed from: com.vk.push.core.hostinfo.a$a, reason: collision with other inner class name */
    public static class C10837a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.hostinfo.a
        public final void o0(com.vk.push.core.base.a aVar) {
        }
    }
}
