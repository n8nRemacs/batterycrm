package defpackage;

import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import kotlin.coroutines.Continuation;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final class bye extends dtf implements sm6 {
    public final /* synthetic */ ShowLocationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bye(Continuation continuation, ShowLocationScreen showLocationScreen) {
        super(2, continuation);
        this.X = showLocationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bye byeVar = (bye) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        byeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bye byeVar = new bye(continuation, this.X);
        byeVar.o = obj;
        return byeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        hp8 hp8VarA;
        g8j.b(obj);
        gye gyeVar = (gye) this.o;
        fye fyeVar = gyeVar.a;
        ShowLocationScreen showLocationScreen = this.X;
        String str2 = null;
        if (showLocationScreen.u0 == null && fyeVar != null) {
            LatLng latLng = fyeVar.a;
            iw6 iw6Var = showLocationScreen.x0;
            if (iw6Var != null) {
                mp8 mp8Var = new mp8();
                mp8Var.a = latLng;
                mp8Var.o = 0.5f;
                mp8Var.X = 0.95f;
                mp8Var.Z = true;
                mp8Var.d = t49.b(fyeVar.c);
                hp8VarA = iw6Var.a(mp8Var);
            } else {
                hp8VarA = null;
            }
            showLocationScreen.u0 = hp8VarA;
            float f = gyeVar.a.b;
            iw6 iw6Var2 = showLocationScreen.x0;
            if (iw6Var2 != null) {
                iw6Var2.c(yxi.c(latLng, f));
            }
        }
        ef8 ef8Var = (ef8) showLocationScreen.w0.D(showLocationScreen, ShowLocationScreen.B0[8]);
        ef8Var.s0.setText(gyeVar.f);
        s5g s5gVar = gyeVar.b;
        ef8Var.d.setText(s5gVar != null ? s5gVar.d(ef8Var) : null);
        String str3 = gyeVar.c;
        eye eyeVar = new eye(showLocationScreen, 0);
        ef8Var.o.setText(str3);
        ef8Var.setOnClickListener(eyeVar);
        s5g s5gVar2 = gyeVar.d;
        if (s5gVar2 != null && (str = gyeVar.e) != null) {
            str2 = str + " " + ((Object) s5gVar2.d(ef8Var));
        }
        eye eyeVar2 = new eye(showLocationScreen, 1);
        TextView textView = ef8Var.t0;
        textView.setText(str2);
        f8j.d(textView, 300L, eyeVar2);
        return qqg.a;
    }
}
