package com.avito.android.search.filter.adapter.action_with_placeholders;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.search.filter.converter.common.ActionWithPlaceholdersItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ActionWithPlaceholdersItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/action_with_placeholders/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/search/filter/adapter/action_with_placeholders/h;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f261956e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f261957b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f261958c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f261959d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f261957b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.placeholder);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f261958c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f261959d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.search.filter.adapter.action_with_placeholders.h
    public final void fP(@k ActionWithPlaceholdersItem actionWithPlaceholdersItem, @k l<? super DeepLink, G0> lVar) {
        TextView textView = this.f261959d;
        textView.setOnClickListener(null);
        Badge badge = actionWithPlaceholdersItem.f262905f;
        if (badge != null) {
            com.avito.android.lib.design.badge.e.d(this.f261957b, actionWithPlaceholdersItem.f262902c, badge.getTitle(), R.style.Re23_Badge_TextRedM, "$\\text  $\\badgeText", 48);
        } else {
            I5.a(this.f261957b, actionWithPlaceholdersItem.f262902c, false);
        }
        List<String> list = actionWithPlaceholdersItem.f262904e;
        boolean z12 = !list.isEmpty();
        TextView textView2 = this.f261958c;
        D6.G(textView2, z12);
        I5.a(textView2, C42745f0.O(list, null, null, null, null, 63), false);
        I5.a(textView, actionWithPlaceholdersItem.f262903d.getTitle(), false);
        textView.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(27, (Object) lVar, (Object) actionWithPlaceholdersItem));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f261959d.setOnClickListener(null);
    }
}
