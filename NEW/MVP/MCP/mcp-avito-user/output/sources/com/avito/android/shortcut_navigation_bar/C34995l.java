package com.avito.android.shortcut_navigation_bar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;

/* compiled from: PinnedItemBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/l;", "Lcom/avito/android/shortcut_navigation_bar/j;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34995l implements InterfaceC34993j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f283422a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f283423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f283424c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f283425d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f283426e;

    /* renamed from: f, reason: collision with root package name */
    public final int f283427f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public PinnedItem f283428g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f283429h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f283430i;

    public C34995l(@Y61.k View view) {
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.bottom_pinned_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f283422a = viewGroup;
        View viewFindViewById2 = viewGroup.findViewById(R.id.serp_pinned_block_preview);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f283423b = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.serp_pinned_block_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f283424c = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.serp_pinned_block_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f283425d = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.serp_pinned_block_arrow);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283426e = viewFindViewById5;
        this.f283427f = C35835l0.d(R.attr.gray54, context);
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f283429h = cVar;
        this.f283430i = new C41981q0(cVar);
        D6.c(viewGroup, null, null, null, com.avito.android.advert.item.delivery_suggests.l.n(view, R.dimen.serp_pinned_block_bottom_padding), 7);
    }
}
