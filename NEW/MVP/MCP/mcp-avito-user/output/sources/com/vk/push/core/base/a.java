package com.vk.push.core.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.push.core.ipc.q;

/* compiled from: AsyncCallback.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {

    /* compiled from: AsyncCallback.java */
    public static class c {
    }

    void e2(AidlResult aidlResult);

    /* compiled from: AsyncCallback.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: AsyncCallback.java */
        /* renamed from: com.vk.push.core.base.a$b$a, reason: collision with other inner class name */
        public static class C10836a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f367016a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f367016a;
            }

            @Override // com.vk.push.core.base.a
            public final void e2(AidlResult aidlResult) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.base.AsyncCallback");
                    parcelObtain.writeInt(1);
                    aidlResult.writeToParcel(parcelObtain, 0);
                    this.f367016a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "com.vk.push.core.base.AsyncCallback");
        }

        public static a e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.base.AsyncCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C10836a c10836a = new C10836a();
            c10836a.f367016a = iBinder;
            return c10836a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.base.AsyncCallback");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.push.core.base.AsyncCallback");
                return true;
            }
            if (i12 != 2) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            ((q.a.BinderC10840a) this).e2(parcel.readInt() != 0 ? AidlResult.CREATOR.createFromParcel(parcel) : null);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: AsyncCallback.java */
    /* renamed from: com.vk.push.core.base.a$a, reason: collision with other inner class name */
    public static class C10835a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.base.a
        public final void e2(AidlResult aidlResult) {
        }
    }
}
