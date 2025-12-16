package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes7.dex */
public interface IMetricaService extends IInterface {
    void a(int i12, Bundle bundle);

    void a(Bundle bundle);

    void b(Bundle bundle);

    void reportData(Bundle bundle);

    public static abstract class a extends Binder implements IMetricaService {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f377503a = 0;

        public a() {
            attachInterface(this, "com.yandex.metrica.IMetricaService");
        }

        public static IMetricaService e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMetricaService)) {
                return (IMetricaService) iInterfaceQueryLocalInterface;
            }
            C10945a c10945a = new C10945a();
            c10945a.f377504a = iBinder;
            return c10945a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 == 1598968902) {
                parcel2.writeString("com.yandex.metrica.IMetricaService");
                return true;
            }
            if (i12 == 1) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f377505d.a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 == 2) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f377505d.reportData(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 == 3) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f377505d.b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 == 4) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f377505d.a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 != 5) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f377505d.a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }

        /* renamed from: com.yandex.metrica.IMetricaService$a$a, reason: collision with other inner class name */
        public static class C10945a implements IMetricaService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f377504a;

            @Override // com.yandex.metrica.IMetricaService
            public final void a(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f377504a.transact(4, parcelObtain, null, 1)) {
                        int i12 = a.f377503a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f377504a;
            }

            @Override // com.yandex.metrica.IMetricaService
            public final void b(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f377504a.transact(3, parcelObtain, null, 1)) {
                        int i12 = a.f377503a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.yandex.metrica.IMetricaService
            public final void reportData(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f377504a.transact(2, parcelObtain, null, 1)) {
                        int i12 = a.f377503a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.yandex.metrica.IMetricaService
            public final void a(int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(i12);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f377504a.transact(5, parcelObtain, null, 1)) {
                        int i13 = a.f377503a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
