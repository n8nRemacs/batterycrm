package com.avito.android.suggest_addresses.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.suggest_addresses.SuggestAddressesFragment;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: SuggestAddressesView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/presentation/k;", "Lcom/avito/android/suggest_addresses/presentation/g;", "a", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f291972a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SuggestAddressesFragment f291973b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.suggest_addresses.h f291974c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f291975d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f291976e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SuggestAddressesToolbarImpl f291977f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f291978g;

    /* compiled from: SuggestAddressesView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/suggest_addresses/presentation/k$a;", "", "<init>", "()V", "", "QUERY_DEBOUNCE", "J", "", "SEARCH_DROP_EMIT_COUNT", "I", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public k(@Y61.k View view, @Y61.k SuggestAddressesFragment suggestAddressesFragment, @Y61.k com.avito.android.suggest_addresses.h hVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, boolean z12) {
        this.f291972a = view;
        this.f291973b = suggestAddressesFragment;
        this.f291974c = hVar;
        this.f291975d = jVar;
        this.f291976e = aVar;
        View viewFindViewById = view.findViewById(R.id.suggests_search);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.suggest_addresses.presentation.SuggestAddressesToolbarImpl");
        }
        SuggestAddressesToolbarImpl suggestAddressesToolbarImpl = (SuggestAddressesToolbarImpl) viewFindViewById;
        this.f291977f = suggestAddressesToolbarImpl;
        View viewFindViewById2 = view.findViewById(R.id.addresses_suggests_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f291978g = button;
        Input input = suggestAddressesToolbarImpl.f291962b;
        C43175k.K(new C43197r1(new h(this, null), C43175k.n(C43175k.t(C43175k.r(y.a(n.e(input).d0(f.f291967b))), 1), 400L)), C22984Q.a(suggestAddressesFragment.getViewLifecycleOwner()));
        suggestAddressesToolbarImpl.f291965e = new i(this);
        suggestAddressesToolbarImpl.f291964d = new j(this);
        if (z12) {
            D6.w(suggestAddressesToolbarImpl.f291963c);
        } else {
            D6.c(suggestAddressesToolbarImpl, null, Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(R.dimen.suggest_addresses_margin)), null, null, 13);
        }
        input.requestFocus();
        button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 16));
        recyclerView.setAdapter(jVar);
    }
}
