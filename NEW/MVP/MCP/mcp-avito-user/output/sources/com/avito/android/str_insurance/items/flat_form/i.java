package com.avito.android.str_insurance.items.flat_form;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.input.s;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceFlatFormView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/items/flat_form/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_insurance/items/flat_form/h;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f288579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f288580c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f288581d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f288582e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Input f288583f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ComponentContainer f288584g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public s f288585h;

    /* compiled from: StrInsuranceFlatFormView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f288587m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f288587m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f288587m.invoke(String.valueOf(i.this.f288583f.m53getText()));
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f288579b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f288580c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f288581d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f288582e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.flat_number);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f288583f = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.flat_number_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f288584g = (ComponentContainer) viewFindViewById5;
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void AV(@k Y41.l<? super String, G0> lVar) {
        s sVar = this.f288585h;
        Input input = this.f288583f;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f288585h = n.c(input, new a(lVar));
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void C(@k String str) {
        this.f288582e.setText(str);
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void G40(@k int[] iArr) {
        this.f288583f.setState(iArr);
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void h(@k String str) {
        this.f288581d.setText(str);
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void kN(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        this.f288584g.setMessage(aVar.c(this.f288579b.getContext(), attributedText));
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void setTitle(@k String str) {
        this.f288580c.setText(str);
    }

    @Override // com.avito.android.str_insurance.items.flat_form.h
    public final void xs(@l String str) {
        Input.t(this.f288583f, str, false, 6);
    }
}
