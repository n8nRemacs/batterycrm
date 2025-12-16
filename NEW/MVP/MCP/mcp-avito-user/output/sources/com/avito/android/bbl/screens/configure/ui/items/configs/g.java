package com.avito.android.bbl.screens.configure.ui.items.configs;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.bbl.screens.configure.ui.items.configs.BblConfigureConfigsItem;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.r;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BblConfigureConfigsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/configs/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/bbl/screens/configure/ui/items/configs/f;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final SelectorCardGroup f99252b;

    public g(@k View view) {
        super(view);
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.bbl_configure_selector_card_group);
        selectorCardGroup.setContentBinderFactory(new i());
        this.f99252b = selectorCardGroup;
    }

    @Override // com.avito.android.bbl.screens.configure.ui.items.configs.f
    public final void kj(@k List<BblConfigureConfigsItem.Config> list, @l BblConfigureConfigsItem.Config config, @k Y41.l<? super BblConfigureConfigsItem.Config, G0> lVar) {
        SelectorCardGroup selectorCardGroup = this.f99252b;
        selectorCardGroup.setSelectedListener(null);
        selectorCardGroup.setData(list);
        if (config != null) {
            selectorCardGroup.d(config, true);
            SelectorCardGroup.c(selectorCardGroup, config);
        }
        selectorCardGroup.setSelectedListener(new a(lVar));
    }

    /* compiled from: BblConfigureConfigsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bbl/screens/configure/ui/items/configs/g$a", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SelectorCardGroup.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<BblConfigureConfigsItem.Config, G0> f99253a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super BblConfigureConfigsItem.Config, G0> lVar) {
            this.f99253a = lVar;
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@k r rVar) {
            this.f99253a.invoke(rVar);
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@k r rVar) {
        }
    }
}
