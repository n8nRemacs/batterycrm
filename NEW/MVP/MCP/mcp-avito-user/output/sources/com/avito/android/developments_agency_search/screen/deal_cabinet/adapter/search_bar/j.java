package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.point.Point;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SearchBarItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/search_bar/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/search_bar/i;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f136871g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f136872b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f136873c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f136874d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Point f136875e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f136876f;

    /* compiled from: SearchBarItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Y41.l<? super String, G0> lVar;
            String str2 = str;
            j jVar = j.this;
            if (!str2.equals(jVar.f136872b) && (lVar = jVar.f136876f) != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SearchBarItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            j.this.f136873c = bool.booleanValue();
            return G0.f406611a;
        }
    }

    public j(@k View view) {
        super(view);
        this.f136872b = "";
        View viewFindViewById = view.findViewById(R.id.search_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        n.c(input, new a());
        new H2(new b(), input, this.f136873c);
        this.f136874d = input;
        View viewFindViewById2 = view.findViewById(R.id.filter_point);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        this.f136875e = (Point) viewFindViewById2;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar.i
    public final void D70(boolean z12) {
        D6.G(this.f136875e, z12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar.i
    public final void UP() {
        if (this.f136873c) {
            this.f136874d.requestFocus();
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar.i
    public final void dI(@k Y41.a<G0> aVar) {
        this.f136874d.setRightIconClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(13, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f136876f = null;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar.i
    public final void r0(@k Y41.l<? super String, G0> lVar) {
        this.f136876f = lVar;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar.i
    public final void setQuery(@k String str) {
        this.f136872b = str;
        Input.t(this.f136874d, str, false, 6);
    }
}
