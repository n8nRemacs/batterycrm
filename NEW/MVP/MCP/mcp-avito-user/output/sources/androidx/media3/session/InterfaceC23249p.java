package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.session.AbstractServiceC23212c1;

/* compiled from: IMediaSessionService.java */
/* renamed from: androidx.media3.session.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23249p extends IInterface {
    void H3(InterfaceC23243n interfaceC23243n, Bundle bundle);

    /* compiled from: IMediaSessionService.java */
    /* renamed from: androidx.media3.session.p$b */
    public static abstract class b extends Binder implements InterfaceC23249p {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f52604a = 0;

        /* compiled from: IMediaSessionService.java */
        /* renamed from: androidx.media3.session.p$b$a */
        public static class a implements InterfaceC23249p {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f52605a;

            @Override // androidx.media3.session.InterfaceC23249p
            public final void H3(InterfaceC23243n interfaceC23243n, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52605a.transact(3001, parcelObtain, null, 1)) {
                        int i12 = b.f52604a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f52605a;
            }
        }

        public b() {
            attachInterface(this, "androidx.media3.session.IMediaSessionService");
        }

        public static InterfaceC23249p e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC23249p)) {
                return (InterfaceC23249p) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f52605a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 == 3001) {
                ((AbstractServiceC23212c1.e) this).H3(M1.a("androidx.media3.session.IMediaSessionService", parcel), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i12 != 1598968902) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IMediaSessionService.java */
    /* renamed from: androidx.media3.session.p$a */
    public static class a implements InterfaceC23249p {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.InterfaceC23249p
        public final void H3(InterfaceC23243n interfaceC23243n, Bundle bundle) {
        }
    }
}
