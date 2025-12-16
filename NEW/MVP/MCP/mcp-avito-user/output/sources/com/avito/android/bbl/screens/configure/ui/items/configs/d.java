package com.avito.android.bbl.screens.configure.ui.items.configs;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.ui.items.configs.BblConfigureConfigsItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import nh.InterfaceC44425d;

/* compiled from: BblConfigureConfigsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/configs/d;", "Lcom/avito/android/bbl/screens/configure/ui/items/configs/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<BblConfigureConfigsItem.Config, G0> f99250b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@InterfaceC44425d @k l<? super BblConfigureConfigsItem.Config, G0> lVar) {
        this.f99250b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BblConfigureConfigsItem bblConfigureConfigsItem = (BblConfigureConfigsItem) aVar;
        ((f) eVar).kj(bblConfigureConfigsItem.f99241d, bblConfigureConfigsItem.f99240c, this.f99250b);
    }
}
