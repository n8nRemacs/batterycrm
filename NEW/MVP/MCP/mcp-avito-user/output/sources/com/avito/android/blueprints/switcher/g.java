package com.avito.android.blueprints.switcher;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiStateSwitcherItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/switcher/g;", "LTV0/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g extends TV0.e {

    /* compiled from: MultiStateSwitcherItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void H(@l CharSequence charSequence);

    void Jp(@l CharSequence charSequence);

    void S1(@k Y41.l<? super Boolean, G0> lVar);

    void Wi(@l CharSequence charSequence);

    @k
    Context getContext();

    void j9(@k BaseListItem.Alignment alignment);

    void k0(@l CustomPaddings customPaddings);

    void setChecked(boolean z12);

    void setEnabled(boolean z12);

    void setTitle(@k String str);

    void u(@l CharSequence charSequence);
}
