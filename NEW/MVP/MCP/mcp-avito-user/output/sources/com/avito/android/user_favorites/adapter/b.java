package com.avito.android.user_favorites.adapter;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.h;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FavoritesTabView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_favorites/adapter/b;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/a;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/h;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.lib.deprecated_design.tab.adapter.a, h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f316835a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f316836b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f316837c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Badge f316838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f316839e;

    public b(@k View view) {
        this.f316835a = view;
        View viewFindViewById = view.findViewById(R.id.tab_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f316836b = (TextView) viewFindViewById;
        this.f316837c = (TextView) view.findViewById(R.id.tab_counter);
        this.f316838d = (Badge) view.findViewById(R.id.tab_badge);
        this.f316839e = R.id.tab_title;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.a
    public final void a(@l String str, @l String str2) {
        I5.a(this.f316836b, str, false);
        TextView textView = this.f316837c;
        if (textView != null) {
            I5.a(textView, str2, false);
        }
        Badge badge = this.f316838d;
        if (badge == null) {
            return;
        }
        badge.setVisibility(8);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.h
    @k
    public final Integer c() {
        return Integer.valueOf(this.f316839e);
    }

    public final void f(@k FavoritesTab favoritesTab) {
        I5.a(this.f316836b, favoritesTab.getF231823d(), false);
        TextView textView = this.f316837c;
        if (textView != null) {
            I5.a(textView, favoritesTab.getF316857h(), false);
        }
        Badge badge = this.f316838d;
        if (badge != null) {
            com.avito.android.lib.design.badge.h.a(badge, favoritesTab.getF316860h());
        }
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF178148a() {
        return this.f316835a;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
    }
}
