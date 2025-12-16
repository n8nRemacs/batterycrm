package com.avito.android.mortgage.pre_approval.form.list.items.chips;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f201754b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f201755c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f201754b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chips);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById2;
        this.f201755c = chips;
        chips.setKeepSelected(true);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.chips.g
    public final void C1(@k List<? extends com.avito.android.lib.design.chips.h> list) {
        Chips chips = this.f201755c;
        D6.H(chips);
        chips.setData(list);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.chips.g
    public final void D(@k PrintableText printableText) {
        TextView textView = this.f201754b;
        textView.setText(printableText.k0(textView.getContext()));
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.chips.g
    public final void E1(@l Y41.l<? super c.a, G0> lVar) {
        this.f201755c.setChipsSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.chips.g
    public final void G2(@l PrintableText printableText) {
        Chips chips = this.f201755c;
        chips.setError(printableText != null ? printableText.k0(chips.getContext()) : null);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.chips.g
    public final void db(@l Integer num) {
        Chips chips = this.f201755c;
        if (num == null || num.intValue() < 0) {
            chips.j();
        } else {
            if (num.equals(C42745f0.G(chips.n()))) {
                return;
            }
            chips.p(num.intValue(), false);
        }
    }

    /* compiled from: ChipsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/pre_approval/form/list/items/chips/h$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<c.a, G0> f201756a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super c.a, G0> lVar) {
            this.f201756a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            c.a aVar = hVar instanceof c.a ? (c.a) hVar : null;
            if (aVar != null) {
                ((d) this.f201756a).invoke(aVar);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
