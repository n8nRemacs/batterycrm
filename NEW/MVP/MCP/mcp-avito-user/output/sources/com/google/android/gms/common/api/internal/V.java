package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36717n;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class V extends AbstractC36657m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36626b0 f349060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zak f349061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C36626b0 c36626b0, C36626b0 c36626b02, zak zakVar) {
        super(c36626b0);
        this.f349060b = c36626b02;
        this.f349061c = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36657m0
    public final void a() {
        InterfaceC36717n n02;
        C36626b0 c36626b0 = this.f349060b;
        if (c36626b0.o(0)) {
            zak zakVar = this.f349061c;
            ConnectionResult connectionResult = zakVar.f355609c;
            if (!connectionResult.i()) {
                if (!c36626b0.f349088l || connectionResult.h()) {
                    c36626b0.l(connectionResult);
                    return;
                } else {
                    c36626b0.i();
                    c36626b0.n();
                    return;
                }
            }
            zav zavVar = zakVar.f355610d;
            C36729v.j(zavVar);
            ConnectionResult connectionResult2 = zavVar.f349486d;
            if (!connectionResult2.i()) {
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                c36626b0.l(connectionResult2);
                return;
            }
            c36626b0.f349090n = true;
            IBinder iBinder = zavVar.f349485c;
            if (iBinder == null) {
                n02 = null;
            } else {
                int i12 = InterfaceC36717n.a.f349450a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                n02 = iInterfaceQueryLocalInterface instanceof InterfaceC36717n ? (InterfaceC36717n) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.N0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            C36729v.j(n02);
            c36626b0.f349091o = n02;
            c36626b0.f349092p = zavVar.f349487e;
            c36626b0.f349093q = zavVar.f349488f;
            c36626b0.n();
        }
    }
}
