package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36717n;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class Y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zak f349066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC36624a1 f349067c;

    public Y0(BinderC36624a1 binderC36624a1, zak zakVar) {
        this.f349067c = binderC36624a1;
        this.f349066b = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC36717n n02;
        Set<Scope> set;
        C36616a.AbstractC10618a abstractC10618a = BinderC36624a1.f349069u;
        zak zakVar = this.f349066b;
        ConnectionResult connectionResult = zakVar.f355609c;
        boolean zI2 = connectionResult.i();
        BinderC36624a1 binderC36624a1 = this.f349067c;
        if (zI2) {
            zav zavVar = zakVar.f355610d;
            C36729v.j(zavVar);
            ConnectionResult connectionResult2 = zavVar.f349486d;
            if (!connectionResult2.i()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                ((A0) binderC36624a1.f349076t).b(connectionResult2);
                binderC36624a1.f349075s.disconnect();
                return;
            }
            Z0 z02 = binderC36624a1.f349076t;
            IBinder iBinder = zavVar.f349485c;
            if (iBinder == null) {
                n02 = null;
            } else {
                int i12 = InterfaceC36717n.a.f349450a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                n02 = iInterfaceQueryLocalInterface instanceof InterfaceC36717n ? (InterfaceC36717n) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.N0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            A0 a02 = (A0) z02;
            a02.getClass();
            if (n02 == null || (set = binderC36624a1.f349073q) == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                a02.b(new ConnectionResult(4));
            } else {
                a02.f348958c = n02;
                a02.f348959d = set;
                if (a02.f348960e) {
                    a02.f348956a.getRemoteService(n02, set);
                }
            }
        } else {
            ((A0) binderC36624a1.f349076t).b(connectionResult);
        }
        binderC36624a1.f349075s.disconnect();
    }
}
