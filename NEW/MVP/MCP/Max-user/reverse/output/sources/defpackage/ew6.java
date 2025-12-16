package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ew6 {
    public static void a(Context context, qf8 qf8Var) {
        int i = pf8.a;
        bci bciVar = new bci(context, bci.m, el.e, rv6.c);
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.a = 100;
        arrayList.add(locationRequest);
        rf8 rf8Var = new rf8(arrayList, false, false);
        rs0 rs0VarE = mg7.e();
        rs0VarE.d = new znd(rf8Var);
        rs0VarE.b = 2426;
        ybj ybjVarB = bciVar.b(0, rs0VarE.e());
        ybjVarB.i(new dw6(qf8Var));
        ybjVarB.j(new dw6(qf8Var));
    }
}
