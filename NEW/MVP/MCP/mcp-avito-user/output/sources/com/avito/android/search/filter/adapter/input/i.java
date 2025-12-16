package com.avito.android.search.filter.adapter.input;

import Y41.l;
import Y61.k;
import android.text.Editable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advert.item.icebreakers.n;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/input/i;", "Lcom/avito/android/search/filter/adapter/input/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f262424d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f262425b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f262426c;

    /* compiled from: InputItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/search/filter/adapter/input/i$a", "Lcom/avito/android/util/u5;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC35956u5 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f262427b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar) {
            this.f262427b = lVar;
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void afterTextChanged(@k Editable editable) {
            this.f262427b.invoke(editable.toString());
        }
    }

    public i(@k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.input_view);
        this.f262425b = input;
        this.f262426c = (ComponentContainer) view;
        input.setClearButtonVisibleUnfocused(true);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void A6(int i12) {
        this.f262425b.setInputType(i12);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void J1(int i12, int i13) {
        this.f262425b.o(i12, 1);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void K(@k l<? super String, G0> lVar) {
        this.f262425b.b(new a(lVar));
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void T2(@Y61.l String str) {
        if (str != null) {
            this.f262425b.setPostfix(str);
        }
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void W() {
        K2.d(this.f262425b, false);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void h0() {
        this.f262425b.r();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        K2.d(this.f262425b, true);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void m(@Y61.l String str) {
        Input.t(this.f262425b, str, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void o(@Y61.l String str) {
        this.f262425b.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void o0(@k l<? super Boolean, G0> lVar) {
        this.f262425b.setOnFocusChangeListener(new n(3, lVar));
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void setTitle(@k String str) {
        Input.f179303W.getClass();
        this.f262425b.setState(Input.f179304a0);
        this.f262426c.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void t5(@k FormatterType formatterType) {
        this.f262425b.setFormatterType(formatterType);
    }

    @Override // com.avito.android.search.filter.adapter.input.h
    public final void x5(@Y61.l String str) {
        if (str != null) {
            this.f262425b.setPrefix(str);
        }
    }
}
