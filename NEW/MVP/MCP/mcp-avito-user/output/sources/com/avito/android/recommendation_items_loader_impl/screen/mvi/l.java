package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Mi0.C14495d;
import Mi0.InterfaceC14493b;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecommendationLoaderReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "LMi0/b;", "LMi0/d;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements u<InterfaceC14493b, C14495d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C14495d a(InterfaceC14493b interfaceC14493b, C14495d c14495d) {
        InterfaceC14493b interfaceC14493b2 = interfaceC14493b;
        C14495d c14495d2 = c14495d;
        if (interfaceC14493b2 instanceof InterfaceC14493b.a) {
            return new C14495d(true);
        }
        if (interfaceC14493b2 instanceof InterfaceC14493b.c) {
            return new C14495d(false);
        }
        if (interfaceC14493b2 instanceof InterfaceC14493b.C0699b) {
            return c14495d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
