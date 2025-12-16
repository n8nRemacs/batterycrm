package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class d6a extends Binder implements jb7 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public d6a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, jb7.b);
    }

    @Override // defpackage.jb7
    public final void J(ib7 ib7Var, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(ib7Var);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [ib7] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = jb7.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        hb7 hb7Var = null;
        ib7 ib7Var = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ib7.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ib7)) {
                    hb7 hb7Var2 = new hb7();
                    hb7Var2.c = strongBinder;
                    hb7Var = hb7Var2;
                } else {
                    hb7Var = (ib7) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            int i3 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
                synchronized (multiInstanceInvalidationService.c) {
                    try {
                        int i4 = multiInstanceInvalidationService.a + 1;
                        multiInstanceInvalidationService.a = i4;
                        if (multiInstanceInvalidationService.c.register(hb7Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(ib7.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof ib7)) {
                    hb7 hb7Var3 = new hb7();
                    hb7Var3.c = strongBinder2;
                    ib7Var = hb7Var3;
                } else {
                    ib7Var = (ib7) iInterfaceQueryLocalInterface2;
                }
            }
            J(ib7Var, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i5 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.c;
        synchronized (multiInstanceInvalidationService2.c) {
            String str2 = (String) multiInstanceInvalidationService2.b.get(Integer.valueOf(i5));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService2.c.beginBroadcast();
                for (int i6 = 0; i6 < iBeginBroadcast; i6++) {
                    try {
                        Integer num = (Integer) multiInstanceInvalidationService2.c.getBroadcastCookie(i6);
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService2.b.get(num);
                        if (i5 != iIntValue && str2.equals(str3)) {
                            try {
                                ((ib7) multiInstanceInvalidationService2.c.getBroadcastItem(i6)).j(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService2.c.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }
}
