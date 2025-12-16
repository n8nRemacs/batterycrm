package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.T;

/* compiled from: IMultiInstanceInvalidationService.java */
@RestrictTo
/* loaded from: classes10.dex */
public interface U extends IInterface {

    /* renamed from: l, reason: collision with root package name */
    public static final String f54337l = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    void N1(T t12, int i12);

    void v3(int i12, String[] strArr);

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class b extends Binder implements U {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f54338a = 0;

        /* compiled from: IMultiInstanceInvalidationService.java */
        public static class a implements U {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f54339a;

            @Override // androidx.room.U
            public final void N1(T t12, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f54337l);
                    parcelObtain.writeStrongInterface(t12);
                    parcelObtain.writeInt(i12);
                    this.f54339a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f54339a;
            }

            @Override // androidx.room.U
            public final void v3(int i12, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f54337l);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeStringArray(strArr);
                    this.f54339a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, U.f54337l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.room.T] */
        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            String str = U.f54337l;
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i12 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            T.b.a aVar = null;
            T t12 = null;
            if (i12 == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(T.f54335k);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof T)) {
                        T.b.a aVar2 = new T.b.a();
                        aVar2.f54336a = strongBinder;
                        aVar = aVar2;
                    } else {
                        aVar = (T) iInterfaceQueryLocalInterface;
                    }
                }
                String string = parcel.readString();
                MultiInstanceInvalidationService.a aVar3 = (MultiInstanceInvalidationService.a) this;
                int i14 = 0;
                if (string != null) {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    synchronized (multiInstanceInvalidationService.f54285d) {
                        try {
                            int i15 = multiInstanceInvalidationService.f54283b + 1;
                            multiInstanceInvalidationService.f54283b = i15;
                            if (multiInstanceInvalidationService.f54285d.register(aVar, Integer.valueOf(i15))) {
                                multiInstanceInvalidationService.f54284c.put(Integer.valueOf(i15), string);
                                i14 = i15;
                            } else {
                                multiInstanceInvalidationService.f54283b--;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i14);
            } else if (i12 == 2) {
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(T.f54335k);
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof T)) {
                        T.b.a aVar4 = new T.b.a();
                        aVar4.f54336a = strongBinder2;
                        t12 = aVar4;
                    } else {
                        t12 = (T) iInterfaceQueryLocalInterface2;
                    }
                }
                ((MultiInstanceInvalidationService.a) this).N1(t12, parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i12 != 3) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                ((MultiInstanceInvalidationService.a) this).v3(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static class a implements U {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.U
        public final void N1(T t12, int i12) {
        }

        @Override // androidx.room.U
        public final void v3(int i12, String[] strArr) {
        }
    }
}
