package ub1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ub1.ServiceConnectionC49025g;
import ub1.l;

/* loaded from: classes9.dex */
public interface D extends IInterface {

    public static abstract class a extends Binder implements D {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f440127a = 0;

        /* renamed from: ub1.D$a$a, reason: collision with other inner class name */
        public static class C12724a implements D {

            /* renamed from: a, reason: collision with root package name */
            public final IBinder f440128a;

            public C12724a(IBinder iBinder) {
                this.f440128a = iBinder;
            }

            @Override // ub1.D
            public final void V0(String str, l.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f440128a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f440128a;
            }

            @Override // ub1.D
            public final void v1(Bundle bundle, String str, ServiceConnectionC49025g.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f440128a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }
    }

    void V0(String str, l.a aVar);

    void v1(Bundle bundle, String str, ServiceConnectionC49025g.a aVar);
}
