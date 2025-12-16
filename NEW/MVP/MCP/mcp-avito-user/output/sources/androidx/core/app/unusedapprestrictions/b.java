package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.a;

/* compiled from: IUnusedAppRestrictionsBackportService.java */
@RestrictTo
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: j, reason: collision with root package name */
    public static final String f44554j = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    void w1(androidx.core.app.unusedapprestrictions.a aVar);

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    /* renamed from: androidx.core.app.unusedapprestrictions.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1721b extends Binder implements b {

        /* compiled from: IUnusedAppRestrictionsBackportService.java */
        /* renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f44555a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f44555a;
            }

            @Override // androidx.core.app.unusedapprestrictions.b
            public final void w1(androidx.core.app.unusedapprestrictions.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f44554j);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f44555a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC1721b() {
            attachInterface(this, b.f44554j);
        }

        public static b e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f44554j);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof b)) {
                return (b) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f44555a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            androidx.core.app.unusedapprestrictions.a aVar;
            String str = b.f44554j;
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
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(androidx.core.app.unusedapprestrictions.a.f44552i);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.core.app.unusedapprestrictions.a)) {
                    a.b.C1720a c1720a = new a.b.C1720a();
                    c1720a.f44553a = strongBinder;
                    aVar = c1720a;
                } else {
                    aVar = (androidx.core.app.unusedapprestrictions.a) iInterfaceQueryLocalInterface;
                }
            }
            w1(aVar);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    public static class a implements b {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public final void w1(androidx.core.app.unusedapprestrictions.a aVar) {
        }
    }
}
