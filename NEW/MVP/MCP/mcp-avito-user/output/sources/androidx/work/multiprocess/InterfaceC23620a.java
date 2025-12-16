package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.work.multiprocess.InterfaceC23622c;

/* compiled from: IListenableWorkerImpl.java */
@RestrictTo
/* renamed from: androidx.work.multiprocess.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC23620a extends IInterface {

    /* renamed from: m, reason: collision with root package name */
    public static final String f56130m = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');

    void c3(InterfaceC23622c interfaceC23622c, byte[] bArr);

    void o1(InterfaceC23622c interfaceC23622c, byte[] bArr);

    /* compiled from: IListenableWorkerImpl.java */
    /* renamed from: androidx.work.multiprocess.a$b */
    public static abstract class b extends Binder implements InterfaceC23620a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f56131a = 0;

        /* compiled from: IListenableWorkerImpl.java */
        /* renamed from: androidx.work.multiprocess.a$b$a, reason: collision with other inner class name */
        public static class C1967a implements InterfaceC23620a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f56132a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f56132a;
            }

            @Override // androidx.work.multiprocess.InterfaceC23620a
            public final void c3(InterfaceC23622c interfaceC23622c, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23620a.f56130m);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56132a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.InterfaceC23620a
            public final void o1(InterfaceC23622c interfaceC23622c, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC23620a.f56130m);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(interfaceC23622c);
                    this.f56132a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC23620a.f56130m);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            String str = InterfaceC23620a.f56130m;
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i12 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i12 == 1) {
                BinderC23624e binderC23624e = (BinderC23624e) this;
                binderC23624e.o1(InterfaceC23622c.b.e4(parcel.readStrongBinder()), parcel.createByteArray());
            } else {
                if (i12 != 2) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                BinderC23624e binderC23624e2 = (BinderC23624e) this;
                binderC23624e2.c3(InterfaceC23622c.b.e4(parcel.readStrongBinder()), parcel.createByteArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IListenableWorkerImpl.java */
    /* renamed from: androidx.work.multiprocess.a$a, reason: collision with other inner class name */
    public static class C1966a implements InterfaceC23620a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.InterfaceC23620a
        public final void c3(InterfaceC23622c interfaceC23622c, byte[] bArr) {
        }

        @Override // androidx.work.multiprocess.InterfaceC23620a
        public final void o1(InterfaceC23622c interfaceC23622c, byte[] bArr) {
        }
    }
}
