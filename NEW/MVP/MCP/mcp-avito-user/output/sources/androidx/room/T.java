package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* compiled from: IMultiInstanceInvalidationCallback.java */
@RestrictTo
/* loaded from: classes10.dex */
public interface T extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f54335k = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    void X1(String[] strArr);

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class b extends Binder implements T {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        public static class a implements T {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f54336a;

            @Override // androidx.room.T
            public final void X1(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f54335k);
                    parcelObtain.writeStringArray(strArr);
                    this.f54336a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f54336a;
            }
        }

        public b() {
            attachInterface(this, T.f54335k);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            String str = T.f54335k;
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i12 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i12 != 1) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            ((BinderC23444e0) this).X1(parcel.createStringArray());
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static class a implements T {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.T
        public final void X1(String[] strArr) {
        }
    }
}
