package com.avito.android.rating_form.step;

import com.avito.android.rating_form.step.RatingFormStepFragment;
import hh0.C40939a;
import ih0.InterfaceC41402a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormStepFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40939a f249726l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RatingFormStepFragment f249727m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C40939a c40939a, RatingFormStepFragment ratingFormStepFragment) {
        super(0);
        this.f249726l = c40939a;
        this.f249727m = ratingFormStepFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<InterfaceC41402a> list = this.f249726l.f397354b;
        RatingFormStepFragment.a aVar = RatingFormStepFragment.f249120R0;
        x xVarR5 = this.f249727m.r5();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            xVarR5.accept((InterfaceC41402a) it.next());
        }
        return G0.f406611a;
    }
}
