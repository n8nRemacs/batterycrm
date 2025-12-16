package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class n5j extends a {
    public final c70 I0;

    public n5j(Context context, Looper looper, goh gohVar, c70 c70Var, wai waiVar, wai waiVar2) {
        super(context, looper, 68, gohVar, waiVar, waiVar2, 0);
        c70Var = c70Var == null ? c70.c : c70Var;
        s7c s7cVar = new s7c();
        s7cVar.a = Boolean.FALSE;
        c70Var.getClass();
        s7cVar.a = Boolean.valueOf(c70Var.a);
        s7cVar.b = c70Var.b;
        byte[] bArr = new byte[16];
        ffi.a.nextBytes(bArr);
        s7cVar.b = Base64.encodeToString(bArr, 11);
        this.I0 = new c70(s7cVar);
    }

    @Override // defpackage.fl
    public final int g() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof vbj ? (vbj) iInterfaceQueryLocalInterface : new vbj(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 4);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        c70 c70Var = this.I0;
        c70Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c70Var.a);
        bundle.putString("log_session_id", c70Var.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
