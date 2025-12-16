package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IAIDLCallback.java */
/* loaded from: classes7.dex */
public interface c extends IInterface {
    void call(b bVar);

    /* compiled from: IAIDLCallback.java */
    public static abstract class a extends Binder implements c {

        /* compiled from: IAIDLCallback.java */
        /* renamed from: com.huawei.hms.core.aidl.c$a$a, reason: collision with other inner class name */
        public static class C10753a implements c {

            /* renamed from: b, reason: collision with root package name */
            public static c f363449b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f363450a;

            public C10753a(IBinder iBinder) {
                this.f363450a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f363450a;
            }
        }

        public a() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLCallback");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C10753a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        public static c getDefaultImpl() {
            return C10753a.f363449b;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (C10753a.f363449b != null || cVar == null) {
                return false;
            }
            C10753a.f363449b = cVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 == 1) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLCallback");
                call(parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 != 1598968902) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            parcel2.writeString("com.huawei.hms.core.aidl.IAIDLCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
