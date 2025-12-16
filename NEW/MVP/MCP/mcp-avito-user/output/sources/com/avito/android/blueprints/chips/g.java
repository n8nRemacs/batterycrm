package com.avito.android.blueprints.chips;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsSelectItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/chips/g;", "LTV0/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g extends TV0.e {

    /* compiled from: ChipsSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void G();

    void L7(@k ArrayList arrayList, @l List list, @k p pVar);

    void Wa(@k ArrayList arrayList);

    void be(@l Integer num);

    void fF(@l Y41.l<? super View, G0> lVar);

    void i2(boolean z12);

    void k(@l AttributedText attributedText);

    void m2(@k Chips.DisplayType displayType);

    void r3(@k SelectStrategy selectStrategy);

    void rb(@l AttributedText attributedText);

    void setError(@l String str);

    void setTitle(@k CharSequence charSequence);

    void ub(@k ArrayList arrayList);
}
