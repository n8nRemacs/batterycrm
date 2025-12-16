package com.avito.android.publish.screen.step.suggest.category;

import Oe0.InterfaceC14678a;
import com.avito.android.blueprints.publish.wizard.WizardItem;
import com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestCategoryFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/wizard/WizardItem;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/blueprints/publish/wizard/WizardItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuggestCategoryFragment f242262b;

    public b(SuggestCategoryFragment suggestCategoryFragment) {
        this.f242262b = suggestCategoryFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        SuggestCategoryFragment.b bVar = SuggestCategoryFragment.f242221A0;
        this.f242262b.r5().accept(new InterfaceC14678a.d(((WizardItem) obj).f106498d));
        return G0.f406611a;
    }
}
