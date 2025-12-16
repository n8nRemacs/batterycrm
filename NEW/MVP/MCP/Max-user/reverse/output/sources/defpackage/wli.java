package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class wli extends a {
    public final GoogleSignInOptions I0;

    public wli(Context context, Looper looper, goh gohVar, GoogleSignInOptions googleSignInOptions, wai waiVar, wai waiVar2) {
        mw6 mw6Var;
        super(context, looper, 91, gohVar, waiVar, waiVar2, 0);
        Set<Scope> set = (Set) gohVar.c;
        if (googleSignInOptions != null) {
            mw6Var = new mw6();
            mw6Var.d = new HashSet();
            mw6Var.i = new HashMap();
            mw6Var.d = new HashSet(googleSignInOptions.b);
            mw6Var.a = googleSignInOptions.o;
            mw6Var.b = googleSignInOptions.X;
            mw6Var.c = googleSignInOptions.d;
            mw6Var.e = googleSignInOptions.Y;
            mw6Var.h = googleSignInOptions.c;
            mw6Var.f = googleSignInOptions.Z;
            mw6Var.i = GoogleSignInOptions.c(googleSignInOptions.s0);
            mw6Var.g = googleSignInOptions.t0;
        } else {
            mw6Var = new mw6();
            mw6Var.d = new HashSet();
            mw6Var.i = new HashMap();
        }
        byte[] bArr = new byte[16];
        ffi.a.nextBytes(bArr);
        mw6Var.g = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) mw6Var.d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = (HashSet) mw6Var.d;
        if (hashSet2.contains(GoogleSignInOptions.x0)) {
            Scope scope2 = GoogleSignInOptions.w0;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (mw6Var.c && (((Account) mw6Var.h) == null || !hashSet2.isEmpty())) {
            ((HashSet) mw6Var.d).add(GoogleSignInOptions.v0);
        }
        this.I0 = new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) mw6Var.h, mw6Var.c, mw6Var.a, mw6Var.b, (String) mw6Var.e, (String) mw6Var.f, (HashMap) mw6Var.i, (String) mw6Var.g);
    }

    @Override // defpackage.fl
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zbj ? (zbj) iInterfaceQueryLocalInterface : new zbj(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 4);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
