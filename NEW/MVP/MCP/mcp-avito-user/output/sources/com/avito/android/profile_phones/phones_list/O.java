package com.avito.android.profile_phones.phones_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesListViewHolder.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/O;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f227355a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Toolbar f227356b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f227357c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Banner f227358d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Banner f227359e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Banner f227360f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f227361g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f227362h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f227363i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f227364j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f227365k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Input f227366l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f227367m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f227368n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ImageButton f227369o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final View f227370p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final View f227371q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Button f227372r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final View f227373s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final ImageView f227374t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f227375u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextView f227376v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f227377w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f227378x;

    public O(@Y61.k View view) {
        this.f227355a = view;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.phone_list_toolbar);
        if (toolbar != null) {
            toolbar.setNavigationContentDescription(R.string.navigation_button_content_desc);
        } else {
            toolbar = null;
        }
        this.f227356b = toolbar;
        View viewFindViewById = view.findViewById(R.id.phone_list_overlay);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f227357c = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.phone_list_view, null, 0, 0, 28, null);
        this.f227358d = (Banner) view.findViewById(R.id.iac_problem_block);
        this.f227359e = (Banner) view.findViewById(R.id.iac_enable_true_block);
        Banner banner = (Banner) view.findViewById(R.id.iac_enable_switch_block);
        this.f227360f = banner;
        View viewFindViewById2 = banner.findViewById(R.id.iac_enable_block_switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f227361g = (ListItemSwitcher) viewFindViewById2;
        this.f227362h = (TextView) view.findViewById(R.id.phone_list_time_hint);
        this.f227363i = (TextView) view.findViewById(R.id.phone_list_time_header);
        this.f227364j = (Input) view.findViewById(R.id.phone_list_time_input);
        this.f227365k = view.findViewById(R.id.phone_list_schedule_title);
        this.f227366l = (Input) view.findViewById(R.id.phone_list_schedule_input);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.phones_list_numbers_rv);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.f227367m = recyclerView;
        this.f227368n = (Button) view.findViewById(R.id.phone_list_numbers_refresh_btn);
        this.f227369o = (ImageButton) view.findViewById(R.id.phone_list_phone_add);
        this.f227370p = view.findViewById(R.id.phone_list_numbers_error);
        this.f227371q = view.findViewById(R.id.phone_list_numbers_empty);
        this.f227372r = (Button) view.findViewById(R.id.phone_list_add_btn);
        this.f227373s = view.findViewById(R.id.phones_lis_numbers_expand);
        this.f227374t = (ImageView) view.findViewById(R.id.phones_list_numbers_expand_ic);
        this.f227375u = (TextView) view.findViewById(R.id.phones_list_numbers_expand_text);
        this.f227376v = (TextView) view.findViewById(R.id.phone_list_devices_info);
        this.f227377w = (TextView) view.findViewById(R.id.phone_list_devices_title);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.phone_list_devices_rv);
        view.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        this.f227378x = recyclerView2;
    }
}
