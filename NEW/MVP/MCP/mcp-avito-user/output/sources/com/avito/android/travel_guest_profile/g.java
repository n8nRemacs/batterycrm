package com.avito.android.travel_guest_profile;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/g;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final NavBar f302034a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f302035b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ContentPlaceholder f302036c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f302037d;

    public g(@k View view) {
        View viewFindViewById = view.findViewById(R.id.nav_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        this.f302034a = (NavBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f302035b = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error_content_placeholder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.content_placeholder.ContentPlaceholder");
        }
        this.f302036c = (ContentPlaceholder) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.loading_state_root);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f302037d = viewFindViewById4;
    }
}
