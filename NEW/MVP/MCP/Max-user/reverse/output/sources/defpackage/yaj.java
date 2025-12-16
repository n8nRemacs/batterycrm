package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class yaj extends uai {
    public final RevocationBoundService d;

    public yaj(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 7);
        this.d = revocationBoundService;
    }

    @Override // defpackage.uai
    public final boolean V(int i, Parcel parcel, Parcel parcel2) throws JSONException, PackageManager.NameNotFoundException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        RevocationBoundService revocationBoundService = this.d;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            W();
            r5j.J(revocationBoundService).u();
            return true;
        }
        W();
        rkf rkfVarA = rkf.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = rkfVarA.b();
        GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.u0;
        if (googleSignInAccountB != null) {
            String strD2 = rkfVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = rkfVarA.d(rkf.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsB = null;
            } else {
                try {
                    googleSignInOptionsB = GoogleSignInOptions.b(strD);
                } catch (JSONException unused) {
                }
            }
        }
        s5j.g(googleSignInOptionsB);
        bci bciVar = new bci(revocationBoundService, f70.a, googleSignInOptionsB, new tha(13));
        Context context = bciVar.a;
        yai yaiVar = bciVar.h;
        if (googleSignInAccountB != null) {
            boolean z = bciVar.e() == 3;
            lk6 lk6Var = yri.a;
            if (lk6Var.b <= 3) {
                Log.d((String) lk6Var.c, ((String) lk6Var.d).concat("Revoking access"));
            }
            String strD3 = rkf.a(context).d("refreshToken");
            yri.a(context);
            if (!z) {
                aui auiVar = new aui(yaiVar, 1);
                yaiVar.a(auiVar);
                basePendingResult2 = auiVar;
            } else if (strD3 == null) {
                lk6 lk6Var2 = gki.c;
                Status status = new Status(4, null, null, null);
                s5j.a("Status code must not be SUCCESS", !status.b());
                BasePendingResult ubiVar = new ubi(status);
                ubiVar.f(status);
                basePendingResult2 = ubiVar;
            } else {
                gki gkiVar = new gki(strD3);
                new Thread(gkiVar).start();
                basePendingResult2 = gkiVar.b;
            }
            basePendingResult2.b(new rai(basePendingResult2, new n2g(), new slf()));
        } else {
            boolean z2 = bciVar.e() == 3;
            lk6 lk6Var3 = yri.a;
            if (lk6Var3.b <= 3) {
                Log.d((String) lk6Var3.c, ((String) lk6Var3.d).concat("Signing out"));
            }
            yri.a(context);
            if (z2) {
                BasePendingResult gefVar = new gef(yaiVar);
                gefVar.f(Status.o);
                basePendingResult = gefVar;
            } else {
                aui auiVar2 = new aui(yaiVar, 0);
                yaiVar.a(auiVar2);
                basePendingResult = auiVar2;
            }
            basePendingResult.b(new rai(basePendingResult, new n2g(), new slf()));
        }
        return true;
    }

    public final void W() throws PackageManager.NameNotFoundException {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.d;
        zo0 zo0VarA = k6i.a(revocationBoundService);
        zo0VarA.getClass();
        try {
            appOpsManager = (AppOpsManager) zo0VarA.a.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        try {
            PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            ow6 ow6VarA = ow6.a(revocationBoundService);
            ow6VarA.getClass();
            if (packageInfo != null) {
                if (ow6.c(packageInfo, false)) {
                    return;
                }
                if (ow6.c(packageInfo, true)) {
                    Context context = ow6VarA.a;
                    try {
                        if (!lw6.c) {
                            try {
                                PackageInfo packageInfo2 = k6i.a(context).a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                ow6.a(context);
                                if (packageInfo2 == null || ow6.c(packageInfo2, false) || !ow6.c(packageInfo2, true)) {
                                    lw6.b = false;
                                } else {
                                    lw6.b = true;
                                }
                                lw6.c = true;
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                lw6.c = true;
                            }
                        }
                        if (lw6.b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    } catch (Throwable th) {
                        lw6.c = true;
                        throw th;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
        }
        int callingUid2 = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid2);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
