package dY0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* renamed from: dY0.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC39649c extends IInterface {

    /* renamed from: dY0.c$a */
    public static abstract class a extends zzb implements InterfaceC39649c {
        public a() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        @Override // com.google.android.gms.internal.maps.zzb
        public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
            if (i12 != 1) {
                if (i12 != 2) {
                    return false;
                }
                deactivate();
                throw null;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC39677u) {
                }
            }
            A3();
            throw null;
        }
    }

    void A3();

    void deactivate();
}
