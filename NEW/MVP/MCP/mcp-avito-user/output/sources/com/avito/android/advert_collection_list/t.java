package com.avito.android.advert_collection_list;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionListViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/t;", "", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f82308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f82309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f82310c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f82311d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f82312e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f82313f;

    public t(@Y61.k View view) {
        this.f82308a = view;
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        TabBarLayout.a aVar = TabBarLayout.f180679h;
        TabBarLayout.a.e(aVar, recyclerView, y6.b(60), 2);
        this.f82309b = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        this.f82310c = (SwipeRefreshLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.create_collection_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        TabBarLayout.a.d(aVar, button);
        this.f82311d = button;
        View viewFindViewById4 = view.findViewById(R.id.info_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f82312e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        View viewFindViewById6 = view.findViewById(R.id.subtitle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        View viewFindViewById7 = view.findViewById(R.id.action_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f82313f = (Button) viewFindViewById7;
    }
}
