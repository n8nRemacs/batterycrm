package one.me.location.map.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.a93;
import defpackage.age;
import defpackage.aw0;
import defpackage.aye;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.bye;
import defpackage.cye;
import defpackage.dse;
import defpackage.dye;
import defpackage.ef8;
import defpackage.eo7;
import defpackage.eo8;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.ff8;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hfb;
import defpackage.ho7;
import defpackage.hp8;
import defpackage.hs;
import defpackage.idi;
import defpackage.imb;
import defpackage.iw6;
import defpackage.iwi;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k2d;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5c;
import defpackage.lye;
import defpackage.mvd;
import defpackage.pcc;
import defpackage.pva;
import defpackage.q6b;
import defpackage.qbi;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.rza;
import defpackage.s2i;
import defpackage.t86;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ts9;
import defpackage.uo8;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wyc;
import defpackage.y38;
import defpackage.yeb;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.zfi;
import defpackage.zxe;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBA\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/location/map/show/ShowLocationScreen;", "Lone/me/sdk/arch/Widget;", "Lpva;", "Lone/me/geo/native/NativeOnMapReadyCallback;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "senderId", "messageId", "", "lat", "lon", "", "zoom", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;DDLjava/lang/Float;)V", "location-map_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShowLocationScreen extends Widget implements pva, qq3 {
    public static final /* synthetic */ yy7[] B0 = {new toc(ShowLocationScreen.class, "lat", "getLat()D", 0), ho7.d(vid.a, ShowLocationScreen.class, "lon", "getLon()D", 0), new toc(ShowLocationScreen.class, "zoom", "getZoom()F", 0), new toc(ShowLocationScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;", 0), new toc(ShowLocationScreen.class, "senderId", "getSenderId()Ljava/lang/Long;", 0), new toc(ShowLocationScreen.class, "messageId", "getMessageId()Ljava/lang/Long;", 0), new toc(ShowLocationScreen.class, "mapView", "getMapView()Lone/me/geo/view/OneMeMapView;", 0), new toc(ShowLocationScreen.class, "buttonCurrentLocation", "getButtonCurrentLocation()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool;", 0), new toc(ShowLocationScreen.class, "locationInfoLayout", "getLocationInfoLayout()Lone/me/location/map/show/view/LocationInfoLayout;", 0)};
    public static final eo7 C0 = new eo7(3, null, 13);
    public final k18 A0;
    public final hs X;
    public final hs Y;
    public final bwf Z;
    public final ka5 a;
    public final hs b;
    public final hs c;
    public final hs d;
    public final hs o;
    public final k18 s0;
    public final bbd t0;
    public hp8 u0;
    public final bbd v0;
    public final bbd w0;
    public iw6 x0;
    public final LinkedHashMap y0;
    public final k18 z0;

    public ShowLocationScreen(Long l, Long l2, Long l3, double d, double d2, Float f) {
        this(gwi.b(new imb("ShowLocationScreen.chatId", l), new imb("ShowLocationScreen.senderId", l2), new imb("ShowLocationScreen.msgId", l3), new imb("ShowLocationScreen.lat", Double.valueOf(d)), new imb("ShowLocationScreen.lon", Double.valueOf(d2)), new imb("ShowLocationScreen.zoom", f)));
    }

    public final void A0(yeb yebVar, iw6 iw6Var) {
        t86 t86VarN = ((l5c) ((age) this.A0.getValue())).n();
        if ((t86VarN != null ? (String) t86VarN.a : null) != null) {
            iw6Var.j(eo8.b(getContext(), k2d.google_universal_map_style));
            return;
        }
        int iOrdinal = yebVar.h().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                iw6Var.j(eo8.b(getContext(), k2d.google_map_night_style));
                return;
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        iw6Var.j(null);
    }

    @Override // defpackage.pva
    public final void R(iw6 iw6Var) {
        this.x0 = iw6Var;
        A0(a93.s0.x(getContext()).k(), iw6Var);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        Intent intent = (Intent) this.y0.get(Integer.valueOf(i));
        if (intent != null) {
            getContext().startActivity(intent);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(wyc.oneme_location_map_toolbar_close);
        zfi.b(yfbVar, C0, null);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new hfb(new dse(1, this)));
        yfbVar.setBackgroundColor(a93.s0.y(yfbVar).b().c);
        yfbVar.setTitle(mvd.T1);
        float f = 6;
        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
        q6b q6bVar = new q6b(getContext());
        q6bVar.setId(wyc.oneme_location_map_view);
        ef8 ef8Var = new ef8(getContext());
        ef8Var.setId(wyc.oneme_location_map_location_info);
        ef8Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        rza rzaVarA = iwi.a(getContext());
        SimpleDraweeView simpleDraweeViewA = uo8.a(getContext(), ff8.a.getAccessor().d(454), ((l5c) ((age) this.A0.getValue())).n());
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        kt3 kt3Var = new kt3(0, 0);
        kt3Var.i = 0;
        kt3Var.t = 0;
        kt3Var.v = 0;
        kt3Var.l = 0;
        kt3Var.setMargins(((ViewGroup.MarginLayoutParams) kt3Var).leftMargin, ((ViewGroup.MarginLayoutParams) kt3Var).topMargin, ((ViewGroup.MarginLayoutParams) kt3Var).rightMargin, -kti.d(48 * vw4.d().getDisplayMetrics().density));
        constraintLayout.addView(q6bVar, kt3Var);
        kt3 kt3Var2 = new kt3(0, -2);
        kt3Var2.i = 0;
        kt3Var2.t = 0;
        kt3Var2.v = 0;
        constraintLayout.addView(yfbVar, kt3Var2);
        kt3 kt3Var3 = new kt3(0, -2);
        kt3Var3.t = 0;
        kt3Var3.v = 0;
        kt3Var3.l = 0;
        constraintLayout.addView(ef8Var, kt3Var3);
        kt3 kt3Var4 = new kt3(-2, -2);
        kt3Var4.v = 0;
        kt3Var4.k = ef8Var.getId();
        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
        kt3Var4.setMargins(((ViewGroup.MarginLayoutParams) kt3Var4).leftMargin, ((ViewGroup.MarginLayoutParams) kt3Var4).topMargin, iD, iD);
        constraintLayout.addView(rzaVarA, kt3Var4);
        kt3 kt3Var5 = new kt3(uo8.a, uo8.b);
        kt3Var5.t = 0;
        kt3Var5.k = ef8Var.getId();
        constraintLayout.addView(simpleDraweeViewA, kt3Var5);
        tqi.c(new aye(yfbVar, q6bVar, simpleDraweeViewA, this, null), constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        idi idiVar = y0().a;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.e();
        } else {
            idiVar.v(4);
        }
        q6b q6bVarY0 = y0();
        q6bVarY0.c = null;
        q6bVarY0.d = null;
        q6bVarY0.s0 = null;
        q6bVarY0.t0 = null;
        q6bVarY0.v0 = null;
        idi idiVar2 = q6bVarY0.a;
        y38 y38Var2 = (y38) idiVar2.a;
        if (y38Var2 != null) {
            y38Var2.a();
        } else {
            idiVar2.v(1);
        }
        iw6 iw6Var = this.x0;
        if (iw6Var != null) {
            iw6Var.n(null);
        }
        iw6 iw6Var2 = this.x0;
        if (iw6Var2 != null) {
            iw6Var2.m(null);
        }
        this.x0 = null;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 169 && qsb.s((qsb) this.z0.getValue(), new s2i(this, 1), strArr, iArr, qsb.k, mvd.U0, mvd.f1, 128)) {
            z0().u();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        idi idiVar = y0().a;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.k(bundle);
            return;
        }
        Bundle bundle2 = (Bundle) idiVar.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        y0().b(gwi.a());
        idi idiVar = y0().a;
        idiVar.getClass();
        idiVar.w(null, new qbi(idiVar, 0));
        q6b q6bVarY0 = y0();
        ts9 ts9Var = new ts9(1, this, ShowLocationScreen.class, "onMapReady", "onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V", 0, 13);
        t86 t86VarN = ((l5c) ((age) this.A0.getValue())).n();
        q6bVarY0.a(ts9Var, null, t86VarN != null ? (String) t86VarN.a : null);
        f8j.d((rza) this.v0.D(this, B0[7]), 300L, new pcc(15, this));
        hbd hbdVar = z0().z0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new bye(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().B0, getViewLifecycleOwner().p(), l38Var), new cye(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().A0, getViewLifecycleOwner().p(), l38Var), new dye(null, this), 1), getViewLifecycleScope());
    }

    public final q6b y0() {
        return (q6b) this.t0.D(this, B0[6]);
    }

    public final lye z0() {
        return (lye) this.s0.getValue();
    }

    public ShowLocationScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(f1e.CHAT_LOCATION_VIEWER);
        Double dValueOf = Double.valueOf(0.0d);
        this.b = new hs(Double.class, dValueOf, "ShowLocationScreen.lat");
        this.c = new hs(Double.class, dValueOf, "ShowLocationScreen.lon");
        this.d = new hs(Float.class, Float.valueOf(14.0f), "ShowLocationScreen.zoom");
        this.o = new hs(Long.class, null, "ShowLocationScreen.chatId");
        this.X = new hs(Long.class, null, "ShowLocationScreen.senderId");
        this.Y = new hs(Long.class, null, "ShowLocationScreen.msgId");
        this.Z = new bwf(new zxe(this, 0));
        this.s0 = createViewModelLazy(lye.class, new vdc(22, new zxe(this, 1)));
        this.t0 = viewBinding(wyc.oneme_location_map_view);
        this.v0 = viewBinding(wyc.oneme_location_map_button_current_location);
        this.w0 = viewBinding(wyc.oneme_location_map_location_info);
        this.y0 = new LinkedHashMap();
        ff8 ff8Var = ff8.a;
        this.z0 = ff8Var.getAccessor().d(10);
        this.A0 = ff8Var.getAccessor().d(47);
    }
}
