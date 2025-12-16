package com.yandex.div.core.expression.triggers;

import Y41.l;
import com.yandex.div2.DivTrigger;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TriggersController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivTrigger$Mode;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivTrigger$Mode;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class d extends N implements l<DivTrigger.Mode, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f367476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(1);
        this.f367476l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(DivTrigger.Mode mode) {
        this.f367476l.f367490m = mode;
        return G0.f406611a;
    }
}
