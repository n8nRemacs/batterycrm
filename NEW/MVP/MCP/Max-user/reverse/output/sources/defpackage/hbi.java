package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* loaded from: classes.dex */
public final class hbi extends dbi implements vv6, wv6 {
    public static final pai k = lbi.a;
    public final Context d;
    public final Handler e;
    public final pai f;
    public final Set g;
    public final goh h;
    public jze i;
    public fo4 j;

    public hbi(Context context, y1a y1aVar, goh gohVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.d = context;
        this.e = y1aVar;
        this.h = gohVar;
        this.g = (Set) gohVar.b;
        this.f = k;
    }

    @Override // defpackage.vv6
    public final void A(int i) {
        fo4 fo4Var = this.j;
        wai waiVar = (wai) ((xv6) fo4Var.X).t0.get((cm) fo4Var.c);
        if (waiVar != null) {
            if (waiVar.k) {
                waiVar.n(new es3(17));
            } else {
                waiVar.A(i);
            }
        }
    }

    @Override // defpackage.wv6
    public final void i(es3 es3Var) {
        this.j.f(es3Var);
    }

    @Override // defpackage.vv6
    public final void onConnected() {
        jze jzeVar = this.i;
        jzeVar.getClass();
        try {
            jzeVar.J0.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? rkf.a(jzeVar.c).b() : null;
            Integer num = jzeVar.L0;
            s5j.g(num);
            fci fciVar = new fci(2, account, num.intValue(), googleSignInAccountB);
            rbi rbiVar = (rbi) jzeVar.o();
            ybi ybiVar = new ybi(1, fciVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(rbiVar.e);
            cbi.c(parcelObtain, ybiVar);
            parcelObtain.writeStrongBinder(this);
            rbiVar.i(parcelObtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.e.post(new c5e(this, new aci(1, new es3(8, null), null), false, 10));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
