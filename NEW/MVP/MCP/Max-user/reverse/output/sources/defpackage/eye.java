package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final class eye implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShowLocationScreen b;

    public /* synthetic */ eye(ShowLocationScreen showLocationScreen, int i) {
        this.a = i;
        this.b = showLocationScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ShowLocationScreen showLocationScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ShowLocationScreen.B0;
                lye lyeVarZ0 = showLocationScreen.z0();
                ci5 ci5Var = lyeVarZ0.B0;
                LatLng latLng = lyeVarZ0.b;
                xfh.r(ci5Var, new vxe(latLng.a, latLng.b, Float.valueOf(lyeVarZ0.c)));
                break;
            default:
                yy7[] yy7VarArr2 = ShowLocationScreen.B0;
                lye lyeVarZ02 = showLocationScreen.z0();
                ((dd) lyeVarZ02.u0.getValue()).e("LOCATION_MAP_DIRECTION_CLICK");
                Context context = (Context) lyeVarZ02.d.getValue();
                LatLng latLng2 = lyeVarZ02.b;
                double d = latLng2.a;
                double d2 = latLng2.b;
                String str = ap7.a;
                List<gx4> listJ = ve3.j(new gx4(ap7.j(context, Uri.parse("yandexmaps://maps.yandex.ru/?rtext=~" + d + "," + d2)), "yandex_maps", "ru.yandex.yandexmaps", 8), new gx4(ap7.j(context, Uri.parse("yandexnavi://build_route_on_map/?lat_to=" + d + "&lon_to=" + d2)), "yandex_navigator", "ru.yandex.yandexnavi", 8), new gx4(Uri.parse("dgis://2gis.ru/routeSearch/rsType/ctx/to/" + d2 + "," + d), "2gis", null, 12), new gx4(Uri.parse("https://www.google.com/maps/dir/?api=1&destination=" + d + "," + d2), "google_maps", null, 12), new gx4(Uri.parse("petalmaps://route?daddr=" + d + "," + d2 + "&type=walk"), "huawei_maps", null, 12));
                ArrayList arrayList = new ArrayList();
                for (gx4 gx4Var : listJ) {
                    Intent intent = new Intent("android.intent.action.VIEW", gx4Var.a);
                    intent.setPackage(gx4Var.c);
                    fx4 fx4Var = intent.resolveActivity(context.getPackageManager()) != null ? new fx4(intent, gx4Var.b) : null;
                    if (fx4Var != null) {
                        arrayList.add(fx4Var);
                    }
                }
                xfh.r(lyeVarZ02.A0, new yxe(arrayList));
                break;
        }
    }
}
