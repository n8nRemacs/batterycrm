package com.avito.android.update.mvi_screen.mvi;

import GG0.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.update.mvi_screen.mvi.entity.UpdateApplicationInternalAction;
import com.avito.android.update.mvi_screen.mvi.entity.UpdateApplicationState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UpdateApplicationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LGG0/a;", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction;", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationState;", "<init>", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<GG0.a, UpdateApplicationInternalAction, UpdateApplicationState> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UpdateApplicationInternalAction> b(GG0.a aVar, UpdateApplicationState updateApplicationState) {
        GG0.a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(2, null));
        }
        if (aVar2 instanceof a.C0338a) {
            return C43175k.G(new b(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
