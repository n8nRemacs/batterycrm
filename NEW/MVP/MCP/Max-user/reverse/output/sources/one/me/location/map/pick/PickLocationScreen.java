package one.me.location.map.pick;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import defpackage.a93;
import defpackage.age;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.cwb;
import defpackage.eo7;
import defpackage.eo8;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.ff8;
import defpackage.ffb;
import defpackage.fw6;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gw6;
import defpackage.gwb;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hfb;
import defpackage.ho7;
import defpackage.hs;
import defpackage.idi;
import defpackage.imb;
import defpackage.iqb;
import defpackage.iv8;
import defpackage.iw6;
import defpackage.iwi;
import defpackage.jq5;
import defpackage.jqd;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k2d;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5c;
import defpackage.ms0;
import defpackage.mvd;
import defpackage.p6b;
import defpackage.pva;
import defpackage.pwc;
import defpackage.q6b;
import defpackage.qbi;
import defpackage.qfb;
import defpackage.qsb;
import defpackage.rza;
import defpackage.s2i;
import defpackage.svi;
import defpackage.t86;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ts9;
import defpackage.uo8;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vvb;
import defpackage.vw4;
import defpackage.wvb;
import defpackage.wyc;
import defpackage.xvb;
import defpackage.y38;
import defpackage.yeb;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.zfb;
import defpackage.zfi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.location.map.pick.PickLocationScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00060\u0004j\u0002`\u00052\u00060\u0006j\u0002`\u00072\u00020\bB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0011B)\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lone/me/location/map/pick/PickLocationScreen;", "Lone/me/sdk/arch/Widget;", "Lfw6;", "Lone/me/geo/native/NativeOnCameraIdleListener;", "Lgw6;", "Lone/me/geo/native/NativeOnCameraMoveStartedListener;", "Lpva;", "Lone/me/geo/native/NativeOnMapReadyCallback;", "Lp6b;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "requestCode", "(JI)V", "", "lat", "lon", "", "zoom", "(JDDF)V", "location-map_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PickLocationScreen extends Widget implements fw6, gw6, pva, p6b {
    public static final /* synthetic */ yy7[] v0 = {new toc(PickLocationScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, PickLocationScreen.class, "requestCode", "getRequestCode()I", 0), new toc(PickLocationScreen.class, "mapView", "getMapView()Lone/me/geo/view/OneMeMapView;", 0), new toc(PickLocationScreen.class, "centerMarker", "getCenterMarker()Landroid/widget/ImageView;", 0), new toc(PickLocationScreen.class, "buttonSend", "getButtonSend()Lone/me/sdk/uikit/common/button/OneMeTitleSubtitleButton;", 0), new toc(PickLocationScreen.class, "buttonCurrentLocation", "getButtonCurrentLocation()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool;", 0)};
    public static final eo7 w0 = new eo7(3, null, 13);
    public static final eo7 x0 = new eo7(0, new ms0(5, 1, false), 7);
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final ka5 a;
    public final hs b;
    public final bwf c;
    public final k18 d;
    public final bbd o;
    public iw6 s0;
    public final k18 t0;
    public final k18 u0;

    public PickLocationScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(f1e.CHAT_SHARE_LOCATION);
        this.b = new hs(Integer.class, "LocationMapScreen.requestCode");
        this.c = new bwf(new ffb(10, this));
        this.d = createViewModelLazy(gwb.class, new iv8(20, new zfb(9)));
        this.o = viewBinding(wyc.oneme_location_map_view);
        this.X = viewBinding(wyc.oneme_location_map_center_marker);
        this.Y = viewBinding(wyc.oneme_location_map_button_send);
        this.Z = viewBinding(wyc.oneme_location_map_button_current_location);
        ff8 ff8Var = ff8.a;
        this.t0 = ff8Var.getAccessor().d(10);
        this.u0 = ff8Var.getAccessor().d(47);
    }

    public final gwb A0() {
        return (gwb) this.d.getValue();
    }

    public final void B0(GradientDrawable gradientDrawable) {
        jqd.a(gradientDrawable, a93.s0.x(getContext()).l() ? new int[]{0, -1207104243, -15921907} : new int[]{0, -1191182337, -1}, new float[]{0.0f, 0.4f, 1.0f});
    }

    public final void C0(yeb yebVar, iw6 iw6Var) {
        t86 t86VarN = ((l5c) ((age) this.u0.getValue())).n();
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
        this.s0 = iw6Var;
        C0(a93.s0.x(getContext()).k(), iw6Var);
        iw6Var.m(this);
        iw6Var.n(this);
        A0().t(false, false);
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.fw6
    public final void h0() {
        CameraPosition cameraPositionD;
        iw6 iw6Var = this.s0;
        if (iw6Var == null || (cameraPositionD = iw6Var.d()) == null) {
            return;
        }
        gwb gwbVarA0 = A0();
        LatLng latLng = cameraPositionD.a;
        svi.e(gwbVarA0.a, null, null, new cwb(gwbVarA0, latLng.a, latLng.b, null), 3);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(wyc.oneme_location_map_toolbar_close);
        zfi.b(yfbVar, w0, null);
        v1a v1aVar = a93.s0;
        yfbVar.setBackgroundColor(v1aVar.y(yfbVar).b().c);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new hfb(new iqb(2, this)));
        yfbVar.setTitle(mvd.T1);
        float f = 6;
        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
        q6b q6bVar = new q6b(getContext());
        q6bVar.setId(wyc.oneme_location_map_view);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(wyc.oneme_location_map_center_marker);
        imageView.setImageResource(pwc.ic_geolocation_filled_28);
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).getIcon().k));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(wyc.oneme_location_map_bottom_gradient_view);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        B0(gradientDrawable);
        frameLayout.setBackground(gradientDrawable);
        OneMeTitleSubtitleButton oneMeTitleSubtitleButton = new OneMeTitleSubtitleButton(getContext(), null);
        oneMeTitleSubtitleButton.setId(wyc.oneme_location_map_button_send);
        rza rzaVarA = iwi.a(getContext());
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
        kt3 kt3Var3 = new kt3(-2, -2);
        kt3Var3.i = q6bVar.getId();
        kt3Var3.l = q6bVar.getId();
        kt3Var3.t = q6bVar.getId();
        kt3Var3.v = q6bVar.getId();
        kt3Var3.setMargins(((ViewGroup.MarginLayoutParams) kt3Var3).leftMargin, ((ViewGroup.MarginLayoutParams) kt3Var3).topMargin, ((ViewGroup.MarginLayoutParams) kt3Var3).rightMargin, kti.d(17 * vw4.d().getDisplayMetrics().density));
        constraintLayout.addView(imageView, kt3Var3);
        kt3 kt3Var4 = new kt3(0, kti.d(104 * vw4.d().getDisplayMetrics().density));
        kt3Var4.t = 0;
        kt3Var4.v = 0;
        kt3Var4.l = 0;
        constraintLayout.addView(frameLayout, kt3Var4);
        kt3 kt3Var5 = new kt3(0, -2);
        kt3Var5.t = 0;
        kt3Var5.v = 0;
        kt3Var5.l = 0;
        float f2 = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f2);
        kt3Var5.setMargins(iD, ((ViewGroup.MarginLayoutParams) kt3Var5).topMargin, iD, kti.d(f2 * vw4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeTitleSubtitleButton, kt3Var5);
        zfi.b(oneMeTitleSubtitleButton, x0, null);
        kt3 kt3Var6 = new kt3(-2, -2);
        kt3Var6.v = 0;
        kt3Var6.k = oneMeTitleSubtitleButton.getId();
        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        kt3Var6.setMargins(((ViewGroup.MarginLayoutParams) kt3Var6).leftMargin, ((ViewGroup.MarginLayoutParams) kt3Var6).topMargin, iD2, iD2);
        constraintLayout.addView(rzaVarA, kt3Var6);
        SimpleDraweeView simpleDraweeViewA = uo8.a(constraintLayout.getContext(), ff8.a.getAccessor().d(454), ((l5c) ((age) this.u0.getValue())).n());
        kt3 kt3Var7 = new kt3(uo8.a, uo8.b);
        kt3Var7.t = 0;
        kt3Var7.k = oneMeTitleSubtitleButton.getId();
        constraintLayout.addView(simpleDraweeViewA, kt3Var7);
        tqi.c(new jq5(yfbVar, q6bVar, simpleDraweeViewA, this, frameLayout, null, 1), constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        idi idiVar = z0().a;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.e();
        } else {
            idiVar.v(4);
        }
        q6b q6bVarZ0 = z0();
        q6bVarZ0.c = null;
        q6bVarZ0.d = null;
        q6bVarZ0.s0 = null;
        q6bVarZ0.t0 = null;
        q6bVarZ0.v0 = null;
        idi idiVar2 = q6bVarZ0.a;
        y38 y38Var2 = (y38) idiVar2.a;
        if (y38Var2 != null) {
            y38Var2.a();
        } else {
            idiVar2.v(1);
        }
        iw6 iw6Var = this.s0;
        if (iw6Var != null) {
            iw6Var.n(null);
        }
        iw6 iw6Var2 = this.s0;
        if (iw6Var2 != null) {
            iw6Var2.m(null);
        }
        this.s0 = null;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 169 && qsb.s((qsb) this.t0.getValue(), new s2i(this, 1), strArr, iArr, qsb.k, mvd.U0, mvd.f1, 128)) {
            A0().t(false, false);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        idi idiVar = z0().a;
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
        z0().b(gwi.a());
        idi idiVar = z0().a;
        idiVar.getClass();
        idiVar.w(null, new qbi(idiVar, 0));
        q6b q6bVarZ0 = z0();
        ts9 ts9Var = new ts9(1, this, PickLocationScreen.class, "onMapReady", "onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V", 0, 6);
        t86 t86VarN = ((l5c) ((age) this.u0.getValue())).n();
        q6bVarZ0.a(ts9Var, this, t86VarN != null ? (String) t86VarN.a : null);
        z0().setOnMapTouchListener(this);
        final int i = 0;
        f8j.d((rza) this.Z.D(this, v0[5]), 300L, new View.OnClickListener(this) { // from class: uvb
            public final /* synthetic */ PickLocationScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                PickLocationScreen pickLocationScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = PickLocationScreen.v0;
                        pickLocationScreen.A0().t(true, true);
                        break;
                    default:
                        yy7[] yy7VarArr2 = PickLocationScreen.v0;
                        gwb gwbVarA0 = pickLocationScreen.A0();
                        svi.e(gwbVarA0.a, null, null, new ewb(gwbVarA0, null), 3);
                        break;
                }
            }
        });
        final int i2 = 1;
        f8j.d(y0(), 300L, new View.OnClickListener(this) { // from class: uvb
            public final /* synthetic */ PickLocationScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                PickLocationScreen pickLocationScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = PickLocationScreen.v0;
                        pickLocationScreen.A0().t(true, true);
                        break;
                    default:
                        yy7[] yy7VarArr2 = PickLocationScreen.v0;
                        gwb gwbVarA0 = pickLocationScreen.A0();
                        svi.e(gwbVarA0.a, null, null, new ewb(gwbVarA0, null), 3);
                        break;
                }
            }
        });
        hbd hbdVar = A0().Z;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new vvb(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().t0, getViewLifecycleOwner().p(), l38Var), new wvb(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().s0, getViewLifecycleOwner().p(), l38Var), new xvb(null, this), 1), getViewLifecycleScope());
    }

    public final OneMeTitleSubtitleButton y0() {
        return (OneMeTitleSubtitleButton) this.Y.D(this, v0[4]);
    }

    public final q6b z0() {
        return (q6b) this.o.D(this, v0[2]);
    }

    public PickLocationScreen(long j, int i) {
        this(gwi.b(new imb("LocationMapScreen.chatId", Long.valueOf(j)), new imb("LocationMapScreen.requestCode", Integer.valueOf(i))));
    }

    public PickLocationScreen(long j, double d, double d2, float f) {
        this(gwi.b(new imb("LocationMapScreen.chatId", Long.valueOf(j)), new imb("LocationMapScreen.lat", Double.valueOf(d)), new imb("LocationMapScreen.lon", Double.valueOf(d2)), new imb("LocationMapScreen.zoom", Float.valueOf(f))));
    }
}
