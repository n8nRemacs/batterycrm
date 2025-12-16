package com.avito.android.blueprints.withSuggestedOptions;

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
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectWithSuggestedOptionsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/withSuggestedOptions/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/withSuggestedOptions/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f106789c;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f106788b = aVar;
        Chips chips = (Chips) view.findViewById(R.id.chips);
        this.f106789c = chips;
        chips.setDisplayType(Chips.DisplayType.f178704e);
        chips.setKeepSelected(true);
        chips.setSelectStrategy(SelectStrategy.f178716b);
        chips.setMaxSelected(-1);
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.g
    public final void II() {
        this.f106789c.setErrorOnTop(null);
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.g
    public final void WS(@k ArrayList arrayList, @k p pVar) {
        Object next;
        Chips chips = this.f106789c;
        chips.setData(arrayList);
        chips.j();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((a) next).f106770d) {
                    break;
                }
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            chips.q(aVar, true);
        }
        chips.setChipsSelectedListener(new h(pVar));
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.g
    public final void k(@l AttributedText attributedText) {
        CharSequence charSequenceC;
        Chips chips = this.f106789c;
        if (attributedText == null || (charSequenceC = this.f106788b.c(chips.getContext(), attributedText)) == null) {
            charSequenceC = "";
        }
        chips.setSubtitle(charSequenceC);
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.g
    public final void setError(@l String str) {
        this.f106789c.setErrorOnTop(str);
    }

    @Override // com.avito.android.blueprints.withSuggestedOptions.g
    public final void setTitle(@k CharSequence charSequence) {
        this.f106789c.setTitle(charSequence);
    }
}
