package com.avito.android.validation;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.NotFoundException;
import com.avito.android.validation.n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ParametersListPresenterImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class W0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends com.avito.conveyor_item.a>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<n1> f319313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y0 f319314m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.a f319315n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(List list, Y0 y02, com.avito.android.items.a aVar) {
        super(1);
        this.f319313l = list;
        this.f319314m = y02;
        this.f319315n = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends com.avito.conveyor_item.a> list) throws NotFoundException {
        for (n1 n1Var : this.f319313l) {
            Y0 y02 = this.f319314m;
            y02.getClass();
            int iL2 = y02.l(n1Var.f319402a);
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) y02.f319328g.get(iL2);
            if (aVar instanceof com.avito.android.items.a) {
                com.avito.android.items.a aVar2 = this.f319315n;
                if (Y0.o(aVar2)) {
                    if (!kotlin.jvm.internal.L.f(n1Var.f319402a, aVar2.getF324032b())) {
                        if ((aVar instanceof com.avito.android.items.d) || (aVar instanceof ParameterElement.I)) {
                            ItemWithState itemWithState = (ItemWithState) aVar;
                            if (n1Var instanceof n1.a) {
                                ItemWithState.State f173921f = itemWithState.getF173921f();
                                n1.a aVar3 = (n1.a) n1Var;
                                if (!kotlin.jvm.internal.L.f(f173921f instanceof ItemWithState.State.Warning ? ((ItemWithState.State.Warning) f173921f).f173900b : f173921f instanceof ItemWithState.State.Error.ErrorWithMessage ? ((ItemWithState.State.Error.ErrorWithMessage) f173921f).f173897b : null, aVar3 instanceof n1.a.c ? C36018l.b((n1.a.c) n1Var, aVar) : aVar3.f319404c)) {
                                }
                            } else if (!(n1Var instanceof n1.b)) {
                                if (!(n1Var instanceof n1.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(itemWithState.getF173921f() instanceof ItemWithState.State.Normal)) {
                                }
                            } else if (!(itemWithState.getF173921f() instanceof ItemWithState.State.Normal)) {
                            }
                        }
                    }
                    y02.f319328g.set(iL2, (com.avito.android.items.a) Y0.k(aVar2));
                    y02.n(n1Var);
                } else {
                    continue;
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
