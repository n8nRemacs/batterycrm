package com.avito.android.beduin.common.component.favorite_button;

import Ui.InterfaceC15523b;
import com.avito.android.B2;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinFavoriteButtonComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/d;", "Lej/b;", "Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonModel;", "Lcom/avito/android/beduin/common/component/favorite_button/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements InterfaceC40113b<BeduinFavoriteButtonModel, b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f101193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B2 f101194b;

    @Inject
    public d(@Y61.k j jVar, @Y61.k B2 b22) {
        this.f101193a = jVar;
        this.f101194b = b22;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new b((BeduinFavoriteButtonModel) beduinModel, this.f101194b, this.f101193a);
    }
}
