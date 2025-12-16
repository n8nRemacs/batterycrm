package com.avito.android.search.filter.adapter.double_input;

import android.text.Editable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DoubleInputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/double_input/t;", "Lcom/avito/android/search/filter/adapter/double_input/s;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f262243h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f262244b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f262245c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f262246d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f262247e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f262248f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public N f262249g;

    /* compiled from: DoubleInputItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f262250l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public t(@Y61.k View view) {
        super(view);
        this.f262244b = (ComponentContainer) view;
        View viewFindViewById = view.findViewById(R.id.input_first);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f262245c = input;
        View viewFindViewById2 = view.findViewById(R.id.input_second);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById2;
        this.f262246d = input2;
        this.f262249g = a.f262250l;
        input.setClearButtonVisibleUnfocused(true);
        input2.setClearButtonVisibleUnfocused(true);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void A6(int i12) {
        this.f262245c.setInputType(i12);
        this.f262246d.setInputType(i12);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    @Y61.k
    public final String Al() {
        Editable editableM53getText = this.f262245c.m53getText();
        String string = editableM53getText != null ? editableM53getText.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    @Y61.k
    public final String BJ() {
        Editable editableM53getText = this.f262246d.m53getText();
        String string = editableM53getText != null ? editableM53getText.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void Ec(@Y61.l String str) {
        Input.t(this.f262246d, str, false, 4);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final boolean Et() {
        return this.f262245c.f179340l.isFocused() || this.f262246d.f179340l.isFocused();
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void G6(@Y61.l String str) {
        Input.t(this.f262245c, str, false, 4);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void I0(int i12) {
        this.f262245c.setMaxLength(12);
        this.f262246d.setMaxLength(12);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void J10(@Y61.l Y41.a<G0> aVar) {
        this.f262246d.setClearButtonListener(aVar);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void Jz(@Y61.l Y41.l<? super String, G0> lVar) {
        com.avito.android.lib.design.input.s sVar = this.f262247e;
        Input input = this.f262245c;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f262247e = com.avito.android.lib.design.input.n.c(input, lVar);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void PU(@Y61.k Y41.l<? super String, G0> lVar) {
        Input input = this.f262246d;
        com.avito.android.lib.design.input.s sVar = new com.avito.android.lib.design.input.s(input.m53getText(), lVar);
        input.b(sVar);
        this.f262248f = sVar;
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void Qt(@Y61.l String str) {
        this.f262245c.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void R20() {
        K2.d(this.f262245c, false);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void T2(@Y61.k String str) {
        this.f262245c.setPostfix(str);
        this.f262246d.setPostfix(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void V20(@Y61.l String str) {
        com.avito.android.lib.design.input.s sVar = this.f262247e;
        Input input = this.f262245c;
        if (sVar != null) {
            input.h(sVar);
        }
        Input.t(input, str, false, 4);
        com.avito.android.lib.design.input.s sVar2 = this.f262247e;
        if (sVar2 != null) {
            input.b(sVar2);
        }
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void ZG(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f262246d.setOnFocusChangeListener(new com.avito.android.blueprint.suggest.A(5, lVar));
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void b(@Y61.l String str) {
        this.f262244b.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void bl(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f262245c.setOnFocusChangeListener(new com.avito.android.blueprint.suggest.A(4, lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f262249g = (N) aVar;
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void eC() {
        com.avito.android.lib.design.input.s sVar = this.f262247e;
        if (sVar != null) {
            this.f262245c.h(sVar);
        }
        com.avito.android.lib.design.input.s sVar2 = this.f262248f;
        if (sVar2 != null) {
            this.f262246d.h(sVar2);
        }
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void hW(@Y61.l Y41.a<G0> aVar) {
        this.f262245c.setClearButtonListener(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f262249g.invoke();
        com.avito.android.lib.design.input.s sVar = this.f262247e;
        Input input = this.f262245c;
        if (sVar != null) {
            input.h(sVar);
        }
        com.avito.android.lib.design.input.s sVar2 = this.f262248f;
        if (sVar2 != null) {
            input.h(sVar2);
        }
        FormatterType.f179288e.getClass();
        FormatterType formatterType = FormatterType.f179289f;
        input.setFormatterType(formatterType);
        Input input2 = this.f262246d;
        input2.setFormatterType(formatterType);
        input.u(false, null);
        input2.u(false, null);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void kE(@Y61.k String str) {
        this.f262245c.setPrefix(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void lr() {
        K2.d(this.f262246d, false);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void qA(@Y61.k String str) {
        this.f262246d.setPrefix(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void v3(@Y61.k FormatterType formatterType) {
        this.f262245c.setFormatterType(formatterType);
        this.f262246d.setFormatterType(formatterType);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void vC(@Y61.l String str) {
        this.f262246d.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void w5(int i12) {
        if (i12 < 1) {
            return;
        }
        Input input = this.f262246d;
        Input input2 = this.f262245c;
        if (i12 == 1) {
            input2.r();
            input.r();
        } else {
            Input.p(input2, 0, i12, 1);
            Input.p(input, 0, i12, 1);
        }
    }

    @Override // com.avito.android.search.filter.adapter.double_input.s
    public final void xh(@Y61.l String str) {
        com.avito.android.lib.design.input.s sVar = this.f262248f;
        Input input = this.f262246d;
        if (sVar != null) {
            input.h(sVar);
        }
        Input.t(input, str, false, 4);
        com.avito.android.lib.design.input.s sVar2 = this.f262248f;
        if (sVar2 != null) {
            input.b(sVar2);
        }
    }
}
