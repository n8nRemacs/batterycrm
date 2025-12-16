package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.ImvGoodsOptionType;
import com.avito.android.imv_goods_poll.ImvGoodsPollParams;
import com.avito.android.imv_goods_poll.mvi.entity.ImvGoodsPollInternalAction;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: ImvGoodsPollReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "LfN/c;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements u<ImvGoodsPollInternalAction, fN.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImvGoodsPollParams f170713b;

    /* compiled from: ImvGoodsPollReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170714a;

        static {
            int[] iArr = new int[ImvGoodsOptionType.values().length];
            try {
                iArr[ImvGoodsOptionType.MULTI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImvGoodsOptionType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f170714a = iArr;
        }
    }

    @Inject
    public m(@Y61.k ImvGoodsPollParams imvGoodsPollParams) {
        this.f170713b = imvGoodsPollParams;
    }

    @Override // com.avito.android.arch.mvi.u
    public final fN.c a(ImvGoodsPollInternalAction imvGoodsPollInternalAction, fN.c cVar) {
        List listSingletonList;
        ImvGoodsPollInternalAction imvGoodsPollInternalAction2 = imvGoodsPollInternalAction;
        fN.c cVar2 = cVar;
        if (imvGoodsPollInternalAction2 instanceof ImvGoodsPollInternalAction.ShowError) {
            return fN.c.a(cVar2, null, false, 1);
        }
        if (imvGoodsPollInternalAction2.equals(ImvGoodsPollInternalAction.ShowLoaded.f170694b)) {
            return fN.c.a(cVar2, null, false, 1);
        }
        if (imvGoodsPollInternalAction2.equals(ImvGoodsPollInternalAction.ShowLoading.f170695b)) {
            return fN.c.a(cVar2, null, true, 1);
        }
        if (!(imvGoodsPollInternalAction2 instanceof ImvGoodsPollInternalAction.UpdateItems)) {
            throw new NoWhenBranchMatchedException();
        }
        ImvGoodsOptionType selectType = this.f170713b.f170610b.getSelectType();
        int i12 = selectType == null ? -1 : a.f170714a[selectType.ordinal()];
        if (i12 == 1) {
            ImvGoodsPollInternalAction.UpdateItems updateItems = (ImvGoodsPollInternalAction.UpdateItems) imvGoodsPollInternalAction2;
            listSingletonList = Collections.singletonList(new com.avito.android.imv_goods_poll.items.check_box.a(updateItems.f170696b, updateItems.f170697c));
        } else if (i12 != 2) {
            listSingletonList = C42784z0.f406748b;
        } else {
            ImvGoodsPollInternalAction.UpdateItems updateItems2 = (ImvGoodsPollInternalAction.UpdateItems) imvGoodsPollInternalAction2;
            listSingletonList = Collections.singletonList(new com.avito.android.imv_goods_poll.items.list_radio_button.a(updateItems2.f170696b, updateItems2.f170697c));
        }
        return fN.c.a(cVar2, listSingletonList, false, 2);
    }
}
