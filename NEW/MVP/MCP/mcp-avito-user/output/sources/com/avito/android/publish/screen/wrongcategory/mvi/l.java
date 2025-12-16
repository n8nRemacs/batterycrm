package com.avito.android.publish.screen.wrongcategory.mvi;

import Qe0.InterfaceC14888b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.publish.screen.wrongcategory.mvi.entity.WrongCategoryState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WrongCategoryReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "LQe0/b;", "Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryState;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements u<InterfaceC14888b, WrongCategoryState> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final WrongCategoryState a(InterfaceC14888b interfaceC14888b, WrongCategoryState wrongCategoryState) {
        InterfaceC14888b interfaceC14888b2 = interfaceC14888b;
        WrongCategoryState wrongCategoryState2 = wrongCategoryState;
        if (interfaceC14888b2 instanceof InterfaceC14888b.d) {
            InterfaceC14888b.d dVar = (InterfaceC14888b.d) interfaceC14888b2;
            return new WrongCategoryState(dVar.f13955a, dVar.f13956b, dVar.f13957c, dVar.f13958d);
        }
        if (interfaceC14888b2 instanceof InterfaceC14888b.C0921b) {
            return new WrongCategoryState(wrongCategoryState2.f242599b, ((InterfaceC14888b.C0921b) interfaceC14888b2).f13953a, true, wrongCategoryState2.f242602e);
        }
        if (interfaceC14888b2 instanceof InterfaceC14888b.a ? true : interfaceC14888b2.equals(InterfaceC14888b.c.f13954a) ? true : interfaceC14888b2.equals(InterfaceC14888b.e.f13959a)) {
            return wrongCategoryState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
