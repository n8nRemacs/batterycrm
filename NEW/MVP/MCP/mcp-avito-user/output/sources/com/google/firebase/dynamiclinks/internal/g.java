package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: IDynamicLinksCallbacks.java */
/* loaded from: classes5.dex */
public interface g extends IInterface {

    /* compiled from: IDynamicLinksCallbacks.java */
    public static class a implements g {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    void j3(Status status, DynamicLinkData dynamicLinkData);

    void n1(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl);

    /* compiled from: IDynamicLinksCallbacks.java */
    public static abstract class b extends Binder implements g {

        /* compiled from: IDynamicLinksCallbacks.java */
        public static class a implements g {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f361539a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f361539a;
            }
        }

        public b() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 == 1) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                j3(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? DynamicLinkData.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 == 2) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                n1(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ShortDynamicLinkImpl.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 != 1598968902) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
