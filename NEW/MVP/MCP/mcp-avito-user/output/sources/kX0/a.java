package KX0;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import yX0.C50196a;
import yX0.b;
import yX0.c;

/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes6.dex */
public interface a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: KX0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0574a extends b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f9509a = 0;

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: KX0.a$a$a, reason: collision with other inner class name */
        public static class C0575a extends C50196a implements a {
            @Override // KX0.a
            public final Bundle b2(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i12 = c.f443170a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                parcelObtain = Parcel.obtain();
                try {
                    this.f443169a.transact(1, parcelObtain, parcelObtain, 0);
                    parcelObtain.readException();
                    parcelObtain.recycle();
                    return (Bundle) (parcelObtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain));
                } catch (RuntimeException e12) {
                    throw e12;
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // yX0.b
        public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
            if (i12 != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i13 = c.f443170a;
            Bundle bundleB2 = b2((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (bundleB2 == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                bundleB2.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }

    Bundle b2(Bundle bundle);
}
