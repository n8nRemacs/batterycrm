package com.avito.android.blueprint.date.interval;

import Au.C13079a;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDateIntervalView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/date/interval/k;", "LHj/c;", "Lcom/avito/android/blueprint/date/interval/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends Hj.c implements i {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f105477r = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Context f105478m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f105479n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Input f105480o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Input f105481p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f105482q;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_date_interval_content, aVar);
        this.f105478m = view.getContext();
        View viewFindViewById = view.findViewById(R.id.till_present_switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById;
        this.f105479n = listItemSwitcher;
        View viewFindViewById2 = this.f7656e.findViewById(R.id.start_date_select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f105480o = (Input) viewFindViewById2;
        View viewFindViewById3 = this.f7656e.findViewById(R.id.end_date_select);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f105481p = (Input) viewFindViewById3;
        listItemSwitcher.e(new C13079a(this, 2));
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void A7(boolean z12) {
        D6.G(this.f105479n, z12);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Ab(boolean z12) {
        this.f105479n.setChecked(z12);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Ca(boolean z12) {
        D6.G(this.f105481p, z12);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void D8(@l Y41.a<G0> aVar) {
        j jVar = new j(0, aVar);
        Input input = this.f105481p;
        input.setOnClickListener(jVar);
        if (G0.f406611a == null) {
            input.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Hb() {
        Input.f179303W.getClass();
        this.f105480o.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Q9(boolean z12) {
        D6.G(this.f105480o, z12);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Tb(@l String str) {
        this.f105479n.setTitle(str);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Vc() {
        Input.f179303W.getClass();
        this.f105481p.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void YF() {
        Input.f179303W.getClass();
        this.f105480o.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void Z7(@l Y41.a<G0> aVar) {
        G0 g02;
        Input input = this.f105480o;
        if (aVar != null) {
            input.setOnClickListener(new j(1, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            input.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void f7(@l Y41.l<? super Boolean, G0> lVar) {
        this.f105482q = lVar;
    }

    @Override // com.avito.android.blueprint.date.interval.i
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF105478m() {
        return this.f105478m;
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void gz() {
        Input.f179303W.getClass();
        this.f105481p.setState(Input.f179305b0);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f105482q = null;
        this.f105480o.setOnClickListener(null);
        this.f105481p.setOnClickListener(null);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void n9(@l String str) {
        Input.t(this.f105480o, str, false, 6);
    }

    @Override // com.avito.android.blueprint.date.interval.i
    public final void r8(@l String str) {
        Input.t(this.f105481p, str, false, 6);
    }
}
