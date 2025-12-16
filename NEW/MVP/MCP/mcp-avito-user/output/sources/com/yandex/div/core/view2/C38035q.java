package com.yandex.div.core.view2;

import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: Div2View.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/g;", "div", "", "invoke", "(Lcom/yandex/div2/g;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38035q extends kotlin.jvm.internal.N implements Y41.l<AbstractC38330g, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42754k<DivTransitionSelector> f369173l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38035q(C42754k<DivTransitionSelector> c42754k) {
        super(1);
        this.f369173l = c42754k;
    }

    @Override // Y41.l
    public final Boolean invoke(AbstractC38330g abstractC38330g) {
        boolean zBooleanValue;
        int iOrdinal;
        List<DivTransitionTrigger> listO = abstractC38330g.a().o();
        Boolean boolValueOf = listO == null ? null : Boolean.valueOf(listO.contains(DivTransitionTrigger.DATA_CHANGE));
        if (boolValueOf == null) {
            DivTransitionSelector divTransitionSelectorH = this.f369173l.h();
            zBooleanValue = false;
            if (divTransitionSelectorH != null && ((iOrdinal = divTransitionSelectorH.ordinal()) == 1 || iOrdinal == 3)) {
                zBooleanValue = true;
            }
        } else {
            zBooleanValue = boolValueOf.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
