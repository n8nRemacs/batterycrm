package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Mi0.InterfaceC14493b;
import Mi0.InterfaceC14494c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecommendationLoaderOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "LMi0/b;", "LMi0/c;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements t<InterfaceC14493b, InterfaceC14494c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14494c b(InterfaceC14493b interfaceC14493b) {
        InterfaceC14493b interfaceC14493b2 = interfaceC14493b;
        if (interfaceC14493b2 instanceof InterfaceC14493b.C0699b) {
            InterfaceC14493b.C0699b c0699b = (InterfaceC14493b.C0699b) interfaceC14493b2;
            return new InterfaceC14494c.a(c0699b.f10995a, c0699b.f10996b);
        }
        if (interfaceC14493b2.equals(InterfaceC14493b.c.f10997a) ? true : interfaceC14493b2.equals(InterfaceC14493b.a.f10994a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
