package com.avito.android.crm_paid_cvs.view.list_items.select_filter;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/select_filter/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/select_filter/j;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f131024e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f131025b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f131026c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f131027d;

    /* compiled from: SelectFilterView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f131028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f131028l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f131028l.invoke();
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f131025b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131026c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f131027d = input;
        Input.f179303W.getClass();
        input.setState(Input.f179304a0);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.select_filter.j
    public final void A0(@Y61.k Y41.a<G0> aVar) {
        this.f131027d.setOnClickListener(new k(0, aVar));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.select_filter.j
    public final void N9(@Y61.l String str, boolean z12) {
        View view = this.f131025b;
        String string = z12 ? view.getContext().getString(R.string.paid_cvs_multiple) : str == null ? view.getContext().getString(R.string.paid_cvs_non_chosen) : str;
        Input input = this.f131027d;
        Input.t(input, string, false, 6);
        input.setTextColor(str != null ? C35835l0.d(R.attr.black, view.getContext()) : C35835l0.d(R.attr.gray54, view.getContext()));
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.select_filter.j
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f131026c, str, false);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.select_filter.j
    public final void uc(@Y61.l Y41.a<G0> aVar) {
        Input input = this.f131027d;
        if (aVar == null) {
            input.setClearButton(false);
        } else {
            input.setClearButton(true);
            input.setClearButtonListener(new a(aVar));
        }
    }
}
