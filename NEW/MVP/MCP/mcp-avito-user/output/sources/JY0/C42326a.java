package jY0;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36717n;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: jY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42326a extends AbstractC36709j<C42331f> implements com.google.android.gms.signin.f {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f405637M = 0;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f405638I;

    /* renamed from: J, reason: collision with root package name */
    public final C36703g f405639J;

    /* renamed from: K, reason: collision with root package name */
    public final Bundle f405640K;

    /* renamed from: L, reason: collision with root package name */
    @P
    public final Integer f405641L;

    public C42326a(@N Context context, @N Looper looper, @N C36703g c36703g, @N Bundle bundle, @N i.b bVar, @N i.c cVar) {
        super(context, looper, 44, c36703g, bVar, cVar);
        this.f405638I = true;
        this.f405639J = c36703g;
        this.f405640K = bundle;
        this.f405641L = c36703g.f349431h;
    }

    @Override // com.google.android.gms.signin.f
    public final void a() {
        connect(new AbstractC36699e.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void b() {
        try {
            C42331f c42331f = (C42331f) getService();
            Integer num = this.f405641L;
            C36729v.j(num);
            int iIntValue = num.intValue();
            Parcel parcelE4 = c42331f.e4();
            parcelE4.writeInt(iIntValue);
            c42331f.f4(parcelE4, 7);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void c(@N InterfaceC36717n interfaceC36717n, boolean z12) {
        try {
            C42331f c42331f = (C42331f) getService();
            Integer num = this.f405641L;
            C36729v.j(num);
            int iIntValue = num.intValue();
            Parcel parcelE4 = c42331f.e4();
            zac.zad(parcelE4, interfaceC36717n);
            parcelE4.writeInt(iIntValue);
            parcelE4.writeInt(z12 ? 1 : 0);
            c42331f.f4(parcelE4, 9);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void d(BinderC42328c binderC42328c) {
        try {
            Account account = this.f405639J.f349424a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? com.google.android.gms.auth.api.signin.internal.b.a(getContext()).b() : null;
            Integer num = this.f405641L;
            C36729v.j(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountB);
            C42331f c42331f = (C42331f) getService();
            zai zaiVar = new zai(1, zatVar);
            Parcel parcelE4 = c42331f.e4();
            zac.zac(parcelE4, zaiVar);
            zac.zad(parcelE4, binderC42328c);
            c42331f.f4(parcelE4, 12);
        } catch (RemoteException e12) {
            try {
                binderC42328c.T0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e12);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final IInterface e(@N IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C42331f ? (C42331f) iInterfaceQueryLocalInterface : new C42331f(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final Bundle f() {
        C36703g c36703g = this.f405639J;
        boolean zEquals = getContext().getPackageName().equals(c36703g.f349428e);
        Bundle bundle = this.f405640K;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c36703g.f349428e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @N
    public final String i() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final boolean requiresSignIn() {
        return this.f405638I;
    }
}
