package com.vk.push.core.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.push.core.base.a;

/* compiled from: Auth.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {
    void X0(com.vk.push.core.base.a aVar);

    void a(com.vk.push.core.base.a aVar);

    /* compiled from: Auth.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: Auth.java */
        /* renamed from: com.vk.push.core.auth.a$b$a, reason: collision with other inner class name */
        public static class C10833a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f367005a;

            @Override // com.vk.push.core.auth.a
            public final void X0(com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.auth.Auth");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367005a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.vk.push.core.auth.a
            public final void a(com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.auth.Auth");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367005a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f367005a;
            }
        }

        public b() {
            attachInterface(this, "com.vk.push.core.auth.Auth");
        }

        public static a e4(IBinder iBinder) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.auth.Auth");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C10833a c10833a = new C10833a();
            c10833a.f367005a = iBinder;
            return c10833a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.auth.Auth");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.push.core.auth.Auth");
                return true;
            }
            if (i12 == 2) {
                a(a.b.e4(parcel.readStrongBinder()));
            } else {
                if (i12 != 3) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                X0(a.b.e4(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: Auth.java */
    /* renamed from: com.vk.push.core.auth.a$a, reason: collision with other inner class name */
    public static class C10832a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.auth.a
        public final void X0(com.vk.push.core.base.a aVar) {
        }

        @Override // com.vk.push.core.auth.a
        public final void a(com.vk.push.core.base.a aVar) {
        }
    }
}
