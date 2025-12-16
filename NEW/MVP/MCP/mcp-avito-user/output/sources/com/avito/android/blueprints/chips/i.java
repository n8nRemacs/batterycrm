package com.avito.android.blueprints.chips;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/chips/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/chips/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f105861b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f105862c;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f105861b = aVar;
        this.f105862c = (Chips) view.findViewById(R.id.chips);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void G() {
        this.f105862c.setErrorOnTop(null);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void L7(@k ArrayList arrayList, @l List list, @k p pVar) {
        Chips chips = this.f105862c;
        chips.setData(arrayList);
        chips.j();
        if (list != null) {
            chips.r(list);
        }
        chips.setChipsSelectedListener(new h(pVar));
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void Wa(@k ArrayList arrayList) {
        Chips chips = this.f105862c;
        Set setP0 = C42745f0.P0(chips.s());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) it.next();
            if (!setP0.contains(hVar)) {
                chips.q(hVar, false);
            }
        }
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void be(@l Integer num) {
        this.f105862c.setMaxSelected(num != null ? num.intValue() : -1);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void fF(@l Y41.l<? super View, G0> lVar) {
        this.f105862c.setTitleTip(lVar);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void i2(boolean z12) {
        this.f105862c.setKeepSelected(z12);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void k(@l AttributedText attributedText) {
        CharSequence charSequenceC;
        Chips chips = this.f105862c;
        if (attributedText == null || (charSequenceC = this.f105861b.c(chips.getContext(), attributedText)) == null) {
            charSequenceC = "";
        }
        chips.setSubtitle(charSequenceC);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void m2(@k Chips.DisplayType displayType) {
        this.f105862c.setDisplayType(displayType);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void r3(@k SelectStrategy selectStrategy) {
        this.f105862c.setSelectStrategy(selectStrategy);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void rb(@l AttributedText attributedText) {
        Chips chips = this.f105862c;
        chips.setHint(this.f105861b.c(chips.getContext(), attributedText));
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void setError(@l String str) {
        this.f105862c.setErrorOnTop(str);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void setTitle(@k CharSequence charSequence) {
        this.f105862c.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.chips.g
    public final void ub(@k ArrayList arrayList) {
        Chips chips = this.f105862c;
        Set setP0 = C42745f0.P0(chips.s());
        boolean keepSelected = chips.getKeepSelected();
        i2(false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) it.next();
            if (setP0.contains(hVar)) {
                chips.q(hVar, false);
            }
        }
        i2(keepSelected);
    }
}
