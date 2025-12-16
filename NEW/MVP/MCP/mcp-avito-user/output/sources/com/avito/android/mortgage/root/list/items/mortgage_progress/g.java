package com.avito.android.mortgage.root.list.items.mortgage_progress;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.widgets.VerticalStepsBar;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgageProgressView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/g;", "LTV0/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g extends TV0.e {

    /* compiled from: MortgageProgressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void O2(@k l<? super DeepLink, G0> lVar);

    void YB(int i12);

    void setTitle(@k String str);

    void t4(@k List<VerticalStepsBar.c> list);
}
