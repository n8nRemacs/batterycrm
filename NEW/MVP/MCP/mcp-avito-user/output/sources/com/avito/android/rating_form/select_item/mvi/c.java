package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction;
import fh0.C40423b;
import fh0.InterfaceC40422a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingFormSelectItemActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfh0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "invoke", "(Lfh0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.l<InterfaceC40422a, InterfaceC43160i<? extends RatingFormSelectItemInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f249057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C40423b> f249058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<C40423b> aVar2) {
        super(1);
        this.f249057l = aVar;
        this.f249058m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends RatingFormSelectItemInternalAction> invoke(InterfaceC40422a interfaceC40422a) {
        C40423b c40423bInvoke = this.f249058m.invoke();
        return this.f249057l.b(interfaceC40422a, c40423bInvoke);
    }
}
