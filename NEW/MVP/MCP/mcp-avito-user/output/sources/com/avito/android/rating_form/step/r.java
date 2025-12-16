package com.avito.android.rating_form.step;

import com.avito.android.rating_form.step.RatingFormStepFragment;
import ih0.InterfaceC41402a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormStepFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RatingFormStepFragment f249730l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41402a f249731m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(RatingFormStepFragment ratingFormStepFragment, InterfaceC41402a interfaceC41402a) {
        super(0);
        this.f249730l = ratingFormStepFragment;
        this.f249731m = interfaceC41402a;
    }

    @Override // Y41.a
    public final G0 invoke() {
        RatingFormStepFragment.a aVar = RatingFormStepFragment.f249120R0;
        this.f249730l.r5().accept(this.f249731m);
        return G0.f406611a;
    }
}
