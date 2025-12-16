package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivInput;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivInput$KeyboardType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivInput$KeyboardType;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class Z0 extends kotlin.jvm.internal.N implements Y41.l<DivInput.KeyboardType, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T0 f368287l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368288m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(T0 t02, com.yandex.div.core.view2.divs.widgets.j jVar) {
        super(1);
        this.f368287l = t02;
        this.f368288m = jVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DivInput.KeyboardType keyboardType) {
        int i12;
        DivInput.KeyboardType keyboardType2 = keyboardType;
        this.f368287l.getClass();
        int iOrdinal = keyboardType2.ordinal();
        if (iOrdinal == 0) {
            i12 = 1;
        } else if (iOrdinal != 1) {
            i12 = 3;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i12 = 8194;
                } else if (iOrdinal == 4) {
                    i12 = 33;
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = 17;
                }
            }
        } else {
            i12 = 131073;
        }
        com.yandex.div.core.view2.divs.widgets.j jVar = this.f368288m;
        jVar.setInputType(i12);
        jVar.setHorizontallyScrolling(keyboardType2 != DivInput.KeyboardType.MULTI_LINE_TEXT);
        return kotlin.G0.f406611a;
    }
}
