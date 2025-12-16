package com.avito.android.location_picker.view.publish;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.location_picker.view.AbstractC31586h;
import com.avito.android.location_picker.view.radius.RadiusCircleViewImpl;
import com.avito.android.user_address.pin.BlackPinView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: PublishLocationPickerViewBinding.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/publish/k;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f182746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC31586h.a f182747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavBar f182748c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f182749d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f182750e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f182751f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final BlackPinView f182752g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Spinner f182753h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f182754i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f182755j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PublishSearchLocationInput f182756k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f182757l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final PublishSearchLocationInput f182758m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f182759n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f182760o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final View f182761p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Chips f182762q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Button f182763r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final View f182764s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final View f182765t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final RadiusCircleViewImpl f182766u;

    public k(View view, AbstractC31586h.a aVar, NavBar navBar, View view2, ViewGroup viewGroup, View view3, BlackPinView blackPinView, Spinner spinner, FrameLayout frameLayout, FloatingActionButton floatingActionButton, PublishSearchLocationInput publishSearchLocationInput, View view4, PublishSearchLocationInput publishSearchLocationInput2, RecyclerView recyclerView, View view5, View view6, Chips chips, Button button, View view7, View view8, RadiusCircleViewImpl radiusCircleViewImpl, int i12, C42822w c42822w) {
        View view9;
        View viewFindViewById;
        RecyclerView recyclerView2;
        Chips chips2;
        Chips chips3;
        Button button2;
        Button button3;
        View viewFindViewById2;
        View view10;
        View viewFindViewById3;
        NavBar navBar2 = (i12 & 4) != 0 ? (NavBar) view.findViewById(R.id.navbar) : navBar;
        View viewFindViewById4 = (i12 & 8) != 0 ? view.findViewById(R.id.navbar_layout) : view2;
        ViewGroup viewGroup2 = (i12 & 16) != 0 ? (ViewGroup) view.findViewById(R.id.progress_overlay_container) : viewGroup;
        View viewFindViewById5 = (i12 & 32) != 0 ? view.findViewById(R.id.container) : view3;
        BlackPinView blackPinView2 = (i12 & 64) != 0 ? (BlackPinView) view.findViewById(R.id.pin_view) : blackPinView;
        Spinner spinner2 = (i12 & 128) != 0 ? (Spinner) view.findViewById(R.id.circular_progress) : spinner;
        FrameLayout frameLayout2 = (i12 & 256) != 0 ? (FrameLayout) view.findViewById(R.id.map) : frameLayout;
        FloatingActionButton floatingActionButton2 = (i12 & 512) != 0 ? (FloatingActionButton) view.findViewById(R.id.find_me_button) : floatingActionButton;
        PublishSearchLocationInput publishSearchLocationInput3 = (i12 & 1024) != 0 ? (PublishSearchLocationInput) view.findViewById(R.id.location_edit_query) : publishSearchLocationInput;
        View viewFindViewById6 = (i12 & 2048) != 0 ? view.findViewById(R.id.bottom_actions_container) : view4;
        PublishSearchLocationInput publishSearchLocationInput4 = (i12 & 4096) != 0 ? (PublishSearchLocationInput) view.findViewById(R.id.bottom_location_edit_query) : publishSearchLocationInput2;
        RecyclerView recyclerView3 = (i12 & 8192) != 0 ? (RecyclerView) view.findViewById(R.id.suggestions_list) : recyclerView;
        View viewFindViewById7 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? view.findViewById(R.id.drop_down_suggestions_container) : view5;
        if ((i12 & 32768) != 0) {
            view9 = viewFindViewById7;
            viewFindViewById = view.findViewById(R.id.linear_radius_list_container);
        } else {
            view9 = viewFindViewById7;
            viewFindViewById = view6;
        }
        if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            recyclerView2 = recyclerView3;
            chips2 = viewFindViewById != null ? (Chips) viewFindViewById.findViewById(R.id.chips) : null;
        } else {
            recyclerView2 = recyclerView3;
            chips2 = chips;
        }
        if ((i12 & 131072) != 0) {
            chips3 = chips2;
            button2 = (Button) view.findViewById(R.id.select_radius_button);
        } else {
            chips3 = chips2;
            button2 = button;
        }
        if ((i12 & 262144) != 0) {
            button3 = button2;
            viewFindViewById2 = view.findViewById(R.id.search_radius_view_skeleton);
        } else {
            button3 = button2;
            viewFindViewById2 = view7;
        }
        if ((i12 & 524288) != 0) {
            view10 = viewFindViewById2;
            viewFindViewById3 = view.findViewById(R.id.search_radius_bottom);
        } else {
            view10 = viewFindViewById2;
            viewFindViewById3 = view8;
        }
        RadiusCircleViewImpl radiusCircleViewImpl2 = (i12 & 1048576) != 0 ? (RadiusCircleViewImpl) view.findViewById(R.id.search_radius_view) : radiusCircleViewImpl;
        this.f182746a = view;
        this.f182747b = aVar;
        this.f182748c = navBar2;
        this.f182749d = viewFindViewById4;
        this.f182750e = viewGroup2;
        this.f182751f = viewFindViewById5;
        this.f182752g = blackPinView2;
        this.f182753h = spinner2;
        this.f182754i = frameLayout2;
        this.f182755j = floatingActionButton2;
        this.f182756k = publishSearchLocationInput3;
        this.f182757l = viewFindViewById6;
        this.f182758m = publishSearchLocationInput4;
        this.f182759n = recyclerView2;
        this.f182760o = view9;
        this.f182761p = viewFindViewById;
        this.f182762q = chips3;
        this.f182763r = button3;
        this.f182764s = view10;
        this.f182765t = viewFindViewById3;
        this.f182766u = radiusCircleViewImpl2;
    }
}
