package com.avito.android.publish.screen.wrongcategory.mvi;

import Qe0.InterfaceC14887a;
import Qe0.InterfaceC14888b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.screen.wrongcategory.mvi.entity.WrongCategoryState;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WrongCategoryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LQe0/a;", "LQe0/b;", "Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC14887a, InterfaceC14888b, WrongCategoryState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdvertProactiveModerationResult.WrongCategorySuggest f242591a;

    @Inject
    public c(@Y61.k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
        this.f242591a = wrongCategorySuggest;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14888b> b(InterfaceC14887a interfaceC14887a, WrongCategoryState wrongCategoryState) {
        InterfaceC14887a interfaceC14887a2 = interfaceC14887a;
        WrongCategoryState wrongCategoryState2 = wrongCategoryState;
        if (interfaceC14887a2.equals(InterfaceC14887a.C0920a.f13948a)) {
            return new C43210w(InterfaceC14888b.c.f13954a);
        }
        if (interfaceC14887a2 instanceof InterfaceC14887a.b) {
            return C43175k.G(new a((InterfaceC14887a.b) interfaceC14887a2, null));
        }
        if (interfaceC14887a2.equals(InterfaceC14887a.c.f13951a)) {
            return C43175k.G(new b(wrongCategoryState2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
