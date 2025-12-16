package com.avito.android.publish.screen.step.suggest.category.mvi;

import Oe0.InterfaceC14679b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.publish.screen.step.suggest.category.mvi.entity.SuggestCategoryState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuggestCategoryReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "LOe0/b;", "Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryState;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements u<InterfaceC14679b, SuggestCategoryState> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final SuggestCategoryState a(InterfaceC14679b interfaceC14679b, SuggestCategoryState suggestCategoryState) {
        InterfaceC14679b interfaceC14679b2 = interfaceC14679b;
        SuggestCategoryState suggestCategoryState2 = suggestCategoryState;
        if (interfaceC14679b2.equals(InterfaceC14679b.h.f12463a)) {
            return SuggestCategoryState.a(suggestCategoryState2, true, false, false, null, false, 30);
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.g) {
            return SuggestCategoryState.a(suggestCategoryState2, false, true, false, null, false, 28);
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.f) {
            InterfaceC14679b.f fVar = (InterfaceC14679b.f) interfaceC14679b2;
            return SuggestCategoryState.a(suggestCategoryState2, false, false, fVar.f12460a, fVar.f12461b, false, 16);
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.d) {
            return SuggestCategoryState.a(suggestCategoryState2, false, false, false, null, false, 15);
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.C0798b) {
            return SuggestCategoryState.a(suggestCategoryState2, false, false, false, null, true, 15);
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.a ? true : interfaceC14679b2.equals(InterfaceC14679b.c.f12457a) ? true : interfaceC14679b2.equals(InterfaceC14679b.e.f12459a) ? true : interfaceC14679b2 instanceof InterfaceC14679b.i) {
            return suggestCategoryState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
