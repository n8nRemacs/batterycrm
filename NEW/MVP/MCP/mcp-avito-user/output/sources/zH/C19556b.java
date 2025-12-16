package Zh;

import Ui.InterfaceC15523b;
import Y61.k;
import bi.C25654c;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinPromoBlockContainerFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LZh/b;", "Lej/b;", "Lcom/avito/android/beduin/common/container/promo_block/BeduinPromoBlockModel;", "LZh/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19556b implements InterfaceC40113b<BeduinPromoBlockModel, C19555a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f20382a;

    @Inject
    public C19556b(@k e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar) {
        this.f20382a = eVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new C19555a((BeduinPromoBlockModel) beduinModel, new C25654c(this.f20382a), interfaceC15523b, eVar);
    }
}
