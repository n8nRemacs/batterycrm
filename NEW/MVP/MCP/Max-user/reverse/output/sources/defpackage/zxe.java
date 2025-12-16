package defpackage;

import com.google.android.gms.maps.model.LatLng;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class zxe implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShowLocationScreen b;

    public /* synthetic */ zxe(ShowLocationScreen showLocationScreen, int i) {
        this.a = i;
        this.b = showLocationScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ShowLocationScreen showLocationScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ShowLocationScreen.B0;
                return new s2i(showLocationScreen, 1);
            default:
                hs hsVar = showLocationScreen.b;
                yy7[] yy7VarArr2 = ShowLocationScreen.B0;
                yy7 yy7Var = yy7VarArr2[0];
                double dDoubleValue = ((Number) hsVar.a(showLocationScreen)).doubleValue();
                hs hsVar2 = showLocationScreen.c;
                yy7 yy7Var2 = yy7VarArr2[1];
                LatLng latLng = new LatLng(dDoubleValue, ((Number) hsVar2.a(showLocationScreen)).doubleValue());
                hs hsVar3 = showLocationScreen.d;
                yy7 yy7Var3 = yy7VarArr2[2];
                float fFloatValue = ((Number) hsVar3.a(showLocationScreen)).floatValue();
                hs hsVar4 = showLocationScreen.o;
                yy7 yy7Var4 = yy7VarArr2[3];
                Long l = (Long) hsVar4.a(showLocationScreen);
                hs hsVar5 = showLocationScreen.X;
                yy7 yy7Var5 = yy7VarArr2[4];
                Long l2 = (Long) hsVar5.a(showLocationScreen);
                hs hsVar6 = showLocationScreen.Y;
                yy7 yy7Var6 = yy7VarArr2[5];
                return new lye(latLng, fFloatValue, l, l2, (Long) hsVar6.a(showLocationScreen));
        }
    }
}
