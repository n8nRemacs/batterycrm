package com.yandex.div.core.view2.divs;

import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivTransitionTrigger;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DivStateBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/g;", "div", "", "invoke", "(Lcom/yandex/div2/g;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.e2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37950e2 extends kotlin.jvm.internal.N implements Y41.l<AbstractC38330g, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C37950e2 f368374l = new C37950e2();

    public C37950e2() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(AbstractC38330g abstractC38330g) {
        List<DivTransitionTrigger> listO = abstractC38330g.a().o();
        return Boolean.valueOf(listO == null ? true : listO.contains(DivTransitionTrigger.STATE_CHANGE));
    }
}
