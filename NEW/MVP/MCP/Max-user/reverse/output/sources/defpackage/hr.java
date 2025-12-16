package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* loaded from: classes.dex */
public final class hr extends dtf implements um6 {
    public /* synthetic */ yeb X;
    public final /* synthetic */ TextView Y;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen Z;
    public /* synthetic */ LinearLayout o;
    public final /* synthetic */ TextView s0;
    public final /* synthetic */ TextView t0;
    public final /* synthetic */ ShapeDrawable u0;
    public final /* synthetic */ rt2 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(TextView textView, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, TextView textView2, TextView textView3, ShapeDrawable shapeDrawable, rt2 rt2Var, Continuation continuation) {
        super(3, continuation);
        this.Y = textView;
        this.Z = appearanceSettingsMultiThemeScreen;
        this.s0 = textView2;
        this.t0 = textView3;
        this.u0 = shapeDrawable;
        this.v0 = rt2Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShapeDrawable shapeDrawable = this.u0;
        rt2 rt2Var = this.v0;
        hr hrVar = new hr(this.Y, this.Z, this.s0, this.t0, shapeDrawable, rt2Var, (Continuation) obj3);
        hrVar.o = (LinearLayout) obj;
        hrVar.X = (yeb) obj2;
        qqg qqgVar = qqg.a;
        hrVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        LinearLayout linearLayout = this.o;
        yeb yebVar = this.X;
        linearLayout.setBackgroundColor(yebVar.b().k);
        this.Y.setTextColor(yebVar.getText().g);
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.Z;
        ((TextView) appearanceSettingsMultiThemeScreen.d.D(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.Z[1])).setTextColor(yebVar.getText().e);
        this.s0.setTextColor(yebVar.getText().g);
        this.t0.setTextColor(yebVar.getText().g);
        svi.e(appearanceSettingsMultiThemeScreen.getViewLifecycleScope(), null, null, new gr(this.v0, appearanceSettingsMultiThemeScreen, null), 3);
        cei.k(this.u0, yebVar.b().h);
        xr xrVarY0 = appearanceSettingsMultiThemeScreen.y0();
        xfh.o(xrVarY0, ((q2b) xrVarY0.z()).a(), new wr(xrVarY0, null), 2);
        return qqg.a;
    }
}
