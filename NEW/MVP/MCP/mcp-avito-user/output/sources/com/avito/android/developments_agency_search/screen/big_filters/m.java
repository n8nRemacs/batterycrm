package com.avito.android.developments_agency_search.screen.big_filters;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.H2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ww.InterfaceC49690a;

/* compiled from: BigFiltersViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/m;", "Lcom/avito/android/developments_agency_search/screen/big_filters/l;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f136667a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49690a, G0> f136668b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f136669c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.search.filter.adapter.h f136670d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public UU.a f136671e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f136672f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f136673g;

    /* compiled from: BigFiltersViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeyboardVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            ((BigFiltersFragment.e) m.this.f136668b).invoke(new InterfaceC49690a.b(zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f136668b.invoke(InterfaceC49690a.C12836a.f441858a);
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f136668b.invoke(InterfaceC49690a.g.f441864a);
            return G0.f406611a;
        }
    }

    public m(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f136667a = aVar;
        this.f136668b = lVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.filters_list);
        recyclerView.setAdapter(jVar);
        this.f136669c = recyclerView;
        this.f136671e = new UU.a(null, null, false, false, false, new b(), null, null, null, false, 991, null);
        Button button = (Button) view.findViewById(R.id.apply_filters_button);
        button.setState(this.f136671e);
        this.f136672f = button;
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_overlay_container), R.id.filters_list, null, 0, 0, 28, null);
        lVar2.f231600j = new c();
        this.f136673g = lVar2;
        new H2(new a(), view, false);
    }
}
