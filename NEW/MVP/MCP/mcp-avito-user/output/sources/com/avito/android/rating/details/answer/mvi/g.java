package com.avito.android.rating.details.answer.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vg0.InterfaceC49326a;
import vg0.InterfaceC49327b;

/* compiled from: RatingAddAnswerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lvg0/a;", "Lvg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements t<InterfaceC49326a, InterfaceC49327b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49327b b(InterfaceC49326a interfaceC49326a) {
        InterfaceC49326a interfaceC49326a2 = interfaceC49326a;
        if (interfaceC49326a2 instanceof InterfaceC49326a.C12786a) {
            return new InterfaceC49327b.a(((InterfaceC49326a.C12786a) interfaceC49326a2).f440929a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
