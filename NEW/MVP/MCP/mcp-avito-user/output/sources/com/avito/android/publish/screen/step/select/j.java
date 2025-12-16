package com.avito.android.publish.screen.step.select;

import Ne0.InterfaceC14566a;
import com.avito.android.publish.screen.step.select.SelectFragment;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectFragment f242174b;

    public j(SelectFragment selectFragment) {
        this.f242174b = selectFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        SelectFragment.b bVar = SelectFragment.f242071A0;
        this.f242174b.q5().accept(new InterfaceC14566a.i((EditableParameter) obj));
        return G0.f406611a;
    }
}
