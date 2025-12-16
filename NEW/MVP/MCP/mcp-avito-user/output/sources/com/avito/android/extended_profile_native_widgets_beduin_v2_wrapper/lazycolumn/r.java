package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileLazyColumnState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r extends N implements Y41.l<G, l> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f151419l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC36250j.b bVar) {
        super(1);
        this.f151419l = bVar;
    }

    @Override // Y41.l
    public final l invoke(G g12) {
        G g13 = g12;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(this.f151419l);
        Boolean boolC = g13.c("visible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        ET0.a aVar = new ET0.a(C42745f0.C(g13.g(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, o.f151416l)));
        String string = g13.getString("backgroundColor");
        if (string == null) {
            string = "#00000000";
        }
        return new l(aVar, string, (Y41.a) g13.d(q.f151418l, "onPrefetch", "onPrefetch"), zBooleanValue, aVarA.f335705c, aVarA.f335706d, aVarA.f335707e, aVarA.f335703a);
    }
}
