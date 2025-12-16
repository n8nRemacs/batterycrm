package com.avito.android.blueprints.publish.date_interval;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DateIntervalItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/date_interval/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/date_interval/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f106156g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f106157b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f106158c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f106159d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f106160e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f106161f;

    /* compiled from: DateIntervalItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprints/publish/date_interval/j$a", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListItemCompoundButton.a {
        public a() {
        }

        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            Y41.l<? super Boolean, G0> lVar = j.this.f106161f;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(z12));
            }
        }
    }

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.till_present_switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById;
        this.f106157b = listItemSwitcher;
        View viewFindViewById2 = view.findViewById(R.id.period_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        ComponentContainer componentContainer = (ComponentContainer) viewFindViewById2;
        this.f106158c = componentContainer;
        View viewFindViewById3 = componentContainer.findViewById(R.id.start_date_select);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f106159d = (Input) viewFindViewById3;
        View viewFindViewById4 = componentContainer.findViewById(R.id.end_date_select);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f106160e = (Input) viewFindViewById4;
        listItemSwitcher.e(new a());
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void A7(boolean z12) {
        D6.G(this.f106157b, z12);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Ab(boolean z12) {
        this.f106157b.setChecked(z12);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Ca(boolean z12) {
        D6.G(this.f106160e, z12);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void D8(@l Y41.a<G0> aVar) {
        com.avito.android.blueprint.date.interval.j jVar = new com.avito.android.blueprint.date.interval.j(15, aVar);
        Input input = this.f106160e;
        input.setOnClickListener(jVar);
        if (G0.f406611a == null) {
            input.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Hb() {
        int[] iArr = {this.f106159d.getId()};
        ComponentContainer componentContainer = this.f106158c;
        componentContainer.o(componentContainer.f178848i, iArr);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Hp(@l CharSequence charSequence) {
        ComponentContainer.l(this.f106158c, new int[]{this.f106160e.getId()}, charSequence, 4);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Q9(boolean z12) {
        D6.G(this.f106159d, z12);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Tb(@l String str) {
        this.f106157b.setTitle(str);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Uw(@l CharSequence charSequence) {
        ComponentContainer.n(this.f106158c, charSequence, 2);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Vc() {
        int[] iArr = {this.f106160e.getId()};
        ComponentContainer componentContainer = this.f106158c;
        componentContainer.o(componentContainer.f178848i, iArr);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void Z7(@l Y41.a<G0> aVar) {
        G0 g02;
        Input input = this.f106159d;
        if (aVar != null) {
            input.setOnClickListener(new com.avito.android.blueprint.date.interval.j(16, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            input.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void f7(@l Y41.l<? super Boolean, G0> lVar) {
        this.f106161f = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f106161f = null;
        this.f106159d.setOnClickListener(null);
        this.f106160e.setOnClickListener(null);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void n9(@l String str) {
        Input.t(this.f106159d, str, false, 6);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void r8(@l String str) {
        Input.t(this.f106160e, str, false, 6);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void setTitle(@k CharSequence charSequence) {
        this.f106158c.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.i
    public final void tj(@l CharSequence charSequence) {
        ComponentContainer.l(this.f106158c, new int[]{this.f106159d.getId()}, charSequence, 4);
    }
}
