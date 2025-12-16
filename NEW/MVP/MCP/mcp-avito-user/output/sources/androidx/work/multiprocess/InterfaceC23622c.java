package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* compiled from: IWorkManagerImplCallback.java */
@RestrictTo
/* renamed from: androidx.work.multiprocess.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC23622c extends IInterface {

    /* renamed from: o, reason: collision with root package name */
    public static final String f56136o = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');

    void F0(byte[] bArr);

    void onFailure(String str);

    /* compiled from: IWorkManagerImplCallback.java */
    /* renamed from: androidx.work.multiprocess.c$b */
    public static abstract class b extends Binder implements InterfaceC23622c {

        /* compiled from: IWorkManagerImplCallback.java */
        /* renamed from: androidx.work.multiprocess.c$b$a */
        public static class a implements InterfaceC23622c {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f56137a;

            @Override // androidx.work.multiprocess.InterfaceC23622c
            public final void F0(byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23622c.f56136o);
                    parcelObtain.writeByteArray(bArr);
                    this.f56137a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f56137a;
            }

            @Override // androidx.work.multiprocess.InterfaceC23622c
            public final void onFailure(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23622c.f56136o);
                    parcelObtain.writeString(str);
                    this.f56137a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC23622c.f56136o);
        }

        public static InterfaceC23622c e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC23622c.f56136o);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC23622c)) {
                return (InterfaceC23622c) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f56137a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            String str = InterfaceC23622c.f56136o;
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i12 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i12 == 1) {
                ((m) this).F0(parcel.createByteArray());
            } else {
                if (i12 != 2) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                ((m) this).onFailure(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IWorkManagerImplCallback.java */
    /* renamed from: androidx.work.multiprocess.c$a */
    public static class a implements InterfaceC23622c {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.InterfaceC23622c
        public final void F0(byte[] bArr) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23622c
        public final void onFailure(String str) {
        }
    }
}
