package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final class j89 extends Binder implements gb7 {
    public final WeakReference c;
    public final Handler d;
    public final Set e;

    public j89(OneMeMediaSessionService oneMeMediaSessionService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.c = new WeakReference(oneMeMediaSessionService);
        this.d = new Handler(oneMeMediaSessionService.getApplicationContext().getMainLooper());
        this.e = Collections.synchronizedSet(new HashSet());
    }

    public static gb7 i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof gb7)) {
            return (gb7) iInterfaceQueryLocalInterface;
        }
        fb7 fb7Var = new fb7();
        fb7Var.c = iBinder;
        return fb7Var;
    }

    @Override // defpackage.gb7
    public final void H(ya7 ya7Var, Bundle bundle) {
        if (ya7Var == null || bundle == null) {
            v9j.b(ya7Var);
            return;
        }
        try {
            ds3 ds3VarA = ds3.a(bundle);
            OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) this.c.get();
            if (oneMeMediaSessionService == null) {
                v9j.b(ya7Var);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ds3VarA.d;
            }
            b89 b89Var = new b89(ds3VarA.c, callingPid, callingUid);
            boolean zB = f89.a(oneMeMediaSessionService.getApplicationContext()).b(b89Var);
            this.e.add(ya7Var);
            try {
                this.d.post(new c29(1, this, ya7Var, b89Var, ds3VarA, zB));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            a8i.m("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
            v9j.b(ya7Var);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        H(vy8.i(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
