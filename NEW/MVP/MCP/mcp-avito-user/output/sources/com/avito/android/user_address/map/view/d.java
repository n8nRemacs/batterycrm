package com.avito.android.user_address.map.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.user_address.map.mvi.ScreenState;
import com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState;
import com.avito.android.user_address.pin.BlackPinView;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressMapView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/view/d;", "Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "MVIState", "Lcom/avito/android/user_address/map/view/h;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class d<MVIState extends UserAddressAddNewAddressMviState> implements h<MVIState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Toolbar f307943b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AvitoMap f307944c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BlackPinView f307945d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f307946e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CompositeLocationTextView f307947f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f307948g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f307949h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f307950i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f307951j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f307952k;

    /* renamed from: l, reason: collision with root package name */
    public com.avito.android.user_address.map.e f307953l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ImageView f307954m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f307955n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f307956o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f307957p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f307958q;

    public d(@Y61.k View view, boolean z12) {
        this.f307943b = (Toolbar) view.findViewById(R.id.toolbar);
        this.f307945d = (BlackPinView) view.findViewById(R.id.pin_view);
        this.f307946e = (FloatingActionButton) view.findViewById(R.id.find_me_button);
        CompositeLocationTextView compositeLocationTextView = (CompositeLocationTextView) view.findViewById(R.id.address_input_view);
        this.f307947f = compositeLocationTextView;
        this.f307948g = (Button) view.findViewById(R.id.button);
        this.f307949h = (TextView) view.findViewById(R.id.error_text_view);
        this.f307950i = (ViewGroup) view.findViewById(R.id.content_view);
        this.f307951j = (ViewGroup) view.findViewById(R.id.error_layout);
        this.f307952k = (ViewGroup) view.findViewById(R.id.spinner_overlay);
        View viewFindViewById = view.findViewById(R.id.error_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f307954m = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.error_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307955n = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307956o = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.retry_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f307957p = (Button) viewFindViewById4;
        TextView textView = (TextView) view.findViewById(R.id.confidence_data_link_text_view);
        this.f307958q = textView;
        if (!z12) {
            D6.w(textView);
        }
        compositeLocationTextView.a(R.attr.textBody, R.attr.black);
    }

    public void a(@Y61.k MVIState mvistate) {
        AvitoMap avitoMap;
        AvitoMap avitoMap2;
        G(this.f307943b);
        ScreenState f307787b = mvistate.getF307787b();
        boolean z12 = f307787b instanceof ScreenState.CommonState;
        Button button = this.f307948g;
        TextView textView = this.f307949h;
        ViewGroup viewGroup = this.f307952k;
        ViewGroup viewGroup2 = this.f307950i;
        ViewGroup viewGroup3 = this.f307951j;
        if (z12) {
            D6.H(viewGroup2);
            D6.w(viewGroup3);
            D6.w(viewGroup);
            AvitoMapCameraPosition f307788c = mvistate.getF307788c();
            if (!mvistate.getF307789d() && (avitoMap2 = this.f307944c) != null) {
                avitoMap2.moveTo(f307788c.getMapPoint(), mvistate.getF307790e(), Float.valueOf(f307788c.getZoomLevel()));
            }
            int length = mvistate.getF307791f().getHouse().length();
            CompositeLocationTextView compositeLocationTextView = this.f307947f;
            if (length > 0) {
                compositeLocationTextView.setFirstText(mvistate.getF307791f().getLocality() + ", ");
            } else {
                compositeLocationTextView.setFirstText(mvistate.getF307791f().getLocality());
            }
            compositeLocationTextView.setSecondText(mvistate.getF307791f().getHouse());
            if (mvistate.getF307792g()) {
                this.f307947f.setBackground(R.drawable.composite_location_view_input_background_state_error);
                button.setEnabled(false);
                D6.H(textView);
                textView.setText(mvistate.getF307793h());
            } else {
                this.f307947f.setBackground(R.drawable.composite_location_view_input_background_state_normal);
                button.setEnabled(true);
                D6.w(textView);
            }
            button.setLoading(mvistate.getF307794i());
            button.setClickable(!mvistate.getF307794i());
            button.setEnabled(mvistate.getF307795j());
        } else if (L.f(f307787b, ScreenState.LoadingState.f307718b)) {
            D6.w(viewGroup2);
            D6.w(viewGroup3);
            D6.H(viewGroup);
        } else {
            boolean zF2 = L.f(f307787b, ScreenState.Error.Api.f307716b);
            TextView textView2 = this.f307956o;
            TextView textView3 = this.f307955n;
            ImageView imageView = this.f307954m;
            if (zF2) {
                D6.w(viewGroup2);
                D6.H(viewGroup3);
                D6.w(viewGroup);
                D6.H(viewGroup3);
                imageView.setImageResource(R.drawable.img_unknown_error_216_160);
                textView3.setText(textView3.getResources().getString(R.string.error_layout_unknown_error));
                textView2.setText(textView2.getResources().getString(R.string.error_layout_try_refresh_or_return_later));
            } else if (L.f(f307787b, ScreenState.Error.Network.f307717b)) {
                D6.w(viewGroup2);
                D6.H(viewGroup3);
                D6.w(viewGroup);
                D6.H(viewGroup3);
                imageView.setImageResource(R.drawable.img_no_internet_160_160);
                textView3.setText(textView3.getResources().getString(R.string.error_layout_no_internet));
                textView2.setText(textView2.getResources().getString(R.string.error_layout_check_connection));
            }
        }
        AvitoMapCameraPosition f307788c2 = mvistate.getF307788c();
        if (!mvistate.getF307789d() && (avitoMap = this.f307944c) != null) {
            avitoMap.moveTo(f307788c2.getMapPoint(), mvistate.getF307790e(), Float.valueOf(f307788c2.getZoomLevel()));
        }
        if (!mvistate.getF307792g()) {
            this.f307947f.setBackground(R.drawable.composite_location_view_input_background_state_normal);
            button.setEnabled(true);
            D6.w(textView);
        } else {
            this.f307947f.setBackground(R.drawable.composite_location_view_input_background_state_error);
            button.setEnabled(false);
            D6.H(textView);
            textView.setText(mvistate.getF307793h());
        }
    }

    @Override // com.avito.android.user_address.map.view.h
    public void c(@Y61.k com.avito.android.user_address.map.e eVar) {
        this.f307953l = eVar;
        this.f307946e.setOnClickListener(new a(eVar, 0));
        this.f307947f.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(13, eVar, this));
        this.f307957p.setOnClickListener(new a(eVar, 1));
        this.f307958q.setOnClickListener(new a(eVar, 2));
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@Y61.k AvitoMap avitoMap) {
        this.f307944c = avitoMap;
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isMyLocationButtonEnabled(true);
        uiSettings.isZoomControlsEnabled(false);
        uiSettings.isCompassEnabled(false);
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isFastTapEnabled(true);
        avitoMap.addMoveStartListener(new b(this));
        avitoMap.addMoveEndListener(new c(this));
        AvitoMap avitoMap2 = this.f307944c;
        if (avitoMap2 != null) {
            avitoMap2.setLogoPadding(y6.b(35), 0);
        }
        BlackPinView blackPinView = this.f307945d;
        blackPinView.getClass();
        avitoMap.addMoveStartListener(blackPinView);
        avitoMap.addMoveEndListener(blackPinView);
    }
}
