package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IAIDLInvoke.java */
/* loaded from: classes7.dex */
public interface d extends IInterface {
    void a(b bVar, c cVar);

    /* compiled from: IAIDLInvoke.java */
    public static abstract class a extends Binder implements d {

        /* compiled from: IAIDLInvoke.java */
        /* renamed from: com.huawei.hms.core.aidl.d$a$a, reason: collision with other inner class name */
        public static class C10754a implements d {

            /* renamed from: b, reason: collision with root package name */
            public static d f363451b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f363452a;

            public C10754a(IBinder iBinder) {
                this.f363452a = iBinder;
            }

            @Override // com.huawei.hms.core.aidl.d
            public void a(b bVar, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (bVar != null) {
                        parcelObtain.writeInt(1);
                        bVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (this.f363452a.transact(2, parcelObtain, null, 1) || a.a() == null) {
                        parcelObtain.recycle();
                    } else {
                        a.a().a(bVar, cVar);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f363452a;
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C10754a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        public static d a() {
            return C10754a.f363451b;
        }
    }
}
