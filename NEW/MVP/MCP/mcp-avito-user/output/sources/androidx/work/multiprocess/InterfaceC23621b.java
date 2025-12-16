package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.work.impl.Y;
import androidx.work.impl.h0;
import androidx.work.impl.utils.C23593c;
import androidx.work.multiprocess.AbstractC23623d;
import androidx.work.multiprocess.InterfaceC23622c;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: IWorkManagerImpl.java */
@RestrictTo
/* renamed from: androidx.work.multiprocess.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC23621b extends IInterface {

    /* renamed from: n, reason: collision with root package name */
    public static final String f56133n = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');

    void A(InterfaceC23622c interfaceC23622c, byte[] bArr);

    void E1(InterfaceC23622c interfaceC23622c, byte[] bArr);

    void J0(String str, InterfaceC23622c interfaceC23622c);

    void X2(InterfaceC23622c interfaceC23622c);

    void b0(InterfaceC23622c interfaceC23622c, byte[] bArr);

    void t(String str, InterfaceC23622c interfaceC23622c);

    void w0(InterfaceC23622c interfaceC23622c, byte[] bArr);

    /* compiled from: IWorkManagerImpl.java */
    /* renamed from: androidx.work.multiprocess.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1968b extends Binder implements InterfaceC23621b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f56134a = 0;

        /* compiled from: IWorkManagerImpl.java */
        /* renamed from: androidx.work.multiprocess.b$b$a */
        public static class a implements InterfaceC23621b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f56135a;

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void A(InterfaceC23622c interfaceC23622c, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void E1(InterfaceC23622c interfaceC23622c, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void J0(String str, InterfaceC23622c interfaceC23622c) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeString(null);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void X2(InterfaceC23622c interfaceC23622c) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f56135a;
            }

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void b0(InterfaceC23622c interfaceC23622c, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void t(String str, InterfaceC23622c interfaceC23622c) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeString(null);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC23621b
            public final void w0(InterfaceC23622c interfaceC23622c, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23621b.f56133n);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56135a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC1968b() {
            attachInterface(this, InterfaceC23621b.f56133n);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            String str = InterfaceC23621b.f56133n;
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i12 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i12) {
                case 1:
                    D d12 = (D) this;
                    d12.A(InterfaceC23622c.b.e4(parcel.readStrongBinder()), parcel.createByteArray());
                    return true;
                case 2:
                    String string = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    InterfaceC23622c interfaceC23622cE4 = InterfaceC23622c.b.e4(parcel.readStrongBinder());
                    Y y12 = ((D) this).f56089b;
                    try {
                        new C(y12.f55560e.f56028a, interfaceC23622cE4, h0.a(((ParcelableWorkRequest) androidx.work.multiprocess.parcelable.a.b(bArrCreateByteArray, ParcelableWorkRequest.CREATOR)).f56197b, y12, string).a()).a();
                    } catch (Throwable th2) {
                        AbstractC23623d.a.a(interfaceC23622cE4, th2);
                    }
                    return true;
                case 3:
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    InterfaceC23622c interfaceC23622cE42 = InterfaceC23622c.b.e4(parcel.readStrongBinder());
                    D d13 = (D) this;
                    try {
                        ParcelableWorkContinuationImpl parcelableWorkContinuationImpl = (ParcelableWorkContinuationImpl) androidx.work.multiprocess.parcelable.a.b(bArrCreateByteArray2, ParcelableWorkContinuationImpl.CREATOR);
                        Y y13 = d13.f56089b;
                        ParcelableWorkContinuationImpl.b bVar = parcelableWorkContinuationImpl.f56188b;
                        bVar.getClass();
                        ArrayList arrayListA = ParcelableWorkContinuationImpl.b.a(y13, bVar.f56192d);
                        new E(d13.f56089b.f55560e.f56028a, interfaceC23622cE42, new androidx.work.impl.G(y13, bVar.f56189a, bVar.f56190b, bVar.f56191c, arrayListA).a().a()).a();
                    } catch (Throwable th3) {
                        AbstractC23623d.a.a(interfaceC23622cE42, th3);
                    }
                    return true;
                case 4:
                    String string2 = parcel.readString();
                    InterfaceC23622c interfaceC23622cE43 = InterfaceC23622c.b.e4(parcel.readStrongBinder());
                    Y y14 = ((D) this).f56089b;
                    try {
                        UUID uuidFromString = UUID.fromString(string2);
                        y14.getClass();
                        new F(y14.f55560e.f56028a, interfaceC23622cE43, C23593c.c(y14, uuidFromString).a()).a();
                    } catch (Throwable th4) {
                        AbstractC23623d.a.a(interfaceC23622cE43, th4);
                    }
                    return true;
                case 5:
                    ((D) this).J0(parcel.readString(), InterfaceC23622c.b.e4(parcel.readStrongBinder()));
                    return true;
                case 6:
                    ((D) this).t(parcel.readString(), InterfaceC23622c.b.e4(parcel.readStrongBinder()));
                    return true;
                case 7:
                    ((D) this).X2(InterfaceC23622c.b.e4(parcel.readStrongBinder()));
                    return true;
                case 8:
                    D d14 = (D) this;
                    d14.b0(InterfaceC23622c.b.e4(parcel.readStrongBinder()), parcel.createByteArray());
                    return true;
                case 9:
                    D d15 = (D) this;
                    d15.w0(InterfaceC23622c.b.e4(parcel.readStrongBinder()), parcel.createByteArray());
                    return true;
                case 10:
                    D d16 = (D) this;
                    d16.E1(InterfaceC23622c.b.e4(parcel.readStrongBinder()), parcel.createByteArray());
                    return true;
                default:
                    return super.onTransact(i12, parcel, parcel2, i13);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IWorkManagerImpl.java */
    /* renamed from: androidx.work.multiprocess.b$a */
    public static class a implements InterfaceC23621b {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void X2(InterfaceC23622c interfaceC23622c) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void A(InterfaceC23622c interfaceC23622c, byte[] bArr) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void E1(InterfaceC23622c interfaceC23622c, byte[] bArr) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void J0(String str, InterfaceC23622c interfaceC23622c) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void b0(InterfaceC23622c interfaceC23622c, byte[] bArr) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void t(String str, InterfaceC23622c interfaceC23622c) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23621b
        public final void w0(InterfaceC23622c interfaceC23622c, byte[] bArr) {
        }
    }
}
