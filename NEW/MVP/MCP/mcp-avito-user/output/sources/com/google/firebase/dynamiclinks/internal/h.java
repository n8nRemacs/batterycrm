package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.dynamiclinks.internal.g;

/* compiled from: IDynamicLinksService.java */
/* loaded from: classes5.dex */
public interface h extends IInterface {
    void Q0(g gVar);

    void c1(g gVar, String str);

    /* compiled from: IDynamicLinksService.java */
    public static abstract class b extends Binder implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f361540a = 0;

        /* compiled from: IDynamicLinksService.java */
        public static class a implements h {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f361541a;

            @Override // com.google.firebase.dynamiclinks.internal.h
            public final void Q0(g gVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    parcelObtain.writeStrongBinder((g.b) gVar);
                    parcelObtain.writeInt(0);
                    if (!this.f361541a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i12 = b.f361540a;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f361541a;
            }

            @Override // com.google.firebase.dynamiclinks.internal.h
            public final void c1(g gVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    parcelObtain.writeStrongBinder((g.b) gVar);
                    parcelObtain.writeString(str);
                    if (!this.f361541a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i12 = b.f361540a;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            g gVar = null;
            g gVar2 = null;
            if (i12 == 1) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) {
                        g.b.a aVar = new g.b.a();
                        aVar.f361539a = strongBinder;
                        gVar = aVar;
                    } else {
                        gVar = (g) iInterfaceQueryLocalInterface;
                    }
                }
                c1(gVar, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i12 != 2) {
                if (i12 != 1598968902) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                return true;
            }
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof g)) {
                    g.b.a aVar2 = new g.b.a();
                    aVar2.f361539a = strongBinder2;
                    gVar2 = aVar2;
                } else {
                    gVar2 = (g) iInterfaceQueryLocalInterface2;
                }
            }
            if (parcel.readInt() != 0) {
            }
            Q0(gVar2);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IDynamicLinksService.java */
    public static class a implements h {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.google.firebase.dynamiclinks.internal.h
        public final void Q0(g gVar) {
        }

        @Override // com.google.firebase.dynamiclinks.internal.h
        public final void c1(g gVar, String str) {
        }
    }
}
