package com.avito.android.mortgage.person_form.list.items.chips;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.mortgage.person_form.list.items.chips.ChipsItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/h;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/chips/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends C00.a implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f200676b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f200677c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Chips f200678d;

    /* compiled from: ChipsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/person_form/list/items/chips/h$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f200679a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f200680b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f200681c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar, h hVar, Y41.a<G0> aVar) {
            this.f200679a = lVar;
            this.f200680b = hVar;
            this.f200681c = aVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
            Y41.a<G0> aVar;
            if (this.f200680b.f200678d.getKeepSelected()) {
                return;
            }
            ChipsItem.Chip chip = hVar instanceof ChipsItem.Chip ? (ChipsItem.Chip) hVar : null;
            if (chip == null || chip.f200664b == null || (aVar = this.f200681c) == null) {
                return;
            }
            ((d) aVar).invoke();
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            String str;
            l<String, G0> lVar;
            ChipsItem.Chip chip = hVar instanceof ChipsItem.Chip ? (ChipsItem.Chip) hVar : null;
            if (chip == null || (str = chip.f200664b) == null || (lVar = this.f200679a) == null) {
                return;
            }
            ((c) lVar).invoke(str);
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200676b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200677c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chips);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f200678d = (Chips) viewFindViewById3;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void C1(@k List<? extends com.avito.android.lib.design.chips.h> list) {
        this.f200678d.setData(list);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void C5(@Y61.l PrintableText printableText) {
        Chips chips = this.f200678d;
        chips.setError(printableText != null ? printableText.k0(chips.getContext()) : null);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void GL(boolean z12) {
        this.f200678d.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void Lu(@Y61.l AttributedText attributedText, @Y61.l String str) {
        TextView textView = this.f200677c;
        if (attributedText != null) {
            j.a(textView, attributedText, null);
        } else {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void Uo(boolean z12) {
        this.f200678d.setKeepSelected(!z12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void fy(@Y61.l Y41.a aVar, @Y61.l l lVar) {
        Chips chips = this.f200678d;
        if (lVar == null && aVar == null) {
            chips.setChipsSelectedListener(null);
        } else {
            chips.setChipsSelectedListener(new a(lVar, this, aVar));
        }
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void gh(int i12) {
        Chips chips = this.f200678d;
        if (i12 < 0) {
            chips.j();
            return;
        }
        Integer num = (Integer) C42745f0.G(chips.n());
        if (num != null && i12 == num.intValue()) {
            return;
        }
        chips.p(i12, false);
    }

    @Override // C00.a, C00.c
    public final void setEnabled(boolean z12) {
        GL(z12);
        TextView textView = this.f200677c;
        TextView textView2 = this.f200676b;
        if (z12) {
            textView2.setEnabled(true);
            textView.setEnabled(true);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            return;
        }
        textView.setAlpha(0.4f);
        textView2.setAlpha(0.4f);
        textView.setEnabled(false);
        textView2.setEnabled(false);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.chips.g
    public final void setTitle(@k String str) {
        this.f200676b.setText(str);
    }
}
