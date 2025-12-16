package com.avito.android.edit_count_field.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import uy.C49127c;
import uy.InterfaceC49125a;

/* compiled from: EditCountFieldActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Luy/a;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Luy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC49125a, EditCountFieldInternalAction, C49127c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_count_field.interactor.a f146635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditCountFieldArguments f146636b;

    @Inject
    public c(@Y61.k com.avito.android.edit_count_field.interactor.a aVar, @Y61.k EditCountFieldArguments editCountFieldArguments) {
        this.f146635a = aVar;
        this.f146636b = editCountFieldArguments;
    }

    public static final boolean c(c cVar, String str, Integer num, Integer num2) {
        cVar.getClass();
        if (str.length() == 0) {
            return true;
        }
        Integer numY0 = C43066x.y0(str);
        if (numY0 != null) {
            int iIntValue = numY0.intValue();
            if ((num == null || iIntValue <= num.intValue()) && (num2 == null || String.valueOf(iIntValue).length() <= num2.intValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EditCountFieldInternalAction> b(InterfaceC49125a interfaceC49125a, C49127c c49127c) {
        InterfaceC49125a interfaceC49125a2 = interfaceC49125a;
        C49127c c49127c2 = c49127c;
        if (interfaceC49125a2 instanceof InterfaceC49125a.C12736a) {
            return C43175k.G(new a(interfaceC49125a2, this, c49127c2, null));
        }
        if (interfaceC49125a2.equals(InterfaceC49125a.b.f440351a)) {
            return C43175k.G(new b(this, c49127c2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
