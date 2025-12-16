package com.avito.android.comfortable_deal.deal.item.actions;

import Ep.InterfaceC13517a;
import Y41.l;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/ActionTransition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/comfortable_deal/api/model/ActionTransition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<ActionTransition, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f121148l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f121148l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(ActionTransition actionTransition) {
        this.f121148l.f121149b.invoke(new InterfaceC13517a.C0257a(actionTransition));
        return G0.f406611a;
    }
}
