package com.vk.push.core.test;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.push.core.base.a;

/* compiled from: TestPushProvider.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {

    /* compiled from: TestPushProvider.java */
    public static class c {
    }

    void a(com.vk.push.core.base.a aVar);

    void j(String str, String str2, com.vk.push.core.base.a aVar);

    void u1(String str, TestPushPayload testPushPayload, com.vk.push.core.base.a aVar);

    /* compiled from: TestPushProvider.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: TestPushProvider.java */
        /* renamed from: com.vk.push.core.test.a$b$a, reason: collision with other inner class name */
        public static class C10846a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f367159a;

            @Override // com.vk.push.core.test.a
            public final void a(com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.test.TestPushProvider");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367159a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f367159a;
            }

            @Override // com.vk.push.core.test.a
            public final void j(String str, String str2, com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.test.TestPushProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367159a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.vk.push.core.test.a
            public final void u1(String str, TestPushPayload testPushPayload, com.vk.push.core.base.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.vk.push.core.test.TestPushProvider");
                    parcelObtain.writeString(str);
                    if (testPushPayload != null) {
                        parcelObtain.writeInt(1);
                        testPushPayload.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongInterface(aVar);
                    this.f367159a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "com.vk.push.core.test.TestPushProvider");
        }

        public static a e4(IBinder iBinder) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.test.TestPushProvider");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C10846a c10846a = new C10846a();
            c10846a.f367159a = iBinder;
            return c10846a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.test.TestPushProvider");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.push.core.test.TestPushProvider");
                return true;
            }
            if (i12 == 2) {
                j(parcel.readString(), parcel.readString(), a.b.e4(parcel.readStrongBinder()));
            } else if (i12 == 3) {
                u1(parcel.readString(), (TestPushPayload) (parcel.readInt() != 0 ? TestPushPayload.INSTANCE.createFromParcel(parcel) : null), a.b.e4(parcel.readStrongBinder()));
            } else {
                if (i12 != 4) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                a(a.b.e4(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: TestPushProvider.java */
    /* renamed from: com.vk.push.core.test.a$a, reason: collision with other inner class name */
    public static class C10845a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.test.a
        public final void a(com.vk.push.core.base.a aVar) {
        }

        @Override // com.vk.push.core.test.a
        public final void j(String str, String str2, com.vk.push.core.base.a aVar) {
        }

        @Override // com.vk.push.core.test.a
        public final void u1(String str, TestPushPayload testPushPayload, com.vk.push.core.base.a aVar) {
        }
    }
}
