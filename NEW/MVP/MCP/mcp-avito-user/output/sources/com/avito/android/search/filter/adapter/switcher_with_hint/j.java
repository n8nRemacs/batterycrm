package com.avito.android.search.filter.adapter.switcher_with_hint;

import Y41.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.search.filter.converter.common.SwitcherWithHintItem;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SwitcherWithHintItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/switcher_with_hint/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/search/filter/adapter/switcher_with_hint/i;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f262628g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f262629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f262630c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f262631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f262632e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Switcher f262633f;

    /* compiled from: SwitcherWithHintItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SwitcherWithHintItem f262634l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f262635m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SwitcherWithHintItem switcherWithHintItem, l<? super DeepLink, G0> lVar) {
            super(0);
            this.f262634l = switcherWithHintItem;
            this.f262635m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            BooleanParameter.Hint hint = this.f262634l.f262949h;
            if (hint == null) {
                return null;
            }
            this.f262635m.invoke(hint.getDeeplink());
            return G0.f406611a;
        }
    }

    public j(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.switcher_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f262629b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.switcher_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262630c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.switcher_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262631d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.switcher_hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262632e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.switcher_toggle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f262633f = (Switcher) viewFindViewById5;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f262629b.setOnClickListener(null);
        this.f262632e.setOnClickListener(null);
        this.f262633f.setOnCheckedChangeListener(null);
    }

    @Override // com.avito.android.search.filter.adapter.switcher_with_hint.i
    public final void yW(@Y61.k SwitcherWithHintItem switcherWithHintItem, @Y61.k l<? super Boolean, G0> lVar, @Y61.k l<? super DeepLink, G0> lVar2) throws Resources.NotFoundException {
        View view = this.f262629b;
        view.setOnClickListener(null);
        TextView textView = this.f262632e;
        textView.setOnClickListener(null);
        Switcher switcher = this.f262633f;
        switcher.setOnCheckedChangeListener(null);
        Badge badge = switcherWithHintItem.f262948g;
        if (badge == null) {
            I5.a(this.f262630c, switcherWithHintItem.f262944c, false);
        } else {
            com.avito.android.lib.design.badge.e.d(this.f262630c, switcherWithHintItem.f262944c, badge.getTitle(), R.style.Re23_Badge_TextRedM, "$\\text  $\\badgeText", 48);
        }
        I5.a(this.f262631d, switcherWithHintItem.f262947f, false);
        a aVar = new a(switcherWithHintItem, lVar2);
        BooleanParameter.Hint hint = switcherWithHintItem.f262949h;
        I5.a(textView, hint != null ? hint.getTitle() : null, false);
        textView.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(16, aVar));
        boolean z12 = switcherWithHintItem.f262946e;
        switcher.setClickable(z12);
        switcher.setEnabled(z12);
        switcher.setChecked(switcherWithHintItem.f262945d);
        switcher.setOnCheckedChangeListener(new com.avito.android.blueprints.publish.select.inline.j(3, lVar));
        if (z12) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(17, aVar));
        }
    }
}
