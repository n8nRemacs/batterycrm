package com.avito.android.select_field.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.select_field.mvi.entity.SelectFieldInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sq0.C48401c;
import sq0.InterfaceC48399a;

/* compiled from: SelectFieldActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select_field/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lsq0/a;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lsq0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC48399a, SelectFieldInternalAction, C48401c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectFieldArguments f267189a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_field.interactor.a f267190b;

    @Inject
    public c(@Y61.k SelectFieldArguments selectFieldArguments, @Y61.k com.avito.android.select_field.interactor.a aVar) {
        this.f267189a = selectFieldArguments;
        this.f267190b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectFieldInternalAction> b(InterfaceC48399a interfaceC48399a, C48401c c48401c) {
        InterfaceC48399a interfaceC48399a2 = interfaceC48399a;
        C48401c c48401c2 = c48401c;
        if (interfaceC48399a2 instanceof InterfaceC48399a.C12646a) {
            return new C43210w(new SelectFieldInternalAction.SelectItem(((InterfaceC48399a.C12646a) interfaceC48399a2).f438880a));
        }
        if (interfaceC48399a2.equals(InterfaceC48399a.b.f438881a)) {
            return C43175k.G(new a(this, null, c48401c2));
        }
        if (interfaceC48399a2.equals(InterfaceC48399a.c.f438882a)) {
            return C43175k.G(new b(this, null, c48401c2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
