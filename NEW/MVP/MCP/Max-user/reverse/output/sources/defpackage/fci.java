package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class fci extends l4 {
    public static final Parcelable.Creator<fci> CREATOR = new obh(18);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public fci(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.f(parcel, 2, this.b, i);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c);
        a9j.f(parcel, 4, this.d, i);
        a9j.l(parcel, iK);
    }
}
