package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.deep_linking.links.ImvGoodsPollLinkBodyOption;
import com.avito.android.imv_goods_poll.ImvGoodsPollParams;
import com.avito.android.imv_goods_poll.mvi.entity.ImvGoodsPollInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImvGoodsPollBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.arch.mvi.b<ImvGoodsPollInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImvGoodsPollParams f170698a;

    @Inject
    public f(@Y61.k ImvGoodsPollParams imvGoodsPollParams) {
        this.f170698a = imvGoodsPollParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ImvGoodsPollInternalAction> a() {
        List<ImvGoodsPollLinkBodyOption> listD = this.f170698a.f170610b.d();
        if (listD == null) {
            listD = C42784z0.f406748b;
        }
        return new C43210w(new ImvGoodsPollInternalAction.UpdateItems(listD, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
