package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import ih0.C41404c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormStepReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LTV0/a;", "items", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class z extends N implements Y41.l<List<? extends TV0.a>, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f249717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RatingFormStepInternalAction f249718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C41404c f249719n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a12, RatingFormStepInternalAction ratingFormStepInternalAction, C41404c c41404c) {
        super(1);
        this.f249717l = a12;
        this.f249718m = ratingFormStepInternalAction;
        this.f249719n = c41404c;
    }

    @Override // Y41.l
    public final Integer invoke(List<? extends TV0.a> list) {
        this.f249717l.getClass();
        return A.c(this.f249718m, list, this.f249719n);
    }
}
