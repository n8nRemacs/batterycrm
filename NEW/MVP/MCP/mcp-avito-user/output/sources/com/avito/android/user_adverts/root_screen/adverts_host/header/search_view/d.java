package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;

/* compiled from: UserAdvertsSearchView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/d;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/d$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f312788a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f312789b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Input f312790c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AppBarLayout f312791d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final View f312792e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final View f312793f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final RecyclerView f312794g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final ListItemSwitcher f312795h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final View f312796i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final View f312797j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final View f312798k;

        public a(@k View view, boolean z12) {
            this.f312788a = view.findViewById(R.id.adverts_search_container_re23);
            this.f312789b = view.findViewById(R.id.adverts_search_cancel_re23);
            this.f312790c = (Input) view.findViewById(R.id.adverts_search_re23);
            this.f312791d = !z12 ? (AppBarLayout) view.findViewById(R.id.app_bar) : null;
            this.f312792e = view.findViewById(R.id.user_adverts_search_content_re23);
            this.f312793f = view.findViewById(R.id.user_adverts_search_content_divider_re23);
            this.f312794g = (RecyclerView) view.findViewById(R.id.user_adverts_search_content_suggestion_re23);
            this.f312795h = (ListItemSwitcher) view.findViewById(R.id.user_adverts_search_content_by_title_re23);
            this.f312796i = view.findViewById(R.id.user_adverts_search_app_bar_overlay_padding);
            this.f312797j = view.findViewById(R.id.adverts_search_filter_btn_re23);
            this.f312798k = view.findViewById(R.id.adverts_search_filter_applied_point_re23);
        }
    }
}
