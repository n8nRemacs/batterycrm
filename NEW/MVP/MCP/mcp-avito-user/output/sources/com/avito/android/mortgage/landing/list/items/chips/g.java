package com.avito.android.mortgage.landing.list.items.chips;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.h;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/chips/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f199683b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f199684c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f199685d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199683b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chips);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById2;
        this.f199684c = chips;
        View viewFindViewById3 = view.findViewById(R.id.chip_as_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199685d = (TextView) viewFindViewById3;
        chips.setKeepSelected(true);
    }

    @Override // com.avito.android.mortgage.landing.list.items.chips.f
    public final void C1(@k List<? extends h> list) {
        D6.w(this.f199685d);
        Chips chips = this.f199684c;
        D6.H(chips);
        chips.setData(list);
    }

    @Override // com.avito.android.mortgage.landing.list.items.chips.f
    public final void E1(@l Y41.l<? super ChipsItem.Chip, G0> lVar) {
        this.f199684c.setChipsSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.mortgage.landing.list.items.chips.f
    public final void I(boolean z12) {
        this.f199684c.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.chips.f
    public final void ag(@k ChipsItem.Chip chip) {
        D6.w(this.f199684c);
        TextView textView = this.f199685d;
        D6.H(textView);
        textView.setText(chip.f199673b);
    }

    @Override // com.avito.android.mortgage.landing.list.items.chips.f
    public final void db(@l Integer num) {
        Chips chips = this.f199684c;
        if (num == null || num.intValue() < 0) {
            chips.j();
        } else {
            if (num.equals(C42745f0.G(chips.n()))) {
                return;
            }
            chips.p(num.intValue(), false);
        }
    }

    @Override // com.avito.android.mortgage.landing.list.items.chips.f
    public final void setTitle(int i12) {
        this.f199683b.setText(i12);
    }

    /* compiled from: ChipsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/list/items/chips/g$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ChipsItem.Chip, G0> f199686a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super ChipsItem.Chip, G0> lVar) {
            this.f199686a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k h hVar) {
            ChipsItem.Chip chip = hVar instanceof ChipsItem.Chip ? (ChipsItem.Chip) hVar : null;
            if (chip != null) {
                ((c) this.f199686a).invoke(chip);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k h hVar) {
        }
    }
}
