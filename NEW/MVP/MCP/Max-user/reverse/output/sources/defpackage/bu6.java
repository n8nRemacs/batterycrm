package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class bu6 extends l4 {
    public static final Parcelable.Creator<bu6> CREATOR = new wci(28);
    public static final Scope[] y0 = new Scope[0];
    public static final qt5[] z0 = new qt5[0];
    public Scope[] X;
    public Bundle Y;
    public Account Z;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder o;
    public qt5[] s0;
    public qt5[] t0;
    public final boolean u0;
    public final int v0;
    public boolean w0;
    public final String x0;

    public bu6(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, qt5[] qt5VarArr, qt5[] qt5VarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? y0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        qt5[] qt5VarArr3 = z0;
        qt5[] qt5VarArr4 = qt5VarArr == null ? qt5VarArr3 : qt5VarArr;
        qt5VarArr3 = qt5VarArr2 != null ? qt5VarArr2 : qt5VarArr3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = x5.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface ubjVar = iInterfaceQueryLocalInterface instanceof sa7 ? (sa7) iInterfaceQueryLocalInterface : new ubj(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                if (ubjVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            ubj ubjVar2 = (ubj) ubjVar;
                            Parcel parcelA = ubjVar2.A(ubjVar2.T(), 2);
                            Account account3 = (Account) wgi.a(parcelA, Account.CREATOR);
                            parcelA.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.Z = account2;
        } else {
            this.o = iBinder;
            this.Z = account;
        }
        this.X = scopeArr2;
        this.Y = bundle2;
        this.s0 = qt5VarArr4;
        this.t0 = qt5VarArr3;
        this.u0 = z;
        this.v0 = i4;
        this.w0 = z2;
        this.x0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wci.a(this, parcel, i);
    }
}
