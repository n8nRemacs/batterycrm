package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* compiled from: IUnusedAppRestrictionsBackportCallback.java */
@RestrictTo
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: i, reason: collision with root package name */
    public static final String f44552i = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    /* renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    public static class C1719a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    void q3(boolean z12, boolean z13);

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
        /* renamed from: androidx.core.app.unusedapprestrictions.a$b$a, reason: collision with other inner class name */
        public static class C1720a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f44553a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f44553a;
            }
        }

        public b() {
            attachInterface(this, a.f44552i);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            String str = a.f44552i;
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
            q3(parcel.readInt() != 0, parcel.readInt() != 0);
            throw null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
